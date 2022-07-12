package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_PLAN_TYPE
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityPlanType implements Serializable {
    /**
     * 商品套餐类型ID
     */
    private Integer commodityPlanTypeId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 商品套餐类型序号
     */
    private Integer commodityPlanTypeSerial;

    /**
     * 商品套餐类型名称
     */
    private String commodityPlanTypeName;

    /**
     * 删除标识   0-未删除   1-已删除
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
     * 获取商品套餐类型ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityPlanTypeId() {
        return commodityPlanTypeId;
    }

    /**
     * 设置商品套餐类型ID
     * @param commodityPlanTypeId 商品套餐类型ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPlanTypeId(Integer commodityPlanTypeId) {
        this.commodityPlanTypeId = commodityPlanTypeId;
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
     * 获取商品套餐类型序号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityPlanTypeSerial() {
        return commodityPlanTypeSerial;
    }

    /**
     * 设置商品套餐类型序号
     * @param commodityPlanTypeSerial 商品套餐类型序号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPlanTypeSerial(Integer commodityPlanTypeSerial) {
        this.commodityPlanTypeSerial = commodityPlanTypeSerial;
    }

    /**
     * 获取商品套餐类型名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityPlanTypeName() {
        return commodityPlanTypeName;
    }

    /**
     * 设置商品套餐类型名称
     * @param commodityPlanTypeName 商品套餐类型名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityPlanTypeName(String commodityPlanTypeName) {
        this.commodityPlanTypeName = commodityPlanTypeName;
    }

    /**
     * 获取删除标识   0-未删除   1-已删除
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识   0-未删除   1-已删除
     * @param delFlag 删除标识   0-未删除   1-已删除
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