package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_PROPERTIES_VALUES
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityPropertiesValues implements Serializable {
    /**
     * 商品属性值表ID
     */
    private Integer commodityPropertiesValuesId;

    /**
     * 商品属性ID
     */
    private Integer commodityPropertiesId;

    /**
     * 商品属性值编号
     */
    private String commodityPropertiesValuesSerial;

    /**
     * 商品属性值
     */
    private String commodityPropertiesValue;

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
     * 获取商品属性值表ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityPropertiesValuesId() {
        return commodityPropertiesValuesId;
    }

    /**
     * 设置商品属性值表ID
     * @param commodityPropertiesValuesId 商品属性值表ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPropertiesValuesId(Integer commodityPropertiesValuesId) {
        this.commodityPropertiesValuesId = commodityPropertiesValuesId;
    }

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
     * 获取商品属性值编号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityPropertiesValuesSerial() {
        return commodityPropertiesValuesSerial;
    }

    /**
     * 设置商品属性值编号
     * @param commodityPropertiesValuesSerial 商品属性值编号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPropertiesValuesSerial(String commodityPropertiesValuesSerial) {
        this.commodityPropertiesValuesSerial = commodityPropertiesValuesSerial;
    }

    /**
     * 获取商品属性值
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityPropertiesValue() {
        return commodityPropertiesValue;
    }

    /**
     * 设置商品属性值
     * @param commodityPropertiesValue 商品属性值
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPropertiesValue(String commodityPropertiesValue) {
        this.commodityPropertiesValue = commodityPropertiesValue;
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