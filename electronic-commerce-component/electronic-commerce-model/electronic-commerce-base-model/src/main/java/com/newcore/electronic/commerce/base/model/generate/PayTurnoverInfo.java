package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * PAY_TURNOVER_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class PayTurnoverInfo implements Serializable {
    /**
     * 支付流水信息ID
     */
    private Integer payTurnoverInfoId;

    /**
     * 支付流水交易号
     */
    private String payTurnoverSerial;

    /**
     * 买家ID
     */
    private Integer buyerId;

    /**
     * 订单号
     */
    private String orderSerial;

    /**
     * 支付方式   1-支付宝；2-微信   3-银行卡快捷支付
     */
    private Integer payWay;

    /**
     * 支付金额
     */
    private BigDecimal payAmnt;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取支付流水信息ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getPayTurnoverInfoId() {
        return payTurnoverInfoId;
    }

    /**
     * 设置支付流水信息ID
     * @param payTurnoverInfoId 支付流水信息ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPayTurnoverInfoId(Integer payTurnoverInfoId) {
        this.payTurnoverInfoId = payTurnoverInfoId;
    }

    /**
     * 获取支付流水交易号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getPayTurnoverSerial() {
        return payTurnoverSerial;
    }

    /**
     * 设置支付流水交易号
     * @param payTurnoverSerial 支付流水交易号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPayTurnoverSerial(String payTurnoverSerial) {
        this.payTurnoverSerial = payTurnoverSerial;
    }

    /**
     * 获取买家ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 设置买家ID
     * @param buyerId 买家ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 获取订单号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getOrderSerial() {
        return orderSerial;
    }

    /**
     * 设置订单号
     * @param orderSerial 订单号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderSerial(String orderSerial) {
        this.orderSerial = orderSerial;
    }

    /**
     * 获取支付方式   1-支付宝；2-微信   3-银行卡快捷支付
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getPayWay() {
        return payWay;
    }

    /**
     * 设置支付方式   1-支付宝；2-微信   3-银行卡快捷支付
     * @param payWay 支付方式   1-支付宝；2-微信   3-银行卡快捷支付
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    /**
     * 获取支付金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getPayAmnt() {
        return payAmnt;
    }

    /**
     * 设置支付金额
     * @param payAmnt 支付金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPayAmnt(BigDecimal payAmnt) {
        this.payAmnt = payAmnt;
    }

    /**
     * 获取创建时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * @param createTime 创建时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}