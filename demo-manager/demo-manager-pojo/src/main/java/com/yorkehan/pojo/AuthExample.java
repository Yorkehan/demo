package com.yorkehan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthExample() {
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

        public Criteria andAuthIdIsNull() {
            addCriterion("auth_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNotNull() {
            addCriterion("auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthIdEqualTo(Integer value) {
            addCriterion("auth_id =", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotEqualTo(Integer value) {
            addCriterion("auth_id <>", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThan(Integer value) {
            addCriterion("auth_id >", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_id >=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThan(Integer value) {
            addCriterion("auth_id <", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThanOrEqualTo(Integer value) {
            addCriterion("auth_id <=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIn(List<Integer> values) {
            addCriterion("auth_id in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotIn(List<Integer> values) {
            addCriterion("auth_id not in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdBetween(Integer value1, Integer value2) {
            addCriterion("auth_id between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_id not between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIsNull() {
            addCriterion("auth_info is null");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIsNotNull() {
            addCriterion("auth_info is not null");
            return (Criteria) this;
        }

        public Criteria andAuthInfoEqualTo(String value) {
            addCriterion("auth_info =", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotEqualTo(String value) {
            addCriterion("auth_info <>", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoGreaterThan(String value) {
            addCriterion("auth_info >", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoGreaterThanOrEqualTo(String value) {
            addCriterion("auth_info >=", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLessThan(String value) {
            addCriterion("auth_info <", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLessThanOrEqualTo(String value) {
            addCriterion("auth_info <=", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLike(String value) {
            addCriterion("auth_info like", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotLike(String value) {
            addCriterion("auth_info not like", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIn(List<String> values) {
            addCriterion("auth_info in", values, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotIn(List<String> values) {
            addCriterion("auth_info not in", values, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoBetween(String value1, String value2) {
            addCriterion("auth_info between", value1, value2, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotBetween(String value1, String value2) {
            addCriterion("auth_info not between", value1, value2, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIsNull() {
            addCriterion("auth_status is null");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIsNotNull() {
            addCriterion("auth_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStatusEqualTo(Byte value) {
            addCriterion("auth_status =", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotEqualTo(Byte value) {
            addCriterion("auth_status <>", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusGreaterThan(Byte value) {
            addCriterion("auth_status >", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("auth_status >=", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusLessThan(Byte value) {
            addCriterion("auth_status <", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusLessThanOrEqualTo(Byte value) {
            addCriterion("auth_status <=", value, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusIn(List<Byte> values) {
            addCriterion("auth_status in", values, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotIn(List<Byte> values) {
            addCriterion("auth_status not in", values, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusBetween(Byte value1, Byte value2) {
            addCriterion("auth_status between", value1, value2, "authStatus");
            return (Criteria) this;
        }

        public Criteria andAuthStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("auth_status not between", value1, value2, "authStatus");
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