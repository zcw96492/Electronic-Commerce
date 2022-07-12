package com.newcore.electronic.commerce.base.model.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * OrderInfoExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public OrderInfoExample() {
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
     * ORDER_INFO 2022-07-12 23:52:08
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

        public Criteria andOrderSerialNumIsNull() {
            addCriterion("order_serial_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumIsNotNull() {
            addCriterion("order_serial_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumEqualTo(String value) {
            addCriterion("order_serial_num =", value, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumNotEqualTo(String value) {
            addCriterion("order_serial_num <>", value, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumGreaterThan(String value) {
            addCriterion("order_serial_num >", value, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_serial_num >=", value, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumLessThan(String value) {
            addCriterion("order_serial_num <", value, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumLessThanOrEqualTo(String value) {
            addCriterion("order_serial_num <=", value, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumLike(String value) {
            addCriterion("order_serial_num like", value, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumNotLike(String value) {
            addCriterion("order_serial_num not like", value, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumIn(List<String> values) {
            addCriterion("order_serial_num in", values, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumNotIn(List<String> values) {
            addCriterion("order_serial_num not in", values, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumBetween(String value1, String value2) {
            addCriterion("order_serial_num between", value1, value2, "orderSerialNum");
            return (Criteria) this;
        }

        public Criteria andOrderSerialNumNotBetween(String value1, String value2) {
            addCriterion("order_serial_num not between", value1, value2, "orderSerialNum");
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

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(Integer value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(Integer value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(Integer value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(Integer value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(Integer value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<Integer> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<Integer> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(Integer value1, Integer value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumIsNull() {
            addCriterion("order_amount_sum is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumIsNotNull() {
            addCriterion("order_amount_sum is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumEqualTo(BigDecimal value) {
            addCriterion("order_amount_sum =", value, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumNotEqualTo(BigDecimal value) {
            addCriterion("order_amount_sum <>", value, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumGreaterThan(BigDecimal value) {
            addCriterion("order_amount_sum >", value, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount_sum >=", value, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumLessThan(BigDecimal value) {
            addCriterion("order_amount_sum <", value, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount_sum <=", value, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumIn(List<BigDecimal> values) {
            addCriterion("order_amount_sum in", values, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumNotIn(List<BigDecimal> values) {
            addCriterion("order_amount_sum not in", values, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount_sum between", value1, value2, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andOrderAmountSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount_sum not between", value1, value2, "orderAmountSum");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountIsNull() {
            addCriterion("actual_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountIsNotNull() {
            addCriterion("actual_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountEqualTo(BigDecimal value) {
            addCriterion("actual_pay_amount =", value, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("actual_pay_amount <>", value, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountGreaterThan(BigDecimal value) {
            addCriterion("actual_pay_amount >", value, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_pay_amount >=", value, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountLessThan(BigDecimal value) {
            addCriterion("actual_pay_amount <", value, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_pay_amount <=", value, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountIn(List<BigDecimal> values) {
            addCriterion("actual_pay_amount in", values, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("actual_pay_amount not in", values, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_pay_amount between", value1, value2, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andActualPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_pay_amount not between", value1, value2, "actualPayAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNull() {
            addCriterion("freight_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIsNotNull() {
            addCriterion("freight_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreightAmountEqualTo(BigDecimal value) {
            addCriterion("freight_amount =", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotEqualTo(BigDecimal value) {
            addCriterion("freight_amount <>", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThan(BigDecimal value) {
            addCriterion("freight_amount >", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount >=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThan(BigDecimal value) {
            addCriterion("freight_amount <", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_amount <=", value, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountIn(List<BigDecimal> values) {
            addCriterion("freight_amount in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotIn(List<BigDecimal> values) {
            addCriterion("freight_amount not in", values, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount between", value1, value2, "freightAmount");
            return (Criteria) this;
        }

        public Criteria andFreightAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_amount not between", value1, value2, "freightAmount");
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

        public Criteria andLogisticsSerialNumIsNull() {
            addCriterion("logistics_serial_num is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumIsNotNull() {
            addCriterion("logistics_serial_num is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumEqualTo(String value) {
            addCriterion("logistics_serial_num =", value, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumNotEqualTo(String value) {
            addCriterion("logistics_serial_num <>", value, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumGreaterThan(String value) {
            addCriterion("logistics_serial_num >", value, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_serial_num >=", value, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumLessThan(String value) {
            addCriterion("logistics_serial_num <", value, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumLessThanOrEqualTo(String value) {
            addCriterion("logistics_serial_num <=", value, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumLike(String value) {
            addCriterion("logistics_serial_num like", value, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumNotLike(String value) {
            addCriterion("logistics_serial_num not like", value, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumIn(List<String> values) {
            addCriterion("logistics_serial_num in", values, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumNotIn(List<String> values) {
            addCriterion("logistics_serial_num not in", values, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumBetween(String value1, String value2) {
            addCriterion("logistics_serial_num between", value1, value2, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andLogisticsSerialNumNotBetween(String value1, String value2) {
            addCriterion("logistics_serial_num not between", value1, value2, "logisticsSerialNum");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNull() {
            addCriterion("integration is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNotNull() {
            addCriterion("integration is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationEqualTo(Integer value) {
            addCriterion("integration =", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotEqualTo(Integer value) {
            addCriterion("integration <>", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThan(Integer value) {
            addCriterion("integration >", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("integration >=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThan(Integer value) {
            addCriterion("integration <", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("integration <=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationIn(List<Integer> values) {
            addCriterion("integration in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotIn(List<Integer> values) {
            addCriterion("integration not in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("integration between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("integration not between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andBeansIsNull() {
            addCriterion("beans is null");
            return (Criteria) this;
        }

        public Criteria andBeansIsNotNull() {
            addCriterion("beans is not null");
            return (Criteria) this;
        }

        public Criteria andBeansEqualTo(Integer value) {
            addCriterion("beans =", value, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansNotEqualTo(Integer value) {
            addCriterion("beans <>", value, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansGreaterThan(Integer value) {
            addCriterion("beans >", value, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansGreaterThanOrEqualTo(Integer value) {
            addCriterion("beans >=", value, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansLessThan(Integer value) {
            addCriterion("beans <", value, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansLessThanOrEqualTo(Integer value) {
            addCriterion("beans <=", value, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansIn(List<Integer> values) {
            addCriterion("beans in", values, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansNotIn(List<Integer> values) {
            addCriterion("beans not in", values, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansBetween(Integer value1, Integer value2) {
            addCriterion("beans between", value1, value2, "beans");
            return (Criteria) this;
        }

        public Criteria andBeansNotBetween(Integer value1, Integer value2) {
            addCriterion("beans not between", value1, value2, "beans");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeIsNull() {
            addCriterion("receiver_post_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeIsNotNull() {
            addCriterion("receiver_post_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeEqualTo(String value) {
            addCriterion("receiver_post_code =", value, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeNotEqualTo(String value) {
            addCriterion("receiver_post_code <>", value, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeGreaterThan(String value) {
            addCriterion("receiver_post_code >", value, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_post_code >=", value, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeLessThan(String value) {
            addCriterion("receiver_post_code <", value, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeLessThanOrEqualTo(String value) {
            addCriterion("receiver_post_code <=", value, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeLike(String value) {
            addCriterion("receiver_post_code like", value, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeNotLike(String value) {
            addCriterion("receiver_post_code not like", value, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeIn(List<String> values) {
            addCriterion("receiver_post_code in", values, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeNotIn(List<String> values) {
            addCriterion("receiver_post_code not in", values, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeBetween(String value1, String value2) {
            addCriterion("receiver_post_code between", value1, value2, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverPostCodeNotBetween(String value1, String value2) {
            addCriterion("receiver_post_code not between", value1, value2, "receiverPostCode");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdIsNull() {
            addCriterion("receiver_province_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdIsNotNull() {
            addCriterion("receiver_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdEqualTo(Integer value) {
            addCriterion("receiver_province_id =", value, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdNotEqualTo(Integer value) {
            addCriterion("receiver_province_id <>", value, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdGreaterThan(Integer value) {
            addCriterion("receiver_province_id >", value, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_province_id >=", value, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdLessThan(Integer value) {
            addCriterion("receiver_province_id <", value, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_province_id <=", value, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdIn(List<Integer> values) {
            addCriterion("receiver_province_id in", values, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdNotIn(List<Integer> values) {
            addCriterion("receiver_province_id not in", values, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("receiver_province_id between", value1, value2, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_province_id not between", value1, value2, "receiverProvinceId");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNull() {
            addCriterion("receiver_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityEqualTo(Integer value) {
            addCriterion("receiver_city =", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotEqualTo(Integer value) {
            addCriterion("receiver_city <>", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThan(Integer value) {
            addCriterion("receiver_city >", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_city >=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThan(Integer value) {
            addCriterion("receiver_city <", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_city <=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIn(List<Integer> values) {
            addCriterion("receiver_city in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotIn(List<Integer> values) {
            addCriterion("receiver_city not in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityBetween(Integer value1, Integer value2) {
            addCriterion("receiver_city between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_city not between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionIsNull() {
            addCriterion("receiver_region is null");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionIsNotNull() {
            addCriterion("receiver_region is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionEqualTo(Integer value) {
            addCriterion("receiver_region =", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionNotEqualTo(Integer value) {
            addCriterion("receiver_region <>", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionGreaterThan(Integer value) {
            addCriterion("receiver_region >", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_region >=", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionLessThan(Integer value) {
            addCriterion("receiver_region <", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_region <=", value, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionIn(List<Integer> values) {
            addCriterion("receiver_region in", values, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionNotIn(List<Integer> values) {
            addCriterion("receiver_region not in", values, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionBetween(Integer value1, Integer value2) {
            addCriterion("receiver_region between", value1, value2, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverRegionNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_region not between", value1, value2, "receiverRegion");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetIsNull() {
            addCriterion("receiver_street is null");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetIsNotNull() {
            addCriterion("receiver_street is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetEqualTo(Integer value) {
            addCriterion("receiver_street =", value, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetNotEqualTo(Integer value) {
            addCriterion("receiver_street <>", value, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetGreaterThan(Integer value) {
            addCriterion("receiver_street >", value, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_street >=", value, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetLessThan(Integer value) {
            addCriterion("receiver_street <", value, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_street <=", value, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetIn(List<Integer> values) {
            addCriterion("receiver_street in", values, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetNotIn(List<Integer> values) {
            addCriterion("receiver_street not in", values, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetBetween(Integer value1, Integer value2) {
            addCriterion("receiver_street between", value1, value2, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverStreetNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_street not between", value1, value2, "receiverStreet");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressIsNull() {
            addCriterion("receiver_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressIsNotNull() {
            addCriterion("receiver_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressEqualTo(Integer value) {
            addCriterion("receiver_detail_address =", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressNotEqualTo(Integer value) {
            addCriterion("receiver_detail_address <>", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressGreaterThan(Integer value) {
            addCriterion("receiver_detail_address >", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_detail_address >=", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressLessThan(Integer value) {
            addCriterion("receiver_detail_address <", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_detail_address <=", value, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressIn(List<Integer> values) {
            addCriterion("receiver_detail_address in", values, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressNotIn(List<Integer> values) {
            addCriterion("receiver_detail_address not in", values, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressBetween(Integer value1, Integer value2) {
            addCriterion("receiver_detail_address between", value1, value2, "receiverDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverDetailAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_detail_address not between", value1, value2, "receiverDetailAddress");
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

        public Criteria andConfirmStatusIsNull() {
            addCriterion("confirm_status is null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNotNull() {
            addCriterion("confirm_status is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusEqualTo(Integer value) {
            addCriterion("confirm_status =", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotEqualTo(Integer value) {
            addCriterion("confirm_status <>", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThan(Integer value) {
            addCriterion("confirm_status >", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_status >=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThan(Integer value) {
            addCriterion("confirm_status <", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_status <=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIn(List<Integer> values) {
            addCriterion("confirm_status in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotIn(List<Integer> values) {
            addCriterion("confirm_status not in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusBetween(Integer value1, Integer value2) {
            addCriterion("confirm_status between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_status not between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelIsNull() {
            addCriterion("comment_star_level is null");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelIsNotNull() {
            addCriterion("comment_star_level is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelEqualTo(Integer value) {
            addCriterion("comment_star_level =", value, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelNotEqualTo(Integer value) {
            addCriterion("comment_star_level <>", value, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelGreaterThan(Integer value) {
            addCriterion("comment_star_level >", value, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_star_level >=", value, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelLessThan(Integer value) {
            addCriterion("comment_star_level <", value, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelLessThanOrEqualTo(Integer value) {
            addCriterion("comment_star_level <=", value, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelIn(List<Integer> values) {
            addCriterion("comment_star_level in", values, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelNotIn(List<Integer> values) {
            addCriterion("comment_star_level not in", values, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelBetween(Integer value1, Integer value2) {
            addCriterion("comment_star_level between", value1, value2, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andCommentStarLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_star_level not between", value1, value2, "commentStarLevel");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeIsNull() {
            addCriterion("logistics_time is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeIsNotNull() {
            addCriterion("logistics_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeEqualTo(Date value) {
            addCriterion("logistics_time =", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeNotEqualTo(Date value) {
            addCriterion("logistics_time <>", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeGreaterThan(Date value) {
            addCriterion("logistics_time >", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logistics_time >=", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeLessThan(Date value) {
            addCriterion("logistics_time <", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeLessThanOrEqualTo(Date value) {
            addCriterion("logistics_time <=", value, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeIn(List<Date> values) {
            addCriterion("logistics_time in", values, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeNotIn(List<Date> values) {
            addCriterion("logistics_time not in", values, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeBetween(Date value1, Date value2) {
            addCriterion("logistics_time between", value1, value2, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsTimeNotBetween(Date value1, Date value2) {
            addCriterion("logistics_time not between", value1, value2, "logisticsTime");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationIsNull() {
            addCriterion("use_integration is null");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationIsNotNull() {
            addCriterion("use_integration is not null");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationEqualTo(Integer value) {
            addCriterion("use_integration =", value, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationNotEqualTo(Integer value) {
            addCriterion("use_integration <>", value, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationGreaterThan(Integer value) {
            addCriterion("use_integration >", value, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_integration >=", value, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationLessThan(Integer value) {
            addCriterion("use_integration <", value, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("use_integration <=", value, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationIn(List<Integer> values) {
            addCriterion("use_integration in", values, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationNotIn(List<Integer> values) {
            addCriterion("use_integration not in", values, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("use_integration between", value1, value2, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andUseIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("use_integration not between", value1, value2, "useIntegration");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeIsNull() {
            addCriterion("auto_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeIsNotNull() {
            addCriterion("auto_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeEqualTo(Date value) {
            addCriterion("auto_confirm_time =", value, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeNotEqualTo(Date value) {
            addCriterion("auto_confirm_time <>", value, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeGreaterThan(Date value) {
            addCriterion("auto_confirm_time >", value, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auto_confirm_time >=", value, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeLessThan(Date value) {
            addCriterion("auto_confirm_time <", value, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("auto_confirm_time <=", value, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeIn(List<Date> values) {
            addCriterion("auto_confirm_time in", values, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeNotIn(List<Date> values) {
            addCriterion("auto_confirm_time not in", values, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("auto_confirm_time between", value1, value2, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andAutoConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("auto_confirm_time not between", value1, value2, "autoConfirmTime");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillHeaderIsNull() {
            addCriterion("bill_header is null");
            return (Criteria) this;
        }

        public Criteria andBillHeaderIsNotNull() {
            addCriterion("bill_header is not null");
            return (Criteria) this;
        }

        public Criteria andBillHeaderEqualTo(String value) {
            addCriterion("bill_header =", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderNotEqualTo(String value) {
            addCriterion("bill_header <>", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderGreaterThan(String value) {
            addCriterion("bill_header >", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("bill_header >=", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderLessThan(String value) {
            addCriterion("bill_header <", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderLessThanOrEqualTo(String value) {
            addCriterion("bill_header <=", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderLike(String value) {
            addCriterion("bill_header like", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderNotLike(String value) {
            addCriterion("bill_header not like", value, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderIn(List<String> values) {
            addCriterion("bill_header in", values, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderNotIn(List<String> values) {
            addCriterion("bill_header not in", values, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderBetween(String value1, String value2) {
            addCriterion("bill_header between", value1, value2, "billHeader");
            return (Criteria) this;
        }

        public Criteria andBillHeaderNotBetween(String value1, String value2) {
            addCriterion("bill_header not between", value1, value2, "billHeader");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumIsNull() {
            addCriterion("taxpayer_identification_num is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumIsNotNull() {
            addCriterion("taxpayer_identification_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumEqualTo(String value) {
            addCriterion("taxpayer_identification_num =", value, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumNotEqualTo(String value) {
            addCriterion("taxpayer_identification_num <>", value, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumGreaterThan(String value) {
            addCriterion("taxpayer_identification_num >", value, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_identification_num >=", value, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumLessThan(String value) {
            addCriterion("taxpayer_identification_num <", value, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_identification_num <=", value, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumLike(String value) {
            addCriterion("taxpayer_identification_num like", value, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumNotLike(String value) {
            addCriterion("taxpayer_identification_num not like", value, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumIn(List<String> values) {
            addCriterion("taxpayer_identification_num in", values, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumNotIn(List<String> values) {
            addCriterion("taxpayer_identification_num not in", values, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumBetween(String value1, String value2) {
            addCriterion("taxpayer_identification_num between", value1, value2, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdentificationNumNotBetween(String value1, String value2) {
            addCriterion("taxpayer_identification_num not between", value1, value2, "taxpayerIdentificationNum");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailIsNull() {
            addCriterion("bill_receiver_email is null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailIsNotNull() {
            addCriterion("bill_receiver_email is not null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailEqualTo(String value) {
            addCriterion("bill_receiver_email =", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailNotEqualTo(String value) {
            addCriterion("bill_receiver_email <>", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailGreaterThan(String value) {
            addCriterion("bill_receiver_email >", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailGreaterThanOrEqualTo(String value) {
            addCriterion("bill_receiver_email >=", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailLessThan(String value) {
            addCriterion("bill_receiver_email <", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailLessThanOrEqualTo(String value) {
            addCriterion("bill_receiver_email <=", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailLike(String value) {
            addCriterion("bill_receiver_email like", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailNotLike(String value) {
            addCriterion("bill_receiver_email not like", value, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailIn(List<String> values) {
            addCriterion("bill_receiver_email in", values, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailNotIn(List<String> values) {
            addCriterion("bill_receiver_email not in", values, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailBetween(String value1, String value2) {
            addCriterion("bill_receiver_email between", value1, value2, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverEmailNotBetween(String value1, String value2) {
            addCriterion("bill_receiver_email not between", value1, value2, "billReceiverEmail");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesIsNull() {
            addCriterion("bill_receiver_phones is null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesIsNotNull() {
            addCriterion("bill_receiver_phones is not null");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesEqualTo(String value) {
            addCriterion("bill_receiver_phones =", value, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesNotEqualTo(String value) {
            addCriterion("bill_receiver_phones <>", value, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesGreaterThan(String value) {
            addCriterion("bill_receiver_phones >", value, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesGreaterThanOrEqualTo(String value) {
            addCriterion("bill_receiver_phones >=", value, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesLessThan(String value) {
            addCriterion("bill_receiver_phones <", value, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesLessThanOrEqualTo(String value) {
            addCriterion("bill_receiver_phones <=", value, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesLike(String value) {
            addCriterion("bill_receiver_phones like", value, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesNotLike(String value) {
            addCriterion("bill_receiver_phones not like", value, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesIn(List<String> values) {
            addCriterion("bill_receiver_phones in", values, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesNotIn(List<String> values) {
            addCriterion("bill_receiver_phones not in", values, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesBetween(String value1, String value2) {
            addCriterion("bill_receiver_phones between", value1, value2, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andBillReceiverPhonesNotBetween(String value1, String value2) {
            addCriterion("bill_receiver_phones not between", value1, value2, "billReceiverPhones");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIsNull() {
            addCriterion("promotion_info is null");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIsNotNull() {
            addCriterion("promotion_info is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoEqualTo(String value) {
            addCriterion("promotion_info =", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotEqualTo(String value) {
            addCriterion("promotion_info <>", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoGreaterThan(String value) {
            addCriterion("promotion_info >", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_info >=", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLessThan(String value) {
            addCriterion("promotion_info <", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLessThanOrEqualTo(String value) {
            addCriterion("promotion_info <=", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoLike(String value) {
            addCriterion("promotion_info like", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotLike(String value) {
            addCriterion("promotion_info not like", value, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoIn(List<String> values) {
            addCriterion("promotion_info in", values, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotIn(List<String> values) {
            addCriterion("promotion_info not in", values, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoBetween(String value1, String value2) {
            addCriterion("promotion_info between", value1, value2, "promotionInfo");
            return (Criteria) this;
        }

        public Criteria andPromotionInfoNotBetween(String value1, String value2) {
            addCriterion("promotion_info not between", value1, value2, "promotionInfo");
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

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
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
     * ORDER_INFO
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ORDER_INFO 2022-07-12 23:52:08
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