#!/bin/bash
PROG_NAME=$0
ACTION=$1
ONLINE_OFFLINE_WAIT_TIME=6  # 实例上下线的等待时间
APP_START_TIMEOUT=60    # 等待应用启动的时间

APP_NAME=card
APP_PORT=8084          # 应用端口
HEALTH_CHECK_URL=http://127.0.0.1:${APP_PORT}  # 应用健康检查URL
HEALTH_CHECK_FILE_DIR=/home/admin/status   # 脚本会在这个目录下生成nginx-status文件
APP_HOME=/home/admin/card # 从package.tgz中解压出来的jar包放到这个目录下
DEPLOY_HOME=/app/card  #jar包运行位置
JAR_NAME=card.jar # jar包的名字
APP_LOG=${APP_HOME}/logs/card.log # 应用的日志文件
JAVA_OUT=${APP_HOME}/logs/start.log  #应用的启动日志
JAVA_HOME= #机器的java环境

# 创建出相关目录
mkdir -p ${HEALTH_CHECK_FILE_DIR}
mkdir -p ${APP_HOME}
rm -rf ${APP_HOME}/${JAR_NAME}
mkdir -p ${APP_HOME}/logs
mkdir -p ${DEPLOY_HOME}
usage() {
    echo "Usage: $PROG_NAME {start|stop|online|offline|restart}"
    exit 2
}
online() {
    # 挂回SLB
    touch -m $HEALTH_CHECK_FILE_DIR/nginx-status || exit 1
    echo "wait app online in ${ONLINE_OFFLINE_WAIT_TIME} seconds..."
    sleep ${ONLINE_OFFLINE_WAIT_TIME}
}
offline() {
    # 摘除SLB
    rm -f $HEALTH_CHECK_FILE_DIR/nginx-status || exit 1
    echo "wait app offline in ${ONLINE_OFFLINE_WAIT_TIME} seconds..."
    sleep ${ONLINE_OFFLINE_WAIT_TIME}
}
health_check() {
    exptime=0
    echo "checking ${HEALTH_CHECK_URL}"
    while true
        do
            status_code=`/usr/bin/curl -L -o /dev/null --connect-timeout 5 -s -w %{http_code}  ${HEALTH_CHECK_URL}`
            echo "\r code is $status_code"
            if [ x$status_code != x200 ];then
                sleep 1
                ((exptime++))

                echo -n -e "\rWait app to pass health check: $exptime..."
            else
                break
            fi
            if [ $exptime -gt ${APP_START_TIMEOUT} ]; then
                echo
                echo 'app start failed'
                exit 0
            fi
        done
    echo "check ${HEALTH_CHECK_URL} success"
}
start_application() {
    rm -rf ${DEPLOY_HOME}/*
    mv ${APP_HOME}/*.jar ${APP_HOME}/${JAR_NAME}
    cp ${APP_HOME}/${JAR_NAME} ${DEPLOY_HOME}/
    cd ${DEPLOY_HOME} || exit 1
        echo "java stdout log: ${APP_LOG}"
    nohup  ${JAVA_HOME}/bin/java -jar ${JAR_NAME} > ${APP_LOG} 2>&1 &

}


stop_application() {
   echo "stop java process"
       times=60
       for e in $(seq 60)
       do
           sleep 1
           COSTTIME=$(($times - $e ))
           PID=`ps -ef|grep java|grep $APP_NAME |grep -v grep|awk '{print $2}'`
           echo "jar -pid : ${PID}"
           if [[ ! -z "$PID" ]];then
                   kill -9 $PID
                   echo -n -e  "\r        -- stopping java lasts `expr $COSTTIME` seconds."
           else
                   break;
           fi
       done
       echo ""
}
start() {
    start_application
    health_check
    online
}
stop() {
    offline
    stop_application
}
case "$ACTION" in
    start)
        start
    ;;
    stop)
        stop
    ;;
    online)
        online
    ;;
    offline)
        offline
    ;;
    restart)
        stop
        start
    ;;
    *)
        usage
    ;;
esac
