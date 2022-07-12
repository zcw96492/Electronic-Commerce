package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ORDER_DETAIL_HISTORY_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class OrderDetailHistoryInfo implements Serializable {
    /**
     * 历史订单商品明细ID
     */
    private Integer orderDetailHistoryInfoId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 商品数量
     */
    private Integer commodityQuantity;

    /**
     * 商品促销活动名称
     */
    private String promotionName;

    /**
     * 商品促销分解金额
     */
    private BigDecimal promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    private BigDecimal couponAmount;

    /**
     * 积分优惠分解金额
     */
    private BigDecimal integrationAmount;

    /**
     * 欣豆优惠分解金额
     */
    private BigDecimal beansAmount;

    /**
     * 该商品优惠后的金额
     */
    private BigDecimal realAmount;

    /**
     * 商品赠送积分
     */
    private Integer giftIntegration;

    /**
     * 商品赠送欣豆
     */
    private Integer giftBeans;

    /**
     * 商品销售属性
     */
    private String commodityAttr;

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
     * 获取历史订单商品明细ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderDetailHistoryInfoId() {
        return orderDetailHistoryInfoId;
    }

    /**
     * 设置历史订单商品明细ID
     * @param orderDetailHistoryInfoId 历史订单商品明细ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderDetailHistoryInfoId(Integer orderDetailHistoryInfoId) {
        this.orderDetailHistoryInfoId = orderDetailHistoryInfoId;
    }

    /**
     * 获取订单ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     * @param orderId 订单ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商品ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品ID
     * @param commodityId 商品ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品数量
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityQuantity() {
        return commodityQuantity;
    }

    /**
     * 设置商品数量
     * @param commodityQuantity 商品数量
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityQuantity(Integer commodityQuantity) {
        this.commodityQuantity = commodityQuantity;
    }

    /**
     * 获取商品促销活动名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * 设置商品促销活动名称
     * @param promotionName 商品促销活动名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    /**
     * 获取商品促销分解金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * 设置商品促销分解金额
     * @param promotionAmount 商品促销分解金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 获取优惠券优惠分解金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * 设置优惠券优惠分解金额
     * @param couponAmount 优惠券优惠分解金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取积分优惠分解金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * 设置积分优惠分解金额
     * @param integrationAmount 积分优惠分解金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * 获取欣豆优惠分解金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getBeansAmount() {
        return beansAmount;
    }

    /**
     * 设置欣豆优惠分解金额
     * @param beansAmount 欣豆优惠分解金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBeansAmount(BigDecimal beansAmount) {
        this.beansAmount = beansAmount;
    }

    /**
     * 获取该商品优惠后的金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 设置该商品优惠后的金额
     * @param realAmount 该商品优惠后的金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 获取商品赠送积分
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    /**
     * 设置商品赠送积分
     * @param giftIntegration 商品赠送积分
     *
     * @date 2022-07-12 23:52:08
     */
    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    /**
     * 获取商品赠送欣豆
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getGiftBeans() {
        return giftBeans;
    }

    /**
     * 设置商品赠送欣豆
     * @param giftBeans 商品赠送欣豆
     *
     * @date 2022-07-12 23:52:08
     */
    public void setGiftBeans(Integer giftBeans) {
        this.giftBeans = giftBeans;
    }

    /**
     * 获取商品销售属性
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityAttr() {
        return commodityAttr;
    }

    /**
     * 设置商品销售属性
     * @param commodityAttr 商品销售属性
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityAttr(String commodityAttr) {
        this.commodityAttr = commodityAttr;
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