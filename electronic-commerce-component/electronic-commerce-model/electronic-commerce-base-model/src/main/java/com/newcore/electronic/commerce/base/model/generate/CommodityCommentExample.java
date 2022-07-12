package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CommodityCommentExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CommodityCommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal 方法
     *
     * @date 2022-07-12 23:52:08
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * COMMODITY_COMMENT 2022-07-12 23:52:08
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCommodityCommentIdIsNull() {
            addCriterion("commodity_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdIsNotNull() {
            addCriterion("commodity_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdEqualTo(Integer value) {
            addCriterion("commodity_comment_id =", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdNotEqualTo(Integer value) {
            addCriterion("commodity_comment_id <>", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdGreaterThan(Integer value) {
            addCriterion("commodity_comment_id >", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_comment_id >=", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdLessThan(Integer value) {
            addCriterion("commodity_comment_id <", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_comment_id <=", value, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdIn(List<Integer> values) {
            addCriterion("commodity_comment_id in", values, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdNotIn(List<Integer> values) {
            addCriterion("commodity_comment_id not in", values, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_comment_id between", value1, value2, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_comment_id not between", value1, value2, "commodityCommentId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Integer value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Integer value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Integer value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Integer value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Integer> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Integer> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNull() {
            addCriterion("comment_type is null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNotNull() {
            addCriterion("comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeEqualTo(Integer value) {
            addCriterion("comment_type =", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotEqualTo(Integer value) {
            addCriterion("comment_type <>", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThan(Integer value) {
            addCriterion("comment_type >", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_type >=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThan(Integer value) {
            addCriterion("comment_type <", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_type <=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIn(List<Integer> values) {
            addCriterion("comment_type in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotIn(List<Integer> values) {
            addCriterion("comment_type not in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeBetween(Integer value1, Integer value2) {
            addCriterion("comment_type between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_type not between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIsNull() {
            addCriterion("comment_description is null");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIsNotNull() {
            addCriterion("comment_description is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionEqualTo(String value) {
            addCriterion("comment_description =", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotEqualTo(String value) {
            addCriterion("comment_description <>", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionGreaterThan(String value) {
            addCriterion("comment_description >", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("comment_description >=", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLessThan(String value) {
            addCriterion("comment_description <", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLessThanOrEqualTo(String value) {
            addCriterion("comment_description <=", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLike(String value) {
            addCriterion("comment_description like", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotLike(String value) {
            addCriterion("comment_description not like", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIn(List<String> values) {
            addCriterion("comment_description in", values, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotIn(List<String> values) {
            addCriterion("comment_description not in", values, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionBetween(String value1, String value2) {
            addCriterion("comment_description between", value1, value2, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotBetween(String value1, String value2) {
            addCriterion("comment_description not between", value1, value2, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationIsNull() {
            addCriterion("additional_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationIsNotNull() {
            addCriterion("additional_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationEqualTo(String value) {
            addCriterion("additional_evaluation =", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotEqualTo(String value) {
            addCriterion("additional_evaluation <>", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationGreaterThan(String value) {
            addCriterion("additional_evaluation >", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("additional_evaluation >=", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationLessThan(String value) {
            addCriterion("additional_evaluation <", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationLessThanOrEqualTo(String value) {
            addCriterion("additional_evaluation <=", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationLike(String value) {
            addCriterion("additional_evaluation like", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotLike(String value) {
            addCriterion("additional_evaluation not like", value, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationIn(List<String> values) {
            addCriterion("additional_evaluation in", values, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotIn(List<String> values) {
            addCriterion("additional_evaluation not in", values, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationBetween(String value1, String value2) {
            addCriterion("additional_evaluation between", value1, value2, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationNotBetween(String value1, String value2) {
            addCriterion("additional_evaluation not between", value1, value2, "additionalEvaluation");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlIsNull() {
            addCriterion("comment_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlIsNotNull() {
            addCriterion("comment_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlEqualTo(String value) {
            addCriterion("comment_pic_url =", value, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlNotEqualTo(String value) {
            addCriterion("comment_pic_url <>", value, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlGreaterThan(String value) {
            addCriterion("comment_pic_url >", value, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("comment_pic_url >=", value, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlLessThan(String value) {
            addCriterion("comment_pic_url <", value, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlLessThanOrEqualTo(String value) {
            addCriterion("comment_pic_url <=", value, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlLike(String value) {
            addCriterion("comment_pic_url like", value, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlNotLike(String value) {
            addCriterion("comment_pic_url not like", value, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlIn(List<String> values) {
            addCriterion("comment_pic_url in", values, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlNotIn(List<String> values) {
            addCriterion("comment_pic_url not in", values, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlBetween(String value1, String value2) {
            addCriterion("comment_pic_url between", value1, value2, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andCommentPicUrlNotBetween(String value1, String value2) {
            addCriterion("comment_pic_url not between", value1, value2, "commentPicUrl");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeIsNull() {
            addCriterion("additional_evaluation_time is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeIsNotNull() {
            addCriterion("additional_evaluation_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeEqualTo(Date value) {
            addCriterion("additional_evaluation_time =", value, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeNotEqualTo(Date value) {
            addCriterion("additional_evaluation_time <>", value, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeGreaterThan(Date value) {
            addCriterion("additional_evaluation_time >", value, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("additional_evaluation_time >=", value, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeLessThan(Date value) {
            addCriterion("additional_evaluation_time <", value, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeLessThanOrEqualTo(Date value) {
            addCriterion("additional_evaluation_time <=", value, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeIn(List<Date> values) {
            addCriterion("additional_evaluation_time in", values, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeNotIn(List<Date> values) {
            addCriterion("additional_evaluation_time not in", values, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeBetween(Date value1, Date value2) {
            addCriterion("additional_evaluation_time between", value1, value2, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andAdditionalEvaluationTimeNotBetween(Date value1, Date value2) {
            addCriterion("additional_evaluation_time not between", value1, value2, "additionalEvaluationTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * COMMODITY_COMMENT
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COMMODITY_COMMENT 2022-07-12 23:52:08
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}