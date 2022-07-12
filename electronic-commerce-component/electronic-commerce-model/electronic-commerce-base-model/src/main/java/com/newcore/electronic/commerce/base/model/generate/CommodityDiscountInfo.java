package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * COMMODITY_DISCOUNT_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityDiscountInfo implements Serializable {
    /**
     * 商品打折信息ID
     */
    private Integer commodityDiscountInfoId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 折扣比例
     */
    private BigDecimal commodityDiscount;

    /**
     * 折扣开始时间
     */
    private Date discountStartTime;

    /**
     * 折扣结束时间
     */
    private Date discountEndTime;

    /**
     * 删除标识    0-未删除   1-已删除
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
     * 获取商品打折信息ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityDiscountInfoId() {
        return commodityDiscountInfoId;
    }

    /**
     * 设置商品打折信息ID
     * @param commodityDiscountInfoId 商品打折信息ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityDiscountInfoId(Integer commodityDiscountInfoId) {
        this.commodityDiscountInfoId = commodityDiscountInfoId;
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
     * 获取折扣比例
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getCommodityDiscount() {
        return commodityDiscount;
    }

    /**
     * 设置折扣比例
     * @param commodityDiscount 折扣比例
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityDiscount(BigDecimal commodityDiscount) {
        this.commodityDiscount = commodityDiscount;
    }

    /**
     * 获取折扣开始时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getDiscountStartTime() {
        return discountStartTime;
    }

    /**
     * 设置折扣开始时间
     * @param discountStartTime 折扣开始时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDiscountStartTime(Date discountStartTime) {
        this.discountStartTime = discountStartTime;
    }

    /**
     * 获取折扣结束时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getDiscountEndTime() {
        return discountEndTime;
    }

    /**
     * 设置折扣结束时间
     * @param discountEndTime 折扣结束时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDiscountEndTime(Date discountEndTime) {
        this.discountEndTime = discountEndTime;
    }

    /**
     * 获取删除标识    0-未删除   1-已删除
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识    0-未删除   1-已删除
     * @param delFlag 删除标识    0-未删除   1-已删除
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