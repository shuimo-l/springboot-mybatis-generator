package com.entity;

import java.util.Date;

/**
 * 支付退款表
 * @author liuxl
 * @date 2020/03/17
 */
public class PayRefund {
    /**
     * 
     */
    private Integer id;

    /**
     * 微信/支付宝订单号
     */
    private String tradeNo;

    /**
     * 微信/支付宝退款单号
     */
    private String refundNo;

    /**
     * 支付类型（0：支付宝 1：微信）
     */
    private Byte payType;

    /**
     * 退款金额
     */
    private String refundFee;

    /**
     * 退款理由
     */
    private String refundReason;

    /**
     * 退款方式 1自动原路返回; 2人工打款
     */
    private String refundMethod;

    /**
     * 退款状态 0未退款; 1退款处理中; 2退款成功; 3退款不成功
     */
    private String refundStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo == null ? null : refundNo.trim();
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public String getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee == null ? null : refundFee.trim();
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public String getRefundMethod() {
        return refundMethod;
    }

    public void setRefundMethod(String refundMethod) {
        this.refundMethod = refundMethod == null ? null : refundMethod.trim();
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}