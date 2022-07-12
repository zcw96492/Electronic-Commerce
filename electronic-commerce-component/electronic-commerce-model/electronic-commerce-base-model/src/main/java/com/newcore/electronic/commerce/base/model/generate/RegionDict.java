package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * REGION_DICT
 *
 * @date 2022-07-12 23:52:08
 */
public class RegionDict implements Serializable {
    /**
     * 地区ID
     */
    private Integer regionId;

    /**
     * 地区父ID
     */
    private Integer parentRegionId;

    /**
     * 地区名称
     */
    private String regionName;

    /**
     * 地区类型  0.省/直辖市/港澳台   1.地级市   2.旗/县/区   3.乡/镇   4.村
     */
    private Integer regionType;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

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
     * 获取地区ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getRegionId() {
        return regionId;
    }

    /**
     * 设置地区ID
     * @param regionId 地区ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取地区父ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getParentRegionId() {
        return parentRegionId;
    }

    /**
     * 设置地区父ID
     * @param parentRegionId 地区父ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setParentRegionId(Integer parentRegionId) {
        this.parentRegionId = parentRegionId;
    }

    /**
     * 获取地区名称
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 设置地区名称
     * @param regionName 地区名称
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * 获取地区类型  0.省/直辖市/港澳台   1.地级市   2.旗/县/区   3.乡/镇   4.村
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getRegionType() {
        return regionType;
    }

    /**
     * 设置地区类型  0.省/直辖市/港澳台   1.地级市   2.旗/县/区   3.乡/镇   4.村
     * @param regionType 地区类型  0.省/直辖市/港澳台   1.地级市   2.旗/县/区   3.乡/镇   4.村
     *
     * @date 2022-07-12 23:52:08
     */
    public void setRegionType(Integer regionType) {
        this.regionType = regionType;
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
     * 获取经度
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     * @param longitude 经度
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     * @param latitude 纬度
     *
     * @date 2022-07-12 23:52:08
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
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