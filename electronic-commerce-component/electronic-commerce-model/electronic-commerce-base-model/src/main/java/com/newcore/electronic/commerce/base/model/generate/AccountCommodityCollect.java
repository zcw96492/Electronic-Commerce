package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_COMMODITY_COLLECT
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountCommodityCollect implements Serializable {
    /**
     * 用户商品收藏ID
     */
    private Integer accountCommodityCollectId;

    /**
     * 账户ID
     */
    private Integer userId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 删除标识   0-未删除   1-已删除(已取消收藏)
     */
    private Integer deleteFlag;

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
     * 获取用户商品收藏ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getAccountCommodityCollectId() {
        return accountCommodityCollectId;
    }

    /**
     * 设置用户商品收藏ID
     * @param accountCommodityCollectId 用户商品收藏ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAccountCommodityCollectId(Integer accountCommodityCollectId) {
        this.accountCommodityCollectId = accountCommodityCollectId;
    }

    /**
     * 获取账户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置账户ID
     * @param userId 账户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * 获取删除标识   0-未删除   1-已删除(已取消收藏)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除标识   0-未删除   1-已删除(已取消收藏)
     * @param deleteFlag 删除标识   0-未删除   1-已删除(已取消收藏)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
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