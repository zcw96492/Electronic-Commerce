package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_TYPE
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityType implements Serializable {
    /**
     * 商品类型表
     */
    private Integer commodityTypeId;

    /**
     * 品牌类型父ID(上级分类的ID)    0-一级分类
     */
    private Integer parentCommodityTypeId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类级别(以此类推)     1-一级列表     2-二级列表     3-三级列表
     */
    private Integer typeLevel;

    /**
     * 商品数量
     */
    private Integer commodityNum;

    /**
     * 商品单位
     */
    private String commodityUnit;

    /**
     * 是否在导航栏显示    0-显示    1-不显示
     */
    private Integer navDisplayFlag;

    /**
     * 是否显示    0-显示    1-不显示
     */
    private Integer displayFlag;

    /**
     * 图标
     */
    private String icon;

    /**
     * 类别关键字
     */
    private String keyword;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 类别描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    /**
     * 获取商品类型表
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityTypeId() {
        return commodityTypeId;
    }

    /**
     * 设置商品类型表
     * @param commodityTypeId 商品类型表
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityTypeId(Integer commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    /**
     * 获取品牌类型父ID(上级分类的ID)    0-一级分类
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getParentCommodityTypeId() {
        return parentCommodityTypeId;
    }

    /**
     * 设置品牌类型父ID(上级分类的ID)    0-一级分类
     * @param parentCommodityTypeId 品牌类型父ID(上级分类的ID)    0-一级分类
     *
     * @date 2022-07-12 23:52:08
     */
    public void setParentCommodityTypeId(Integer parentCommodityTypeId) {
        this.parentCommodityTypeId = parentCommodityTypeId;
    }

    /**
     * 获取分类名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     * @param name 分类名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类级别(以此类推)     1-一级列表     2-二级列表     3-三级列表
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getTypeLevel() {
        return typeLevel;
    }

    /**
     * 设置分类级别(以此类推)     1-一级列表     2-二级列表     3-三级列表
     * @param typeLevel 分类级别(以此类推)     1-一级列表     2-二级列表     3-三级列表
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTypeLevel(Integer typeLevel) {
        this.typeLevel = typeLevel;
    }

    /**
     * 获取商品数量
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityNum() {
        return commodityNum;
    }

    /**
     * 设置商品数量
     * @param commodityNum 商品数量
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }

    /**
     * 获取商品单位
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityUnit() {
        return commodityUnit;
    }

    /**
     * 设置商品单位
     * @param commodityUnit 商品单位
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityUnit(String commodityUnit) {
        this.commodityUnit = commodityUnit;
    }

    /**
     * 获取是否在导航栏显示    0-显示    1-不显示
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getNavDisplayFlag() {
        return navDisplayFlag;
    }

    /**
     * 设置是否在导航栏显示    0-显示    1-不显示
     * @param navDisplayFlag 是否在导航栏显示    0-显示    1-不显示
     *
     * @date 2022-07-12 23:52:08
     */
    public void setNavDisplayFlag(Integer navDisplayFlag) {
        this.navDisplayFlag = navDisplayFlag;
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
     * 获取图标
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     * @param icon 图标
     *
     * @date 2022-07-12 23:52:08
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取类别关键字
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置类别关键字
     * @param keyword 类别关键字
     *
     * @date 2022-07-12 23:52:08
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
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

    /**
     * 获取类别描述
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置类别描述
     * @param description 类别描述
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDescription(String description) {
        this.description = description;
    }
}