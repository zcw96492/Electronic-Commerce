package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_BRAND_COLLECT
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountBrandCollect implements Serializable {
    /**
     * 用户品牌收藏ID
     */
    private Integer accountBrandCollectId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 删除标识    0-未删除    1-已删除(已取消收藏)
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
     * 获取用户品牌收藏ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getAccountBrandCollectId() {
        return accountBrandCollectId;
    }

    /**
     * 设置用户品牌收藏ID
     * @param accountBrandCollectId 用户品牌收藏ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAccountBrandCollectId(Integer accountBrandCollectId) {
        this.accountBrandCollectId = accountBrandCollectId;
    }

    /**
     * 获取用户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     * @param userId 用户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取品牌ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 设置品牌ID
     * @param brandId 品牌ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取删除标识    0-未删除    1-已删除(已取消收藏)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除标识    0-未删除    1-已删除(已取消收藏)
     * @param deleteFlag 删除标识    0-未删除    1-已删除(已取消收藏)
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