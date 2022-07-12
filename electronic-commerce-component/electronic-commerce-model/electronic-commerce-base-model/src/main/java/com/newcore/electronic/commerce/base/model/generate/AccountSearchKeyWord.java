package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_SEARCH_KEY_WORD
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountSearchKeyWord implements Serializable {
    /**
     * 用户历史搜索关键字ID
     */
    private Integer accountSearchKeyWordId;

    /**
     * 账户ID
     */
    private Integer userId;

    /**
     * 关键词
     */
    private String keyWord;

    /**
     * 关键词出现频度
     */
    private Integer frequency;

    /**
     * 删除标识      0-未删除     1-已删除
     */
    private Integer deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户历史搜索关键字ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getAccountSearchKeyWordId() {
        return accountSearchKeyWordId;
    }

    /**
     * 设置用户历史搜索关键字ID
     * @param accountSearchKeyWordId 用户历史搜索关键字ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAccountSearchKeyWordId(Integer accountSearchKeyWordId) {
        this.accountSearchKeyWordId = accountSearchKeyWordId;
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
     * 获取关键词
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * 设置关键词
     * @param keyWord 关键词
     *
     * @date 2022-07-12 23:52:08
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * 获取关键词出现频度
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * 设置关键词出现频度
     * @param frequency 关键词出现频度
     *
     * @date 2022-07-12 23:52:08
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * 获取删除标识      0-未删除     1-已删除
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除标识      0-未删除     1-已删除
     * @param deleteFlag 删除标识      0-未删除     1-已删除
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
}