package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * SHOP_COMMODITY_REGISTER
 *
 * @date 2022-07-12 23:52:08
 */
public class ShopCommodityRegister implements Serializable {
    /**
     * 商户商品信息ID
     */
    private Integer shopCommodityRegisterId;

    /**
     * 商户ID
     */
    private Integer shopId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 商户商品类目ID
     */
    private Integer shopCommodityCategoryId;

    /**
     * 删除标识  0-未删除  1-已删除
     */
    private Integer delFlag;

    /**
     * 商品状态  0-下架  1-上架 
     */
    private Integer commodityStatus;

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
     * 获取商户商品信息ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopCommodityRegisterId() {
        return shopCommodityRegisterId;
    }

    /**
     * 设置商户商品信息ID
     * @param shopCommodityRegisterId 商户商品信息ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopCommodityRegisterId(Integer shopCommodityRegisterId) {
        this.shopCommodityRegisterId = shopCommodityRegisterId;
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
     * 获取商户商品类目ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopCommodityCategoryId() {
        return shopCommodityCategoryId;
    }

    /**
     * 设置商户商品类目ID
     * @param shopCommodityCategoryId 商户商品类目ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopCommodityCategoryId(Integer shopCommodityCategoryId) {
        this.shopCommodityCategoryId = shopCommodityCategoryId;
    }

    /**
     * 获取删除标识  0-未删除  1-已删除
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识  0-未删除  1-已删除
     * @param delFlag 删除标识  0-未删除  1-已删除
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取商品状态  0-下架  1-上架 
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    /**
     * 设置商品状态  0-下架  1-上架 
     * @param commodityStatus 商品状态  0-下架  1-上架 
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
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