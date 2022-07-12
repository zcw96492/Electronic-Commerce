package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * AccountPromotionExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public AccountPromotionExample() {
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
     * ACCOUNT_PROMOTION 2022-07-12 23:52:08
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

        public Criteria andAccountPromotionIdIsNull() {
            addCriterion("account_promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdIsNotNull() {
            addCriterion("account_promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdEqualTo(Integer value) {
            addCriterion("account_promotion_id =", value, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdNotEqualTo(Integer value) {
            addCriterion("account_promotion_id <>", value, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdGreaterThan(Integer value) {
            addCriterion("account_promotion_id >", value, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_promotion_id >=", value, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdLessThan(Integer value) {
            addCriterion("account_promotion_id <", value, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_promotion_id <=", value, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdIn(List<Integer> values) {
            addCriterion("account_promotion_id in", values, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdNotIn(List<Integer> values) {
            addCriterion("account_promotion_id not in", values, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdBetween(Integer value1, Integer value2) {
            addCriterion("account_promotion_id between", value1, value2, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andAccountPromotionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_promotion_id not between", value1, value2, "accountPromotionId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdIsNull() {
            addCriterion("promotion_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdIsNotNull() {
            addCriterion("promotion_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdEqualTo(Integer value) {
            addCriterion("promotion_type_id =", value, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdNotEqualTo(Integer value) {
            addCriterion("promotion_type_id <>", value, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdGreaterThan(Integer value) {
            addCriterion("promotion_type_id >", value, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_type_id >=", value, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdLessThan(Integer value) {
            addCriterion("promotion_type_id <", value, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_type_id <=", value, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdIn(List<Integer> values) {
            addCriterion("promotion_type_id in", values, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdNotIn(List<Integer> values) {
            addCriterion("promotion_type_id not in", values, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type_id between", value1, value2, "promotionTypeId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_type_id not between", value1, value2, "promotionTypeId");
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

        public Criteria andPeriodValidityIsNull() {
            addCriterion("period_validity is null");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityIsNotNull() {
            addCriterion("period_validity is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityEqualTo(Integer value) {
            addCriterion("period_validity =", value, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityNotEqualTo(Integer value) {
            addCriterion("period_validity <>", value, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityGreaterThan(Integer value) {
            addCriterion("period_validity >", value, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_validity >=", value, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityLessThan(Integer value) {
            addCriterion("period_validity <", value, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityLessThanOrEqualTo(Integer value) {
            addCriterion("period_validity <=", value, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityIn(List<Integer> values) {
            addCriterion("period_validity in", values, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityNotIn(List<Integer> values) {
            addCriterion("period_validity not in", values, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityBetween(Integer value1, Integer value2) {
            addCriterion("period_validity between", value1, value2, "periodValidity");
            return (Criteria) this;
        }

        public Criteria andPeriodValidityNotBetween(Integer value1, Integer value2) {
            addCriterion("period_validity not between", value1, value2, "periodValidity");
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
     * ACCOUNT_PROMOTION
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ACCOUNT_PROMOTION 2022-07-12 23:52:08
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