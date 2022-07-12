package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * COMMODITY
 *
 * @date 2022-07-12 23:52:08
 */
public class Commodity implements Serializable {
    /**
     * 商品ID(主键)
     */
    private Integer commodityId;

    /**
     * 商品编号(条码编号)
     */
    private String commodityNum;

    /**
     * 商品标题
     */
    private String commodityTitle;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 商品所属类型ID
     */
    private Integer commodityBelongTypeId;

    /**
     * 商品所属品牌ID
     */
    private Integer commodityBelongBrandId;

    /**
     * 商品价格
     */
    private BigDecimal commodityPrice;

    /**
     * 商品库存
     */
    private Integer commodityRepertory;

    /**
     * 商品状态(0-下架  1-上架  2-已删除)
     */
    private Integer commodityStatus;

    /**
     * 商品描述
     */
    private String commodityDesc;

    /**
     * 商品浏览量(点击量)
     */
    private Integer commodityClickTimes;

    /**
     * 商品关键字
     */
    private String commodityKeyword;

    /**
     * 商品主图ID
     */
    private Integer commodityMainPic;

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
     * 获取商品ID(主键)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品ID(主键)
     * @param commodityId 商品ID(主键)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品编号(条码编号)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityNum() {
        return commodityNum;
    }

    /**
     * 设置商品编号(条码编号)
     * @param commodityNum 商品编号(条码编号)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityNum(String commodityNum) {
        this.commodityNum = commodityNum;
    }

    /**
     * 获取商品标题
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityTitle() {
        return commodityTitle;
    }

    /**
     * 设置商品标题
     * @param commodityTitle 商品标题
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityTitle(String commodityTitle) {
        this.commodityTitle = commodityTitle;
    }

    /**
     * 获取商品名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称
     * @param commodityName 商品名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * 获取商品所属类型ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityBelongTypeId() {
        return commodityBelongTypeId;
    }

    /**
     * 设置商品所属类型ID
     * @param commodityBelongTypeId 商品所属类型ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityBelongTypeId(Integer commodityBelongTypeId) {
        this.commodityBelongTypeId = commodityBelongTypeId;
    }

    /**
     * 获取商品所属品牌ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityBelongBrandId() {
        return commodityBelongBrandId;
    }

    /**
     * 设置商品所属品牌ID
     * @param commodityBelongBrandId 商品所属品牌ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityBelongBrandId(Integer commodityBelongBrandId) {
        this.commodityBelongBrandId = commodityBelongBrandId;
    }

    /**
     * 获取商品价格
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    /**
     * 设置商品价格
     * @param commodityPrice 商品价格
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    /**
     * 获取商品库存
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityRepertory() {
        return commodityRepertory;
    }

    /**
     * 设置商品库存
     * @param commodityRepertory 商品库存
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityRepertory(Integer commodityRepertory) {
        this.commodityRepertory = commodityRepertory;
    }

    /**
     * 获取商品状态(0-下架  1-上架  2-已删除)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    /**
     * 设置商品状态(0-下架  1-上架  2-已删除)
     * @param commodityStatus 商品状态(0-下架  1-上架  2-已删除)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    /**
     * 获取商品描述
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityDesc() {
        return commodityDesc;
    }

    /**
     * 设置商品描述
     * @param commodityDesc 商品描述
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    /**
     * 获取商品浏览量(点击量)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityClickTimes() {
        return commodityClickTimes;
    }

    /**
     * 设置商品浏览量(点击量)
     * @param commodityClickTimes 商品浏览量(点击量)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityClickTimes(Integer commodityClickTimes) {
        this.commodityClickTimes = commodityClickTimes;
    }

    /**
     * 获取商品关键字
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityKeyword() {
        return commodityKeyword;
    }

    /**
     * 设置商品关键字
     * @param commodityKeyword 商品关键字
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityKeyword(String commodityKeyword) {
        this.commodityKeyword = commodityKeyword;
    }

    /**
     * 获取商品主图ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityMainPic() {
        return commodityMainPic;
    }

    /**
     * 设置商品主图ID
     * @param commodityMainPic 商品主图ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityMainPic(Integer commodityMainPic) {
        this.commodityMainPic = commodityMainPic;
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