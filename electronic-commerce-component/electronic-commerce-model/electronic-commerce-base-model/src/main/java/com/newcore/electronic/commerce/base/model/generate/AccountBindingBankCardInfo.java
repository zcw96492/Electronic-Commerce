package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ACCOUNT_BINDING_BANK_CARD_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountBindingBankCardInfo implements Serializable {
    /**
     * 用户银行卡绑定信息表ID
     */
    private Integer accountBindingBankCardInfoId;

    /**
     * 账户ID
     */
    private Integer userId;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 银行卡所属银行名称
     */
    private String bankName;

    /**
     * 银行卡余额
     */
    private BigDecimal balance;

    /**
     * 银行卡登记姓名
     */
    private String bankCardRegisterUserName;

    /**
     * 银行预留手机号
     */
    private String mobilePhone;

    /**
     * 银行卡类型    0-储蓄卡     1-信用卡     2-借记卡
     */
    private Integer bankCardType;

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
     * 获取用户银行卡绑定信息表ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getAccountBindingBankCardInfoId() {
        return accountBindingBankCardInfoId;
    }

    /**
     * 设置用户银行卡绑定信息表ID
     * @param accountBindingBankCardInfoId 用户银行卡绑定信息表ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAccountBindingBankCardInfoId(Integer accountBindingBankCardInfoId) {
        this.accountBindingBankCardInfoId = accountBindingBankCardInfoId;
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
     * 获取银行卡号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * 设置银行卡号
     * @param bankCardNo 银行卡号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 获取银行卡所属银行名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行卡所属银行名称
     * @param bankName 银行卡所属银行名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取银行卡余额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置银行卡余额
     * @param balance 银行卡余额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取银行卡登记姓名
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBankCardRegisterUserName() {
        return bankCardRegisterUserName;
    }

    /**
     * 设置银行卡登记姓名
     * @param bankCardRegisterUserName 银行卡登记姓名
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBankCardRegisterUserName(String bankCardRegisterUserName) {
        this.bankCardRegisterUserName = bankCardRegisterUserName;
    }

    /**
     * 获取银行预留手机号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置银行预留手机号
     * @param mobilePhone 银行预留手机号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取银行卡类型    0-储蓄卡     1-信用卡     2-借记卡
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getBankCardType() {
        return bankCardType;
    }

    /**
     * 设置银行卡类型    0-储蓄卡     1-信用卡     2-借记卡
     * @param bankCardType 银行卡类型    0-储蓄卡     1-信用卡     2-借记卡
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBankCardType(Integer bankCardType) {
        this.bankCardType = bankCardType;
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