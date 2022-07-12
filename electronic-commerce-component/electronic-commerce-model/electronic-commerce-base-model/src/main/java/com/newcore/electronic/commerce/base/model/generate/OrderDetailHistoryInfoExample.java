package com.newcore.electronic.commerce.base.model.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailHistoryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * OrderDetailHistoryInfoExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public OrderDetailHistoryInfoExample() {
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
     * ORDER_DETAIL_HISTORY_INFO 2022-07-12 23:52:08
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

        public Criteria andOrderDetailHistoryInfoIdIsNull() {
            addCriterion("order_detail_history_info_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdIsNotNull() {
            addCriterion("order_detail_history_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdEqualTo(Integer value) {
            addCriterion("order_detail_history_info_id =", value, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdNotEqualTo(Integer value) {
            addCriterion("order_detail_history_info_id <>", value, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdGreaterThan(Integer value) {
            addCriterion("order_detail_history_info_id >", value, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_detail_history_info_id >=", value, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdLessThan(Integer value) {
            addCriterion("order_detail_history_info_id <", value, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_detail_history_info_id <=", value, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdIn(List<Integer> values) {
            addCriterion("order_detail_history_info_id in", values, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdNotIn(List<Integer> values) {
            addCriterion("order_detail_history_info_id not in", values, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("order_detail_history_info_id between", value1, value2, "orderDetailHistoryInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailHistoryInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_detail_history_info_id not between", value1, value2, "orderDetailHistoryInfoId");
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

        public Criteria andCommodityQuantityIsNull() {
            addCriterion("commodity_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityIsNotNull() {
            addCriterion("commodity_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityEqualTo(Integer value) {
            addCriterion("commodity_quantity =", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityNotEqualTo(Integer value) {
            addCriterion("commodity_quantity <>", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityGreaterThan(Integer value) {
            addCriterion("commodity_quantity >", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_quantity >=", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityLessThan(Integer value) {
            addCriterion("commodity_quantity <", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_quantity <=", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityIn(List<Integer> values) {
            addCriterion("commodity_quantity in", values, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityNotIn(List<Integer> values) {
            addCriterion("commodity_quantity not in", values, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityBetween(Integer value1, Integer value2) {
            addCriterion("commodity_quantity between", value1, value2, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_quantity not between", value1, value2, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIsNull() {
            addCriterion("promotion_name is null");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIsNotNull() {
            addCriterion("promotion_name is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionNameEqualTo(String value) {
            addCriterion("promotion_name =", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotEqualTo(String value) {
            addCriterion("promotion_name <>", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameGreaterThan(String value) {
            addCriterion("promotion_name >", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_name >=", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLessThan(String value) {
            addCriterion("promotion_name <", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLessThanOrEqualTo(String value) {
            addCriterion("promotion_name <=", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameLike(String value) {
            addCriterion("promotion_name like", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotLike(String value) {
            addCriterion("promotion_name not like", value, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameIn(List<String> values) {
            addCriterion("promotion_name in", values, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotIn(List<String> values) {
            addCriterion("promotion_name not in", values, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameBetween(String value1, String value2) {
            addCriterion("promotion_name between", value1, value2, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionNameNotBetween(String value1, String value2) {
            addCriterion("promotion_name not between", value1, value2, "promotionName");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNull() {
            addCriterion("promotion_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNotNull() {
            addCriterion("promotion_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountEqualTo(BigDecimal value) {
            addCriterion("promotion_amount =", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <>", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThan(BigDecimal value) {
            addCriterion("promotion_amount >", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount >=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThan(BigDecimal value) {
            addCriterion("promotion_amount <", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIn(List<BigDecimal> values) {
            addCriterion("promotion_amount in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotIn(List<BigDecimal> values) {
            addCriterion("promotion_amount not in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount not between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(BigDecimal value) {
            addCriterion("coupon_amount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("coupon_amount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(BigDecimal value) {
            addCriterion("coupon_amount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<BigDecimal> values) {
            addCriterion("coupon_amount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("coupon_amount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountIsNull() {
            addCriterion("integration_amount is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountIsNotNull() {
            addCriterion("integration_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountEqualTo(BigDecimal value) {
            addCriterion("integration_amount =", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountNotEqualTo(BigDecimal value) {
            addCriterion("integration_amount <>", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountGreaterThan(BigDecimal value) {
            addCriterion("integration_amount >", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("integration_amount >=", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountLessThan(BigDecimal value) {
            addCriterion("integration_amount <", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("integration_amount <=", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountIn(List<BigDecimal> values) {
            addCriterion("integration_amount in", values, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountNotIn(List<BigDecimal> values) {
            addCriterion("integration_amount not in", values, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integration_amount between", value1, value2, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integration_amount not between", value1, value2, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountIsNull() {
            addCriterion("beans_amount is null");
            return (Criteria) this;
        }

        public Criteria andBeansAmountIsNotNull() {
            addCriterion("beans_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBeansAmountEqualTo(BigDecimal value) {
            addCriterion("beans_amount =", value, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountNotEqualTo(BigDecimal value) {
            addCriterion("beans_amount <>", value, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountGreaterThan(BigDecimal value) {
            addCriterion("beans_amount >", value, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beans_amount >=", value, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountLessThan(BigDecimal value) {
            addCriterion("beans_amount <", value, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("beans_amount <=", value, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountIn(List<BigDecimal> values) {
            addCriterion("beans_amount in", values, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountNotIn(List<BigDecimal> values) {
            addCriterion("beans_amount not in", values, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beans_amount between", value1, value2, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andBeansAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beans_amount not between", value1, value2, "beansAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationIsNull() {
            addCriterion("gift_integration is null");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationIsNotNull() {
            addCriterion("gift_integration is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationEqualTo(Integer value) {
            addCriterion("gift_integration =", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationNotEqualTo(Integer value) {
            addCriterion("gift_integration <>", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationGreaterThan(Integer value) {
            addCriterion("gift_integration >", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_integration >=", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationLessThan(Integer value) {
            addCriterion("gift_integration <", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("gift_integration <=", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationIn(List<Integer> values) {
            addCriterion("gift_integration in", values, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationNotIn(List<Integer> values) {
            addCriterion("gift_integration not in", values, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("gift_integration between", value1, value2, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_integration not between", value1, value2, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftBeansIsNull() {
            addCriterion("gift_beans is null");
            return (Criteria) this;
        }

        public Criteria andGiftBeansIsNotNull() {
            addCriterion("gift_beans is not null");
            return (Criteria) this;
        }

        public Criteria andGiftBeansEqualTo(Integer value) {
            addCriterion("gift_beans =", value, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansNotEqualTo(Integer value) {
            addCriterion("gift_beans <>", value, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansGreaterThan(Integer value) {
            addCriterion("gift_beans >", value, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_beans >=", value, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansLessThan(Integer value) {
            addCriterion("gift_beans <", value, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansLessThanOrEqualTo(Integer value) {
            addCriterion("gift_beans <=", value, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansIn(List<Integer> values) {
            addCriterion("gift_beans in", values, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansNotIn(List<Integer> values) {
            addCriterion("gift_beans not in", values, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansBetween(Integer value1, Integer value2) {
            addCriterion("gift_beans between", value1, value2, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andGiftBeansNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_beans not between", value1, value2, "giftBeans");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrIsNull() {
            addCriterion("commodity_attr is null");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrIsNotNull() {
            addCriterion("commodity_attr is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrEqualTo(String value) {
            addCriterion("commodity_attr =", value, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrNotEqualTo(String value) {
            addCriterion("commodity_attr <>", value, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrGreaterThan(String value) {
            addCriterion("commodity_attr >", value, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_attr >=", value, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrLessThan(String value) {
            addCriterion("commodity_attr <", value, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrLessThanOrEqualTo(String value) {
            addCriterion("commodity_attr <=", value, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrLike(String value) {
            addCriterion("commodity_attr like", value, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrNotLike(String value) {
            addCriterion("commodity_attr not like", value, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrIn(List<String> values) {
            addCriterion("commodity_attr in", values, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrNotIn(List<String> values) {
            addCriterion("commodity_attr not in", values, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrBetween(String value1, String value2) {
            addCriterion("commodity_attr between", value1, value2, "commodityAttr");
            return (Criteria) this;
        }

        public Criteria andCommodityAttrNotBetween(String value1, String value2) {
            addCriterion("commodity_attr not between", value1, value2, "commodityAttr");
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
     * ORDER_DETAIL_HISTORY_INFO
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ORDER_DETAIL_HISTORY_INFO 2022-07-12 23:52:08
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