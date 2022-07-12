package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityPropertiesValuesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CommodityPropertiesValuesExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CommodityPropertiesValuesExample() {
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
     * COMMODITY_PROPERTIES_VALUES 2022-07-12 23:52:08
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

        public Criteria andCommodityPropertiesValuesIdIsNull() {
            addCriterion("commodity_properties_values_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdIsNotNull() {
            addCriterion("commodity_properties_values_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdEqualTo(Integer value) {
            addCriterion("commodity_properties_values_id =", value, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdNotEqualTo(Integer value) {
            addCriterion("commodity_properties_values_id <>", value, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdGreaterThan(Integer value) {
            addCriterion("commodity_properties_values_id >", value, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_properties_values_id >=", value, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdLessThan(Integer value) {
            addCriterion("commodity_properties_values_id <", value, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_properties_values_id <=", value, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdIn(List<Integer> values) {
            addCriterion("commodity_properties_values_id in", values, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdNotIn(List<Integer> values) {
            addCriterion("commodity_properties_values_id not in", values, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_properties_values_id between", value1, value2, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_properties_values_id not between", value1, value2, "commodityPropertiesValuesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdIsNull() {
            addCriterion("commodity_properties_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdIsNotNull() {
            addCriterion("commodity_properties_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdEqualTo(Integer value) {
            addCriterion("commodity_properties_id =", value, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdNotEqualTo(Integer value) {
            addCriterion("commodity_properties_id <>", value, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdGreaterThan(Integer value) {
            addCriterion("commodity_properties_id >", value, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_properties_id >=", value, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdLessThan(Integer value) {
            addCriterion("commodity_properties_id <", value, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_properties_id <=", value, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdIn(List<Integer> values) {
            addCriterion("commodity_properties_id in", values, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdNotIn(List<Integer> values) {
            addCriterion("commodity_properties_id not in", values, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_properties_id between", value1, value2, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_properties_id not between", value1, value2, "commodityPropertiesId");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialIsNull() {
            addCriterion("commodity_properties_values_serial is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialIsNotNull() {
            addCriterion("commodity_properties_values_serial is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialEqualTo(String value) {
            addCriterion("commodity_properties_values_serial =", value, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialNotEqualTo(String value) {
            addCriterion("commodity_properties_values_serial <>", value, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialGreaterThan(String value) {
            addCriterion("commodity_properties_values_serial >", value, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_properties_values_serial >=", value, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialLessThan(String value) {
            addCriterion("commodity_properties_values_serial <", value, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialLessThanOrEqualTo(String value) {
            addCriterion("commodity_properties_values_serial <=", value, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialLike(String value) {
            addCriterion("commodity_properties_values_serial like", value, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialNotLike(String value) {
            addCriterion("commodity_properties_values_serial not like", value, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialIn(List<String> values) {
            addCriterion("commodity_properties_values_serial in", values, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialNotIn(List<String> values) {
            addCriterion("commodity_properties_values_serial not in", values, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialBetween(String value1, String value2) {
            addCriterion("commodity_properties_values_serial between", value1, value2, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValuesSerialNotBetween(String value1, String value2) {
            addCriterion("commodity_properties_values_serial not between", value1, value2, "commodityPropertiesValuesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueIsNull() {
            addCriterion("commodity_properties_value is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueIsNotNull() {
            addCriterion("commodity_properties_value is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueEqualTo(String value) {
            addCriterion("commodity_properties_value =", value, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueNotEqualTo(String value) {
            addCriterion("commodity_properties_value <>", value, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueGreaterThan(String value) {
            addCriterion("commodity_properties_value >", value, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_properties_value >=", value, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueLessThan(String value) {
            addCriterion("commodity_properties_value <", value, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueLessThanOrEqualTo(String value) {
            addCriterion("commodity_properties_value <=", value, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueLike(String value) {
            addCriterion("commodity_properties_value like", value, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueNotLike(String value) {
            addCriterion("commodity_properties_value not like", value, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueIn(List<String> values) {
            addCriterion("commodity_properties_value in", values, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueNotIn(List<String> values) {
            addCriterion("commodity_properties_value not in", values, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueBetween(String value1, String value2) {
            addCriterion("commodity_properties_value between", value1, value2, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesValueNotBetween(String value1, String value2) {
            addCriterion("commodity_properties_value not between", value1, value2, "commodityPropertiesValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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
     * COMMODITY_PROPERTIES_VALUES
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COMMODITY_PROPERTIES_VALUES 2022-07-12 23:52:08
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