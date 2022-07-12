package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * SHOP_INFO
 *
 * @date 2022-07-12 23:52:08
 */
public class ShopInfo implements Serializable {
    /**
     * 商户ID(主键)
     */
    private Integer shopId;

    /**
     * 商户名称
     */
    private String shopName;

    /**
     * 商户法定代表人
     */
    private String legalRepresentative;

    /**
     * 商户法定代表人证件类型
     */
    private String legalRepresentativeIdType;

    /**
     * 商户法定代表人证件号码
     */
    private String legalRepresentativeIdNo;

    /**
     * 商户法定代表人手机号
     */
    private String legalRepresentativePhone;

    /**
     * 商户是否认证 0-未认证   1-已认证   2-认证中
     */
    private Integer authenticationFlag;

    /**
     * 商户认证时间
     */
    private Date authenticationDate;

    /**
     * 商户链接地址
     */
    private String shopLinkAddr;

    /**
     * 商户联系电话
     */
    private String officePhone;

    /**
     * 店铺星级
     */
    private String shopStarLevel;

    /**
     * 店铺语言
     */
    private String shopLanguage;

    /**
     * 店铺说明
     */
    private String shopDesc;

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
     * 获取商户ID(主键)
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置商户ID(主键)
     * @param shopId 商户ID(主键)
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取商户名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置商户名称
     * @param shopName 商户名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 获取商户法定代表人
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * 设置商户法定代表人
     * @param legalRepresentative 商户法定代表人
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    /**
     * 获取商户法定代表人证件类型
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLegalRepresentativeIdType() {
        return legalRepresentativeIdType;
    }

    /**
     * 设置商户法定代表人证件类型
     * @param legalRepresentativeIdType 商户法定代表人证件类型
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLegalRepresentativeIdType(String legalRepresentativeIdType) {
        this.legalRepresentativeIdType = legalRepresentativeIdType;
    }

    /**
     * 获取商户法定代表人证件号码
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLegalRepresentativeIdNo() {
        return legalRepresentativeIdNo;
    }

    /**
     * 设置商户法定代表人证件号码
     * @param legalRepresentativeIdNo 商户法定代表人证件号码
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLegalRepresentativeIdNo(String legalRepresentativeIdNo) {
        this.legalRepresentativeIdNo = legalRepresentativeIdNo;
    }

    /**
     * 获取商户法定代表人手机号
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getLegalRepresentativePhone() {
        return legalRepresentativePhone;
    }

    /**
     * 设置商户法定代表人手机号
     * @param legalRepresentativePhone 商户法定代表人手机号
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLegalRepresentativePhone(String legalRepresentativePhone) {
        this.legalRepresentativePhone = legalRepresentativePhone;
    }

    /**
     * 获取商户是否认证 0-未认证   1-已认证   2-认证中
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getAuthenticationFlag() {
        return authenticationFlag;
    }

    /**
     * 设置商户是否认证 0-未认证   1-已认证   2-认证中
     * @param authenticationFlag 商户是否认证 0-未认证   1-已认证   2-认证中
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAuthenticationFlag(Integer authenticationFlag) {
        this.authenticationFlag = authenticationFlag;
    }

    /**
     * 获取商户认证时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getAuthenticationDate() {
        return authenticationDate;
    }

    /**
     * 设置商户认证时间
     * @param authenticationDate 商户认证时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAuthenticationDate(Date authenticationDate) {
        this.authenticationDate = authenticationDate;
    }

    /**
     * 获取商户链接地址
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getShopLinkAddr() {
        return shopLinkAddr;
    }

    /**
     * 设置商户链接地址
     * @param shopLinkAddr 商户链接地址
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopLinkAddr(String shopLinkAddr) {
        this.shopLinkAddr = shopLinkAddr;
    }

    /**
     * 获取商户联系电话
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * 设置商户联系电话
     * @param officePhone 商户联系电话
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * 获取店铺星级
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getShopStarLevel() {
        return shopStarLevel;
    }

    /**
     * 设置店铺星级
     * @param shopStarLevel 店铺星级
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopStarLevel(String shopStarLevel) {
        this.shopStarLevel = shopStarLevel;
    }

    /**
     * 获取店铺语言
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getShopLanguage() {
        return shopLanguage;
    }

    /**
     * 设置店铺语言
     * @param shopLanguage 店铺语言
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopLanguage(String shopLanguage) {
        this.shopLanguage = shopLanguage;
    }

    /**
     * 获取店铺说明
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getShopDesc() {
        return shopDesc;
    }

    /**
     * 设置店铺说明
     * @param shopDesc 店铺说明
     *
     * @date 2022-07-12 23:52:08
     */
    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
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