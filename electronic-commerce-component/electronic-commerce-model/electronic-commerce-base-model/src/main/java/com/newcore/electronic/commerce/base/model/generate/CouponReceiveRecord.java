package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COUPON_RECEIVE_RECORD
 *
 * @date 2022-07-12 23:52:08
 */
public class CouponReceiveRecord implements Serializable {
    /**
     * 优惠券领取记录表ID
     */
    private Integer couponReceiveRecordId;

    /**
     * 领取人ID
     */
    private Integer buyerId;

    /**
     * 优惠券ID
     */
    private Integer couponId;

    /**
     * 创建时间(优惠券领取时间)
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取优惠券领取记录表ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCouponReceiveRecordId() {
        return couponReceiveRecordId;
    }

    /**
     * 设置优惠券领取记录表ID
     * @param couponReceiveRecordId 优惠券领取记录表ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponReceiveRecordId(Integer couponReceiveRecordId) {
        this.couponReceiveRecordId = couponReceiveRecordId;
    }

    /**
     * 获取领取人ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 设置领取人ID
     * @param buyerId 领取人ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
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
     * 获取创建时间(优惠券领取时间)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间(优惠券领取时间)
     * @param createTime 创建时间(优惠券领取时间)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}