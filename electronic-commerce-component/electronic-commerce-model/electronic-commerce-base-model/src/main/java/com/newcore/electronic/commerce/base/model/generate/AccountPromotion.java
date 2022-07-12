package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_PROMOTION
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountPromotion implements Serializable {
    /**
     * 用户优惠券表ID
     */
    private Integer accountPromotionId;

    /**
     * 优惠券所属用户ID
     */
    private Integer userId;

    /**
     * 优惠券种类ID
     */
    private Integer promotionTypeId;

    /**
     * 优惠券所属商户ID
     */
    private Integer shopId;

    /**
     * 优惠券所属商品ID
     */
    private Integer commodityId;

    /**
     * 有效期(单位：天)
     */
    private Integer periodValidity;

    /**
     * 创建日期
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户优惠券表ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getAccountPromotionId() {
        return accountPromotionId;
    }

    /**
     * 设置用户优惠券表ID
     * @param accountPromotionId 用户优惠券表ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAccountPromotionId(Integer accountPromotionId) {
        this.accountPromotionId = accountPromotionId;
    }

    /**
     * 获取优惠券所属用户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置优惠券所属用户ID
     * @param userId 优惠券所属用户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取优惠券种类ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getPromotionTypeId() {
        return promotionTypeId;
    }

    /**
     * 设置优惠券种类ID
     * @param promotionTypeId 优惠券种类ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPromotionTypeId(Integer promotionTypeId) {
        this.promotionTypeId = promotionTypeId;
    }

    /**
     * 获取优惠券所属商户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置优惠券所属商户ID
     * @param shopId 优惠券所属商户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取优惠券所属商品ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置优惠券所属商品ID
     * @param commodityId 优惠券所属商品ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取有效期(单位：天)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getPeriodValidity() {
        return periodValidity;
    }

    /**
     * 设置有效期(单位：天)
     * @param periodValidity 有效期(单位：天)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPeriodValidity(Integer periodValidity) {
        this.periodValidity = periodValidity;
    }

    /**
     * 获取创建日期
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     * @param createTime 创建日期
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}