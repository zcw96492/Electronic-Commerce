package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_TAG_RELATION
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityTagRelation implements Serializable {
    /**
     * 商品标签关系表主键ID
     */
    private Integer commodityTagRelationId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 商品标签ID
     */
    private Integer commodityTagId;

    /**
     * 删除标识   0-未删除   1-已删除
     */
    private Integer delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取商品标签关系表主键ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityTagRelationId() {
        return commodityTagRelationId;
    }

    /**
     * 设置商品标签关系表主键ID
     * @param commodityTagRelationId 商品标签关系表主键ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityTagRelationId(Integer commodityTagRelationId) {
        this.commodityTagRelationId = commodityTagRelationId;
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
     * 获取商品标签ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityTagId() {
        return commodityTagId;
    }

    /**
     * 设置商品标签ID
     * @param commodityTagId 商品标签ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityTagId(Integer commodityTagId) {
        this.commodityTagId = commodityTagId;
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