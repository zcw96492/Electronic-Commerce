package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * LOGISTICS_COMPANY
 *
 * @date 2022-07-12 23:52:08
 */
public class LogisticsCompany implements Serializable {
    /**
     * 物流公司ID(主键)
     */
    private Integer logisticsCompanyId;

    /**
     * 物流公司名称
     */
    private String logisticsCompanyName;

    /**
     * 物流公司代码
     */
    private String logisticsCompanyCode;

    /**
     * 是否显示    0-显示    1-不显示
     */
    private Integer displayFlag;

    /**
     * 是否已签约    0-已签约    1-未签约
     */
    private Integer signFlag;

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
     * 获取物流公司ID(主键)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    /**
     * 设置物流公司ID(主键)
     * @param logisticsCompanyId 物流公司ID(主键)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsCompanyId(Integer logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    /**
     * 获取物流公司名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    /**
     * 设置物流公司名称
     * @param logisticsCompanyName 物流公司名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName;
    }

    /**
     * 获取物流公司代码
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLogisticsCompanyCode() {
        return logisticsCompanyCode;
    }

    /**
     * 设置物流公司代码
     * @param logisticsCompanyCode 物流公司代码
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsCompanyCode(String logisticsCompanyCode) {
        this.logisticsCompanyCode = logisticsCompanyCode;
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
     * 获取是否已签约    0-已签约    1-未签约
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getSignFlag() {
        return signFlag;
    }

    /**
     * 设置是否已签约    0-已签约    1-未签约
     * @param signFlag 是否已签约    0-已签约    1-未签约
     *
     * @date 2022-07-12 23:52:08
     */
    public void setSignFlag(Integer signFlag) {
        this.signFlag = signFlag;
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