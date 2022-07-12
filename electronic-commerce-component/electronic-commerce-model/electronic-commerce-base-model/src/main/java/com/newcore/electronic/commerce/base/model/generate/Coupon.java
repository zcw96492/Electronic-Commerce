package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COUPON
 *
 * @date 2022-07-12 23:52:08
 */
public class Coupon implements Serializable {
    /**
     * 优惠券ID
     */
    private Integer couponId;

    /**
     * 优惠券种类ID
     */
    private Integer couponTypeId;

    /**
     * 优惠券生效时间
     */
    private Date couponStartTime;

    /**
     * 优惠券失效时间
     */
    private Date couponEndTime;

    /**
     * 优惠券数量
     */
    private Integer couponAmount;

    /**
     * 优惠券状态   0-未生效   1-已生效   2-已失效  3-已使用   4-未使用
     */
    private Integer couponState;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

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
     * 获取优惠券种类ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCouponTypeId() {
        return couponTypeId;
    }

    /**
     * 设置优惠券种类ID
     * @param couponTypeId 优惠券种类ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponTypeId(Integer couponTypeId) {
        this.couponTypeId = couponTypeId;
    }

    /**
     * 获取优惠券生效时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCouponStartTime() {
        return couponStartTime;
    }

    /**
     * 设置优惠券生效时间
     * @param couponStartTime 优惠券生效时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponStartTime(Date couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    /**
     * 获取优惠券失效时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCouponEndTime() {
        return couponEndTime;
    }

    /**
     * 设置优惠券失效时间
     * @param couponEndTime 优惠券失效时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponEndTime(Date couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    /**
     * 获取优惠券数量
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCouponAmount() {
        return couponAmount;
    }

    /**
     * 设置优惠券数量
     * @param couponAmount 优惠券数量
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取优惠券状态   0-未生效   1-已生效   2-已失效  3-已使用   4-未使用
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCouponState() {
        return couponState;
    }

    /**
     * 设置优惠券状态   0-未生效   1-已生效   2-已失效  3-已使用   4-未使用
     * @param couponState 优惠券状态   0-未生效   1-已生效   2-已失效  3-已使用   4-未使用
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponState(Integer couponState) {
        this.couponState = couponState;
    }

    /**
     * 获取备注
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     * @param remark 备注
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRemark(String remark) {
        this.remark = remark;
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