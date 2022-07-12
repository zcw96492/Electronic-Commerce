package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CommodityTypeExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CommodityTypeExample() {
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
     * COMMODITY_TYPE 2022-07-12 23:52:08
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

        public Criteria andCommodityTypeIdIsNull() {
            addCriterion("commodity_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNotNull() {
            addCriterion("commodity_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdEqualTo(Integer value) {
            addCriterion("commodity_type_id =", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotEqualTo(Integer value) {
            addCriterion("commodity_type_id <>", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThan(Integer value) {
            addCriterion("commodity_type_id >", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_type_id >=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThan(Integer value) {
            addCriterion("commodity_type_id <", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_type_id <=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIn(List<Integer> values) {
            addCriterion("commodity_type_id in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotIn(List<Integer> values) {
            addCriterion("commodity_type_id not in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_type_id between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_type_id not between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdIsNull() {
            addCriterion("parent_commodity_type_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdIsNotNull() {
            addCriterion("parent_commodity_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdEqualTo(Integer value) {
            addCriterion("parent_commodity_type_id =", value, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdNotEqualTo(Integer value) {
            addCriterion("parent_commodity_type_id <>", value, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdGreaterThan(Integer value) {
            addCriterion("parent_commodity_type_id >", value, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_commodity_type_id >=", value, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdLessThan(Integer value) {
            addCriterion("parent_commodity_type_id <", value, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_commodity_type_id <=", value, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdIn(List<Integer> values) {
            addCriterion("parent_commodity_type_id in", values, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdNotIn(List<Integer> values) {
            addCriterion("parent_commodity_type_id not in", values, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_commodity_type_id between", value1, value2, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCommodityTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_commodity_type_id not between", value1, value2, "parentCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIsNull() {
            addCriterion("type_level is null");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIsNotNull() {
            addCriterion("type_level is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLevelEqualTo(Integer value) {
            addCriterion("type_level =", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotEqualTo(Integer value) {
            addCriterion("type_level <>", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelGreaterThan(Integer value) {
            addCriterion("type_level >", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_level >=", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelLessThan(Integer value) {
            addCriterion("type_level <", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("type_level <=", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIn(List<Integer> values) {
            addCriterion("type_level in", values, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotIn(List<Integer> values) {
            addCriterion("type_level not in", values, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelBetween(Integer value1, Integer value2) {
            addCriterion("type_level between", value1, value2, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("type_level not between", value1, value2, "typeLevel");
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

        public Criteria andCommodityNumEqualTo(Integer value) {
            addCriterion("commodity_num =", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotEqualTo(Integer value) {
            addCriterion("commodity_num <>", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumGreaterThan(Integer value) {
            addCriterion("commodity_num >", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_num >=", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLessThan(Integer value) {
            addCriterion("commodity_num <", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_num <=", value, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumIn(List<Integer> values) {
            addCriterion("commodity_num in", values, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotIn(List<Integer> values) {
            addCriterion("commodity_num not in", values, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumBetween(Integer value1, Integer value2) {
            addCriterion("commodity_num between", value1, value2, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityNumNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_num not between", value1, value2, "commodityNum");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitIsNull() {
            addCriterion("commodity_unit is null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitIsNotNull() {
            addCriterion("commodity_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitEqualTo(String value) {
            addCriterion("commodity_unit =", value, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitNotEqualTo(String value) {
            addCriterion("commodity_unit <>", value, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitGreaterThan(String value) {
            addCriterion("commodity_unit >", value, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_unit >=", value, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitLessThan(String value) {
            addCriterion("commodity_unit <", value, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitLessThanOrEqualTo(String value) {
            addCriterion("commodity_unit <=", value, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitLike(String value) {
            addCriterion("commodity_unit like", value, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitNotLike(String value) {
            addCriterion("commodity_unit not like", value, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitIn(List<String> values) {
            addCriterion("commodity_unit in", values, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitNotIn(List<String> values) {
            addCriterion("commodity_unit not in", values, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitBetween(String value1, String value2) {
            addCriterion("commodity_unit between", value1, value2, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andCommodityUnitNotBetween(String value1, String value2) {
            addCriterion("commodity_unit not between", value1, value2, "commodityUnit");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagIsNull() {
            addCriterion("nav_display_flag is null");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagIsNotNull() {
            addCriterion("nav_display_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagEqualTo(Integer value) {
            addCriterion("nav_display_flag =", value, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagNotEqualTo(Integer value) {
            addCriterion("nav_display_flag <>", value, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagGreaterThan(Integer value) {
            addCriterion("nav_display_flag >", value, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("nav_display_flag >=", value, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagLessThan(Integer value) {
            addCriterion("nav_display_flag <", value, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("nav_display_flag <=", value, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagIn(List<Integer> values) {
            addCriterion("nav_display_flag in", values, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagNotIn(List<Integer> values) {
            addCriterion("nav_display_flag not in", values, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagBetween(Integer value1, Integer value2) {
            addCriterion("nav_display_flag between", value1, value2, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andNavDisplayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("nav_display_flag not between", value1, value2, "navDisplayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagIsNull() {
            addCriterion("display_flag is null");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagIsNotNull() {
            addCriterion("display_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagEqualTo(Integer value) {
            addCriterion("display_flag =", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagNotEqualTo(Integer value) {
            addCriterion("display_flag <>", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagGreaterThan(Integer value) {
            addCriterion("display_flag >", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_flag >=", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagLessThan(Integer value) {
            addCriterion("display_flag <", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("display_flag <=", value, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagIn(List<Integer> values) {
            addCriterion("display_flag in", values, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagNotIn(List<Integer> values) {
            addCriterion("display_flag not in", values, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagBetween(Integer value1, Integer value2) {
            addCriterion("display_flag between", value1, value2, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andDisplayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("display_flag not between", value1, value2, "displayFlag");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
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
     * COMMODITY_TYPE
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COMMODITY_TYPE 2022-07-12 23:52:08
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