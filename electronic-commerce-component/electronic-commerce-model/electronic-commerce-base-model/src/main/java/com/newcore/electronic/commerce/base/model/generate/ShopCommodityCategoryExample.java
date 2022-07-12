package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopCommodityCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * ShopCommodityCategoryExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public ShopCommodityCategoryExample() {
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
     * SHOP_COMMODITY_CATEGORY 2022-07-12 23:52:08
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

        public Criteria andShopCommodityCategoryIdIsNull() {
            addCriterion("shop_commodity_category_id is null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdIsNotNull() {
            addCriterion("shop_commodity_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdEqualTo(Integer value) {
            addCriterion("shop_commodity_category_id =", value, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdNotEqualTo(Integer value) {
            addCriterion("shop_commodity_category_id <>", value, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdGreaterThan(Integer value) {
            addCriterion("shop_commodity_category_id >", value, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_commodity_category_id >=", value, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdLessThan(Integer value) {
            addCriterion("shop_commodity_category_id <", value, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_commodity_category_id <=", value, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdIn(List<Integer> values) {
            addCriterion("shop_commodity_category_id in", values, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdNotIn(List<Integer> values) {
            addCriterion("shop_commodity_category_id not in", values, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_commodity_category_id between", value1, value2, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_commodity_category_id not between", value1, value2, "shopCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialIsNull() {
            addCriterion("shop_category_serial is null");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialIsNotNull() {
            addCriterion("shop_category_serial is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialEqualTo(Integer value) {
            addCriterion("shop_category_serial =", value, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialNotEqualTo(Integer value) {
            addCriterion("shop_category_serial <>", value, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialGreaterThan(Integer value) {
            addCriterion("shop_category_serial >", value, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_category_serial >=", value, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialLessThan(Integer value) {
            addCriterion("shop_category_serial <", value, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialLessThanOrEqualTo(Integer value) {
            addCriterion("shop_category_serial <=", value, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialIn(List<Integer> values) {
            addCriterion("shop_category_serial in", values, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialNotIn(List<Integer> values) {
            addCriterion("shop_category_serial not in", values, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialBetween(Integer value1, Integer value2) {
            addCriterion("shop_category_serial between", value1, value2, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategorySerialNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_category_serial not between", value1, value2, "shopCategorySerial");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIsNull() {
            addCriterion("shop_category_name is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIsNotNull() {
            addCriterion("shop_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameEqualTo(String value) {
            addCriterion("shop_category_name =", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotEqualTo(String value) {
            addCriterion("shop_category_name <>", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameGreaterThan(String value) {
            addCriterion("shop_category_name >", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_category_name >=", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLessThan(String value) {
            addCriterion("shop_category_name <", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("shop_category_name <=", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameLike(String value) {
            addCriterion("shop_category_name like", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotLike(String value) {
            addCriterion("shop_category_name not like", value, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameIn(List<String> values) {
            addCriterion("shop_category_name in", values, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotIn(List<String> values) {
            addCriterion("shop_category_name not in", values, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameBetween(String value1, String value2) {
            addCriterion("shop_category_name between", value1, value2, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryNameNotBetween(String value1, String value2) {
            addCriterion("shop_category_name not between", value1, value2, "shopCategoryName");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeIsNull() {
            addCriterion("shop_category_grade is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeIsNotNull() {
            addCriterion("shop_category_grade is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeEqualTo(Integer value) {
            addCriterion("shop_category_grade =", value, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeNotEqualTo(Integer value) {
            addCriterion("shop_category_grade <>", value, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeGreaterThan(Integer value) {
            addCriterion("shop_category_grade >", value, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_category_grade >=", value, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeLessThan(Integer value) {
            addCriterion("shop_category_grade <", value, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeLessThanOrEqualTo(Integer value) {
            addCriterion("shop_category_grade <=", value, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeIn(List<Integer> values) {
            addCriterion("shop_category_grade in", values, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeNotIn(List<Integer> values) {
            addCriterion("shop_category_grade not in", values, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeBetween(Integer value1, Integer value2) {
            addCriterion("shop_category_grade between", value1, value2, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCategoryGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_category_grade not between", value1, value2, "shopCategoryGrade");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdIsNull() {
            addCriterion("shop_commodity_category_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdIsNotNull() {
            addCriterion("shop_commodity_category_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdEqualTo(Integer value) {
            addCriterion("shop_commodity_category_parent_id =", value, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdNotEqualTo(Integer value) {
            addCriterion("shop_commodity_category_parent_id <>", value, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdGreaterThan(Integer value) {
            addCriterion("shop_commodity_category_parent_id >", value, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_commodity_category_parent_id >=", value, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdLessThan(Integer value) {
            addCriterion("shop_commodity_category_parent_id <", value, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_commodity_category_parent_id <=", value, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdIn(List<Integer> values) {
            addCriterion("shop_commodity_category_parent_id in", values, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdNotIn(List<Integer> values) {
            addCriterion("shop_commodity_category_parent_id not in", values, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_commodity_category_parent_id between", value1, value2, "shopCommodityCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andShopCommodityCategoryParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_commodity_category_parent_id not between", value1, value2, "shopCommodityCategoryParentId");
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
     * SHOP_COMMODITY_CATEGORY
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SHOP_COMMODITY_CATEGORY 2022-07-12 23:52:08
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