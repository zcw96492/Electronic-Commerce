package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ORDER_HISTORY_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class OrderHistoryInfo implements Serializable {
    /**
     * 历史订单ID
     */
    private Integer orderHistoryInfoId;

    /**
     * 历史订单编号
     */
    private String orderSerialNum;

    /**
     * 历史订单所属用户ID
     */
    private Integer userId;

    /**
     * 历史订单类型  0-普通订单   1-秒杀订单
     */
    private Integer orderType;

    /**
     * 历史订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。
     */
    private Integer orderStatus;

    /**
     * 历史订单来源     0-PC端订单；1-app订单
     */
    private Integer orderSource;

    /**
     * 历史订单总金额
     */
    private BigDecimal orderAmountSum;

    /**
     * 支付方式  0-未支付；1-支付宝；2-微信   3-银行卡快捷支付
     */
    private Integer payType;

    /**
     * 应付金额(通常指未优惠时的金额)
     */
    private BigDecimal payAmount;

    /**
     * 实付金额(通常指优惠打折后的金额)
     */
    private BigDecimal actualPayAmount;

    /**
     * 历史订单运费
     */
    private BigDecimal freightAmount;

    /**
     * 历史订单所属商户ID
     */
    private Integer shopId;

    /**
     * 物流公司ID
     */
    private Integer logisticsCompanyId;

    /**
     * 物流单号
     */
    private String logisticsSerialNum;

    /**
     * 可以获得的积分
     */
    private Integer integration;

    /**
     * 可以获得的欣豆
     */
    private Integer beans;

    /**
     * 收货人姓名
     */
    private String receiverName;

    /**
     * 收货人电话
     */
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    private String receiverPostCode;

    /**
     * 收货人所在省份/直辖市ID
     */
    private Integer receiverProvinceId;

    /**
     * 收货人所在地级市/省会城市/县/旗ID
     */
    private Integer receiverCity;

    /**
     * 收货人所在区域/乡/镇
     */
    private Integer receiverRegion;

    /**
     * 收货人所在街道
     */
    private Integer receiverStreet;

    /**
     * 收货人详细地址(具体到楼号/单元号/门牌号)
     */
    private Integer receiverDetailAddress;

    /**
     * 备注
     */
    private String remark;

    /**
     * 确认收货状态   0-未确认    1-已确认
     */
    private Integer confirmStatus;

    /**
     * 确认收货时间
     */
    private Date confirmTime;

    /**
     * 历史订单评价
     */
    private String comment;

    /**
     * 历史订单评价时间
     */
    private Date commentTime;

    /**
     * 历史订单评价星级(1-5的数值)
     */
    private Integer commentStarLevel;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 发货时间
     */
    private Date logisticsTime;

    /**
     * 下单时使用的积分
     */
    private Integer useIntegration;

    /**
     * 历史订单自动确认时间
     */
    private Date autoConfirmTime;

    /**
     * 发票类型   0-不开发票    1-电子发票    2-纸质发票
     */
    private Integer billType;

    /**
     * 发票抬头
     */
    private String billHeader;

    /**
     * 纳税人识别号
     */
    private String taxpayerIdentificationNum;

    /**
     * 收票人邮箱
     */
    private String billReceiverEmail;

    /**
     * 收票人电话
     */
    private String billReceiverPhones;

    /**
     * 活动信息
     */
    private String promotionInfo;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     */
    private BigDecimal integrationAmount;

    /**
     * 优惠券抵扣金额
     */
    private BigDecimal couponAmount;

    /**
     * 管理员后台调整订单使用的折扣金额
     */
    private BigDecimal discountAmount;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间(历史订单创建时间)
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取历史订单ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderHistoryInfoId() {
        return orderHistoryInfoId;
    }

    /**
     * 设置历史订单ID
     * @param orderHistoryInfoId 历史订单ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderHistoryInfoId(Integer orderHistoryInfoId) {
        this.orderHistoryInfoId = orderHistoryInfoId;
    }

    /**
     * 获取历史订单编号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getOrderSerialNum() {
        return orderSerialNum;
    }

    /**
     * 设置历史订单编号
     * @param orderSerialNum 历史订单编号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderSerialNum(String orderSerialNum) {
        this.orderSerialNum = orderSerialNum;
    }

    /**
     * 获取历史订单所属用户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置历史订单所属用户ID
     * @param userId 历史订单所属用户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取历史订单类型  0-普通订单   1-秒杀订单
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 设置历史订单类型  0-普通订单   1-秒杀订单
     * @param orderType 历史订单类型  0-普通订单   1-秒杀订单
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取历史订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置历史订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。
     * @param orderStatus 历史订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取历史订单来源     0-PC端订单；1-app订单
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderSource() {
        return orderSource;
    }

    /**
     * 设置历史订单来源     0-PC端订单；1-app订单
     * @param orderSource 历史订单来源     0-PC端订单；1-app订单
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    /**
     * 获取历史订单总金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getOrderAmountSum() {
        return orderAmountSum;
    }

    /**
     * 设置历史订单总金额
     * @param orderAmountSum 历史订单总金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderAmountSum(BigDecimal orderAmountSum) {
        this.orderAmountSum = orderAmountSum;
    }

    /**
     * 获取支付方式  0-未支付；1-支付宝；2-微信   3-银行卡快捷支付
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付方式  0-未支付；1-支付宝；2-微信   3-银行卡快捷支付
     * @param payType 支付方式  0-未支付；1-支付宝；2-微信   3-银行卡快捷支付
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取应付金额(通常指未优惠时的金额)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置应付金额(通常指未优惠时的金额)
     * @param payAmount 应付金额(通常指未优惠时的金额)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取实付金额(通常指优惠打折后的金额)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getActualPayAmount() {
        return actualPayAmount;
    }

    /**
     * 设置实付金额(通常指优惠打折后的金额)
     * @param actualPayAmount 实付金额(通常指优惠打折后的金额)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setActualPayAmount(BigDecimal actualPayAmount) {
        this.actualPayAmount = actualPayAmount;
    }

    /**
     * 获取历史订单运费
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    /**
     * 设置历史订单运费
     * @param freightAmount 历史订单运费
     *
     * @date 2022-07-12 23:52:08
     */
    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    /**
     * 获取历史订单所属商户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置历史订单所属商户ID
     * @param shopId 历史订单所属商户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取物流公司ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    /**
     * 设置物流公司ID
     * @param logisticsCompanyId 物流公司ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsCompanyId(Integer logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    /**
     * 获取物流单号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLogisticsSerialNum() {
        return logisticsSerialNum;
    }

    /**
     * 设置物流单号
     * @param logisticsSerialNum 物流单号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsSerialNum(String logisticsSerialNum) {
        this.logisticsSerialNum = logisticsSerialNum;
    }

    /**
     * 获取可以获得的积分
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getIntegration() {
        return integration;
    }

    /**
     * 设置可以获得的积分
     * @param integration 可以获得的积分
     *
     * @date 2022-07-12 23:52:08
     */
    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    /**
     * 获取可以获得的欣豆
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getBeans() {
        return beans;
    }

    /**
     * 设置可以获得的欣豆
     * @param beans 可以获得的欣豆
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBeans(Integer beans) {
        this.beans = beans;
    }

    /**
     * 获取收货人姓名
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人姓名
     * @param receiverName 收货人姓名
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取收货人电话
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 设置收货人电话
     * @param receiverPhone 收货人电话
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * 获取收货人邮编
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * 设置收货人邮编
     * @param receiverPostCode 收货人邮编
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    /**
     * 获取收货人所在省份/直辖市ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getReceiverProvinceId() {
        return receiverProvinceId;
    }

    /**
     * 设置收货人所在省份/直辖市ID
     * @param receiverProvinceId 收货人所在省份/直辖市ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiverProvinceId(Integer receiverProvinceId) {
        this.receiverProvinceId = receiverProvinceId;
    }

    /**
     * 获取收货人所在地级市/省会城市/县/旗ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getReceiverCity() {
        return receiverCity;
    }

    /**
     * 设置收货人所在地级市/省会城市/县/旗ID
     * @param receiverCity 收货人所在地级市/省会城市/县/旗ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiverCity(Integer receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * 获取收货人所在区域/乡/镇
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getReceiverRegion() {
        return receiverRegion;
    }

    /**
     * 设置收货人所在区域/乡/镇
     * @param receiverRegion 收货人所在区域/乡/镇
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiverRegion(Integer receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    /**
     * 获取收货人所在街道
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getReceiverStreet() {
        return receiverStreet;
    }

    /**
     * 设置收货人所在街道
     * @param receiverStreet 收货人所在街道
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiverStreet(Integer receiverStreet) {
        this.receiverStreet = receiverStreet;
    }

    /**
     * 获取收货人详细地址(具体到楼号/单元号/门牌号)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    /**
     * 设置收货人详细地址(具体到楼号/单元号/门牌号)
     * @param receiverDetailAddress 收货人详细地址(具体到楼号/单元号/门牌号)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiverDetailAddress(Integer receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    /**
     * 获取备注
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     * @param remark 备注
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取确认收货状态   0-未确认    1-已确认
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * 设置确认收货状态   0-未确认    1-已确认
     * @param confirmStatus 确认收货状态   0-未确认    1-已确认
     *
     * @date 2022-07-12 23:52:08
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * 获取确认收货时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * 设置确认收货时间
     * @param confirmTime 确认收货时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * 获取历史订单评价
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置历史订单评价
     * @param comment 历史订单评价
     *
     * @date 2022-07-12 23:52:08
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取历史订单评价时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * 设置历史订单评价时间
     * @param commentTime 历史订单评价时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * 获取历史订单评价星级(1-5的数值)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommentStarLevel() {
        return commentStarLevel;
    }

    /**
     * 设置历史订单评价星级(1-5的数值)
     * @param commentStarLevel 历史订单评价星级(1-5的数值)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommentStarLevel(Integer commentStarLevel) {
        this.commentStarLevel = commentStarLevel;
    }

    /**
     * 获取支付时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置支付时间
     * @param paymentTime 支付时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取发货时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getLogisticsTime() {
        return logisticsTime;
    }

    /**
     * 设置发货时间
     * @param logisticsTime 发货时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsTime(Date logisticsTime) {
        this.logisticsTime = logisticsTime;
    }

    /**
     * 获取下单时使用的积分
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUseIntegration() {
        return useIntegration;
    }

    /**
     * 设置下单时使用的积分
     * @param useIntegration 下单时使用的积分
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    /**
     * 获取历史订单自动确认时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getAutoConfirmTime() {
        return autoConfirmTime;
    }

    /**
     * 设置历史订单自动确认时间
     * @param autoConfirmTime 历史订单自动确认时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAutoConfirmTime(Date autoConfirmTime) {
        this.autoConfirmTime = autoConfirmTime;
    }

    /**
     * 获取发票类型   0-不开发票    1-电子发票    2-纸质发票
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getBillType() {
        return billType;
    }

    /**
     * 设置发票类型   0-不开发票    1-电子发票    2-纸质发票
     * @param billType 发票类型   0-不开发票    1-电子发票    2-纸质发票
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    /**
     * 获取发票抬头
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBillHeader() {
        return billHeader;
    }

    /**
     * 设置发票抬头
     * @param billHeader 发票抬头
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }

    /**
     * 获取纳税人识别号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getTaxpayerIdentificationNum() {
        return taxpayerIdentificationNum;
    }

    /**
     * 设置纳税人识别号
     * @param taxpayerIdentificationNum 纳税人识别号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTaxpayerIdentificationNum(String taxpayerIdentificationNum) {
        this.taxpayerIdentificationNum = taxpayerIdentificationNum;
    }

    /**
     * 获取收票人邮箱
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    /**
     * 设置收票人邮箱
     * @param billReceiverEmail 收票人邮箱
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    /**
     * 获取收票人电话
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getBillReceiverPhones() {
        return billReceiverPhones;
    }

    /**
     * 设置收票人电话
     * @param billReceiverPhones 收票人电话
     *
     * @date 2022-07-12 23:52:08
     */
    public void setBillReceiverPhones(String billReceiverPhones) {
        this.billReceiverPhones = billReceiverPhones;
    }

    /**
     * 获取活动信息
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * 设置活动信息
     * @param promotionInfo 活动信息
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    /**
     * 获取促销优化金额（促销价、满减、阶梯价）
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * 设置促销优化金额（促销价、满减、阶梯价）
     * @param promotionAmount 促销优化金额（促销价、满减、阶梯价）
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 获取积分抵扣金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * 设置积分抵扣金额
     * @param integrationAmount 积分抵扣金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * 获取优惠券抵扣金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * 设置优惠券抵扣金额
     * @param couponAmount 优惠券抵扣金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * 获取管理员后台调整订单使用的折扣金额
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置管理员后台调整订单使用的折扣金额
     * @param discountAmount 管理员后台调整订单使用的折扣金额
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
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

    /**
     * 获取创建时间(历史订单创建时间)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间(历史订单创建时间)
     * @param createTime 创建时间(历史订单创建时间)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}