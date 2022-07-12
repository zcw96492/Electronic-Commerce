package com.newcore.electronic.commerce.base.model.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CouponTypeExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CouponTypeExample() {
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
     * COUPON_TYPE 2022-07-12 23:52:08
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

        public Criteria andCouponTypeIdIsNull() {
            addCriterion("coupon_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIsNotNull() {
            addCriterion("coupon_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdEqualTo(Integer value) {
            addCriterion("coupon_type_id =", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotEqualTo(Integer value) {
            addCriterion("coupon_type_id <>", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdGreaterThan(Integer value) {
            addCriterion("coupon_type_id >", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type_id >=", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdLessThan(Integer value) {
            addCriterion("coupon_type_id <", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type_id <=", value, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdIn(List<Integer> values) {
            addCriterion("coupon_type_id in", values, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotIn(List<Integer> values) {
            addCriterion("coupon_type_id not in", values, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type_id between", value1, value2, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type_id not between", value1, value2, "couponTypeId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponAmntIsNull() {
            addCriterion("coupon_amnt is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmntIsNotNull() {
            addCriterion("coupon_amnt is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmntEqualTo(BigDecimal value) {
            addCriterion("coupon_amnt =", value, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntNotEqualTo(BigDecimal value) {
            addCriterion("coupon_amnt <>", value, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntGreaterThan(BigDecimal value) {
            addCriterion("coupon_amnt >", value, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amnt >=", value, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntLessThan(BigDecimal value) {
            addCriterion("coupon_amnt <", value, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amnt <=", value, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntIn(List<BigDecimal> values) {
            addCriterion("coupon_amnt in", values, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntNotIn(List<BigDecimal> values) {
            addCriterion("coupon_amnt not in", values, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amnt between", value1, value2, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andCouponAmntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amnt not between", value1, value2, "couponAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntIsNull() {
            addCriterion("full_amnt is null");
            return (Criteria) this;
        }

        public Criteria andFullAmntIsNotNull() {
            addCriterion("full_amnt is not null");
            return (Criteria) this;
        }

        public Criteria andFullAmntEqualTo(BigDecimal value) {
            addCriterion("full_amnt =", value, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntNotEqualTo(BigDecimal value) {
            addCriterion("full_amnt <>", value, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntGreaterThan(BigDecimal value) {
            addCriterion("full_amnt >", value, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("full_amnt >=", value, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntLessThan(BigDecimal value) {
            addCriterion("full_amnt <", value, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("full_amnt <=", value, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntIn(List<BigDecimal> values) {
            addCriterion("full_amnt in", values, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntNotIn(List<BigDecimal> values) {
            addCriterion("full_amnt not in", values, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("full_amnt between", value1, value2, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullAmntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("full_amnt not between", value1, value2, "fullAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntIsNull() {
            addCriterion("full_reduction_amnt is null");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntIsNotNull() {
            addCriterion("full_reduction_amnt is not null");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntEqualTo(BigDecimal value) {
            addCriterion("full_reduction_amnt =", value, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntNotEqualTo(BigDecimal value) {
            addCriterion("full_reduction_amnt <>", value, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntGreaterThan(BigDecimal value) {
            addCriterion("full_reduction_amnt >", value, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("full_reduction_amnt >=", value, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntLessThan(BigDecimal value) {
            addCriterion("full_reduction_amnt <", value, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("full_reduction_amnt <=", value, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntIn(List<BigDecimal> values) {
            addCriterion("full_reduction_amnt in", values, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntNotIn(List<BigDecimal> values) {
            addCriterion("full_reduction_amnt not in", values, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("full_reduction_amnt between", value1, value2, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andFullReductionAmntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("full_reduction_amnt not between", value1, value2, "fullReductionAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntIsNull() {
            addCriterion("reduce_amnt is null");
            return (Criteria) this;
        }

        public Criteria andReduceAmntIsNotNull() {
            addCriterion("reduce_amnt is not null");
            return (Criteria) this;
        }

        public Criteria andReduceAmntEqualTo(BigDecimal value) {
            addCriterion("reduce_amnt =", value, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntNotEqualTo(BigDecimal value) {
            addCriterion("reduce_amnt <>", value, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntGreaterThan(BigDecimal value) {
            addCriterion("reduce_amnt >", value, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reduce_amnt >=", value, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntLessThan(BigDecimal value) {
            addCriterion("reduce_amnt <", value, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reduce_amnt <=", value, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntIn(List<BigDecimal> values) {
            addCriterion("reduce_amnt in", values, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntNotIn(List<BigDecimal> values) {
            addCriterion("reduce_amnt not in", values, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduce_amnt between", value1, value2, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andReduceAmntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reduce_amnt not between", value1, value2, "reduceAmnt");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionIsNull() {
            addCriterion("discount_proportion is null");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionIsNotNull() {
            addCriterion("discount_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionEqualTo(Double value) {
            addCriterion("discount_proportion =", value, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionNotEqualTo(Double value) {
            addCriterion("discount_proportion <>", value, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionGreaterThan(Double value) {
            addCriterion("discount_proportion >", value, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_proportion >=", value, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionLessThan(Double value) {
            addCriterion("discount_proportion <", value, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionLessThanOrEqualTo(Double value) {
            addCriterion("discount_proportion <=", value, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionIn(List<Double> values) {
            addCriterion("discount_proportion in", values, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionNotIn(List<Double> values) {
            addCriterion("discount_proportion not in", values, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionBetween(Double value1, Double value2) {
            addCriterion("discount_proportion between", value1, value2, "discountProportion");
            return (Criteria) this;
        }

        public Criteria andDiscountProportionNotBetween(Double value1, Double value2) {
            addCriterion("discount_proportion not between", value1, value2, "discountProportion");
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
     * COUPON_TYPE
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COUPON_TYPE 2022-07-12 23:52:08
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