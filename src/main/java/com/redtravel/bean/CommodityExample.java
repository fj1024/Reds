package com.redtravel.bean;

import java.util.ArrayList;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCommodityidIsNull() {
            addCriterion("commodityId is null");
            return (Criteria) this;
        }

        public Criteria andCommodityidIsNotNull() {
            addCriterion("commodityId is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityidEqualTo(Integer value) {
            addCriterion("commodityId =", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotEqualTo(Integer value) {
            addCriterion("commodityId <>", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThan(Integer value) {
            addCriterion("commodityId >", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityId >=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThan(Integer value) {
            addCriterion("commodityId <", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThanOrEqualTo(Integer value) {
            addCriterion("commodityId <=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidIn(List<Integer> values) {
            addCriterion("commodityId in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotIn(List<Integer> values) {
            addCriterion("commodityId not in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidBetween(Integer value1, Integer value2) {
            addCriterion("commodityId between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityId not between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNull() {
            addCriterion("commodityName is null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNotNull() {
            addCriterion("commodityName is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameEqualTo(String value) {
            addCriterion("commodityName =", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotEqualTo(String value) {
            addCriterion("commodityName <>", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThan(String value) {
            addCriterion("commodityName >", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThanOrEqualTo(String value) {
            addCriterion("commodityName >=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThan(String value) {
            addCriterion("commodityName <", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThanOrEqualTo(String value) {
            addCriterion("commodityName <=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLike(String value) {
            addCriterion("commodityName like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotLike(String value) {
            addCriterion("commodityName not like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIn(List<String> values) {
            addCriterion("commodityName in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotIn(List<String> values) {
            addCriterion("commodityName not in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameBetween(String value1, String value2) {
            addCriterion("commodityName between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotBetween(String value1, String value2) {
            addCriterion("commodityName not between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceIsNull() {
            addCriterion("commodityPrice is null");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceIsNotNull() {
            addCriterion("commodityPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceEqualTo(Integer value) {
            addCriterion("commodityPrice =", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceNotEqualTo(Integer value) {
            addCriterion("commodityPrice <>", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceGreaterThan(Integer value) {
            addCriterion("commodityPrice >", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityPrice >=", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceLessThan(Integer value) {
            addCriterion("commodityPrice <", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceLessThanOrEqualTo(Integer value) {
            addCriterion("commodityPrice <=", value, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceIn(List<Integer> values) {
            addCriterion("commodityPrice in", values, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceNotIn(List<Integer> values) {
            addCriterion("commodityPrice not in", values, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceBetween(Integer value1, Integer value2) {
            addCriterion("commodityPrice between", value1, value2, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypriceNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityPrice not between", value1, value2, "commodityprice");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureIsNull() {
            addCriterion("commodityPicture is null");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureIsNotNull() {
            addCriterion("commodityPicture is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureEqualTo(String value) {
            addCriterion("commodityPicture =", value, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureNotEqualTo(String value) {
            addCriterion("commodityPicture <>", value, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureGreaterThan(String value) {
            addCriterion("commodityPicture >", value, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureGreaterThanOrEqualTo(String value) {
            addCriterion("commodityPicture >=", value, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureLessThan(String value) {
            addCriterion("commodityPicture <", value, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureLessThanOrEqualTo(String value) {
            addCriterion("commodityPicture <=", value, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureLike(String value) {
            addCriterion("commodityPicture like", value, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureNotLike(String value) {
            addCriterion("commodityPicture not like", value, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureIn(List<String> values) {
            addCriterion("commodityPicture in", values, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureNotIn(List<String> values) {
            addCriterion("commodityPicture not in", values, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureBetween(String value1, String value2) {
            addCriterion("commodityPicture between", value1, value2, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditypictureNotBetween(String value1, String value2) {
            addCriterion("commodityPicture not between", value1, value2, "commoditypicture");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationIsNull() {
            addCriterion("commodityLocation is null");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationIsNotNull() {
            addCriterion("commodityLocation is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationEqualTo(String value) {
            addCriterion("commodityLocation =", value, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationNotEqualTo(String value) {
            addCriterion("commodityLocation <>", value, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationGreaterThan(String value) {
            addCriterion("commodityLocation >", value, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationGreaterThanOrEqualTo(String value) {
            addCriterion("commodityLocation >=", value, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationLessThan(String value) {
            addCriterion("commodityLocation <", value, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationLessThanOrEqualTo(String value) {
            addCriterion("commodityLocation <=", value, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationLike(String value) {
            addCriterion("commodityLocation like", value, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationNotLike(String value) {
            addCriterion("commodityLocation not like", value, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationIn(List<String> values) {
            addCriterion("commodityLocation in", values, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationNotIn(List<String> values) {
            addCriterion("commodityLocation not in", values, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationBetween(String value1, String value2) {
            addCriterion("commodityLocation between", value1, value2, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommoditylocationNotBetween(String value1, String value2) {
            addCriterion("commodityLocation not between", value1, value2, "commoditylocation");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkIsNull() {
            addCriterion("commodityRemark is null");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkIsNotNull() {
            addCriterion("commodityRemark is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkEqualTo(String value) {
            addCriterion("commodityRemark =", value, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkNotEqualTo(String value) {
            addCriterion("commodityRemark <>", value, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkGreaterThan(String value) {
            addCriterion("commodityRemark >", value, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkGreaterThanOrEqualTo(String value) {
            addCriterion("commodityRemark >=", value, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkLessThan(String value) {
            addCriterion("commodityRemark <", value, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkLessThanOrEqualTo(String value) {
            addCriterion("commodityRemark <=", value, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkLike(String value) {
            addCriterion("commodityRemark like", value, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkNotLike(String value) {
            addCriterion("commodityRemark not like", value, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkIn(List<String> values) {
            addCriterion("commodityRemark in", values, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkNotIn(List<String> values) {
            addCriterion("commodityRemark not in", values, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkBetween(String value1, String value2) {
            addCriterion("commodityRemark between", value1, value2, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommodityremarkNotBetween(String value1, String value2) {
            addCriterion("commodityRemark not between", value1, value2, "commodityremark");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIsNull() {
            addCriterion("commodityDetail is null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIsNotNull() {
            addCriterion("commodityDetail is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailEqualTo(String value) {
            addCriterion("commodityDetail =", value, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNotEqualTo(String value) {
            addCriterion("commodityDetail <>", value, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailGreaterThan(String value) {
            addCriterion("commodityDetail >", value, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailGreaterThanOrEqualTo(String value) {
            addCriterion("commodityDetail >=", value, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailLessThan(String value) {
            addCriterion("commodityDetail <", value, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailLessThanOrEqualTo(String value) {
            addCriterion("commodityDetail <=", value, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailLike(String value) {
            addCriterion("commodityDetail like", value, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNotLike(String value) {
            addCriterion("commodityDetail not like", value, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailIn(List<String> values) {
            addCriterion("commodityDetail in", values, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNotIn(List<String> values) {
            addCriterion("commodityDetail not in", values, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailBetween(String value1, String value2) {
            addCriterion("commodityDetail between", value1, value2, "commoditydetail");
            return (Criteria) this;
        }

        public Criteria andCommoditydetailNotBetween(String value1, String value2) {
            addCriterion("commodityDetail not between", value1, value2, "commoditydetail");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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