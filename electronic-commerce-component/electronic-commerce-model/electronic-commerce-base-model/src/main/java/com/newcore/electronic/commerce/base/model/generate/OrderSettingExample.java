package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * OrderSettingExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public OrderSettingExample() {
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
     * ORDER_SETTING 2022-07-12 23:52:08
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

        public Criteria andOrderSettingIdIsNull() {
            addCriterion("order_setting_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdIsNotNull() {
            addCriterion("order_setting_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdEqualTo(Integer value) {
            addCriterion("order_setting_id =", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdNotEqualTo(Integer value) {
            addCriterion("order_setting_id <>", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdGreaterThan(Integer value) {
            addCriterion("order_setting_id >", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_setting_id >=", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdLessThan(Integer value) {
            addCriterion("order_setting_id <", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_setting_id <=", value, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdIn(List<Integer> values) {
            addCriterion("order_setting_id in", values, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdNotIn(List<Integer> values) {
            addCriterion("order_setting_id not in", values, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdBetween(Integer value1, Integer value2) {
            addCriterion("order_setting_id between", value1, value2, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andOrderSettingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_setting_id not between", value1, value2, "orderSettingId");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeIsNull() {
            addCriterion("flash_order_overtime is null");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeIsNotNull() {
            addCriterion("flash_order_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeEqualTo(Integer value) {
            addCriterion("flash_order_overtime =", value, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeNotEqualTo(Integer value) {
            addCriterion("flash_order_overtime <>", value, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeGreaterThan(Integer value) {
            addCriterion("flash_order_overtime >", value, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("flash_order_overtime >=", value, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeLessThan(Integer value) {
            addCriterion("flash_order_overtime <", value, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("flash_order_overtime <=", value, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeIn(List<Integer> values) {
            addCriterion("flash_order_overtime in", values, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeNotIn(List<Integer> values) {
            addCriterion("flash_order_overtime not in", values, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("flash_order_overtime between", value1, value2, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andFlashOrderOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("flash_order_overtime not between", value1, value2, "flashOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeIsNull() {
            addCriterion("normal_order_overtime is null");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeIsNotNull() {
            addCriterion("normal_order_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeEqualTo(Integer value) {
            addCriterion("normal_order_overtime =", value, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeNotEqualTo(Integer value) {
            addCriterion("normal_order_overtime <>", value, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeGreaterThan(Integer value) {
            addCriterion("normal_order_overtime >", value, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("normal_order_overtime >=", value, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeLessThan(Integer value) {
            addCriterion("normal_order_overtime <", value, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("normal_order_overtime <=", value, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeIn(List<Integer> values) {
            addCriterion("normal_order_overtime in", values, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeNotIn(List<Integer> values) {
            addCriterion("normal_order_overtime not in", values, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("normal_order_overtime between", value1, value2, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andNormalOrderOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("normal_order_overtime not between", value1, value2, "normalOrderOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeIsNull() {
            addCriterion("confirm_overtime is null");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeIsNotNull() {
            addCriterion("confirm_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeEqualTo(Integer value) {
            addCriterion("confirm_overtime =", value, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeNotEqualTo(Integer value) {
            addCriterion("confirm_overtime <>", value, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeGreaterThan(Integer value) {
            addCriterion("confirm_overtime >", value, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_overtime >=", value, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeLessThan(Integer value) {
            addCriterion("confirm_overtime <", value, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_overtime <=", value, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeIn(List<Integer> values) {
            addCriterion("confirm_overtime in", values, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeNotIn(List<Integer> values) {
            addCriterion("confirm_overtime not in", values, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("confirm_overtime between", value1, value2, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andConfirmOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_overtime not between", value1, value2, "confirmOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeIsNull() {
            addCriterion("finish_overtime is null");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeIsNotNull() {
            addCriterion("finish_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeEqualTo(Integer value) {
            addCriterion("finish_overtime =", value, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeNotEqualTo(Integer value) {
            addCriterion("finish_overtime <>", value, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeGreaterThan(Integer value) {
            addCriterion("finish_overtime >", value, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_overtime >=", value, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeLessThan(Integer value) {
            addCriterion("finish_overtime <", value, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("finish_overtime <=", value, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeIn(List<Integer> values) {
            addCriterion("finish_overtime in", values, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeNotIn(List<Integer> values) {
            addCriterion("finish_overtime not in", values, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("finish_overtime between", value1, value2, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andFinishOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_overtime not between", value1, value2, "finishOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeIsNull() {
            addCriterion("comment_overtime is null");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeIsNotNull() {
            addCriterion("comment_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeEqualTo(Integer value) {
            addCriterion("comment_overtime =", value, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeNotEqualTo(Integer value) {
            addCriterion("comment_overtime <>", value, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeGreaterThan(Integer value) {
            addCriterion("comment_overtime >", value, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_overtime >=", value, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeLessThan(Integer value) {
            addCriterion("comment_overtime <", value, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_overtime <=", value, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeIn(List<Integer> values) {
            addCriterion("comment_overtime in", values, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeNotIn(List<Integer> values) {
            addCriterion("comment_overtime not in", values, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("comment_overtime between", value1, value2, "commentOvertime");
            return (Criteria) this;
        }

        public Criteria andCommentOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_overtime not between", value1, value2, "commentOvertime");
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
     * ORDER_SETTING
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ORDER_SETTING 2022-07-12 23:52:08
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