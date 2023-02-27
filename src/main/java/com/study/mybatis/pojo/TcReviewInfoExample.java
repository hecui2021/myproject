package com.study.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcReviewInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcReviewInfoExample() {
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

        public Criteria andReviewIdIsNull() {
            addCriterion("review_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNotNull() {
            addCriterion("review_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIdEqualTo(String value) {
            addCriterion("review_id =", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotEqualTo(String value) {
            addCriterion("review_id <>", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThan(String value) {
            addCriterion("review_id >", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThanOrEqualTo(String value) {
            addCriterion("review_id >=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThan(String value) {
            addCriterion("review_id <", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThanOrEqualTo(String value) {
            addCriterion("review_id <=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLike(String value) {
            addCriterion("review_id like", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotLike(String value) {
            addCriterion("review_id not like", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdIn(List<String> values) {
            addCriterion("review_id in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotIn(List<String> values) {
            addCriterion("review_id not in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdBetween(String value1, String value2) {
            addCriterion("review_id between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotBetween(String value1, String value2) {
            addCriterion("review_id not between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdIsNull() {
            addCriterion("program_app_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdIsNotNull() {
            addCriterion("program_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdEqualTo(String value) {
            addCriterion("program_app_id =", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdNotEqualTo(String value) {
            addCriterion("program_app_id <>", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdGreaterThan(String value) {
            addCriterion("program_app_id >", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("program_app_id >=", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdLessThan(String value) {
            addCriterion("program_app_id <", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdLessThanOrEqualTo(String value) {
            addCriterion("program_app_id <=", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdLike(String value) {
            addCriterion("program_app_id like", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdNotLike(String value) {
            addCriterion("program_app_id not like", value, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdIn(List<String> values) {
            addCriterion("program_app_id in", values, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdNotIn(List<String> values) {
            addCriterion("program_app_id not in", values, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdBetween(String value1, String value2) {
            addCriterion("program_app_id between", value1, value2, "programAppId");
            return (Criteria) this;
        }

        public Criteria andProgramAppIdNotBetween(String value1, String value2) {
            addCriterion("program_app_id not between", value1, value2, "programAppId");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("review_status is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(Byte value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(Byte value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(Byte value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(Byte value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("review_status <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<Byte> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<Byte> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(Byte value1, Byte value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIsNull() {
            addCriterion("review_type is null");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIsNotNull() {
            addCriterion("review_type is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTypeEqualTo(Byte value) {
            addCriterion("review_type =", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotEqualTo(Byte value) {
            addCriterion("review_type <>", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeGreaterThan(Byte value) {
            addCriterion("review_type >", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("review_type >=", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeLessThan(Byte value) {
            addCriterion("review_type <", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeLessThanOrEqualTo(Byte value) {
            addCriterion("review_type <=", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIn(List<Byte> values) {
            addCriterion("review_type in", values, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotIn(List<Byte> values) {
            addCriterion("review_type not in", values, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeBetween(Byte value1, Byte value2) {
            addCriterion("review_type between", value1, value2, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("review_type not between", value1, value2, "reviewType");
            return (Criteria) this;
        }

        public Criteria andProgramNameIsNull() {
            addCriterion("program_name is null");
            return (Criteria) this;
        }

        public Criteria andProgramNameIsNotNull() {
            addCriterion("program_name is not null");
            return (Criteria) this;
        }

        public Criteria andProgramNameEqualTo(String value) {
            addCriterion("program_name =", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotEqualTo(String value) {
            addCriterion("program_name <>", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameGreaterThan(String value) {
            addCriterion("program_name >", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameGreaterThanOrEqualTo(String value) {
            addCriterion("program_name >=", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLessThan(String value) {
            addCriterion("program_name <", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLessThanOrEqualTo(String value) {
            addCriterion("program_name <=", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLike(String value) {
            addCriterion("program_name like", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotLike(String value) {
            addCriterion("program_name not like", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameIn(List<String> values) {
            addCriterion("program_name in", values, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotIn(List<String> values) {
            addCriterion("program_name not in", values, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameBetween(String value1, String value2) {
            addCriterion("program_name between", value1, value2, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotBetween(String value1, String value2) {
            addCriterion("program_name not between", value1, value2, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramIdIsNull() {
            addCriterion("program_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramIdIsNotNull() {
            addCriterion("program_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramIdEqualTo(String value) {
            addCriterion("program_id =", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotEqualTo(String value) {
            addCriterion("program_id <>", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdGreaterThan(String value) {
            addCriterion("program_id >", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdGreaterThanOrEqualTo(String value) {
            addCriterion("program_id >=", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLessThan(String value) {
            addCriterion("program_id <", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLessThanOrEqualTo(String value) {
            addCriterion("program_id <=", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLike(String value) {
            addCriterion("program_id like", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotLike(String value) {
            addCriterion("program_id not like", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdIn(List<String> values) {
            addCriterion("program_id in", values, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotIn(List<String> values) {
            addCriterion("program_id not in", values, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdBetween(String value1, String value2) {
            addCriterion("program_id between", value1, value2, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotBetween(String value1, String value2) {
            addCriterion("program_id not between", value1, value2, "programId");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateIsNull() {
            addCriterion("info_review_state is null");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateIsNotNull() {
            addCriterion("info_review_state is not null");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateEqualTo(Byte value) {
            addCriterion("info_review_state =", value, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateNotEqualTo(Byte value) {
            addCriterion("info_review_state <>", value, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateGreaterThan(Byte value) {
            addCriterion("info_review_state >", value, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("info_review_state >=", value, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateLessThan(Byte value) {
            addCriterion("info_review_state <", value, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateLessThanOrEqualTo(Byte value) {
            addCriterion("info_review_state <=", value, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateIn(List<Byte> values) {
            addCriterion("info_review_state in", values, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateNotIn(List<Byte> values) {
            addCriterion("info_review_state not in", values, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateBetween(Byte value1, Byte value2) {
            addCriterion("info_review_state between", value1, value2, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andInfoReviewStateNotBetween(Byte value1, Byte value2) {
            addCriterion("info_review_state not between", value1, value2, "infoReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateIsNull() {
            addCriterion("performance_review_state is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateIsNotNull() {
            addCriterion("performance_review_state is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateEqualTo(Byte value) {
            addCriterion("performance_review_state =", value, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateNotEqualTo(Byte value) {
            addCriterion("performance_review_state <>", value, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateGreaterThan(Byte value) {
            addCriterion("performance_review_state >", value, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("performance_review_state >=", value, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateLessThan(Byte value) {
            addCriterion("performance_review_state <", value, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateLessThanOrEqualTo(Byte value) {
            addCriterion("performance_review_state <=", value, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateIn(List<Byte> values) {
            addCriterion("performance_review_state in", values, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateNotIn(List<Byte> values) {
            addCriterion("performance_review_state not in", values, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateBetween(Byte value1, Byte value2) {
            addCriterion("performance_review_state between", value1, value2, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andPerformanceReviewStateNotBetween(Byte value1, Byte value2) {
            addCriterion("performance_review_state not between", value1, value2, "performanceReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateIsNull() {
            addCriterion("function_review_state is null");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateIsNotNull() {
            addCriterion("function_review_state is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateEqualTo(Byte value) {
            addCriterion("function_review_state =", value, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateNotEqualTo(Byte value) {
            addCriterion("function_review_state <>", value, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateGreaterThan(Byte value) {
            addCriterion("function_review_state >", value, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("function_review_state >=", value, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateLessThan(Byte value) {
            addCriterion("function_review_state <", value, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateLessThanOrEqualTo(Byte value) {
            addCriterion("function_review_state <=", value, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateIn(List<Byte> values) {
            addCriterion("function_review_state in", values, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateNotIn(List<Byte> values) {
            addCriterion("function_review_state not in", values, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateBetween(Byte value1, Byte value2) {
            addCriterion("function_review_state between", value1, value2, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andFunctionReviewStateNotBetween(Byte value1, Byte value2) {
            addCriterion("function_review_state not between", value1, value2, "functionReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateIsNull() {
            addCriterion("off_review_state is null");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateIsNotNull() {
            addCriterion("off_review_state is not null");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateEqualTo(Byte value) {
            addCriterion("off_review_state =", value, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateNotEqualTo(Byte value) {
            addCriterion("off_review_state <>", value, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateGreaterThan(Byte value) {
            addCriterion("off_review_state >", value, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("off_review_state >=", value, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateLessThan(Byte value) {
            addCriterion("off_review_state <", value, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateLessThanOrEqualTo(Byte value) {
            addCriterion("off_review_state <=", value, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateIn(List<Byte> values) {
            addCriterion("off_review_state in", values, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateNotIn(List<Byte> values) {
            addCriterion("off_review_state not in", values, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateBetween(Byte value1, Byte value2) {
            addCriterion("off_review_state between", value1, value2, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andOffReviewStateNotBetween(Byte value1, Byte value2) {
            addCriterion("off_review_state not between", value1, value2, "offReviewState");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIsNull() {
            addCriterion("program_version is null");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIsNotNull() {
            addCriterion("program_version is not null");
            return (Criteria) this;
        }

        public Criteria andProgramVersionEqualTo(String value) {
            addCriterion("program_version =", value, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionNotEqualTo(String value) {
            addCriterion("program_version <>", value, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionGreaterThan(String value) {
            addCriterion("program_version >", value, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionGreaterThanOrEqualTo(String value) {
            addCriterion("program_version >=", value, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionLessThan(String value) {
            addCriterion("program_version <", value, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionLessThanOrEqualTo(String value) {
            addCriterion("program_version <=", value, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionLike(String value) {
            addCriterion("program_version like", value, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionNotLike(String value) {
            addCriterion("program_version not like", value, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIn(List<String> values) {
            addCriterion("program_version in", values, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionNotIn(List<String> values) {
            addCriterion("program_version not in", values, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionBetween(String value1, String value2) {
            addCriterion("program_version between", value1, value2, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionNotBetween(String value1, String value2) {
            addCriterion("program_version not between", value1, value2, "programVersion");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdIsNull() {
            addCriterion("program_version_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdIsNotNull() {
            addCriterion("program_version_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdEqualTo(String value) {
            addCriterion("program_version_id =", value, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdNotEqualTo(String value) {
            addCriterion("program_version_id <>", value, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdGreaterThan(String value) {
            addCriterion("program_version_id >", value, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdGreaterThanOrEqualTo(String value) {
            addCriterion("program_version_id >=", value, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdLessThan(String value) {
            addCriterion("program_version_id <", value, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdLessThanOrEqualTo(String value) {
            addCriterion("program_version_id <=", value, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdLike(String value) {
            addCriterion("program_version_id like", value, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdNotLike(String value) {
            addCriterion("program_version_id not like", value, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdIn(List<String> values) {
            addCriterion("program_version_id in", values, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdNotIn(List<String> values) {
            addCriterion("program_version_id not in", values, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdBetween(String value1, String value2) {
            addCriterion("program_version_id between", value1, value2, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andProgramVersionIdNotBetween(String value1, String value2) {
            addCriterion("program_version_id not between", value1, value2, "programVersionId");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNull() {
            addCriterion("review_time is null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIsNotNull() {
            addCriterion("review_time is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTimeEqualTo(String value) {
            addCriterion("review_time =", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotEqualTo(String value) {
            addCriterion("review_time <>", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThan(String value) {
            addCriterion("review_time >", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeGreaterThanOrEqualTo(String value) {
            addCriterion("review_time >=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThan(String value) {
            addCriterion("review_time <", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLessThanOrEqualTo(String value) {
            addCriterion("review_time <=", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeLike(String value) {
            addCriterion("review_time like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotLike(String value) {
            addCriterion("review_time not like", value, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeIn(List<String> values) {
            addCriterion("review_time in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotIn(List<String> values) {
            addCriterion("review_time not in", values, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeBetween(String value1, String value2) {
            addCriterion("review_time between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andReviewTimeNotBetween(String value1, String value2) {
            addCriterion("review_time not between", value1, value2, "reviewTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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