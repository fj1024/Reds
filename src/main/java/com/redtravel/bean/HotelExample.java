package com.redtravel.bean;

import java.util.ArrayList;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
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

        public Criteria andHotelidIsNull() {
            addCriterion("hotelId is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("hotelId is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(Integer value) {
            addCriterion("hotelId =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(Integer value) {
            addCriterion("hotelId <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(Integer value) {
            addCriterion("hotelId >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelId >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(Integer value) {
            addCriterion("hotelId <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(Integer value) {
            addCriterion("hotelId <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<Integer> values) {
            addCriterion("hotelId in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<Integer> values) {
            addCriterion("hotelId not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(Integer value1, Integer value2) {
            addCriterion("hotelId between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelId not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNull() {
            addCriterion("hotelName is null");
            return (Criteria) this;
        }

        public Criteria andHotelnameIsNotNull() {
            addCriterion("hotelName is not null");
            return (Criteria) this;
        }

        public Criteria andHotelnameEqualTo(String value) {
            addCriterion("hotelName =", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotEqualTo(String value) {
            addCriterion("hotelName <>", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThan(String value) {
            addCriterion("hotelName >", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameGreaterThanOrEqualTo(String value) {
            addCriterion("hotelName >=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThan(String value) {
            addCriterion("hotelName <", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLessThanOrEqualTo(String value) {
            addCriterion("hotelName <=", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameLike(String value) {
            addCriterion("hotelName like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotLike(String value) {
            addCriterion("hotelName not like", value, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameIn(List<String> values) {
            addCriterion("hotelName in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotIn(List<String> values) {
            addCriterion("hotelName not in", values, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameBetween(String value1, String value2) {
            addCriterion("hotelName between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotelnameNotBetween(String value1, String value2) {
            addCriterion("hotelName not between", value1, value2, "hotelname");
            return (Criteria) this;
        }

        public Criteria andHotellocationIsNull() {
            addCriterion("hotelLocation is null");
            return (Criteria) this;
        }

        public Criteria andHotellocationIsNotNull() {
            addCriterion("hotelLocation is not null");
            return (Criteria) this;
        }

        public Criteria andHotellocationEqualTo(String value) {
            addCriterion("hotelLocation =", value, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationNotEqualTo(String value) {
            addCriterion("hotelLocation <>", value, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationGreaterThan(String value) {
            addCriterion("hotelLocation >", value, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationGreaterThanOrEqualTo(String value) {
            addCriterion("hotelLocation >=", value, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationLessThan(String value) {
            addCriterion("hotelLocation <", value, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationLessThanOrEqualTo(String value) {
            addCriterion("hotelLocation <=", value, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationLike(String value) {
            addCriterion("hotelLocation like", value, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationNotLike(String value) {
            addCriterion("hotelLocation not like", value, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationIn(List<String> values) {
            addCriterion("hotelLocation in", values, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationNotIn(List<String> values) {
            addCriterion("hotelLocation not in", values, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationBetween(String value1, String value2) {
            addCriterion("hotelLocation between", value1, value2, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotellocationNotBetween(String value1, String value2) {
            addCriterion("hotelLocation not between", value1, value2, "hotellocation");
            return (Criteria) this;
        }

        public Criteria andHotelcontactIsNull() {
            addCriterion("hotelContact is null");
            return (Criteria) this;
        }

        public Criteria andHotelcontactIsNotNull() {
            addCriterion("hotelContact is not null");
            return (Criteria) this;
        }

        public Criteria andHotelcontactEqualTo(String value) {
            addCriterion("hotelContact =", value, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactNotEqualTo(String value) {
            addCriterion("hotelContact <>", value, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactGreaterThan(String value) {
            addCriterion("hotelContact >", value, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactGreaterThanOrEqualTo(String value) {
            addCriterion("hotelContact >=", value, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactLessThan(String value) {
            addCriterion("hotelContact <", value, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactLessThanOrEqualTo(String value) {
            addCriterion("hotelContact <=", value, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactLike(String value) {
            addCriterion("hotelContact like", value, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactNotLike(String value) {
            addCriterion("hotelContact not like", value, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactIn(List<String> values) {
            addCriterion("hotelContact in", values, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactNotIn(List<String> values) {
            addCriterion("hotelContact not in", values, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactBetween(String value1, String value2) {
            addCriterion("hotelContact between", value1, value2, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHotelcontactNotBetween(String value1, String value2) {
            addCriterion("hotelContact not between", value1, value2, "hotelcontact");
            return (Criteria) this;
        }

        public Criteria andHoteldetailIsNull() {
            addCriterion("hotelDetail is null");
            return (Criteria) this;
        }

        public Criteria andHoteldetailIsNotNull() {
            addCriterion("hotelDetail is not null");
            return (Criteria) this;
        }

        public Criteria andHoteldetailEqualTo(String value) {
            addCriterion("hotelDetail =", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailNotEqualTo(String value) {
            addCriterion("hotelDetail <>", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailGreaterThan(String value) {
            addCriterion("hotelDetail >", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailGreaterThanOrEqualTo(String value) {
            addCriterion("hotelDetail >=", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailLessThan(String value) {
            addCriterion("hotelDetail <", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailLessThanOrEqualTo(String value) {
            addCriterion("hotelDetail <=", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailLike(String value) {
            addCriterion("hotelDetail like", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailNotLike(String value) {
            addCriterion("hotelDetail not like", value, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailIn(List<String> values) {
            addCriterion("hotelDetail in", values, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailNotIn(List<String> values) {
            addCriterion("hotelDetail not in", values, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailBetween(String value1, String value2) {
            addCriterion("hotelDetail between", value1, value2, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHoteldetailNotBetween(String value1, String value2) {
            addCriterion("hotelDetail not between", value1, value2, "hoteldetail");
            return (Criteria) this;
        }

        public Criteria andHotelpictureIsNull() {
            addCriterion("hotelPicture is null");
            return (Criteria) this;
        }

        public Criteria andHotelpictureIsNotNull() {
            addCriterion("hotelPicture is not null");
            return (Criteria) this;
        }

        public Criteria andHotelpictureEqualTo(String value) {
            addCriterion("hotelPicture =", value, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureNotEqualTo(String value) {
            addCriterion("hotelPicture <>", value, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureGreaterThan(String value) {
            addCriterion("hotelPicture >", value, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureGreaterThanOrEqualTo(String value) {
            addCriterion("hotelPicture >=", value, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureLessThan(String value) {
            addCriterion("hotelPicture <", value, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureLessThanOrEqualTo(String value) {
            addCriterion("hotelPicture <=", value, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureLike(String value) {
            addCriterion("hotelPicture like", value, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureNotLike(String value) {
            addCriterion("hotelPicture not like", value, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureIn(List<String> values) {
            addCriterion("hotelPicture in", values, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureNotIn(List<String> values) {
            addCriterion("hotelPicture not in", values, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureBetween(String value1, String value2) {
            addCriterion("hotelPicture between", value1, value2, "hotelpicture");
            return (Criteria) this;
        }

        public Criteria andHotelpictureNotBetween(String value1, String value2) {
            addCriterion("hotelPicture not between", value1, value2, "hotelpicture");
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