package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountMemberLevelInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * AccountMemberLevelInfoExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public AccountMemberLevelInfoExample() {
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
     * ACCOUNT_MEMBER_LEVEL_INFO 2022-07-12 23:52:08
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

        public Criteria andAccountMemberLevelInfoIdIsNull() {
            addCriterion("account_member_level_info_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdIsNotNull() {
            addCriterion("account_member_level_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdEqualTo(Integer value) {
            addCriterion("account_member_level_info_id =", value, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdNotEqualTo(Integer value) {
            addCriterion("account_member_level_info_id <>", value, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdGreaterThan(Integer value) {
            addCriterion("account_member_level_info_id >", value, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_member_level_info_id >=", value, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdLessThan(Integer value) {
            addCriterion("account_member_level_info_id <", value, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_member_level_info_id <=", value, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdIn(List<Integer> values) {
            addCriterion("account_member_level_info_id in", values, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdNotIn(List<Integer> values) {
            addCriterion("account_member_level_info_id not in", values, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("account_member_level_info_id between", value1, value2, "accountMemberLevelInfoId");
            return (Criteria) this;
        }

        public Criteria andAccountMemberLevelInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_member_level_info_id not between", value1, value2, "accountMemberLevelInfoId");
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

        public Criteria andMemberLevelIsNull() {
            addCriterion("member_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(Integer value) {
            addCriterion("member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(Integer value) {
            addCriterion("member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(Integer value) {
            addCriterion("member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(Integer value) {
            addCriterion("member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(Integer value) {
            addCriterion("member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<Integer> values) {
            addCriterion("member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<Integer> values) {
            addCriterion("member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(Integer value1, Integer value2) {
            addCriterion("member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("member_level not between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIsNull() {
            addCriterion("member_level_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIsNotNull() {
            addCriterion("member_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameEqualTo(String value) {
            addCriterion("member_level_name =", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotEqualTo(String value) {
            addCriterion("member_level_name <>", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameGreaterThan(String value) {
            addCriterion("member_level_name >", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_level_name >=", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLessThan(String value) {
            addCriterion("member_level_name <", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLessThanOrEqualTo(String value) {
            addCriterion("member_level_name <=", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameLike(String value) {
            addCriterion("member_level_name like", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotLike(String value) {
            addCriterion("member_level_name not like", value, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameIn(List<String> values) {
            addCriterion("member_level_name in", values, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotIn(List<String> values) {
            addCriterion("member_level_name not in", values, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameBetween(String value1, String value2) {
            addCriterion("member_level_name between", value1, value2, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNameNotBetween(String value1, String value2) {
            addCriterion("member_level_name not between", value1, value2, "memberLevelName");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationIsNull() {
            addCriterion("member_integration is null");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationIsNotNull() {
            addCriterion("member_integration is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationEqualTo(Integer value) {
            addCriterion("member_integration =", value, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationNotEqualTo(Integer value) {
            addCriterion("member_integration <>", value, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationGreaterThan(Integer value) {
            addCriterion("member_integration >", value, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_integration >=", value, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationLessThan(Integer value) {
            addCriterion("member_integration <", value, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("member_integration <=", value, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationIn(List<Integer> values) {
            addCriterion("member_integration in", values, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationNotIn(List<Integer> values) {
            addCriterion("member_integration not in", values, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("member_integration between", value1, value2, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("member_integration not between", value1, value2, "memberIntegration");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeIsNull() {
            addCriterion("member_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeIsNotNull() {
            addCriterion("member_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeEqualTo(Date value) {
            addCriterion("member_expire_time =", value, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeNotEqualTo(Date value) {
            addCriterion("member_expire_time <>", value, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeGreaterThan(Date value) {
            addCriterion("member_expire_time >", value, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("member_expire_time >=", value, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeLessThan(Date value) {
            addCriterion("member_expire_time <", value, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("member_expire_time <=", value, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeIn(List<Date> values) {
            addCriterion("member_expire_time in", values, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeNotIn(List<Date> values) {
            addCriterion("member_expire_time not in", values, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeBetween(Date value1, Date value2) {
            addCriterion("member_expire_time between", value1, value2, "memberExpireTime");
            return (Criteria) this;
        }

        public Criteria andMemberExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("member_expire_time not between", value1, value2, "memberExpireTime");
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
     * ACCOUNT_MEMBER_LEVEL_INFO
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ACCOUNT_MEMBER_LEVEL_INFO 2022-07-12 23:52:08
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