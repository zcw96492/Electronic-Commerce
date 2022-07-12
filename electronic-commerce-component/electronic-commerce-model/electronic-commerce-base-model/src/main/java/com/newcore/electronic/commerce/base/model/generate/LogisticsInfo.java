package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * LOGISTICS_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class LogisticsInfo implements Serializable {
    /**
     * 物流信息表ID(主键)
     */
    private Integer logisticsInfoId;

    /**
     * 物流编号
     */
    private String logisticsNum;

    /**
     * 所属物流公司
     */
    private Integer logisticsCompanyId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 商品标题
     */
    private String commodityTitle;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 商品所属订单ID
     */
    private Integer orderId;

    /**
     * 商品所属商户ID
     */
    private Integer shopId;

    /**
     * 收货人姓名
     */
    private String receiveName;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date deliverTime;

    /**
     * 快递员编号
     */
    private String courierNum;

    /**
     * 快递员姓名
     */
    private String courierName;

    /**
     * 快递员手机号
     */
    private String courierMobilePhone;

    /**
     * 快递员星级
     */
    private String courierStar;

    /**
     * 包裹所在位置经度
     */
    private Double packageLongitude;

    /**
     * 包裹所在位置纬度
     */
    private Double packageLatitude;

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
     * 获取物流信息表ID(主键)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getLogisticsInfoId() {
        return logisticsInfoId;
    }

    /**
     * 设置物流信息表ID(主键)
     * @param logisticsInfoId 物流信息表ID(主键)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsInfoId(Integer logisticsInfoId) {
        this.logisticsInfoId = logisticsInfoId;
    }

    /**
     * 获取物流编号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLogisticsNum() {
        return logisticsNum;
    }

    /**
     * 设置物流编号
     * @param logisticsNum 物流编号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum;
    }

    /**
     * 获取所属物流公司
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    /**
     * 设置所属物流公司
     * @param logisticsCompanyId 所属物流公司
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLogisticsCompanyId(Integer logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    /**
     * 获取商品ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品ID
     * @param commodityId 商品ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品标题
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityTitle() {
        return commodityTitle;
    }

    /**
     * 设置商品标题
     * @param commodityTitle 商品标题
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityTitle(String commodityTitle) {
        this.commodityTitle = commodityTitle;
    }

    /**
     * 获取商品名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称
     * @param commodityName 商品名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * 获取商品所属订单ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置商品所属订单ID
     * @param orderId 商品所属订单ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商品所属商户ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置商品所属商户ID
     * @param shopId 商品所属商户ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取收货人姓名
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * 设置收货人姓名
     * @param receiveName 收货人姓名
     *
     * @date 2022-07-12 23:52:08
     */
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    /**
     * 获取支付时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     * @param payTime 支付时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取发货时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getDeliverTime() {
        return deliverTime;
    }

    /**
     * 设置发货时间
     * @param deliverTime 发货时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    /**
     * 获取快递员编号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCourierNum() {
        return courierNum;
    }

    /**
     * 设置快递员编号
     * @param courierNum 快递员编号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCourierNum(String courierNum) {
        this.courierNum = courierNum;
    }

    /**
     * 获取快递员姓名
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCourierName() {
        return courierName;
    }

    /**
     * 设置快递员姓名
     * @param courierName 快递员姓名
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    /**
     * 获取快递员手机号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCourierMobilePhone() {
        return courierMobilePhone;
    }

    /**
     * 设置快递员手机号
     * @param courierMobilePhone 快递员手机号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCourierMobilePhone(String courierMobilePhone) {
        this.courierMobilePhone = courierMobilePhone;
    }

    /**
     * 获取快递员星级
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCourierStar() {
        return courierStar;
    }

    /**
     * 设置快递员星级
     * @param courierStar 快递员星级
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCourierStar(String courierStar) {
        this.courierStar = courierStar;
    }

    /**
     * 获取包裹所在位置经度
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Double getPackageLongitude() {
        return packageLongitude;
    }

    /**
     * 设置包裹所在位置经度
     * @param packageLongitude 包裹所在位置经度
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPackageLongitude(Double packageLongitude) {
        this.packageLongitude = packageLongitude;
    }

    /**
     * 获取包裹所在位置纬度
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Double getPackageLatitude() {
        return packageLatitude;
    }

    /**
     * 设置包裹所在位置纬度
     * @param packageLatitude 包裹所在位置纬度
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPackageLatitude(Double packageLatitude) {
        this.packageLatitude = packageLatitude;
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