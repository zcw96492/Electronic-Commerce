package com.newcore.electronic.commerce.base.model.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CommodityExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CommodityExample() {
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
     * COMMODITY 2022-07-12 23:52:08
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

        public Criteria andCommodityNumIsNull() {
            addCriterion("commodity_num is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumIsNotNull() {
            addCriterion("commodity_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumEqualTo(String value) {
            addCriterion("commodity_num =", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotEqualTo(String value) {
            addCriterion("commodity_num <>", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumGreaterThan(String value) {
            addCriterion("commodity_num >", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_num >=", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLessThan(String value) {
            addCriterion("commodity_num <", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLessThanOrEqualTo(String value) {
            addCriterion("commodity_num <=", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLike(String value) {
            addCriterion("commodity_num like", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotLike(String value) {
            addCriterion("commodity_num not like", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumIn(List<String> values) {
            addCriterion("commodity_num in", values, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotIn(List<String> values) {
            addCriterion("commodity_num not in", values, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumBetween(String value1, String value2) {
            addCriterion("commodity_num between", value1, value2, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotBetween(String value1, String value2) {
            addCriterion("commodity_num not between", value1, value2, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleIsNull() {
            addCriterion("commodity_title is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleIsNotNull() {
            addCriterion("commodity_title is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleEqualTo(String value) {
            addCriterion("commodity_title =", value, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleNotEqualTo(String value) {
            addCriterion("commodity_title <>", value, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleGreaterThan(String value) {
            addCriterion("commodity_title >", value, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_title >=", value, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleLessThan(String value) {
            addCriterion("commodity_title <", value, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleLessThanOrEqualTo(String value) {
            addCriterion("commodity_title <=", value, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleLike(String value) {
            addCriterion("commodity_title like", value, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleNotLike(String value) {
            addCriterion("commodity_title not like", value, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleIn(List<String> values) {
            addCriterion("commodity_title in", values, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleNotIn(List<String> values) {
            addCriterion("commodity_title not in", values, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleBetween(String value1, String value2) {
            addCriterion("commodity_title between", value1, value2, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityTitleNotBetween(String value1, String value2) {
            addCriterion("commodity_title not between", value1, value2, "commodityTitle");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdIsNull() {
            addCriterion("commodity_belong_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdIsNotNull() {
            addCriterion("commodity_belong_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdEqualTo(Integer value) {
            addCriterion("commodity_belong_type_id =", value, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdNotEqualTo(Integer value) {
            addCriterion("commodity_belong_type_id <>", value, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdGreaterThan(Integer value) {
            addCriterion("commodity_belong_type_id >", value, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_belong_type_id >=", value, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdLessThan(Integer value) {
            addCriterion("commodity_belong_type_id <", value, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_belong_type_id <=", value, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdIn(List<Integer> values) {
            addCriterion("commodity_belong_type_id in", values, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdNotIn(List<Integer> values) {
            addCriterion("commodity_belong_type_id not in", values, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_belong_type_id between", value1, value2, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_belong_type_id not between", value1, value2, "commodityBelongTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdIsNull() {
            addCriterion("commodity_belong_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdIsNotNull() {
            addCriterion("commodity_belong_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdEqualTo(Integer value) {
            addCriterion("commodity_belong_brand_id =", value, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdNotEqualTo(Integer value) {
            addCriterion("commodity_belong_brand_id <>", value, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdGreaterThan(Integer value) {
            addCriterion("commodity_belong_brand_id >", value, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_belong_brand_id >=", value, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdLessThan(Integer value) {
            addCriterion("commodity_belong_brand_id <", value, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_belong_brand_id <=", value, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdIn(List<Integer> values) {
            addCriterion("commodity_belong_brand_id in", values, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdNotIn(List<Integer> values) {
            addCriterion("commodity_belong_brand_id not in", values, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_belong_brand_id between", value1, value2, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBelongBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_belong_brand_id not between", value1, value2, "commodityBelongBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNull() {
            addCriterion("commodity_price is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNotNull() {
            addCriterion("commodity_price is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceEqualTo(BigDecimal value) {
            addCriterion("commodity_price =", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotEqualTo(BigDecimal value) {
            addCriterion("commodity_price <>", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThan(BigDecimal value) {
            addCriterion("commodity_price >", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price >=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThan(BigDecimal value) {
            addCriterion("commodity_price <", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commodity_price <=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIn(List<BigDecimal> values) {
            addCriterion("commodity_price in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotIn(List<BigDecimal> values) {
            addCriterion("commodity_price not in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commodity_price not between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryIsNull() {
            addCriterion("commodity_repertory is null");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryIsNotNull() {
            addCriterion("commodity_repertory is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryEqualTo(Integer value) {
            addCriterion("commodity_repertory =", value, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryNotEqualTo(Integer value) {
            addCriterion("commodity_repertory <>", value, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryGreaterThan(Integer value) {
            addCriterion("commodity_repertory >", value, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_repertory >=", value, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryLessThan(Integer value) {
            addCriterion("commodity_repertory <", value, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_repertory <=", value, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryIn(List<Integer> values) {
            addCriterion("commodity_repertory in", values, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryNotIn(List<Integer> values) {
            addCriterion("commodity_repertory not in", values, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryBetween(Integer value1, Integer value2) {
            addCriterion("commodity_repertory between", value1, value2, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityRepertoryNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_repertory not between", value1, value2, "commodityRepertory");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIsNull() {
            addCriterion("commodity_status is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIsNotNull() {
            addCriterion("commodity_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusEqualTo(Integer value) {
            addCriterion("commodity_status =", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotEqualTo(Integer value) {
            addCriterion("commodity_status <>", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusGreaterThan(Integer value) {
            addCriterion("commodity_status >", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_status >=", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusLessThan(Integer value) {
            addCriterion("commodity_status <", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_status <=", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIn(List<Integer> values) {
            addCriterion("commodity_status in", values, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotIn(List<Integer> values) {
            addCriterion("commodity_status not in", values, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusBetween(Integer value1, Integer value2) {
            addCriterion("commodity_status between", value1, value2, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_status not between", value1, value2, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIsNull() {
            addCriterion("commodity_desc is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIsNotNull() {
            addCriterion("commodity_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescEqualTo(String value) {
            addCriterion("commodity_desc =", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotEqualTo(String value) {
            addCriterion("commodity_desc <>", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescGreaterThan(String value) {
            addCriterion("commodity_desc >", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_desc >=", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLessThan(String value) {
            addCriterion("commodity_desc <", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLessThanOrEqualTo(String value) {
            addCriterion("commodity_desc <=", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescLike(String value) {
            addCriterion("commodity_desc like", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotLike(String value) {
            addCriterion("commodity_desc not like", value, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescIn(List<String> values) {
            addCriterion("commodity_desc in", values, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotIn(List<String> values) {
            addCriterion("commodity_desc not in", values, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescBetween(String value1, String value2) {
            addCriterion("commodity_desc between", value1, value2, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityDescNotBetween(String value1, String value2) {
            addCriterion("commodity_desc not between", value1, value2, "commodityDesc");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesIsNull() {
            addCriterion("commodity_click_times is null");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesIsNotNull() {
            addCriterion("commodity_click_times is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesEqualTo(Integer value) {
            addCriterion("commodity_click_times =", value, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesNotEqualTo(Integer value) {
            addCriterion("commodity_click_times <>", value, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesGreaterThan(Integer value) {
            addCriterion("commodity_click_times >", value, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_click_times >=", value, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesLessThan(Integer value) {
            addCriterion("commodity_click_times <", value, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_click_times <=", value, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesIn(List<Integer> values) {
            addCriterion("commodity_click_times in", values, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesNotIn(List<Integer> values) {
            addCriterion("commodity_click_times not in", values, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesBetween(Integer value1, Integer value2) {
            addCriterion("commodity_click_times between", value1, value2, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityClickTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_click_times not between", value1, value2, "commodityClickTimes");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordIsNull() {
            addCriterion("commodity_keyword is null");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordIsNotNull() {
            addCriterion("commodity_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordEqualTo(String value) {
            addCriterion("commodity_keyword =", value, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordNotEqualTo(String value) {
            addCriterion("commodity_keyword <>", value, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordGreaterThan(String value) {
            addCriterion("commodity_keyword >", value, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_keyword >=", value, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordLessThan(String value) {
            addCriterion("commodity_keyword <", value, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordLessThanOrEqualTo(String value) {
            addCriterion("commodity_keyword <=", value, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordLike(String value) {
            addCriterion("commodity_keyword like", value, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordNotLike(String value) {
            addCriterion("commodity_keyword not like", value, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordIn(List<String> values) {
            addCriterion("commodity_keyword in", values, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordNotIn(List<String> values) {
            addCriterion("commodity_keyword not in", values, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordBetween(String value1, String value2) {
            addCriterion("commodity_keyword between", value1, value2, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityKeywordNotBetween(String value1, String value2) {
            addCriterion("commodity_keyword not between", value1, value2, "commodityKeyword");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicIsNull() {
            addCriterion("commodity_main_pic is null");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicIsNotNull() {
            addCriterion("commodity_main_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicEqualTo(Integer value) {
            addCriterion("commodity_main_pic =", value, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicNotEqualTo(Integer value) {
            addCriterion("commodity_main_pic <>", value, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicGreaterThan(Integer value) {
            addCriterion("commodity_main_pic >", value, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_main_pic >=", value, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicLessThan(Integer value) {
            addCriterion("commodity_main_pic <", value, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_main_pic <=", value, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicIn(List<Integer> values) {
            addCriterion("commodity_main_pic in", values, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicNotIn(List<Integer> values) {
            addCriterion("commodity_main_pic not in", values, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicBetween(Integer value1, Integer value2) {
            addCriterion("commodity_main_pic between", value1, value2, "commodityMainPic");
            return (Criteria) this;
        }

        public Criteria andCommodityMainPicNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_main_pic not between", value1, value2, "commodityMainPic");
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
     * COMMODITY
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COMMODITY 2022-07-12 23:52:08
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