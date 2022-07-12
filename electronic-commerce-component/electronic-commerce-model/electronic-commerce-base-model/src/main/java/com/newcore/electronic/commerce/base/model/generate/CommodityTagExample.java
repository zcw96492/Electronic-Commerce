package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityTagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CommodityTagExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CommodityTagExample() {
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
     * COMMODITY_TAG 2022-07-12 23:52:08
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

        public Criteria andCommodityTagIdIsNull() {
            addCriterion("commodity_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdIsNotNull() {
            addCriterion("commodity_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdEqualTo(Integer value) {
            addCriterion("commodity_tag_id =", value, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdNotEqualTo(Integer value) {
            addCriterion("commodity_tag_id <>", value, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdGreaterThan(Integer value) {
            addCriterion("commodity_tag_id >", value, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_tag_id >=", value, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdLessThan(Integer value) {
            addCriterion("commodity_tag_id <", value, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_tag_id <=", value, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdIn(List<Integer> values) {
            addCriterion("commodity_tag_id in", values, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdNotIn(List<Integer> values) {
            addCriterion("commodity_tag_id not in", values, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_tag_id between", value1, value2, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andCommodityTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_tag_id not between", value1, value2, "commodityTagId");
            return (Criteria) this;
        }

        public Criteria andTagSerialIsNull() {
            addCriterion("tag_serial is null");
            return (Criteria) this;
        }

        public Criteria andTagSerialIsNotNull() {
            addCriterion("tag_serial is not null");
            return (Criteria) this;
        }

        public Criteria andTagSerialEqualTo(Integer value) {
            addCriterion("tag_serial =", value, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialNotEqualTo(Integer value) {
            addCriterion("tag_serial <>", value, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialGreaterThan(Integer value) {
            addCriterion("tag_serial >", value, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag_serial >=", value, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialLessThan(Integer value) {
            addCriterion("tag_serial <", value, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialLessThanOrEqualTo(Integer value) {
            addCriterion("tag_serial <=", value, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialIn(List<Integer> values) {
            addCriterion("tag_serial in", values, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialNotIn(List<Integer> values) {
            addCriterion("tag_serial not in", values, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialBetween(Integer value1, Integer value2) {
            addCriterion("tag_serial between", value1, value2, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("tag_serial not between", value1, value2, "tagSerial");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumIsNull() {
            addCriterion("tag_type_num is null");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumIsNotNull() {
            addCriterion("tag_type_num is not null");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumEqualTo(Integer value) {
            addCriterion("tag_type_num =", value, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumNotEqualTo(Integer value) {
            addCriterion("tag_type_num <>", value, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumGreaterThan(Integer value) {
            addCriterion("tag_type_num >", value, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag_type_num >=", value, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumLessThan(Integer value) {
            addCriterion("tag_type_num <", value, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumLessThanOrEqualTo(Integer value) {
            addCriterion("tag_type_num <=", value, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumIn(List<Integer> values) {
            addCriterion("tag_type_num in", values, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumNotIn(List<Integer> values) {
            addCriterion("tag_type_num not in", values, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumBetween(Integer value1, Integer value2) {
            addCriterion("tag_type_num between", value1, value2, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tag_type_num not between", value1, value2, "tagTypeNum");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameIsNull() {
            addCriterion("tag_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameIsNotNull() {
            addCriterion("tag_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameEqualTo(String value) {
            addCriterion("tag_type_name =", value, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameNotEqualTo(String value) {
            addCriterion("tag_type_name <>", value, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameGreaterThan(String value) {
            addCriterion("tag_type_name >", value, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("tag_type_name >=", value, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameLessThan(String value) {
            addCriterion("tag_type_name <", value, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameLessThanOrEqualTo(String value) {
            addCriterion("tag_type_name <=", value, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameLike(String value) {
            addCriterion("tag_type_name like", value, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameNotLike(String value) {
            addCriterion("tag_type_name not like", value, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameIn(List<String> values) {
            addCriterion("tag_type_name in", values, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameNotIn(List<String> values) {
            addCriterion("tag_type_name not in", values, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameBetween(String value1, String value2) {
            addCriterion("tag_type_name between", value1, value2, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagTypeNameNotBetween(String value1, String value2) {
            addCriterion("tag_type_name not between", value1, value2, "tagTypeName");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNull() {
            addCriterion("tag_name is null");
            return (Criteria) this;
        }

        public Criteria andTagNameIsNotNull() {
            addCriterion("tag_name is not null");
            return (Criteria) this;
        }

        public Criteria andTagNameEqualTo(String value) {
            addCriterion("tag_name =", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotEqualTo(String value) {
            addCriterion("tag_name <>", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThan(String value) {
            addCriterion("tag_name >", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameGreaterThanOrEqualTo(String value) {
            addCriterion("tag_name >=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThan(String value) {
            addCriterion("tag_name <", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLessThanOrEqualTo(String value) {
            addCriterion("tag_name <=", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameLike(String value) {
            addCriterion("tag_name like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotLike(String value) {
            addCriterion("tag_name not like", value, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameIn(List<String> values) {
            addCriterion("tag_name in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotIn(List<String> values) {
            addCriterion("tag_name not in", values, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameBetween(String value1, String value2) {
            addCriterion("tag_name between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagNameNotBetween(String value1, String value2) {
            addCriterion("tag_name not between", value1, value2, "tagName");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionIsNull() {
            addCriterion("tag_description is null");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionIsNotNull() {
            addCriterion("tag_description is not null");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionEqualTo(String value) {
            addCriterion("tag_description =", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionNotEqualTo(String value) {
            addCriterion("tag_description <>", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionGreaterThan(String value) {
            addCriterion("tag_description >", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("tag_description >=", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionLessThan(String value) {
            addCriterion("tag_description <", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionLessThanOrEqualTo(String value) {
            addCriterion("tag_description <=", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionLike(String value) {
            addCriterion("tag_description like", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionNotLike(String value) {
            addCriterion("tag_description not like", value, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionIn(List<String> values) {
            addCriterion("tag_description in", values, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionNotIn(List<String> values) {
            addCriterion("tag_description not in", values, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionBetween(String value1, String value2) {
            addCriterion("tag_description between", value1, value2, "tagDescription");
            return (Criteria) this;
        }

        public Criteria andTagDescriptionNotBetween(String value1, String value2) {
            addCriterion("tag_description not between", value1, value2, "tagDescription");
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
     * COMMODITY_TAG
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COMMODITY_TAG 2022-07-12 23:52:08
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