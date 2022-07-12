package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * ACCOUNT_DELIVERY_ADDRESS
 *
 * @date 2022-07-12 23:52:08
 */
public class AccountDeliveryAddress implements Serializable {
    /**
     * 收货地址id
     */
    private Integer deliveryAddressId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 收货人姓名
     */
    private String consignee;

    /**
     * 省份id
     */
    private Integer provinceId;

    /**
     * 市(县,旗)
     */
    private Integer cityId;

    /**
     * 区(乡/镇)
     */
    private Integer districtId;

    /**
     * 街道(社区)
     */
    private Integer streetId;

    /**
     * 详细地址(具体到楼号、单元号、门牌号)
     */
    private String detailAddress;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 手机号
     */
    private String mobilePhone;

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
     * 获取收货地址id
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDeliveryAddressId() {
        return deliveryAddressId;
    }

    /**
     * 设置收货地址id
     * @param deliveryAddressId 收货地址id
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDeliveryAddressId(Integer deliveryAddressId) {
        this.deliveryAddressId = deliveryAddressId;
    }

    /**
     * 获取用户id
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     * @param userId 用户id
     *
     * @date 2022-07-12 23:52:08
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取收货人姓名
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置收货人姓名
     * @param consignee 收货人姓名
     *
     * @date 2022-07-12 23:52:08
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 获取省份id
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置省份id
     * @param provinceId 省份id
     *
     * @date 2022-07-12 23:52:08
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取市(县,旗)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置市(县,旗)
     * @param cityId 市(县,旗)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取区(乡/镇)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDistrictId() {
        return districtId;
    }

    /**
     * 设置区(乡/镇)
     * @param districtId 区(乡/镇)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    /**
     * 获取街道(社区)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getStreetId() {
        return streetId;
    }

    /**
     * 设置街道(社区)
     * @param streetId 街道(社区)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    /**
     * 获取详细地址(具体到楼号、单元号、门牌号)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 设置详细地址(具体到楼号、单元号、门牌号)
     * @param detailAddress 详细地址(具体到楼号、单元号、门牌号)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    /**
     * 获取邮政编码
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 设置邮政编码
     * @param postCode 邮政编码
     *
     * @date 2022-07-12 23:52:08
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 获取联系电话
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置联系电话
     * @param telephone 联系电话
     *
     * @date 2022-07-12 23:52:08
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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