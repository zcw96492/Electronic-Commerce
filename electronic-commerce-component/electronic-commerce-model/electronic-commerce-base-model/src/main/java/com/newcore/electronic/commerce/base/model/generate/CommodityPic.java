package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_PIC
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityPic implements Serializable {
    /**
     * 商品图片ID
     */
    private Integer commodityPicId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 商品图片链接地址
     */
    private String picUrl;

    /**
     * 删除标识 0-未删除  1-已删除
     */
    private Integer delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取商品图片ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityPicId() {
        return commodityPicId;
    }

    /**
     * 设置商品图片ID
     * @param commodityPicId 商品图片ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPicId(Integer commodityPicId) {
        this.commodityPicId = commodityPicId;
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
     * 获取商品图片链接地址
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置商品图片链接地址
     * @param picUrl 商品图片链接地址
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取删除标识 0-未删除  1-已删除
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识 0-未删除  1-已删除
     * @param delFlag 删除标识 0-未删除  1-已删除
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
}