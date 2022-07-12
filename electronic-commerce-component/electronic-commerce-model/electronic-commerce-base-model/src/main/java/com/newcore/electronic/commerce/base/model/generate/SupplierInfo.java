package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * SUPPLIER_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class SupplierInfo implements Serializable {
    /**
     * 供应商信息ID
     */
    private Integer supplierInfoId;

    /**
     * 供应商编号
     */
    private String supplierNum;

    /**
     * 供应商名称
     */
    private String supplierName;

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
     * 获取供应商信息ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getSupplierInfoId() {
        return supplierInfoId;
    }

    /**
     * 设置供应商信息ID
     * @param supplierInfoId 供应商信息ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setSupplierInfoId(Integer supplierInfoId) {
        this.supplierInfoId = supplierInfoId;
    }

    /**
     * 获取供应商编号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getSupplierNum() {
        return supplierNum;
    }

    /**
     * 设置供应商编号
     * @param supplierNum 供应商编号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setSupplierNum(String supplierNum) {
        this.supplierNum = supplierNum;
    }

    /**
     * 获取供应商名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置供应商名称
     * @param supplierName 供应商名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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