package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_MEMBER_LEVEL_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountMemberLevelInfo implements Serializable {
    /**
     * 用户会员级别信息表
     */
    private Integer accountMemberLevelInfoId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 账户会员级别  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员
     */
    private Integer memberLevel;

    /**
     * 账户会员级别中文名  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员
     */
    private String memberLevelName;

    /**
     * 会员积分
     */
    private Integer memberIntegration;

    /**
     * 会员到期时间
     */
    private Date memberExpireTime;

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
     * 获取用户会员级别信息表
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getAccountMemberLevelInfoId() {
        return accountMemberLevelInfoId;
    }

    /**
     * 设置用户会员级别信息表
     * @param accountMemberLevelInfoId 用户会员级别信息表
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAccountMemberLevelInfoId(Integer accountMemberLevelInfoId) {
        this.accountMemberLevelInfoId = accountMemberLevelInfoId;
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
     * 获取账户会员级别  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getMemberLevel() {
        return memberLevel;
    }

    /**
     * 设置账户会员级别  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员
     * @param memberLevel 账户会员级别  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员
     *
     * @date 2022-07-12 23:52:08
     */
    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    /**
     * 获取账户会员级别中文名  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getMemberLevelName() {
        return memberLevelName;
    }

    /**
     * 设置账户会员级别中文名  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员
     * @param memberLevelName 账户会员级别中文名  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员
     *
     * @date 2022-07-12 23:52:08
     */
    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    /**
     * 获取会员积分
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getMemberIntegration() {
        return memberIntegration;
    }

    /**
     * 设置会员积分
     * @param memberIntegration 会员积分
     *
     * @date 2022-07-12 23:52:08
     */
    public void setMemberIntegration(Integer memberIntegration) {
        this.memberIntegration = memberIntegration;
    }

    /**
     * 获取会员到期时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getMemberExpireTime() {
        return memberExpireTime;
    }

    /**
     * 设置会员到期时间
     * @param memberExpireTime 会员到期时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setMemberExpireTime(Date memberExpireTime) {
        this.memberExpireTime = memberExpireTime;
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