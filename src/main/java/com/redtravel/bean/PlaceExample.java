package com.redtravel.bean;

import java.util.ArrayList;
import java.util.List;

public class PlaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlaceExample() {
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

        public Criteria andPlaceidIsNull() {
            addCriterion("placeId is null");
            return (Criteria) this;
        }

        public Criteria andPlaceidIsNotNull() {
            addCriterion("placeId is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceidEqualTo(Integer value) {
            addCriterion("placeId =", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotEqualTo(Integer value) {
            addCriterion("placeId <>", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThan(Integer value) {
            addCriterion("placeId >", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("placeId >=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThan(Integer value) {
            addCriterion("placeId <", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidLessThanOrEqualTo(Integer value) {
            addCriterion("placeId <=", value, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidIn(List<Integer> values) {
            addCriterion("placeId in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotIn(List<Integer> values) {
            addCriterion("placeId not in", values, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidBetween(Integer value1, Integer value2) {
            addCriterion("placeId between", value1, value2, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlaceidNotBetween(Integer value1, Integer value2) {
            addCriterion("placeId not between", value1, value2, "placeid");
            return (Criteria) this;
        }

        public Criteria andPlacenameIsNull() {
            addCriterion("placeName is null");
            return (Criteria) this;
        }

        public Criteria andPlacenameIsNotNull() {
            addCriterion("placeName is not null");
            return (Criteria) this;
        }

        public Criteria andPlacenameEqualTo(String value) {
            addCriterion("placeName =", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotEqualTo(String value) {
            addCriterion("placeName <>", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameGreaterThan(String value) {
            addCriterion("placeName >", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameGreaterThanOrEqualTo(String value) {
            addCriterion("placeName >=", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLessThan(String value) {
            addCriterion("placeName <", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLessThanOrEqualTo(String value) {
            addCriterion("placeName <=", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameLike(String value) {
            addCriterion("placeName like", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotLike(String value) {
            addCriterion("placeName not like", value, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameIn(List<String> values) {
            addCriterion("placeName in", values, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotIn(List<String> values) {
            addCriterion("placeName not in", values, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameBetween(String value1, String value2) {
            addCriterion("placeName between", value1, value2, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacenameNotBetween(String value1, String value2) {
            addCriterion("placeName not between", value1, value2, "placename");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionIsNull() {
            addCriterion("placeDescription is null");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionIsNotNull() {
            addCriterion("placeDescription is not null");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionEqualTo(String value) {
            addCriterion("placeDescription =", value, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionNotEqualTo(String value) {
            addCriterion("placeDescription <>", value, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionGreaterThan(String value) {
            addCriterion("placeDescription >", value, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("placeDescription >=", value, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionLessThan(String value) {
            addCriterion("placeDescription <", value, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionLessThanOrEqualTo(String value) {
            addCriterion("placeDescription <=", value, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionLike(String value) {
            addCriterion("placeDescription like", value, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionNotLike(String value) {
            addCriterion("placeDescription not like", value, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionIn(List<String> values) {
            addCriterion("placeDescription in", values, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionNotIn(List<String> values) {
            addCriterion("placeDescription not in", values, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionBetween(String value1, String value2) {
            addCriterion("placeDescription between", value1, value2, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacedescriptionNotBetween(String value1, String value2) {
            addCriterion("placeDescription not between", value1, value2, "placedescription");
            return (Criteria) this;
        }

        public Criteria andPlacelacationIsNull() {
            addCriterion("placeLacation is null");
            return (Criteria) this;
        }

        public Criteria andPlacelacationIsNotNull() {
            addCriterion("placeLacation is not null");
            return (Criteria) this;
        }

        public Criteria andPlacelacationEqualTo(String value) {
            addCriterion("placeLacation =", value, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationNotEqualTo(String value) {
            addCriterion("placeLacation <>", value, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationGreaterThan(String value) {
            addCriterion("placeLacation >", value, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationGreaterThanOrEqualTo(String value) {
            addCriterion("placeLacation >=", value, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationLessThan(String value) {
            addCriterion("placeLacation <", value, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationLessThanOrEqualTo(String value) {
            addCriterion("placeLacation <=", value, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationLike(String value) {
            addCriterion("placeLacation like", value, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationNotLike(String value) {
            addCriterion("placeLacation not like", value, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationIn(List<String> values) {
            addCriterion("placeLacation in", values, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationNotIn(List<String> values) {
            addCriterion("placeLacation not in", values, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationBetween(String value1, String value2) {
            addCriterion("placeLacation between", value1, value2, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacelacationNotBetween(String value1, String value2) {
            addCriterion("placeLacation not between", value1, value2, "placelacation");
            return (Criteria) this;
        }

        public Criteria andPlacerankIsNull() {
            addCriterion("placeRank is null");
            return (Criteria) this;
        }

        public Criteria andPlacerankIsNotNull() {
            addCriterion("placeRank is not null");
            return (Criteria) this;
        }

        public Criteria andPlacerankEqualTo(String value) {
            addCriterion("placeRank =", value, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankNotEqualTo(String value) {
            addCriterion("placeRank <>", value, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankGreaterThan(String value) {
            addCriterion("placeRank >", value, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankGreaterThanOrEqualTo(String value) {
            addCriterion("placeRank >=", value, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankLessThan(String value) {
            addCriterion("placeRank <", value, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankLessThanOrEqualTo(String value) {
            addCriterion("placeRank <=", value, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankLike(String value) {
            addCriterion("placeRank like", value, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankNotLike(String value) {
            addCriterion("placeRank not like", value, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankIn(List<String> values) {
            addCriterion("placeRank in", values, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankNotIn(List<String> values) {
            addCriterion("placeRank not in", values, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankBetween(String value1, String value2) {
            addCriterion("placeRank between", value1, value2, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlacerankNotBetween(String value1, String value2) {
            addCriterion("placeRank not between", value1, value2, "placerank");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkIsNull() {
            addCriterion("placeRemark is null");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkIsNotNull() {
            addCriterion("placeRemark is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkEqualTo(String value) {
            addCriterion("placeRemark =", value, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkNotEqualTo(String value) {
            addCriterion("placeRemark <>", value, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkGreaterThan(String value) {
            addCriterion("placeRemark >", value, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkGreaterThanOrEqualTo(String value) {
            addCriterion("placeRemark >=", value, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkLessThan(String value) {
            addCriterion("placeRemark <", value, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkLessThanOrEqualTo(String value) {
            addCriterion("placeRemark <=", value, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkLike(String value) {
            addCriterion("placeRemark like", value, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkNotLike(String value) {
            addCriterion("placeRemark not like", value, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkIn(List<String> values) {
            addCriterion("placeRemark in", values, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkNotIn(List<String> values) {
            addCriterion("placeRemark not in", values, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkBetween(String value1, String value2) {
            addCriterion("placeRemark between", value1, value2, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlaceremarkNotBetween(String value1, String value2) {
            addCriterion("placeRemark not between", value1, value2, "placeremark");
            return (Criteria) this;
        }

        public Criteria andPlacepictureIsNull() {
            addCriterion("placePicture is null");
            return (Criteria) this;
        }

        public Criteria andPlacepictureIsNotNull() {
            addCriterion("placePicture is not null");
            return (Criteria) this;
        }

        public Criteria andPlacepictureEqualTo(String value) {
            addCriterion("placePicture =", value, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureNotEqualTo(String value) {
            addCriterion("placePicture <>", value, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureGreaterThan(String value) {
            addCriterion("placePicture >", value, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureGreaterThanOrEqualTo(String value) {
            addCriterion("placePicture >=", value, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureLessThan(String value) {
            addCriterion("placePicture <", value, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureLessThanOrEqualTo(String value) {
            addCriterion("placePicture <=", value, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureLike(String value) {
            addCriterion("placePicture like", value, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureNotLike(String value) {
            addCriterion("placePicture not like", value, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureIn(List<String> values) {
            addCriterion("placePicture in", values, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureNotIn(List<String> values) {
            addCriterion("placePicture not in", values, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureBetween(String value1, String value2) {
            addCriterion("placePicture between", value1, value2, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacepictureNotBetween(String value1, String value2) {
            addCriterion("placePicture not between", value1, value2, "placepicture");
            return (Criteria) this;
        }

        public Criteria andPlacecontactIsNull() {
            addCriterion("placeContact is null");
            return (Criteria) this;
        }

        public Criteria andPlacecontactIsNotNull() {
            addCriterion("placeContact is not null");
            return (Criteria) this;
        }

        public Criteria andPlacecontactEqualTo(String value) {
            addCriterion("placeContact =", value, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactNotEqualTo(String value) {
            addCriterion("placeContact <>", value, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactGreaterThan(String value) {
            addCriterion("placeContact >", value, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactGreaterThanOrEqualTo(String value) {
            addCriterion("placeContact >=", value, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactLessThan(String value) {
            addCriterion("placeContact <", value, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactLessThanOrEqualTo(String value) {
            addCriterion("placeContact <=", value, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactLike(String value) {
            addCriterion("placeContact like", value, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactNotLike(String value) {
            addCriterion("placeContact not like", value, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactIn(List<String> values) {
            addCriterion("placeContact in", values, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactNotIn(List<String> values) {
            addCriterion("placeContact not in", values, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactBetween(String value1, String value2) {
            addCriterion("placeContact between", value1, value2, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlacecontactNotBetween(String value1, String value2) {
            addCriterion("placeContact not between", value1, value2, "placecontact");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionIsNull() {
            addCriterion("placeAttraction is null");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionIsNotNull() {
            addCriterion("placeAttraction is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionEqualTo(String value) {
            addCriterion("placeAttraction =", value, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionNotEqualTo(String value) {
            addCriterion("placeAttraction <>", value, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionGreaterThan(String value) {
            addCriterion("placeAttraction >", value, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionGreaterThanOrEqualTo(String value) {
            addCriterion("placeAttraction >=", value, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionLessThan(String value) {
            addCriterion("placeAttraction <", value, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionLessThanOrEqualTo(String value) {
            addCriterion("placeAttraction <=", value, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionLike(String value) {
            addCriterion("placeAttraction like", value, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionNotLike(String value) {
            addCriterion("placeAttraction not like", value, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionIn(List<String> values) {
            addCriterion("placeAttraction in", values, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionNotIn(List<String> values) {
            addCriterion("placeAttraction not in", values, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionBetween(String value1, String value2) {
            addCriterion("placeAttraction between", value1, value2, "placeattraction");
            return (Criteria) this;
        }

        public Criteria andPlaceattractionNotBetween(String value1, String value2) {
            addCriterion("placeAttraction not between", value1, value2, "placeattraction");
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