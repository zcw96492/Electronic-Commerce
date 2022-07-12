package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogisticsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * LogisticsInfoExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public LogisticsInfoExample() {
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
     * LOGISTICS_INFO 2022-07-12 23:52:08
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

        public Criteria andLogisticsInfoIdIsNull() {
            addCriterion("logistics_info_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdIsNotNull() {
            addCriterion("logistics_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdEqualTo(Integer value) {
            addCriterion("logistics_info_id =", value, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdNotEqualTo(Integer value) {
            addCriterion("logistics_info_id <>", value, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdGreaterThan(Integer value) {
            addCriterion("logistics_info_id >", value, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_info_id >=", value, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdLessThan(Integer value) {
            addCriterion("logistics_info_id <", value, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_info_id <=", value, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdIn(List<Integer> values) {
            addCriterion("logistics_info_id in", values, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdNotIn(List<Integer> values) {
            addCriterion("logistics_info_id not in", values, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("logistics_info_id between", value1, value2, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_info_id not between", value1, value2, "logisticsInfoId");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIsNull() {
            addCriterion("logistics_num is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIsNotNull() {
            addCriterion("logistics_num is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumEqualTo(String value) {
            addCriterion("logistics_num =", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotEqualTo(String value) {
            addCriterion("logistics_num <>", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumGreaterThan(String value) {
            addCriterion("logistics_num >", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_num >=", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLessThan(String value) {
            addCriterion("logistics_num <", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLessThanOrEqualTo(String value) {
            addCriterion("logistics_num <=", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumLike(String value) {
            addCriterion("logistics_num like", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotLike(String value) {
            addCriterion("logistics_num not like", value, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumIn(List<String> values) {
            addCriterion("logistics_num in", values, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotIn(List<String> values) {
            addCriterion("logistics_num not in", values, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumBetween(String value1, String value2) {
            addCriterion("logistics_num between", value1, value2, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsNumNotBetween(String value1, String value2) {
            addCriterion("logistics_num not between", value1, value2, "logisticsNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIsNull() {
            addCriterion("logistics_company_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIsNotNull() {
            addCriterion("logistics_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdEqualTo(Integer value) {
            addCriterion("logistics_company_id =", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotEqualTo(Integer value) {
            addCriterion("logistics_company_id <>", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdGreaterThan(Integer value) {
            addCriterion("logistics_company_id >", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_company_id >=", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdLessThan(Integer value) {
            addCriterion("logistics_company_id <", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_company_id <=", value, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdIn(List<Integer> values) {
            addCriterion("logistics_company_id in", values, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotIn(List<Integer> values) {
            addCriterion("logistics_company_id not in", values, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("logistics_company_id between", value1, value2, "logisticsCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_company_id not between", value1, value2, "logisticsCompanyId");
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliver_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Date value) {
            addCriterion("deliver_time =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Date value) {
            addCriterion("deliver_time <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Date value) {
            addCriterion("deliver_time >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_time >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Date value) {
            addCriterion("deliver_time <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Date value) {
            addCriterion("deliver_time <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Date> values) {
            addCriterion("deliver_time in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Date> values) {
            addCriterion("deliver_time not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Date value1, Date value2) {
            addCriterion("deliver_time between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Date value1, Date value2) {
            addCriterion("deliver_time not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andCourierNumIsNull() {
            addCriterion("courier_num is null");
            return (Criteria) this;
        }

        public Criteria andCourierNumIsNotNull() {
            addCriterion("courier_num is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNumEqualTo(String value) {
            addCriterion("courier_num =", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotEqualTo(String value) {
            addCriterion("courier_num <>", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumGreaterThan(String value) {
            addCriterion("courier_num >", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumGreaterThanOrEqualTo(String value) {
            addCriterion("courier_num >=", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumLessThan(String value) {
            addCriterion("courier_num <", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumLessThanOrEqualTo(String value) {
            addCriterion("courier_num <=", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumLike(String value) {
            addCriterion("courier_num like", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotLike(String value) {
            addCriterion("courier_num not like", value, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumIn(List<String> values) {
            addCriterion("courier_num in", values, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotIn(List<String> values) {
            addCriterion("courier_num not in", values, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumBetween(String value1, String value2) {
            addCriterion("courier_num between", value1, value2, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNumNotBetween(String value1, String value2) {
            addCriterion("courier_num not between", value1, value2, "courierNum");
            return (Criteria) this;
        }

        public Criteria andCourierNameIsNull() {
            addCriterion("courier_name is null");
            return (Criteria) this;
        }

        public Criteria andCourierNameIsNotNull() {
            addCriterion("courier_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourierNameEqualTo(String value) {
            addCriterion("courier_name =", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotEqualTo(String value) {
            addCriterion("courier_name <>", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameGreaterThan(String value) {
            addCriterion("courier_name >", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameGreaterThanOrEqualTo(String value) {
            addCriterion("courier_name >=", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLessThan(String value) {
            addCriterion("courier_name <", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLessThanOrEqualTo(String value) {
            addCriterion("courier_name <=", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameLike(String value) {
            addCriterion("courier_name like", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotLike(String value) {
            addCriterion("courier_name not like", value, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameIn(List<String> values) {
            addCriterion("courier_name in", values, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotIn(List<String> values) {
            addCriterion("courier_name not in", values, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameBetween(String value1, String value2) {
            addCriterion("courier_name between", value1, value2, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierNameNotBetween(String value1, String value2) {
            addCriterion("courier_name not between", value1, value2, "courierName");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneIsNull() {
            addCriterion("courier_mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneIsNotNull() {
            addCriterion("courier_mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneEqualTo(String value) {
            addCriterion("courier_mobile_phone =", value, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneNotEqualTo(String value) {
            addCriterion("courier_mobile_phone <>", value, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneGreaterThan(String value) {
            addCriterion("courier_mobile_phone >", value, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("courier_mobile_phone >=", value, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneLessThan(String value) {
            addCriterion("courier_mobile_phone <", value, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("courier_mobile_phone <=", value, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneLike(String value) {
            addCriterion("courier_mobile_phone like", value, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneNotLike(String value) {
            addCriterion("courier_mobile_phone not like", value, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneIn(List<String> values) {
            addCriterion("courier_mobile_phone in", values, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneNotIn(List<String> values) {
            addCriterion("courier_mobile_phone not in", values, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneBetween(String value1, String value2) {
            addCriterion("courier_mobile_phone between", value1, value2, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("courier_mobile_phone not between", value1, value2, "courierMobilePhone");
            return (Criteria) this;
        }

        public Criteria andCourierStarIsNull() {
            addCriterion("courier_star is null");
            return (Criteria) this;
        }

        public Criteria andCourierStarIsNotNull() {
            addCriterion("courier_star is not null");
            return (Criteria) this;
        }

        public Criteria andCourierStarEqualTo(String value) {
            addCriterion("courier_star =", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarNotEqualTo(String value) {
            addCriterion("courier_star <>", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarGreaterThan(String value) {
            addCriterion("courier_star >", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarGreaterThanOrEqualTo(String value) {
            addCriterion("courier_star >=", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarLessThan(String value) {
            addCriterion("courier_star <", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarLessThanOrEqualTo(String value) {
            addCriterion("courier_star <=", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarLike(String value) {
            addCriterion("courier_star like", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarNotLike(String value) {
            addCriterion("courier_star not like", value, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarIn(List<String> values) {
            addCriterion("courier_star in", values, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarNotIn(List<String> values) {
            addCriterion("courier_star not in", values, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarBetween(String value1, String value2) {
            addCriterion("courier_star between", value1, value2, "courierStar");
            return (Criteria) this;
        }

        public Criteria andCourierStarNotBetween(String value1, String value2) {
            addCriterion("courier_star not between", value1, value2, "courierStar");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeIsNull() {
            addCriterion("package_longitude is null");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeIsNotNull() {
            addCriterion("package_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeEqualTo(Double value) {
            addCriterion("package_longitude =", value, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeNotEqualTo(Double value) {
            addCriterion("package_longitude <>", value, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeGreaterThan(Double value) {
            addCriterion("package_longitude >", value, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("package_longitude >=", value, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeLessThan(Double value) {
            addCriterion("package_longitude <", value, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("package_longitude <=", value, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeIn(List<Double> values) {
            addCriterion("package_longitude in", values, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeNotIn(List<Double> values) {
            addCriterion("package_longitude not in", values, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeBetween(Double value1, Double value2) {
            addCriterion("package_longitude between", value1, value2, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("package_longitude not between", value1, value2, "packageLongitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeIsNull() {
            addCriterion("package_latitude is null");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeIsNotNull() {
            addCriterion("package_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeEqualTo(Double value) {
            addCriterion("package_latitude =", value, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeNotEqualTo(Double value) {
            addCriterion("package_latitude <>", value, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeGreaterThan(Double value) {
            addCriterion("package_latitude >", value, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("package_latitude >=", value, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeLessThan(Double value) {
            addCriterion("package_latitude <", value, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("package_latitude <=", value, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeIn(List<Double> values) {
            addCriterion("package_latitude in", values, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeNotIn(List<Double> values) {
            addCriterion("package_latitude not in", values, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeBetween(Double value1, Double value2) {
            addCriterion("package_latitude between", value1, value2, "packageLatitude");
            return (Criteria) this;
        }

        public Criteria andPackageLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("package_latitude not between", value1, value2, "packageLatitude");
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
     * LOGISTICS_INFO
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * LOGISTICS_INFO 2022-07-12 23:52:08
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