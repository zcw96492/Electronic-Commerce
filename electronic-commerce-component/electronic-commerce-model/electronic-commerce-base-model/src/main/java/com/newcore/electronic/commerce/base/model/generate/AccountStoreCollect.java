package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_STORE_COLLECT
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountStoreCollect implements Serializable {
    /**
     * 用户店铺收藏ID
     */
    private Integer accountStoreCollectId;

    /**
     * 账户ID
     */
    private Integer userId;

    /**
     * 商户ID
     */
    private Integer shopId;

    /**
     * 删除标识     0-未删除    1-已删除(已取消收藏)
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
     * 获取用户店铺收藏ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getAccountStoreCollectId() {
        return accountStoreCollectId;
    }

    /**
     * 设置用户店铺收藏ID
     * @param accountStoreCollectId 用户店铺收藏ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAccountStoreCollectId(Integer accountStoreCollectId) {
        this.accountStoreCollectId = accountStoreCollectId;
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
     * 获取商户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置商户ID
     * @param shopId 商户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取删除标识     0-未删除    1-已删除(已取消收藏)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除标识     0-未删除    1-已删除(已取消收藏)
     * @param deleteFlag 删除标识     0-未删除    1-已删除(已取消收藏)
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