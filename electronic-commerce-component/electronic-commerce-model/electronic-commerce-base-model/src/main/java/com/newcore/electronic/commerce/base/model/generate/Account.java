package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ACCOUNT
 *
 * @date 2022-07-12 23:52:08
 */
public class Account implements Serializable {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户真实姓名
     */
    private String userName;

    /**
     * 证件类型 I-身份证
     */
    private String idType;

    /**
     * 证件号码
     */
    private String idNo;

    /**
     * 手机号
     */
    private String mobilePhone;

    /**
     * 邮箱
     */
    private String eMail;

    /**
     * 性别  F-女  M-男
     */
    private String sex;

    /**
     * 账户注册时间
     */
    private Date registerTime;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 账户最后更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

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
     * 获取用户真实姓名
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户真实姓名
     * @param userName 用户真实姓名
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取证件类型 I-身份证
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 设置证件类型 I-身份证
     * @param idType 证件类型 I-身份证
     *
     * @date 2022-07-12 23:52:08
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * 获取证件号码
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置证件号码
     * @param idNo 证件号码
     *
     * @date 2022-07-12 23:52:08
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * 获取手机号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置手机号
     * @param mobilePhone 手机号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取邮箱
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * 设置邮箱
     * @param eMail 邮箱
     *
     * @date 2022-07-12 23:52:08
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 获取性别  F-女  M-男
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别  F-女  M-男
     * @param sex 性别  F-女  M-男
     *
     * @date 2022-07-12 23:52:08
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取账户注册时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置账户注册时间
     * @param registerTime 账户注册时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取账户余额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置账户余额
     * @param balance 账户余额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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
     * 获取账户最后更新时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置账户最后更新时间
     * @param updateTime 账户最后更新时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}