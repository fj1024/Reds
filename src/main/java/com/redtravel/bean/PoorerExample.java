package com.redtravel.bean;

import java.util.ArrayList;
import java.util.List;

public class PoorerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoorerExample() {
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

        public Criteria andPooreridIsNull() {
            addCriterion("poorerId is null");
            return (Criteria) this;
        }

        public Criteria andPooreridIsNotNull() {
            addCriterion("poorerId is not null");
            return (Criteria) this;
        }

        public Criteria andPooreridEqualTo(Integer value) {
            addCriterion("poorerId =", value, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridNotEqualTo(Integer value) {
            addCriterion("poorerId <>", value, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridGreaterThan(Integer value) {
            addCriterion("poorerId >", value, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridGreaterThanOrEqualTo(Integer value) {
            addCriterion("poorerId >=", value, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridLessThan(Integer value) {
            addCriterion("poorerId <", value, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridLessThanOrEqualTo(Integer value) {
            addCriterion("poorerId <=", value, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridIn(List<Integer> values) {
            addCriterion("poorerId in", values, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridNotIn(List<Integer> values) {
            addCriterion("poorerId not in", values, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridBetween(Integer value1, Integer value2) {
            addCriterion("poorerId between", value1, value2, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPooreridNotBetween(Integer value1, Integer value2) {
            addCriterion("poorerId not between", value1, value2, "poorerid");
            return (Criteria) this;
        }

        public Criteria andPoorernameIsNull() {
            addCriterion("poorerName is null");
            return (Criteria) this;
        }

        public Criteria andPoorernameIsNotNull() {
            addCriterion("poorerName is not null");
            return (Criteria) this;
        }

        public Criteria andPoorernameEqualTo(String value) {
            addCriterion("poorerName =", value, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameNotEqualTo(String value) {
            addCriterion("poorerName <>", value, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameGreaterThan(String value) {
            addCriterion("poorerName >", value, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameGreaterThanOrEqualTo(String value) {
            addCriterion("poorerName >=", value, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameLessThan(String value) {
            addCriterion("poorerName <", value, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameLessThanOrEqualTo(String value) {
            addCriterion("poorerName <=", value, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameLike(String value) {
            addCriterion("poorerName like", value, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameNotLike(String value) {
            addCriterion("poorerName not like", value, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameIn(List<String> values) {
            addCriterion("poorerName in", values, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameNotIn(List<String> values) {
            addCriterion("poorerName not in", values, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameBetween(String value1, String value2) {
            addCriterion("poorerName between", value1, value2, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorernameNotBetween(String value1, String value2) {
            addCriterion("poorerName not between", value1, value2, "poorername");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationIsNull() {
            addCriterion("poorerLocation is null");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationIsNotNull() {
            addCriterion("poorerLocation is not null");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationEqualTo(String value) {
            addCriterion("poorerLocation =", value, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationNotEqualTo(String value) {
            addCriterion("poorerLocation <>", value, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationGreaterThan(String value) {
            addCriterion("poorerLocation >", value, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationGreaterThanOrEqualTo(String value) {
            addCriterion("poorerLocation >=", value, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationLessThan(String value) {
            addCriterion("poorerLocation <", value, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationLessThanOrEqualTo(String value) {
            addCriterion("poorerLocation <=", value, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationLike(String value) {
            addCriterion("poorerLocation like", value, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationNotLike(String value) {
            addCriterion("poorerLocation not like", value, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationIn(List<String> values) {
            addCriterion("poorerLocation in", values, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationNotIn(List<String> values) {
            addCriterion("poorerLocation not in", values, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationBetween(String value1, String value2) {
            addCriterion("poorerLocation between", value1, value2, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerlocationNotBetween(String value1, String value2) {
            addCriterion("poorerLocation not between", value1, value2, "poorerlocation");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailIsNull() {
            addCriterion("poorerDetail is null");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailIsNotNull() {
            addCriterion("poorerDetail is not null");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailEqualTo(String value) {
            addCriterion("poorerDetail =", value, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailNotEqualTo(String value) {
            addCriterion("poorerDetail <>", value, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailGreaterThan(String value) {
            addCriterion("poorerDetail >", value, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailGreaterThanOrEqualTo(String value) {
            addCriterion("poorerDetail >=", value, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailLessThan(String value) {
            addCriterion("poorerDetail <", value, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailLessThanOrEqualTo(String value) {
            addCriterion("poorerDetail <=", value, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailLike(String value) {
            addCriterion("poorerDetail like", value, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailNotLike(String value) {
            addCriterion("poorerDetail not like", value, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailIn(List<String> values) {
            addCriterion("poorerDetail in", values, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailNotIn(List<String> values) {
            addCriterion("poorerDetail not in", values, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailBetween(String value1, String value2) {
            addCriterion("poorerDetail between", value1, value2, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerdetailNotBetween(String value1, String value2) {
            addCriterion("poorerDetail not between", value1, value2, "poorerdetail");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureIsNull() {
            addCriterion("poorerPicture is null");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureIsNotNull() {
            addCriterion("poorerPicture is not null");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureEqualTo(String value) {
            addCriterion("poorerPicture =", value, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureNotEqualTo(String value) {
            addCriterion("poorerPicture <>", value, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureGreaterThan(String value) {
            addCriterion("poorerPicture >", value, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureGreaterThanOrEqualTo(String value) {
            addCriterion("poorerPicture >=", value, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureLessThan(String value) {
            addCriterion("poorerPicture <", value, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureLessThanOrEqualTo(String value) {
            addCriterion("poorerPicture <=", value, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureLike(String value) {
            addCriterion("poorerPicture like", value, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureNotLike(String value) {
            addCriterion("poorerPicture not like", value, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureIn(List<String> values) {
            addCriterion("poorerPicture in", values, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureNotIn(List<String> values) {
            addCriterion("poorerPicture not in", values, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureBetween(String value1, String value2) {
            addCriterion("poorerPicture between", value1, value2, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerpictureNotBetween(String value1, String value2) {
            addCriterion("poorerPicture not between", value1, value2, "poorerpicture");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelIsNull() {
            addCriterion("poorerLevel is null");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelIsNotNull() {
            addCriterion("poorerLevel is not null");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelEqualTo(String value) {
            addCriterion("poorerLevel =", value, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelNotEqualTo(String value) {
            addCriterion("poorerLevel <>", value, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelGreaterThan(String value) {
            addCriterion("poorerLevel >", value, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelGreaterThanOrEqualTo(String value) {
            addCriterion("poorerLevel >=", value, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelLessThan(String value) {
            addCriterion("poorerLevel <", value, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelLessThanOrEqualTo(String value) {
            addCriterion("poorerLevel <=", value, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelLike(String value) {
            addCriterion("poorerLevel like", value, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelNotLike(String value) {
            addCriterion("poorerLevel not like", value, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelIn(List<String> values) {
            addCriterion("poorerLevel in", values, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelNotIn(List<String> values) {
            addCriterion("poorerLevel not in", values, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelBetween(String value1, String value2) {
            addCriterion("poorerLevel between", value1, value2, "poorerlevel");
            return (Criteria) this;
        }

        public Criteria andPoorerlevelNotBetween(String value1, String value2) {
            addCriterion("poorerLevel not between", value1, value2, "poorerlevel");
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