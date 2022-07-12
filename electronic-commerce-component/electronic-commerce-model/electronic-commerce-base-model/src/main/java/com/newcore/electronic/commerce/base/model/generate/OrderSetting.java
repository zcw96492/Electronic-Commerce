package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ORDER_SETTING
 *
 * @date 2022-07-12 23:52:08
 */
public class OrderSetting implements Serializable {
    /**
     * 订单设置ID
     */
    private Integer orderSettingId;

    /**
     * 秒杀订单超时关闭时间(分)
     */
    private Integer flashOrderOvertime;

    /**
     * 正常订单超时时间(分)
     */
    private Integer normalOrderOvertime;

    /**
     * 发货后自动确认收货时间（天）
     */
    private Integer confirmOvertime;

    /**
     * 自动完成交易时间，不能申请售后（天）
     */
    private Integer finishOvertime;

    /**
     * 订单完成后自动好评时间（天）
     */
    private Integer commentOvertime;

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
     * 获取订单设置ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderSettingId() {
        return orderSettingId;
    }

    /**
     * 设置订单设置ID
     * @param orderSettingId 订单设置ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderSettingId(Integer orderSettingId) {
        this.orderSettingId = orderSettingId;
    }

    /**
     * 获取秒杀订单超时关闭时间(分)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    /**
     * 设置秒杀订单超时关闭时间(分)
     * @param flashOrderOvertime 秒杀订单超时关闭时间(分)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    /**
     * 获取正常订单超时时间(分)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    /**
     * 设置正常订单超时时间(分)
     * @param normalOrderOvertime 正常订单超时时间(分)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    /**
     * 获取发货后自动确认收货时间（天）
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    /**
     * 设置发货后自动确认收货时间（天）
     * @param confirmOvertime 发货后自动确认收货时间（天）
     *
     * @date 2022-07-12 23:52:08
     */
    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    /**
     * 获取自动完成交易时间，不能申请售后（天）
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    /**
     * 设置自动完成交易时间，不能申请售后（天）
     * @param finishOvertime 自动完成交易时间，不能申请售后（天）
     *
     * @date 2022-07-12 23:52:08
     */
    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    /**
     * 获取订单完成后自动好评时间（天）
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    /**
     * 设置订单完成后自动好评时间（天）
     * @param commentOvertime 订单完成后自动好评时间（天）
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
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