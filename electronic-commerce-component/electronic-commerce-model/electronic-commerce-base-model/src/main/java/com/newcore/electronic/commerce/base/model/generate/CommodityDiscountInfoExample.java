package com.newcore.electronic.commerce.base.model.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityDiscountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CommodityDiscountInfoExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CommodityDiscountInfoExample() {
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
     * COMMODITY_DISCOUNT_INFO 2022-07-12 23:52:08
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

        public Criteria andCommodityDiscountInfoIdIsNull() {
            addCriterion("commodity_discount_info_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdIsNotNull() {
            addCriterion("commodity_discount_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdEqualTo(Integer value) {
            addCriterion("commodity_discount_info_id =", value, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdNotEqualTo(Integer value) {
            addCriterion("commodity_discount_info_id <>", value, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdGreaterThan(Integer value) {
            addCriterion("commodity_discount_info_id >", value, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_discount_info_id >=", value, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdLessThan(Integer value) {
            addCriterion("commodity_discount_info_id <", value, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_discount_info_id <=", value, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdIn(List<Integer> values) {
            addCriterion("commodity_discount_info_id in", values, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdNotIn(List<Integer> values) {
            addCriterion("commodity_discount_info_id not in", values, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_discount_info_id between", value1, value2, "commodityDiscountInfoId");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_discount_info_id not between", value1, value2, "commodityDiscountInfoId");
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

        public Criteria andCommodityDiscountIsNull() {
            addCriterion("commodity_discount is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountIsNotNull() {
            addCriterion("commodity_discount is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountEqualTo(BigDecimal value) {
            addCriterion("commodity_discount =", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountNotEqualTo(BigDecimal value) {
            addCriterion("commodity_discount <>", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountGreaterThan(BigDecimal value) {
            addCriterion("commodity_discount >", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_discount >=", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountLessThan(BigDecimal value) {
            addCriterion("commodity_discount <", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_discount <=", value, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountIn(List<BigDecimal> values) {
            addCriterion("commodity_discount in", values, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountNotIn(List<BigDecimal> values) {
            addCriterion("commodity_discount not in", values, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_discount between", value1, value2, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andCommodityDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_discount not between", value1, value2, "commodityDiscount");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeIsNull() {
            addCriterion("discount_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeIsNotNull() {
            addCriterion("discount_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeEqualTo(Date value) {
            addCriterion("discount_start_time =", value, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeNotEqualTo(Date value) {
            addCriterion("discount_start_time <>", value, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeGreaterThan(Date value) {
            addCriterion("discount_start_time >", value, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discount_start_time >=", value, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeLessThan(Date value) {
            addCriterion("discount_start_time <", value, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("discount_start_time <=", value, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeIn(List<Date> values) {
            addCriterion("discount_start_time in", values, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeNotIn(List<Date> values) {
            addCriterion("discount_start_time not in", values, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeBetween(Date value1, Date value2) {
            addCriterion("discount_start_time between", value1, value2, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("discount_start_time not between", value1, value2, "discountStartTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeIsNull() {
            addCriterion("discount_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeIsNotNull() {
            addCriterion("discount_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeEqualTo(Date value) {
            addCriterion("discount_end_time =", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeNotEqualTo(Date value) {
            addCriterion("discount_end_time <>", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeGreaterThan(Date value) {
            addCriterion("discount_end_time >", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discount_end_time >=", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeLessThan(Date value) {
            addCriterion("discount_end_time <", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("discount_end_time <=", value, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeIn(List<Date> values) {
            addCriterion("discount_end_time in", values, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeNotIn(List<Date> values) {
            addCriterion("discount_end_time not in", values, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeBetween(Date value1, Date value2) {
            addCriterion("discount_end_time between", value1, value2, "discountEndTime");
            return (Criteria) this;
        }

        public Criteria andDiscountEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("discount_end_time not between", value1, value2, "discountEndTime");
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
     * COMMODITY_DISCOUNT_INFO
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COMMODITY_DISCOUNT_INFO 2022-07-12 23:52:08
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