package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * SUPPLIER_COMMODITY_RELATION
 *
 * @date 2022-07-12 23:52:08
 */
public class SupplierCommodityRelation implements Serializable {
    /**
     * 供应商与商品关系ID
     */
    private Integer supplierCommodityRelationId;

    /**
     * 供应商ID
     */
    private Integer supplierInfoId;

    /**
     * 商品ID
     */
    private Integer commodityId;

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
     * 获取供应商与商品关系ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getSupplierCommodityRelationId() {
        return supplierCommodityRelationId;
    }

    /**
     * 设置供应商与商品关系ID
     * @param supplierCommodityRelationId 供应商与商品关系ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setSupplierCommodityRelationId(Integer supplierCommodityRelationId) {
        this.supplierCommodityRelationId = supplierCommodityRelationId;
    }

    /**
     * 获取供应商ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getSupplierInfoId() {
        return supplierInfoId;
    }

    /**
     * 设置供应商ID
     * @param supplierInfoId 供应商ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setSupplierInfoId(Integer supplierInfoId) {
        this.supplierInfoId = supplierInfoId;
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