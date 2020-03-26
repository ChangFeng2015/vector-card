package com.qiqilab;

import java.io.Serializable;

/**
 * 结果集工具类
 *
 * @param <T>
 * @author Dave
 */
public class Result<T> implements Serializable {

    private static final int OK = 0;
    private static final int FAIL = 1;
    private static final int UNAUTHORIZED = 2;

    private T data;
    private int status = OK;
    private String msg = "";

    public static Result isOk() {
        return new Result();
    }

    public static Result isFail() {
        return new Result().status(FAIL);
    }

    public static Result isFail(Throwable e) {
        return isFail().msg(e);
    }

    public Result msg(Throwable e) {
        this.setMsg(e.toString());
        return this;
    }

    public Result data(T data) {
        this.setData(data);
        return this;
    }

    public Result status(int status) {
        this.setStatus(status);
        return this;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
