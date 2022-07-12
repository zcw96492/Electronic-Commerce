package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogisticsCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * LogisticsCompanyExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public LogisticsCompanyExample() {
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
     * LOGISTICS_COMPANY 2022-07-12 23:52:08
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

        public Criteria andLogisticsCompanyNameIsNull() {
            addCriterion("logistics_company_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIsNotNull() {
            addCriterion("logistics_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameEqualTo(String value) {
            addCriterion("logistics_company_name =", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotEqualTo(String value) {
            addCriterion("logistics_company_name <>", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameGreaterThan(String value) {
            addCriterion("logistics_company_name >", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company_name >=", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLessThan(String value) {
            addCriterion("logistics_company_name <", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("logistics_company_name <=", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLike(String value) {
            addCriterion("logistics_company_name like", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotLike(String value) {
            addCriterion("logistics_company_name not like", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIn(List<String> values) {
            addCriterion("logistics_company_name in", values, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotIn(List<String> values) {
            addCriterion("logistics_company_name not in", values, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameBetween(String value1, String value2) {
            addCriterion("logistics_company_name between", value1, value2, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotBetween(String value1, String value2) {
            addCriterion("logistics_company_name not between", value1, value2, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeIsNull() {
            addCriterion("logistics_company_code is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeIsNotNull() {
            addCriterion("logistics_company_code is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeEqualTo(String value) {
            addCriterion("logistics_company_code =", value, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeNotEqualTo(String value) {
            addCriterion("logistics_company_code <>", value, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeGreaterThan(String value) {
            addCriterion("logistics_company_code >", value, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company_code >=", value, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeLessThan(String value) {
            addCriterion("logistics_company_code <", value, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("logistics_company_code <=", value, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeLike(String value) {
            addCriterion("logistics_company_code like", value, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeNotLike(String value) {
            addCriterion("logistics_company_code not like", value, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeIn(List<String> values) {
            addCriterion("logistics_company_code in", values, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeNotIn(List<String> values) {
            addCriterion("logistics_company_code not in", values, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeBetween(String value1, String value2) {
            addCriterion("logistics_company_code between", value1, value2, "logisticsCompanyCode");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("logistics_company_code not between", value1, value2, "logisticsCompanyCode");
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

        public Criteria andSignFlagIsNull() {
            addCriterion("sign_flag is null");
            return (Criteria) this;
        }

        public Criteria andSignFlagIsNotNull() {
            addCriterion("sign_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSignFlagEqualTo(Integer value) {
            addCriterion("sign_flag =", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagNotEqualTo(Integer value) {
            addCriterion("sign_flag <>", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagGreaterThan(Integer value) {
            addCriterion("sign_flag >", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_flag >=", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagLessThan(Integer value) {
            addCriterion("sign_flag <", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagLessThanOrEqualTo(Integer value) {
            addCriterion("sign_flag <=", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagIn(List<Integer> values) {
            addCriterion("sign_flag in", values, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagNotIn(List<Integer> values) {
            addCriterion("sign_flag not in", values, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagBetween(Integer value1, Integer value2) {
            addCriterion("sign_flag between", value1, value2, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_flag not between", value1, value2, "signFlag");
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
     * LOGISTICS_COMPANY
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * LOGISTICS_COMPANY 2022-07-12 23:52:08
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