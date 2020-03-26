package com.qiqilab.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Credence {
    private Long id;

    private Integer version;

    private String code;

    private String credenceName;

    private String credenceType;

    private String credenceTypeValue;

    private String shopCode;

    private String shopName;

    private String headShopCode;

    private Long shopId;

    private Date createTime;

    private BigDecimal amount;

    private Integer scoreAmount;

    private Long userId;

    private String userName;

    private String userCode;

    private Long cashierUserId;

    private String cashierUserCode;

    private String cashierUserName;

    private String cashierTelephone;

    private String consumeCode;

    private BigDecimal cashPayMoney;

    private BigDecimal scorePayMoney;

    private BigDecimal bonusPayMoney;

    private BigDecimal virtualPayMoney;

    private Integer payScore;

    private String payBonusCodes;

    private String scoreBankCode;

    private Integer num;

    private Date payTime;

    private Date deleteTime;

    private String vaccountCode;

    private String checkValue;

    private String tradeNo;

    private Date tranDate;

    private BigDecimal serviceFee;

    private BigDecimal serviceFeeReturn;

    private String accountCode;

    private String refundType;

    private String refundTypeValue;

    private String payChannel;

    private String payChannelValue;

    private String isInvoice;

    private String isMakeInvoice;

    private String errorSerialNo;

    private String errorReason;

    private String checkStatus;

    private String checkStatusValue;

    private Date checkTime;

    private String credenceCategory;

    private String credenceCategoryValue;

    private String isCancel;

    private Date cancelTime;

    private String isTransfer;

    private Date transferTime;

    private String isCompensation;

    private String bankCode;

    private BigDecimal pfBonusPayMoney;

    private String pfBonusCodes;

    private BigDecimal subsidyPayMoney;

    private String isRefund;

    private Date refundTime;

    private BigDecimal interestPayMoney;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCredenceName() {
        return credenceName;
    }

    public void setCredenceName(String credenceName) {
        this.credenceName = credenceName == null ? null : credenceName.trim();
    }

    public String getCredenceType() {
        return credenceType;
    }

    public void setCredenceType(String credenceType) {
        this.credenceType = credenceType == null ? null : credenceType.trim();
    }

    public String getCredenceTypeValue() {
        return credenceTypeValue;
    }

    public void setCredenceTypeValue(String credenceTypeValue) {
        this.credenceTypeValue = credenceTypeValue == null ? null : credenceTypeValue.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getHeadShopCode() {
        return headShopCode;
    }

    public void setHeadShopCode(String headShopCode) {
        this.headShopCode = headShopCode == null ? null : headShopCode.trim();
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getScoreAmount() {
        return scoreAmount;
    }

    public void setScoreAmount(Integer scoreAmount) {
        this.scoreAmount = scoreAmount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Long getCashierUserId() {
        return cashierUserId;
    }

    public void setCashierUserId(Long cashierUserId) {
        this.cashierUserId = cashierUserId;
    }

    public String getCashierUserCode() {
        return cashierUserCode;
    }

    public void setCashierUserCode(String cashierUserCode) {
        this.cashierUserCode = cashierUserCode == null ? null : cashierUserCode.trim();
    }

    public String getCashierUserName() {
        return cashierUserName;
    }

    public void setCashierUserName(String cashierUserName) {
        this.cashierUserName = cashierUserName == null ? null : cashierUserName.trim();
    }

    public String getCashierTelephone() {
        return cashierTelephone;
    }

    public void setCashierTelephone(String cashierTelephone) {
        this.cashierTelephone = cashierTelephone == null ? null : cashierTelephone.trim();
    }

    public String getConsumeCode() {
        return consumeCode;
    }

    public void setConsumeCode(String consumeCode) {
        this.consumeCode = consumeCode == null ? null : consumeCode.trim();
    }

    public BigDecimal getCashPayMoney() {
        return cashPayMoney;
    }

    public void setCashPayMoney(BigDecimal cashPayMoney) {
        this.cashPayMoney = cashPayMoney;
    }

    public BigDecimal getScorePayMoney() {
        return scorePayMoney;
    }

    public void setScorePayMoney(BigDecimal scorePayMoney) {
        this.scorePayMoney = scorePayMoney;
    }

    public BigDecimal getBonusPayMoney() {
        return bonusPayMoney;
    }

    public void setBonusPayMoney(BigDecimal bonusPayMoney) {
        this.bonusPayMoney = bonusPayMoney;
    }

    public BigDecimal getVirtualPayMoney() {
        return virtualPayMoney;
    }

    public void setVirtualPayMoney(BigDecimal virtualPayMoney) {
        this.virtualPayMoney = virtualPayMoney;
    }

    public Integer getPayScore() {
        return payScore;
    }

    public void setPayScore(Integer payScore) {
        this.payScore = payScore;
    }

    public String getPayBonusCodes() {
        return payBonusCodes;
    }

    public void setPayBonusCodes(String payBonusCodes) {
        this.payBonusCodes = payBonusCodes == null ? null : payBonusCodes.trim();
    }

    public String getScoreBankCode() {
        return scoreBankCode;
    }

    public void setScoreBankCode(String scoreBankCode) {
        this.scoreBankCode = scoreBankCode == null ? null : scoreBankCode.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getVaccountCode() {
        return vaccountCode;
    }

    public void setVaccountCode(String vaccountCode) {
        this.vaccountCode = vaccountCode == null ? null : vaccountCode.trim();
    }

    public String getCheckValue() {
        return checkValue;
    }

    public void setCheckValue(String checkValue) {
        this.checkValue = checkValue == null ? null : checkValue.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getServiceFeeReturn() {
        return serviceFeeReturn;
    }

    public void setServiceFeeReturn(BigDecimal serviceFeeReturn) {
        this.serviceFeeReturn = serviceFeeReturn;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode == null ? null : accountCode.trim();
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType == null ? null : refundType.trim();
    }

    public String getRefundTypeValue() {
        return refundTypeValue;
    }

    public void setRefundTypeValue(String refundTypeValue) {
        this.refundTypeValue = refundTypeValue == null ? null : refundTypeValue.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getPayChannelValue() {
        return payChannelValue;
    }

    public void setPayChannelValue(String payChannelValue) {
        this.payChannelValue = payChannelValue == null ? null : payChannelValue.trim();
    }

    public String getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(String isInvoice) {
        this.isInvoice = isInvoice == null ? null : isInvoice.trim();
    }

    public String getIsMakeInvoice() {
        return isMakeInvoice;
    }

    public void setIsMakeInvoice(String isMakeInvoice) {
        this.isMakeInvoice = isMakeInvoice == null ? null : isMakeInvoice.trim();
    }

    public String getErrorSerialNo() {
        return errorSerialNo;
    }

    public void setErrorSerialNo(String errorSerialNo) {
        this.errorSerialNo = errorSerialNo == null ? null : errorSerialNo.trim();
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason == null ? null : errorReason.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getCheckStatusValue() {
        return checkStatusValue;
    }

    public void setCheckStatusValue(String checkStatusValue) {
        this.checkStatusValue = checkStatusValue == null ? null : checkStatusValue.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCredenceCategory() {
        return credenceCategory;
    }

    public void setCredenceCategory(String credenceCategory) {
        this.credenceCategory = credenceCategory == null ? null : credenceCategory.trim();
    }

    public String getCredenceCategoryValue() {
        return credenceCategoryValue;
    }

    public void setCredenceCategoryValue(String credenceCategoryValue) {
        this.credenceCategoryValue = credenceCategoryValue == null ? null : credenceCategoryValue.trim();
    }

    public String getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(String isCancel) {
        this.isCancel = isCancel == null ? null : isCancel.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(String isTransfer) {
        this.isTransfer = isTransfer == null ? null : isTransfer.trim();
    }

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    public String getIsCompensation() {
        return isCompensation;
    }

    public void setIsCompensation(String isCompensation) {
        this.isCompensation = isCompensation == null ? null : isCompensation.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public BigDecimal getPfBonusPayMoney() {
        return pfBonusPayMoney;
    }

    public void setPfBonusPayMoney(BigDecimal pfBonusPayMoney) {
        this.pfBonusPayMoney = pfBonusPayMoney;
    }

    public String getPfBonusCodes() {
        return pfBonusCodes;
    }

    public void setPfBonusCodes(String pfBonusCodes) {
        this.pfBonusCodes = pfBonusCodes == null ? null : pfBonusCodes.trim();
    }

    public BigDecimal getSubsidyPayMoney() {
        return subsidyPayMoney;
    }

    public void setSubsidyPayMoney(BigDecimal subsidyPayMoney) {
        this.subsidyPayMoney = subsidyPayMoney;
    }

    public String getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(String isRefund) {
        this.isRefund = isRefund == null ? null : isRefund.trim();
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public BigDecimal getInterestPayMoney() {
        return interestPayMoney;
    }

    public void setInterestPayMoney(BigDecimal interestPayMoney) {
        this.interestPayMoney = interestPayMoney;
    }
}