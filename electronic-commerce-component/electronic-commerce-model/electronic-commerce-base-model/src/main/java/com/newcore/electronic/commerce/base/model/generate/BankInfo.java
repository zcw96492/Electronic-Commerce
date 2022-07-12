package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * BANK_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class BankInfo implements Serializable {
    /**
     * 银行ID
     */
    private Integer bankId;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行类型
     */
    private String bankType;

    /**
     * 银行编码
     */
    private String bankCode;

    /**
     * 是否展示(是否启用该银行)  Y-是   N-否
     */
    private String displayFlag;

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
     * 获取银行ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getBankId() {
        return bankId;
    }

    /**
     * 设置银行ID
     * @param bankId 银行ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * 获取银行名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     * @param bankName 银行名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取银行类型
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBankType() {
        return bankType;
    }

    /**
     * 设置银行类型
     * @param bankType 银行类型
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    /**
     * 获取银行编码
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置银行编码
     * @param bankCode 银行编码
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取是否展示(是否启用该银行)  Y-是   N-否
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getDisplayFlag() {
        return displayFlag;
    }

    /**
     * 设置是否展示(是否启用该银行)  Y-是   N-否
     * @param displayFlag 是否展示(是否启用该银行)  Y-是   N-否
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDisplayFlag(String displayFlag) {
        this.displayFlag = displayFlag;
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