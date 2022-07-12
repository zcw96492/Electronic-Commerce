package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_BRAND
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityBrand implements Serializable {
    /**
     * 商品品牌ID
     */
    private Integer commodityBrandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 首字母
     */
    private String firstLetter;

    /**
     * 是否为品牌制造商   0-是   1-否
     */
    private Integer factoryStatus;

    /**
     * 是否显示    0-显示    1-不显示
     */
    private Integer displayFlag;

    /**
     * 品牌产品数量
     */
    private Integer productNum;

    /**
     * 产品评论数量
     */
    private Integer productCommentNum;

    /**
     * 品牌logo
     */
    private String logo;

    /**
     * 品牌专区大图
     */
    private String brandPic;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 品牌故事
     */
    private String brandStory;

    private static final long serialVersionUID = 1L;

    /**
     * 获取商品品牌ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityBrandId() {
        return commodityBrandId;
    }

    /**
     * 设置商品品牌ID
     * @param commodityBrandId 商品品牌ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityBrandId(Integer commodityBrandId) {
        this.commodityBrandId = commodityBrandId;
    }

    /**
     * 获取品牌名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置品牌名称
     * @param brandName 品牌名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取首字母
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getFirstLetter() {
        return firstLetter;
    }

    /**
     * 设置首字母
     * @param firstLetter 首字母
     *
     * @date 2022-07-12 23:52:08
     */
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    /**
     * 获取是否为品牌制造商   0-是   1-否
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    /**
     * 设置是否为品牌制造商   0-是   1-否
     * @param factoryStatus 是否为品牌制造商   0-是   1-否
     *
     * @date 2022-07-12 23:52:08
     */
    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    /**
     * 获取是否显示    0-显示    1-不显示
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDisplayFlag() {
        return displayFlag;
    }

    /**
     * 设置是否显示    0-显示    1-不显示
     * @param displayFlag 是否显示    0-显示    1-不显示
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDisplayFlag(Integer displayFlag) {
        this.displayFlag = displayFlag;
    }

    /**
     * 获取品牌产品数量
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * 设置品牌产品数量
     * @param productNum 品牌产品数量
     *
     * @date 2022-07-12 23:52:08
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * 获取产品评论数量
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getProductCommentNum() {
        return productCommentNum;
    }

    /**
     * 设置产品评论数量
     * @param productCommentNum 产品评论数量
     *
     * @date 2022-07-12 23:52:08
     */
    public void setProductCommentNum(Integer productCommentNum) {
        this.productCommentNum = productCommentNum;
    }

    /**
     * 获取品牌logo
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置品牌logo
     * @param logo 品牌logo
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取品牌专区大图
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBrandPic() {
        return brandPic;
    }

    /**
     * 设置品牌专区大图
     * @param brandPic 品牌专区大图
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBrandPic(String brandPic) {
        this.brandPic = brandPic;
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

    /**
     * 获取品牌故事
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBrandStory() {
        return brandStory;
    }

    /**
     * 设置品牌故事
     * @param brandStory 品牌故事
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }
}