package com.newcore.electronic.commerce.base.model.generate;

import java.io.Serializable;
import java.util.Date;

/**
 * COMMODITY_COMMENT
 *
 * @date 2022-07-12 23:52:08
 */
public class CommodityComment implements Serializable {
    /**
     * 商品评价ID
     */
    private Integer commodityCommentId;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 评价类型   0-好评    1-中评    2-差评
     */
    private Integer commentType;

    /**
     * 评价内容
     */
    private String commentDescription;

    /**
     * 追加评价
     */
    private String additionalEvaluation;

    /**
     * 评价图片链接地址
     */
    private String commentPicUrl;

    /**
     * 删除标识   0-未删除  1-已删除
     */
    private Integer delFlag;

    /**
     * 追加评价时间
     */
    private Date additionalEvaluationTime;

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
     * 获取商品评价ID
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommodityCommentId() {
        return commodityCommentId;
    }

    /**
     * 设置商品评价ID
     * @param commodityCommentId 商品评价ID
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommodityCommentId(Integer commodityCommentId) {
        this.commodityCommentId = commodityCommentId;
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
     * 获取评价类型   0-好评    1-中评    2-差评
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getCommentType() {
        return commentType;
    }

    /**
     * 设置评价类型   0-好评    1-中评    2-差评
     * @param commentType 评价类型   0-好评    1-中评    2-差评
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    /**
     * 获取评价内容
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommentDescription() {
        return commentDescription;
    }

    /**
     * 设置评价内容
     * @param commentDescription 评价内容
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }

    /**
     * 获取追加评价
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getAdditionalEvaluation() {
        return additionalEvaluation;
    }

    /**
     * 设置追加评价
     * @param additionalEvaluation 追加评价
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAdditionalEvaluation(String additionalEvaluation) {
        this.additionalEvaluation = additionalEvaluation;
    }

    /**
     * 获取评价图片链接地址
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public String getCommentPicUrl() {
        return commentPicUrl;
    }

    /**
     * 设置评价图片链接地址
     * @param commentPicUrl 评价图片链接地址
     *
     * @date 2022-07-12 23:52:08
     */
    public void setCommentPicUrl(String commentPicUrl) {
        this.commentPicUrl = commentPicUrl;
    }

    /**
     * 获取删除标识   0-未删除  1-已删除
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识   0-未删除  1-已删除
     * @param delFlag 删除标识   0-未删除  1-已删除
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取追加评价时间
     *
     * @date 2022-07-12 23:52:08
     * @return  
     */
    public Date getAdditionalEvaluationTime() {
        return additionalEvaluationTime;
    }

    /**
     * 设置追加评价时间
     * @param additionalEvaluationTime 追加评价时间
     *
     * @date 2022-07-12 23:52:08
     */
    public void setAdditionalEvaluationTime(Date additionalEvaluationTime) {
        this.additionalEvaluationTime = additionalEvaluationTime;
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