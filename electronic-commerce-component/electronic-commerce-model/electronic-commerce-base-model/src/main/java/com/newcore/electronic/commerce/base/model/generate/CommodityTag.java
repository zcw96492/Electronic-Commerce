package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_TAG
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityTag implements Serializable {
    /**
     * 商品标签表ID(主键)
     */
    private Integer commodityTagId;

    /**
     * 商品标签序号
     */
    private Integer tagSerial;

    /**
     * 标签类别序号
     */
    private Integer tagTypeNum;

    /**
     * 标签类别名称
     */
    private String tagTypeName;

    /**
     * 标签名称
     */
    private String tagName;

    /**
     * 标签描述
     */
    private String tagDescription;

    /**
     * 删除标识  0-未删除  1-已删除
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
     * 获取商品标签表ID(主键)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityTagId() {
        return commodityTagId;
    }

    /**
     * 设置商品标签表ID(主键)
     * @param commodityTagId 商品标签表ID(主键)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityTagId(Integer commodityTagId) {
        this.commodityTagId = commodityTagId;
    }

    /**
     * 获取商品标签序号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getTagSerial() {
        return tagSerial;
    }

    /**
     * 设置商品标签序号
     * @param tagSerial 商品标签序号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTagSerial(Integer tagSerial) {
        this.tagSerial = tagSerial;
    }

    /**
     * 获取标签类别序号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getTagTypeNum() {
        return tagTypeNum;
    }

    /**
     * 设置标签类别序号
     * @param tagTypeNum 标签类别序号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTagTypeNum(Integer tagTypeNum) {
        this.tagTypeNum = tagTypeNum;
    }

    /**
     * 获取标签类别名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getTagTypeName() {
        return tagTypeName;
    }

    /**
     * 设置标签类别名称
     * @param tagTypeName 标签类别名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTagTypeName(String tagTypeName) {
        this.tagTypeName = tagTypeName;
    }

    /**
     * 获取标签名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置标签名称
     * @param tagName 标签名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * 获取标签描述
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getTagDescription() {
        return tagDescription;
    }

    /**
     * 设置标签描述
     * @param tagDescription 标签描述
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    /**
     * 获取删除标识  0-未删除  1-已删除
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识  0-未删除  1-已删除
     * @param delFlag 删除标识  0-未删除  1-已删除
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