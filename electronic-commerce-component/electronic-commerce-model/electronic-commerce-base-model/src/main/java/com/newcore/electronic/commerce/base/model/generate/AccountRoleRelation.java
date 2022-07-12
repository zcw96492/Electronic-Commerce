package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_ROLE_RELATION
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountRoleRelation implements Serializable {
    /**
     * 
     */
    private Integer userRoleRelationId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 用户ID
     */
    private Integer userId;

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
     * 获取
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUserRoleRelationId() {
        return userRoleRelationId;
    }

    /**
     * 设置
     * @param userRoleRelationId 
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserRoleRelationId(Integer userRoleRelationId) {
        this.userRoleRelationId = userRoleRelationId;
    }

    /**
     * 获取角色ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     * @param roleId 角色ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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