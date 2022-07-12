package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_PROPERTIES
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityProperties implements Serializable {
    /**
     * 商品属性ID
     */
    private Integer commodityPropertiesId;

    /**
     * 商品属性编号
     */
    private String commodityPropertiesSerial;

    /**
     * 商品属性名称
     */
    private String commodityPropertiesName;

    /**
     * 商品属性类型  0-一般属性  1-特殊属性
     */
    private Integer commodityPropertiesType;

    /**
     * 删除标识   0-未删除   1-已删除
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
     * 获取商品属性ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityPropertiesId() {
        return commodityPropertiesId;
    }

    /**
     * 设置商品属性ID
     * @param commodityPropertiesId 商品属性ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPropertiesId(Integer commodityPropertiesId) {
        this.commodityPropertiesId = commodityPropertiesId;
    }

    /**
     * 获取商品属性编号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityPropertiesSerial() {
        return commodityPropertiesSerial;
    }

    /**
     * 设置商品属性编号
     * @param commodityPropertiesSerial 商品属性编号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPropertiesSerial(String commodityPropertiesSerial) {
        this.commodityPropertiesSerial = commodityPropertiesSerial;
    }

    /**
     * 获取商品属性名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityPropertiesName() {
        return commodityPropertiesName;
    }

    /**
     * 设置商品属性名称
     * @param commodityPropertiesName 商品属性名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPropertiesName(String commodityPropertiesName) {
        this.commodityPropertiesName = commodityPropertiesName;
    }

    /**
     * 获取商品属性类型  0-一般属性  1-特殊属性
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityPropertiesType() {
        return commodityPropertiesType;
    }

    /**
     * 设置商品属性类型  0-一般属性  1-特殊属性
     * @param commodityPropertiesType 商品属性类型  0-一般属性  1-特殊属性
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPropertiesType(Integer commodityPropertiesType) {
        this.commodityPropertiesType = commodityPropertiesType;
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