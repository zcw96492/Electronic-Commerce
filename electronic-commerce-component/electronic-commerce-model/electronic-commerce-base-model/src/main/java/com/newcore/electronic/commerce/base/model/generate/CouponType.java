package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * COUPON_TYPE
 *
 * @date 2022-07-12 23:52:08
 */
public class CouponType implements Serializable {
    /**
     * 优惠券种类ID
     */
    private Integer couponTypeId;

    /**
     * 优惠券种类  0-满减券  1-折扣券  2-无条件立减券  3-代金券
     */
    private Integer couponType;

    /**
     * 优惠券规则描述
     */
    private String couponName;

    /**
     * 优惠券金额(作为代金券的金额)
     */
    private BigDecimal couponAmnt;

    /**
     * 满金额
     */
    private BigDecimal fullAmnt;

    /**
     * 满减金额
     */
    private BigDecimal fullReductionAmnt;

    /**
     * 立减金额
     */
    private BigDecimal reduceAmnt;

    /**
     * 折扣比例
     */
    private Double discountProportion;

    /**
     * 删除标识   0-未删除   1-已删除
     */
    private Integer delFlag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

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
     * 获取优惠券种类  0-满减券  1-折扣券  2-无条件立减券  3-代金券
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCouponType() {
        return couponType;
    }

    /**
     * 设置优惠券种类  0-满减券  1-折扣券  2-无条件立减券  3-代金券
     * @param couponType 优惠券种类  0-满减券  1-折扣券  2-无条件立减券  3-代金券
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    /**
     * 获取优惠券规则描述
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * 设置优惠券规则描述
     * @param couponName 优惠券规则描述
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    /**
     * 获取优惠券金额(作为代金券的金额)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getCouponAmnt() {
        return couponAmnt;
    }

    /**
     * 设置优惠券金额(作为代金券的金额)
     * @param couponAmnt 优惠券金额(作为代金券的金额)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponAmnt(BigDecimal couponAmnt) {
        this.couponAmnt = couponAmnt;
    }

    /**
     * 获取满金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getFullAmnt() {
        return fullAmnt;
    }

    /**
     * 设置满金额
     * @param fullAmnt 满金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setFullAmnt(BigDecimal fullAmnt) {
        this.fullAmnt = fullAmnt;
    }

    /**
     * 获取满减金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getFullReductionAmnt() {
        return fullReductionAmnt;
    }

    /**
     * 设置满减金额
     * @param fullReductionAmnt 满减金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setFullReductionAmnt(BigDecimal fullReductionAmnt) {
        this.fullReductionAmnt = fullReductionAmnt;
    }

    /**
     * 获取立减金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getReduceAmnt() {
        return reduceAmnt;
    }

    /**
     * 设置立减金额
     * @param reduceAmnt 立减金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReduceAmnt(BigDecimal reduceAmnt) {
        this.reduceAmnt = reduceAmnt;
    }

    /**
     * 获取折扣比例
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Double getDiscountProportion() {
        return discountProportion;
    }

    /**
     * 设置折扣比例
     * @param discountProportion 折扣比例
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDiscountProportion(Double discountProportion) {
        this.discountProportion = discountProportion;
    }

    /**
     * 获取删除标识   0-未删除   1-已删除
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识   0-未删除   1-已删除
     * @param delFlag 删除标识   0-未删除   1-已删除
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
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

    /**
     * 获取更新时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     * @param updateTime 更新时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}