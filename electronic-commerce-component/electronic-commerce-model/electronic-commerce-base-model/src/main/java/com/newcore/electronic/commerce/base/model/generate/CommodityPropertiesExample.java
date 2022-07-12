package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityPropertiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CommodityPropertiesExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CommodityPropertiesExample() {
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
     * COMMODITY_PROPERTIES 2022-07-12 23:52:08
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

        public Criteria andCommodityPropertiesSerialIsNull() {
            addCriterion("commodity_properties_serial is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialIsNotNull() {
            addCriterion("commodity_properties_serial is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialEqualTo(String value) {
            addCriterion("commodity_properties_serial =", value, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialNotEqualTo(String value) {
            addCriterion("commodity_properties_serial <>", value, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialGreaterThan(String value) {
            addCriterion("commodity_properties_serial >", value, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_properties_serial >=", value, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialLessThan(String value) {
            addCriterion("commodity_properties_serial <", value, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialLessThanOrEqualTo(String value) {
            addCriterion("commodity_properties_serial <=", value, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialLike(String value) {
            addCriterion("commodity_properties_serial like", value, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialNotLike(String value) {
            addCriterion("commodity_properties_serial not like", value, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialIn(List<String> values) {
            addCriterion("commodity_properties_serial in", values, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialNotIn(List<String> values) {
            addCriterion("commodity_properties_serial not in", values, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialBetween(String value1, String value2) {
            addCriterion("commodity_properties_serial between", value1, value2, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesSerialNotBetween(String value1, String value2) {
            addCriterion("commodity_properties_serial not between", value1, value2, "commodityPropertiesSerial");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameIsNull() {
            addCriterion("commodity_properties_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameIsNotNull() {
            addCriterion("commodity_properties_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameEqualTo(String value) {
            addCriterion("commodity_properties_name =", value, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameNotEqualTo(String value) {
            addCriterion("commodity_properties_name <>", value, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameGreaterThan(String value) {
            addCriterion("commodity_properties_name >", value, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_properties_name >=", value, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameLessThan(String value) {
            addCriterion("commodity_properties_name <", value, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_properties_name <=", value, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameLike(String value) {
            addCriterion("commodity_properties_name like", value, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameNotLike(String value) {
            addCriterion("commodity_properties_name not like", value, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameIn(List<String> values) {
            addCriterion("commodity_properties_name in", values, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameNotIn(List<String> values) {
            addCriterion("commodity_properties_name not in", values, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameBetween(String value1, String value2) {
            addCriterion("commodity_properties_name between", value1, value2, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesNameNotBetween(String value1, String value2) {
            addCriterion("commodity_properties_name not between", value1, value2, "commodityPropertiesName");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeIsNull() {
            addCriterion("commodity_properties_type is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeIsNotNull() {
            addCriterion("commodity_properties_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeEqualTo(Integer value) {
            addCriterion("commodity_properties_type =", value, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeNotEqualTo(Integer value) {
            addCriterion("commodity_properties_type <>", value, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeGreaterThan(Integer value) {
            addCriterion("commodity_properties_type >", value, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_properties_type >=", value, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeLessThan(Integer value) {
            addCriterion("commodity_properties_type <", value, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_properties_type <=", value, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeIn(List<Integer> values) {
            addCriterion("commodity_properties_type in", values, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeNotIn(List<Integer> values) {
            addCriterion("commodity_properties_type not in", values, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeBetween(Integer value1, Integer value2) {
            addCriterion("commodity_properties_type between", value1, value2, "commodityPropertiesType");
            return (Criteria) this;
        }

        public Criteria andCommodityPropertiesTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_properties_type not between", value1, value2, "commodityPropertiesType");
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
     * COMMODITY_PROPERTIES
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COMMODITY_PROPERTIES 2022-07-12 23:52:08
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