package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * CART_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class CartInfo implements Serializable {
    /**
     * 购物车ID
     */
    private Integer cartInfoId;

    /**
     * 购物车所属账户ID
     */
    private Integer userId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 商户ID
     */
    private Integer shopId;

    /**
     * 商户名称
     */
    private String shopName;

    /**
     * 商品价格
     */
    private BigDecimal commodityAmount;

    /**
     * 商品数量
     */
    private Integer commodityQuantity;

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
     * 获取购物车ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCartInfoId() {
        return cartInfoId;
    }

    /**
     * 设置购物车ID
     * @param cartInfoId 购物车ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCartInfoId(Integer cartInfoId) {
        this.cartInfoId = cartInfoId;
    }

    /**
     * 获取购物车所属账户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置购物车所属账户ID
     * @param userId 购物车所属账户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * 获取商户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置商户ID
     * @param shopId 商户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取商户名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置商户名称
     * @param shopName 商户名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 获取商品价格
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getCommodityAmount() {
        return commodityAmount;
    }

    /**
     * 设置商品价格
     * @param commodityAmount 商品价格
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityAmount(BigDecimal commodityAmount) {
        this.commodityAmount = commodityAmount;
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