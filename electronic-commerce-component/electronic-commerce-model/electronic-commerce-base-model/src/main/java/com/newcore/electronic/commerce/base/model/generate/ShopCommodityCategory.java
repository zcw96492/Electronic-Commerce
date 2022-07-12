package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * SHOP_COMMODITY_CATEGORY
 *
 * @date 2022-07-12 23:52:08
 */
public class ShopCommodityCategory implements Serializable {
    /**
     * 商户商品类目表
     */
    private Integer shopCommodityCategoryId;

    /**
     * 商户ID
     */
    private Integer shopId;

    /**
     * 商户类目序号
     */
    private Integer shopCategorySerial;

    /**
     * 商户类目名称
     */
    private String shopCategoryName;

    /**
     * 商户商品类目级别 0-总类目  1-一级类目  2-二级类目  3-三级类目
     */
    private Integer shopCategoryGrade;

    /**
     * 商户商品类目父ID
     */
    private Integer shopCommodityCategoryParentId;

    /**
     * 删除标识  0-未删除  1-已删除
     */
    private Integer delFlag;

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
     * 获取商户商品类目表
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopCommodityCategoryId() {
        return shopCommodityCategoryId;
    }

    /**
     * 设置商户商品类目表
     * @param shopCommodityCategoryId 商户商品类目表
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopCommodityCategoryId(Integer shopCommodityCategoryId) {
        this.shopCommodityCategoryId = shopCommodityCategoryId;
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
     * 获取商户类目序号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopCategorySerial() {
        return shopCategorySerial;
    }

    /**
     * 设置商户类目序号
     * @param shopCategorySerial 商户类目序号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopCategorySerial(Integer shopCategorySerial) {
        this.shopCategorySerial = shopCategorySerial;
    }

    /**
     * 获取商户类目名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getShopCategoryName() {
        return shopCategoryName;
    }

    /**
     * 设置商户类目名称
     * @param shopCategoryName 商户类目名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }

    /**
     * 获取商户商品类目级别 0-总类目  1-一级类目  2-二级类目  3-三级类目
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopCategoryGrade() {
        return shopCategoryGrade;
    }

    /**
     * 设置商户商品类目级别 0-总类目  1-一级类目  2-二级类目  3-三级类目
     * @param shopCategoryGrade 商户商品类目级别 0-总类目  1-一级类目  2-二级类目  3-三级类目
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopCategoryGrade(Integer shopCategoryGrade) {
        this.shopCategoryGrade = shopCategoryGrade;
    }

    /**
     * 获取商户商品类目父ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopCommodityCategoryParentId() {
        return shopCommodityCategoryParentId;
    }

    /**
     * 设置商户商品类目父ID
     * @param shopCommodityCategoryParentId 商户商品类目父ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopCommodityCategoryParentId(Integer shopCommodityCategoryParentId) {
        this.shopCommodityCategoryParentId = shopCommodityCategoryParentId;
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