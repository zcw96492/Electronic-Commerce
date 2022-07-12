package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ORDER_OPERATION_RECORD
 *
 * @date 2022-07-12 23:52:08
 */
public class OrderOperationRecord implements Serializable {
    /**
     * 订单操作记录ID
     */
    private Integer orderOperationRecordId;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 操作人 0.用户(买家) 1.商户(卖家) 2.系统(包含秒杀超时自动关闭的操作) 3.系统管理员
     */
    private Integer operationPsn;

    /**
     * 订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。
     */
    private Integer orderStatus;

    /**
     * 操作时间
     */
    private Date operationTime;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取订单操作记录ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderOperationRecordId() {
        return orderOperationRecordId;
    }

    /**
     * 设置订单操作记录ID
     * @param orderOperationRecordId 订单操作记录ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderOperationRecordId(Integer orderOperationRecordId) {
        this.orderOperationRecordId = orderOperationRecordId;
    }

    /**
     * 获取订单ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     * @param orderId 订单ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取操作人 0.用户(买家) 1.商户(卖家) 2.系统(包含秒杀超时自动关闭的操作) 3.系统管理员
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOperationPsn() {
        return operationPsn;
    }

    /**
     * 设置操作人 0.用户(买家) 1.商户(卖家) 2.系统(包含秒杀超时自动关闭的操作) 3.系统管理员
     * @param operationPsn 操作人 0.用户(买家) 1.商户(卖家) 2.系统(包含秒杀超时自动关闭的操作) 3.系统管理员
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOperationPsn(Integer operationPsn) {
        this.operationPsn = operationPsn;
    }

    /**
     * 获取订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。
     * @param orderStatus 订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取操作时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * 设置操作时间
     * @param operationTime 操作时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * 获取记录创建时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     * @param createTime 记录创建时间
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