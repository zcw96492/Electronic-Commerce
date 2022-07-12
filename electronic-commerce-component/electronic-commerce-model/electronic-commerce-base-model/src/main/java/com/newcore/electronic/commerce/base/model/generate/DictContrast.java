package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;

/**
 * DICT_CONTRAST
 *
 * @date 2022-07-12 23:52:08
 */
public class DictContrast implements Serializable {
    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 字典码值
     */
    private String dictCode;

    /**
     * 字典码值释义
     */
    private String dictDescription;

    /**
     * 码值启用状态(0-启用   1-未启用)
     */
    private Integer dictEnableStatus;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 获取字典名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置字典名称
     * @param dictName 字典名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * 获取字典码值
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * 设置字典码值
     * @param dictCode 字典码值
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    /**
     * 获取字典码值释义
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getDictDescription() {
        return dictDescription;
    }

    /**
     * 设置字典码值释义
     * @param dictDescription 字典码值释义
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDictDescription(String dictDescription) {
        this.dictDescription = dictDescription;
    }

    /**
     * 获取码值启用状态(0-启用   1-未启用)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDictEnableStatus() {
        return dictEnableStatus;
    }

    /**
     * 设置码值启用状态(0-启用   1-未启用)
     * @param dictEnableStatus 码值启用状态(0-启用   1-未启用)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDictEnableStatus(Integer dictEnableStatus) {
        this.dictEnableStatus = dictEnableStatus;
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
}