package com.newcore.electronic.commerce.base.model.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayTurnoverInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * PayTurnoverInfoExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public PayTurnoverInfoExample() {
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
     * PAY_TURNOVER_INFO 2022-07-12 23:52:08
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

        public Criteria andPayTurnoverInfoIdIsNull() {
            addCriterion("pay_turnover_info_id is null");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdIsNotNull() {
            addCriterion("pay_turnover_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdEqualTo(Integer value) {
            addCriterion("pay_turnover_info_id =", value, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdNotEqualTo(Integer value) {
            addCriterion("pay_turnover_info_id <>", value, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdGreaterThan(Integer value) {
            addCriterion("pay_turnover_info_id >", value, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_turnover_info_id >=", value, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdLessThan(Integer value) {
            addCriterion("pay_turnover_info_id <", value, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_turnover_info_id <=", value, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdIn(List<Integer> values) {
            addCriterion("pay_turnover_info_id in", values, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdNotIn(List<Integer> values) {
            addCriterion("pay_turnover_info_id not in", values, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_turnover_info_id between", value1, value2, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_turnover_info_id not between", value1, value2, "payTurnoverInfoId");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialIsNull() {
            addCriterion("pay_turnover_serial is null");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialIsNotNull() {
            addCriterion("pay_turnover_serial is not null");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialEqualTo(String value) {
            addCriterion("pay_turnover_serial =", value, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialNotEqualTo(String value) {
            addCriterion("pay_turnover_serial <>", value, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialGreaterThan(String value) {
            addCriterion("pay_turnover_serial >", value, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialGreaterThanOrEqualTo(String value) {
            addCriterion("pay_turnover_serial >=", value, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialLessThan(String value) {
            addCriterion("pay_turnover_serial <", value, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialLessThanOrEqualTo(String value) {
            addCriterion("pay_turnover_serial <=", value, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialLike(String value) {
            addCriterion("pay_turnover_serial like", value, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialNotLike(String value) {
            addCriterion("pay_turnover_serial not like", value, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialIn(List<String> values) {
            addCriterion("pay_turnover_serial in", values, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialNotIn(List<String> values) {
            addCriterion("pay_turnover_serial not in", values, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialBetween(String value1, String value2) {
            addCriterion("pay_turnover_serial between", value1, value2, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andPayTurnoverSerialNotBetween(String value1, String value2) {
            addCriterion("pay_turnover_serial not between", value1, value2, "payTurnoverSerial");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Integer value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Integer> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Integer> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andOrderSerialIsNull() {
            addCriterion("order_serial is null");
            return (Criteria) this;
        }

        public Criteria andOrderSerialIsNotNull() {
            addCriterion("order_serial is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSerialEqualTo(String value) {
            addCriterion("order_serial =", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNotEqualTo(String value) {
            addCriterion("order_serial <>", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialGreaterThan(String value) {
            addCriterion("order_serial >", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialGreaterThanOrEqualTo(String value) {
            addCriterion("order_serial >=", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialLessThan(String value) {
            addCriterion("order_serial <", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialLessThanOrEqualTo(String value) {
            addCriterion("order_serial <=", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialLike(String value) {
            addCriterion("order_serial like", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNotLike(String value) {
            addCriterion("order_serial not like", value, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialIn(List<String> values) {
            addCriterion("order_serial in", values, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNotIn(List<String> values) {
            addCriterion("order_serial not in", values, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialBetween(String value1, String value2) {
            addCriterion("order_serial between", value1, value2, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNotBetween(String value1, String value2) {
            addCriterion("order_serial not between", value1, value2, "orderSerial");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(Integer value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Integer value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Integer value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Integer value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Integer value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Integer> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Integer> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Integer value1, Integer value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayAmntIsNull() {
            addCriterion("pay_amnt is null");
            return (Criteria) this;
        }

        public Criteria andPayAmntIsNotNull() {
            addCriterion("pay_amnt is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmntEqualTo(BigDecimal value) {
            addCriterion("pay_amnt =", value, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntNotEqualTo(BigDecimal value) {
            addCriterion("pay_amnt <>", value, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntGreaterThan(BigDecimal value) {
            addCriterion("pay_amnt >", value, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amnt >=", value, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntLessThan(BigDecimal value) {
            addCriterion("pay_amnt <", value, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amnt <=", value, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntIn(List<BigDecimal> values) {
            addCriterion("pay_amnt in", values, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntNotIn(List<BigDecimal> values) {
            addCriterion("pay_amnt not in", values, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amnt between", value1, value2, "payAmnt");
            return (Criteria) this;
        }

        public Criteria andPayAmntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amnt not between", value1, value2, "payAmnt");
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
    }

    /**
     * PAY_TURNOVER_INFO
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PAY_TURNOVER_INFO 2022-07-12 23:52:08
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