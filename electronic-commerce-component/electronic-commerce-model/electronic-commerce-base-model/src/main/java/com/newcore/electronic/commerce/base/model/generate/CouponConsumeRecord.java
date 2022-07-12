package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COUPON_CONSUME_RECORD
 *
 * @date 2022-07-12 23:52:08
 */
public class CouponConsumeRecord implements Serializable {
    /**
     * 优惠券消费记录ID
     */
    private Integer couponConsumeRecordId;

    /**
     * 买家ID
     */
    private Integer buyerId;

    /**
     * 订单号
     */
    private String orderSerial;

    /**
     * 优惠券ID
     */
    private Integer couponId;

    /**
     * 创建时间(消费时间)
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取优惠券消费记录ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCouponConsumeRecordId() {
        return couponConsumeRecordId;
    }

    /**
     * 设置优惠券消费记录ID
     * @param couponConsumeRecordId 优惠券消费记录ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponConsumeRecordId(Integer couponConsumeRecordId) {
        this.couponConsumeRecordId = couponConsumeRecordId;
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
     * 获取优惠券ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * 设置优惠券ID
     * @param couponId 优惠券ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取创建时间(消费时间)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间(消费时间)
     * @param createTime 创建时间(消费时间)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}