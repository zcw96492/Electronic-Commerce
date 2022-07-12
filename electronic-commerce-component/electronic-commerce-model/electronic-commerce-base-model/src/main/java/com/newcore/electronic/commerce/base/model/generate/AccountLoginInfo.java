package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_LOGIN_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountLoginInfo implements Serializable {
    /**
     * 用户Id
     */
    private Integer userId;

    /**
     * 用户登录名
     */
    private String userLoginName;

    /**
     * 用户登录密码
     */
    private String userLoginPassword;

    /**
     * 用户登录状态    0-未登录   1-已登录
     */
    private String userLoginStatus;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户Id
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户Id
     * @param userId 用户Id
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户登录名
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getUserLoginName() {
        return userLoginName;
    }

    /**
     * 设置用户登录名
     * @param userLoginName 用户登录名
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    /**
     * 获取用户登录密码
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    /**
     * 设置用户登录密码
     * @param userLoginPassword 用户登录密码
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword;
    }

    /**
     * 获取用户登录状态    0-未登录   1-已登录
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getUserLoginStatus() {
        return userLoginStatus;
    }

    /**
     * 设置用户登录状态    0-未登录   1-已登录
     * @param userLoginStatus 用户登录状态    0-未登录   1-已登录
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserLoginStatus(String userLoginStatus) {
        this.userLoginStatus = userLoginStatus;
    }

    /**
     * 获取最后更新时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后更新时间
     * @param updateTime 最后更新时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
}