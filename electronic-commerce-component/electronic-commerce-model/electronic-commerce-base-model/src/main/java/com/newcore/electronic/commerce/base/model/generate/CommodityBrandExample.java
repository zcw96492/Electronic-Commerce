package com.newcore.electronic.commerce.base.model.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * CommodityBrandExample 方法
     *
     * @date 2022-07-12 23:52:08
     */
    public CommodityBrandExample() {
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
     * COMMODITY_BRAND 2022-07-12 23:52:08
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

        public Criteria andCommodityBrandIdIsNull() {
            addCriterion("commodity_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdIsNotNull() {
            addCriterion("commodity_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdEqualTo(Integer value) {
            addCriterion("commodity_brand_id =", value, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdNotEqualTo(Integer value) {
            addCriterion("commodity_brand_id <>", value, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdGreaterThan(Integer value) {
            addCriterion("commodity_brand_id >", value, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_brand_id >=", value, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdLessThan(Integer value) {
            addCriterion("commodity_brand_id <", value, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_brand_id <=", value, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdIn(List<Integer> values) {
            addCriterion("commodity_brand_id in", values, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdNotIn(List<Integer> values) {
            addCriterion("commodity_brand_id not in", values, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_brand_id between", value1, value2, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andCommodityBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_brand_id not between", value1, value2, "commodityBrandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andFirstLetterIsNull() {
            addCriterion("first_letter is null");
            return (Criteria) this;
        }

        public Criteria andFirstLetterIsNotNull() {
            addCriterion("first_letter is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLetterEqualTo(String value) {
            addCriterion("first_letter =", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterNotEqualTo(String value) {
            addCriterion("first_letter <>", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterGreaterThan(String value) {
            addCriterion("first_letter >", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterGreaterThanOrEqualTo(String value) {
            addCriterion("first_letter >=", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterLessThan(String value) {
            addCriterion("first_letter <", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterLessThanOrEqualTo(String value) {
            addCriterion("first_letter <=", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterLike(String value) {
            addCriterion("first_letter like", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterNotLike(String value) {
            addCriterion("first_letter not like", value, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterIn(List<String> values) {
            addCriterion("first_letter in", values, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterNotIn(List<String> values) {
            addCriterion("first_letter not in", values, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterBetween(String value1, String value2) {
            addCriterion("first_letter between", value1, value2, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFirstLetterNotBetween(String value1, String value2) {
            addCriterion("first_letter not between", value1, value2, "firstLetter");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIsNull() {
            addCriterion("factory_status is null");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIsNotNull() {
            addCriterion("factory_status is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusEqualTo(Integer value) {
            addCriterion("factory_status =", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotEqualTo(Integer value) {
            addCriterion("factory_status <>", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusGreaterThan(Integer value) {
            addCriterion("factory_status >", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_status >=", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusLessThan(Integer value) {
            addCriterion("factory_status <", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("factory_status <=", value, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusIn(List<Integer> values) {
            addCriterion("factory_status in", values, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotIn(List<Integer> values) {
            addCriterion("factory_status not in", values, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("factory_status between", value1, value2, "factoryStatus");
            return (Criteria) this;
        }

        public Criteria andFactoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_status not between", value1, value2, "factoryStatus");
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

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(Integer value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(Integer value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(Integer value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(Integer value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<Integer> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<Integer> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(Integer value1, Integer value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumIsNull() {
            addCriterion("product_comment_num is null");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumIsNotNull() {
            addCriterion("product_comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumEqualTo(Integer value) {
            addCriterion("product_comment_num =", value, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumNotEqualTo(Integer value) {
            addCriterion("product_comment_num <>", value, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumGreaterThan(Integer value) {
            addCriterion("product_comment_num >", value, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_comment_num >=", value, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumLessThan(Integer value) {
            addCriterion("product_comment_num <", value, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("product_comment_num <=", value, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumIn(List<Integer> values) {
            addCriterion("product_comment_num in", values, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumNotIn(List<Integer> values) {
            addCriterion("product_comment_num not in", values, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("product_comment_num between", value1, value2, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andProductCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("product_comment_num not between", value1, value2, "productCommentNum");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andBrandPicIsNull() {
            addCriterion("brand_pic is null");
            return (Criteria) this;
        }

        public Criteria andBrandPicIsNotNull() {
            addCriterion("brand_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBrandPicEqualTo(String value) {
            addCriterion("brand_pic =", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicNotEqualTo(String value) {
            addCriterion("brand_pic <>", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicGreaterThan(String value) {
            addCriterion("brand_pic >", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicGreaterThanOrEqualTo(String value) {
            addCriterion("brand_pic >=", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicLessThan(String value) {
            addCriterion("brand_pic <", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicLessThanOrEqualTo(String value) {
            addCriterion("brand_pic <=", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicLike(String value) {
            addCriterion("brand_pic like", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicNotLike(String value) {
            addCriterion("brand_pic not like", value, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicIn(List<String> values) {
            addCriterion("brand_pic in", values, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicNotIn(List<String> values) {
            addCriterion("brand_pic not in", values, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicBetween(String value1, String value2) {
            addCriterion("brand_pic between", value1, value2, "brandPic");
            return (Criteria) this;
        }

        public Criteria andBrandPicNotBetween(String value1, String value2) {
            addCriterion("brand_pic not between", value1, value2, "brandPic");
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
     * COMMODITY_BRAND
     *
     * @date 2022-07-12 23:52:08
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * COMMODITY_BRAND 2022-07-12 23:52:08
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