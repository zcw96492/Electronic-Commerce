package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_ROLE
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountRole implements Serializable {
    /**
     * 
     */
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型   B-买家   S-卖家   A-管理员
     */
    private String roleType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 角色更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置
     * @param roleId 
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     * @param roleName 角色名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色类型   B-买家   S-卖家   A-管理员
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * 设置角色类型   B-买家   S-卖家   A-管理员
     * @param roleType 角色类型   B-买家   S-卖家   A-管理员
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
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
     * 获取角色更新时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置角色更新时间
     * @param updateTime 角色更新时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}