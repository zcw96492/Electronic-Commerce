package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * ShopInfoExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public ShopInfoExample() {
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
     * SHOP_INFO 2022-07-12 23:52:08
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

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNull() {
            addCriterion("legal_representative is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNotNull() {
            addCriterion("legal_representative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeEqualTo(String value) {
            addCriterion("legal_representative =", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotEqualTo(String value) {
            addCriterion("legal_representative <>", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThan(String value) {
            addCriterion("legal_representative >", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative >=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThan(String value) {
            addCriterion("legal_representative <", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative <=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLike(String value) {
            addCriterion("legal_representative like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotLike(String value) {
            addCriterion("legal_representative not like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIn(List<String> values) {
            addCriterion("legal_representative in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotIn(List<String> values) {
            addCriterion("legal_representative not in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeBetween(String value1, String value2) {
            addCriterion("legal_representative between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotBetween(String value1, String value2) {
            addCriterion("legal_representative not between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeIsNull() {
            addCriterion("legal_representative_id_type is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeIsNotNull() {
            addCriterion("legal_representative_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeEqualTo(String value) {
            addCriterion("legal_representative_id_type =", value, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeNotEqualTo(String value) {
            addCriterion("legal_representative_id_type <>", value, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeGreaterThan(String value) {
            addCriterion("legal_representative_id_type >", value, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_id_type >=", value, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeLessThan(String value) {
            addCriterion("legal_representative_id_type <", value, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_id_type <=", value, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeLike(String value) {
            addCriterion("legal_representative_id_type like", value, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeNotLike(String value) {
            addCriterion("legal_representative_id_type not like", value, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeIn(List<String> values) {
            addCriterion("legal_representative_id_type in", values, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeNotIn(List<String> values) {
            addCriterion("legal_representative_id_type not in", values, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeBetween(String value1, String value2) {
            addCriterion("legal_representative_id_type between", value1, value2, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdTypeNotBetween(String value1, String value2) {
            addCriterion("legal_representative_id_type not between", value1, value2, "legalRepresentativeIdType");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoIsNull() {
            addCriterion("legal_representative_id_no is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoIsNotNull() {
            addCriterion("legal_representative_id_no is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoEqualTo(String value) {
            addCriterion("legal_representative_id_no =", value, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoNotEqualTo(String value) {
            addCriterion("legal_representative_id_no <>", value, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoGreaterThan(String value) {
            addCriterion("legal_representative_id_no >", value, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_id_no >=", value, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoLessThan(String value) {
            addCriterion("legal_representative_id_no <", value, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_id_no <=", value, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoLike(String value) {
            addCriterion("legal_representative_id_no like", value, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoNotLike(String value) {
            addCriterion("legal_representative_id_no not like", value, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoIn(List<String> values) {
            addCriterion("legal_representative_id_no in", values, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoNotIn(List<String> values) {
            addCriterion("legal_representative_id_no not in", values, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoBetween(String value1, String value2) {
            addCriterion("legal_representative_id_no between", value1, value2, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIdNoNotBetween(String value1, String value2) {
            addCriterion("legal_representative_id_no not between", value1, value2, "legalRepresentativeIdNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIsNull() {
            addCriterion("legal_representative_phone is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIsNotNull() {
            addCriterion("legal_representative_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneEqualTo(String value) {
            addCriterion("legal_representative_phone =", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotEqualTo(String value) {
            addCriterion("legal_representative_phone <>", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneGreaterThan(String value) {
            addCriterion("legal_representative_phone >", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_phone >=", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLessThan(String value) {
            addCriterion("legal_representative_phone <", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_phone <=", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneLike(String value) {
            addCriterion("legal_representative_phone like", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotLike(String value) {
            addCriterion("legal_representative_phone not like", value, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneIn(List<String> values) {
            addCriterion("legal_representative_phone in", values, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotIn(List<String> values) {
            addCriterion("legal_representative_phone not in", values, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneBetween(String value1, String value2) {
            addCriterion("legal_representative_phone between", value1, value2, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativePhoneNotBetween(String value1, String value2) {
            addCriterion("legal_representative_phone not between", value1, value2, "legalRepresentativePhone");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagIsNull() {
            addCriterion("authentication_flag is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagIsNotNull() {
            addCriterion("authentication_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagEqualTo(Integer value) {
            addCriterion("authentication_flag =", value, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagNotEqualTo(Integer value) {
            addCriterion("authentication_flag <>", value, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagGreaterThan(Integer value) {
            addCriterion("authentication_flag >", value, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("authentication_flag >=", value, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagLessThan(Integer value) {
            addCriterion("authentication_flag <", value, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagLessThanOrEqualTo(Integer value) {
            addCriterion("authentication_flag <=", value, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagIn(List<Integer> values) {
            addCriterion("authentication_flag in", values, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagNotIn(List<Integer> values) {
            addCriterion("authentication_flag not in", values, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagBetween(Integer value1, Integer value2) {
            addCriterion("authentication_flag between", value1, value2, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("authentication_flag not between", value1, value2, "authenticationFlag");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateIsNull() {
            addCriterion("authentication_date is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateIsNotNull() {
            addCriterion("authentication_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateEqualTo(Date value) {
            addCriterion("authentication_date =", value, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateNotEqualTo(Date value) {
            addCriterion("authentication_date <>", value, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateGreaterThan(Date value) {
            addCriterion("authentication_date >", value, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("authentication_date >=", value, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateLessThan(Date value) {
            addCriterion("authentication_date <", value, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateLessThanOrEqualTo(Date value) {
            addCriterion("authentication_date <=", value, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateIn(List<Date> values) {
            addCriterion("authentication_date in", values, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateNotIn(List<Date> values) {
            addCriterion("authentication_date not in", values, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateBetween(Date value1, Date value2) {
            addCriterion("authentication_date between", value1, value2, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andAuthenticationDateNotBetween(Date value1, Date value2) {
            addCriterion("authentication_date not between", value1, value2, "authenticationDate");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrIsNull() {
            addCriterion("shop_link_addr is null");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrIsNotNull() {
            addCriterion("shop_link_addr is not null");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrEqualTo(String value) {
            addCriterion("shop_link_addr =", value, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrNotEqualTo(String value) {
            addCriterion("shop_link_addr <>", value, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrGreaterThan(String value) {
            addCriterion("shop_link_addr >", value, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrGreaterThanOrEqualTo(String value) {
            addCriterion("shop_link_addr >=", value, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrLessThan(String value) {
            addCriterion("shop_link_addr <", value, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrLessThanOrEqualTo(String value) {
            addCriterion("shop_link_addr <=", value, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrLike(String value) {
            addCriterion("shop_link_addr like", value, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrNotLike(String value) {
            addCriterion("shop_link_addr not like", value, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrIn(List<String> values) {
            addCriterion("shop_link_addr in", values, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrNotIn(List<String> values) {
            addCriterion("shop_link_addr not in", values, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrBetween(String value1, String value2) {
            addCriterion("shop_link_addr between", value1, value2, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andShopLinkAddrNotBetween(String value1, String value2) {
            addCriterion("shop_link_addr not between", value1, value2, "shopLinkAddr");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNull() {
            addCriterion("office_phone is null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNotNull() {
            addCriterion("office_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneEqualTo(String value) {
            addCriterion("office_phone =", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotEqualTo(String value) {
            addCriterion("office_phone <>", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThan(String value) {
            addCriterion("office_phone >", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("office_phone >=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThan(String value) {
            addCriterion("office_phone <", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThanOrEqualTo(String value) {
            addCriterion("office_phone <=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLike(String value) {
            addCriterion("office_phone like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotLike(String value) {
            addCriterion("office_phone not like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIn(List<String> values) {
            addCriterion("office_phone in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotIn(List<String> values) {
            addCriterion("office_phone not in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneBetween(String value1, String value2) {
            addCriterion("office_phone between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotBetween(String value1, String value2) {
            addCriterion("office_phone not between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelIsNull() {
            addCriterion("shop_star_level is null");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelIsNotNull() {
            addCriterion("shop_star_level is not null");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelEqualTo(String value) {
            addCriterion("shop_star_level =", value, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelNotEqualTo(String value) {
            addCriterion("shop_star_level <>", value, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelGreaterThan(String value) {
            addCriterion("shop_star_level >", value, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("shop_star_level >=", value, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelLessThan(String value) {
            addCriterion("shop_star_level <", value, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelLessThanOrEqualTo(String value) {
            addCriterion("shop_star_level <=", value, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelLike(String value) {
            addCriterion("shop_star_level like", value, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelNotLike(String value) {
            addCriterion("shop_star_level not like", value, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelIn(List<String> values) {
            addCriterion("shop_star_level in", values, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelNotIn(List<String> values) {
            addCriterion("shop_star_level not in", values, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelBetween(String value1, String value2) {
            addCriterion("shop_star_level between", value1, value2, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopStarLevelNotBetween(String value1, String value2) {
            addCriterion("shop_star_level not between", value1, value2, "shopStarLevel");
            return (Criteria) this;
        }

        public Criteria andShopLanguageIsNull() {
            addCriterion("shop_language is null");
            return (Criteria) this;
        }

        public Criteria andShopLanguageIsNotNull() {
            addCriterion("shop_language is not null");
            return (Criteria) this;
        }

        public Criteria andShopLanguageEqualTo(String value) {
            addCriterion("shop_language =", value, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageNotEqualTo(String value) {
            addCriterion("shop_language <>", value, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageGreaterThan(String value) {
            addCriterion("shop_language >", value, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("shop_language >=", value, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageLessThan(String value) {
            addCriterion("shop_language <", value, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageLessThanOrEqualTo(String value) {
            addCriterion("shop_language <=", value, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageLike(String value) {
            addCriterion("shop_language like", value, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageNotLike(String value) {
            addCriterion("shop_language not like", value, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageIn(List<String> values) {
            addCriterion("shop_language in", values, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageNotIn(List<String> values) {
            addCriterion("shop_language not in", values, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageBetween(String value1, String value2) {
            addCriterion("shop_language between", value1, value2, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopLanguageNotBetween(String value1, String value2) {
            addCriterion("shop_language not between", value1, value2, "shopLanguage");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNull() {
            addCriterion("shop_desc is null");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNotNull() {
            addCriterion("shop_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShopDescEqualTo(String value) {
            addCriterion("shop_desc =", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotEqualTo(String value) {
            addCriterion("shop_desc <>", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThan(String value) {
            addCriterion("shop_desc >", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThanOrEqualTo(String value) {
            addCriterion("shop_desc >=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThan(String value) {
            addCriterion("shop_desc <", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThanOrEqualTo(String value) {
            addCriterion("shop_desc <=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLike(String value) {
            addCriterion("shop_desc like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotLike(String value) {
            addCriterion("shop_desc not like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescIn(List<String> values) {
            addCriterion("shop_desc in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotIn(List<String> values) {
            addCriterion("shop_desc not in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescBetween(String value1, String value2) {
            addCriterion("shop_desc between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotBetween(String value1, String value2) {
            addCriterion("shop_desc not between", value1, value2, "shopDesc");
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
     * SHOP_INFO
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SHOP_INFO 2022-07-12 23:52:08
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