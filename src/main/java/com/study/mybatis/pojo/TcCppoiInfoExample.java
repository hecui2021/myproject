package com.study.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcCppoiInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcCppoiInfoExample() {
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

        public Criteria andCppoiIdIsNull() {
            addCriterion("cppoi_id is null");
            return (Criteria) this;
        }

        public Criteria andCppoiIdIsNotNull() {
            addCriterion("cppoi_id is not null");
            return (Criteria) this;
        }

        public Criteria andCppoiIdEqualTo(Integer value) {
            addCriterion("cppoi_id =", value, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdNotEqualTo(Integer value) {
            addCriterion("cppoi_id <>", value, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdGreaterThan(Integer value) {
            addCriterion("cppoi_id >", value, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cppoi_id >=", value, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdLessThan(Integer value) {
            addCriterion("cppoi_id <", value, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdLessThanOrEqualTo(Integer value) {
            addCriterion("cppoi_id <=", value, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdIn(List<Integer> values) {
            addCriterion("cppoi_id in", values, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdNotIn(List<Integer> values) {
            addCriterion("cppoi_id not in", values, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdBetween(Integer value1, Integer value2) {
            addCriterion("cppoi_id between", value1, value2, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andCppoiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cppoi_id not between", value1, value2, "cppoiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNull() {
            addCriterion("poi_id is null");
            return (Criteria) this;
        }

        public Criteria andPoiIdIsNotNull() {
            addCriterion("poi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoiIdEqualTo(String value) {
            addCriterion("poi_id =", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotEqualTo(String value) {
            addCriterion("poi_id <>", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThan(String value) {
            addCriterion("poi_id >", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdGreaterThanOrEqualTo(String value) {
            addCriterion("poi_id >=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThan(String value) {
            addCriterion("poi_id <", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLessThanOrEqualTo(String value) {
            addCriterion("poi_id <=", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdLike(String value) {
            addCriterion("poi_id like", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotLike(String value) {
            addCriterion("poi_id not like", value, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdIn(List<String> values) {
            addCriterion("poi_id in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotIn(List<String> values) {
            addCriterion("poi_id not in", values, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdBetween(String value1, String value2) {
            addCriterion("poi_id between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andPoiIdNotBetween(String value1, String value2) {
            addCriterion("poi_id not between", value1, value2, "poiId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdIsNull() {
            addCriterion("cppoi_apply_record_id is null");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdIsNotNull() {
            addCriterion("cppoi_apply_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdEqualTo(String value) {
            addCriterion("cppoi_apply_record_id =", value, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdNotEqualTo(String value) {
            addCriterion("cppoi_apply_record_id <>", value, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdGreaterThan(String value) {
            addCriterion("cppoi_apply_record_id >", value, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("cppoi_apply_record_id >=", value, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdLessThan(String value) {
            addCriterion("cppoi_apply_record_id <", value, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdLessThanOrEqualTo(String value) {
            addCriterion("cppoi_apply_record_id <=", value, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdLike(String value) {
            addCriterion("cppoi_apply_record_id like", value, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdNotLike(String value) {
            addCriterion("cppoi_apply_record_id not like", value, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdIn(List<String> values) {
            addCriterion("cppoi_apply_record_id in", values, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdNotIn(List<String> values) {
            addCriterion("cppoi_apply_record_id not in", values, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdBetween(String value1, String value2) {
            addCriterion("cppoi_apply_record_id between", value1, value2, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordIdNotBetween(String value1, String value2) {
            addCriterion("cppoi_apply_record_id not between", value1, value2, "cppoiApplyRecordId");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameIsNull() {
            addCriterion("cppoi_apply_record_name is null");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameIsNotNull() {
            addCriterion("cppoi_apply_record_name is not null");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameEqualTo(String value) {
            addCriterion("cppoi_apply_record_name =", value, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameNotEqualTo(String value) {
            addCriterion("cppoi_apply_record_name <>", value, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameGreaterThan(String value) {
            addCriterion("cppoi_apply_record_name >", value, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameGreaterThanOrEqualTo(String value) {
            addCriterion("cppoi_apply_record_name >=", value, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameLessThan(String value) {
            addCriterion("cppoi_apply_record_name <", value, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameLessThanOrEqualTo(String value) {
            addCriterion("cppoi_apply_record_name <=", value, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameLike(String value) {
            addCriterion("cppoi_apply_record_name like", value, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameNotLike(String value) {
            addCriterion("cppoi_apply_record_name not like", value, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameIn(List<String> values) {
            addCriterion("cppoi_apply_record_name in", values, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameNotIn(List<String> values) {
            addCriterion("cppoi_apply_record_name not in", values, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameBetween(String value1, String value2) {
            addCriterion("cppoi_apply_record_name between", value1, value2, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andCppoiApplyRecordNameNotBetween(String value1, String value2) {
            addCriterion("cppoi_apply_record_name not between", value1, value2, "cppoiApplyRecordName");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCsysIsNull() {
            addCriterion("csys is null");
            return (Criteria) this;
        }

        public Criteria andCsysIsNotNull() {
            addCriterion("csys is not null");
            return (Criteria) this;
        }

        public Criteria andCsysEqualTo(String value) {
            addCriterion("csys =", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysNotEqualTo(String value) {
            addCriterion("csys <>", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysGreaterThan(String value) {
            addCriterion("csys >", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysGreaterThanOrEqualTo(String value) {
            addCriterion("csys >=", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysLessThan(String value) {
            addCriterion("csys <", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysLessThanOrEqualTo(String value) {
            addCriterion("csys <=", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysLike(String value) {
            addCriterion("csys like", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysNotLike(String value) {
            addCriterion("csys not like", value, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysIn(List<String> values) {
            addCriterion("csys in", values, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysNotIn(List<String> values) {
            addCriterion("csys not in", values, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysBetween(String value1, String value2) {
            addCriterion("csys between", value1, value2, "csys");
            return (Criteria) this;
        }

        public Criteria andCsysNotBetween(String value1, String value2) {
            addCriterion("csys not between", value1, value2, "csys");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andBusiIdIsNull() {
            addCriterion("busi_id is null");
            return (Criteria) this;
        }

        public Criteria andBusiIdIsNotNull() {
            addCriterion("busi_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusiIdEqualTo(String value) {
            addCriterion("busi_id =", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdNotEqualTo(String value) {
            addCriterion("busi_id <>", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdGreaterThan(String value) {
            addCriterion("busi_id >", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdGreaterThanOrEqualTo(String value) {
            addCriterion("busi_id >=", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdLessThan(String value) {
            addCriterion("busi_id <", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdLessThanOrEqualTo(String value) {
            addCriterion("busi_id <=", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdLike(String value) {
            addCriterion("busi_id like", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdNotLike(String value) {
            addCriterion("busi_id not like", value, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdIn(List<String> values) {
            addCriterion("busi_id in", values, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdNotIn(List<String> values) {
            addCriterion("busi_id not in", values, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdBetween(String value1, String value2) {
            addCriterion("busi_id between", value1, value2, "busiId");
            return (Criteria) this;
        }

        public Criteria andBusiIdNotBetween(String value1, String value2) {
            addCriterion("busi_id not between", value1, value2, "busiId");
            return (Criteria) this;
        }

        public Criteria andProgIdIsNull() {
            addCriterion("prog_id is null");
            return (Criteria) this;
        }

        public Criteria andProgIdIsNotNull() {
            addCriterion("prog_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgIdEqualTo(String value) {
            addCriterion("prog_id =", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdNotEqualTo(String value) {
            addCriterion("prog_id <>", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdGreaterThan(String value) {
            addCriterion("prog_id >", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdGreaterThanOrEqualTo(String value) {
            addCriterion("prog_id >=", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdLessThan(String value) {
            addCriterion("prog_id <", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdLessThanOrEqualTo(String value) {
            addCriterion("prog_id <=", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdLike(String value) {
            addCriterion("prog_id like", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdNotLike(String value) {
            addCriterion("prog_id not like", value, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdIn(List<String> values) {
            addCriterion("prog_id in", values, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdNotIn(List<String> values) {
            addCriterion("prog_id not in", values, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdBetween(String value1, String value2) {
            addCriterion("prog_id between", value1, value2, "progId");
            return (Criteria) this;
        }

        public Criteria andProgIdNotBetween(String value1, String value2) {
            addCriterion("prog_id not between", value1, value2, "progId");
            return (Criteria) this;
        }

        public Criteria andProgNameIsNull() {
            addCriterion("prog_name is null");
            return (Criteria) this;
        }

        public Criteria andProgNameIsNotNull() {
            addCriterion("prog_name is not null");
            return (Criteria) this;
        }

        public Criteria andProgNameEqualTo(String value) {
            addCriterion("prog_name =", value, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameNotEqualTo(String value) {
            addCriterion("prog_name <>", value, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameGreaterThan(String value) {
            addCriterion("prog_name >", value, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameGreaterThanOrEqualTo(String value) {
            addCriterion("prog_name >=", value, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameLessThan(String value) {
            addCriterion("prog_name <", value, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameLessThanOrEqualTo(String value) {
            addCriterion("prog_name <=", value, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameLike(String value) {
            addCriterion("prog_name like", value, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameNotLike(String value) {
            addCriterion("prog_name not like", value, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameIn(List<String> values) {
            addCriterion("prog_name in", values, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameNotIn(List<String> values) {
            addCriterion("prog_name not in", values, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameBetween(String value1, String value2) {
            addCriterion("prog_name between", value1, value2, "progName");
            return (Criteria) this;
        }

        public Criteria andProgNameNotBetween(String value1, String value2) {
            addCriterion("prog_name not between", value1, value2, "progName");
            return (Criteria) this;
        }

        public Criteria andTpoiIdIsNull() {
            addCriterion("tpoi_id is null");
            return (Criteria) this;
        }

        public Criteria andTpoiIdIsNotNull() {
            addCriterion("tpoi_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpoiIdEqualTo(String value) {
            addCriterion("tpoi_id =", value, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdNotEqualTo(String value) {
            addCriterion("tpoi_id <>", value, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdGreaterThan(String value) {
            addCriterion("tpoi_id >", value, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdGreaterThanOrEqualTo(String value) {
            addCriterion("tpoi_id >=", value, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdLessThan(String value) {
            addCriterion("tpoi_id <", value, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdLessThanOrEqualTo(String value) {
            addCriterion("tpoi_id <=", value, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdLike(String value) {
            addCriterion("tpoi_id like", value, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdNotLike(String value) {
            addCriterion("tpoi_id not like", value, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdIn(List<String> values) {
            addCriterion("tpoi_id in", values, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdNotIn(List<String> values) {
            addCriterion("tpoi_id not in", values, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdBetween(String value1, String value2) {
            addCriterion("tpoi_id between", value1, value2, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andTpoiIdNotBetween(String value1, String value2) {
            addCriterion("tpoi_id not between", value1, value2, "tpoiId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusIsNull() {
            addCriterion("deliver_status is null");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusIsNotNull() {
            addCriterion("deliver_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusEqualTo(Byte value) {
            addCriterion("deliver_status =", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusNotEqualTo(Byte value) {
            addCriterion("deliver_status <>", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusGreaterThan(Byte value) {
            addCriterion("deliver_status >", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("deliver_status >=", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusLessThan(Byte value) {
            addCriterion("deliver_status <", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusLessThanOrEqualTo(Byte value) {
            addCriterion("deliver_status <=", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusIn(List<Byte> values) {
            addCriterion("deliver_status in", values, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusNotIn(List<Byte> values) {
            addCriterion("deliver_status not in", values, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusBetween(Byte value1, Byte value2) {
            addCriterion("deliver_status between", value1, value2, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("deliver_status not between", value1, value2, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesIsNull() {
            addCriterion("deliver_times is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesIsNotNull() {
            addCriterion("deliver_times is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesEqualTo(Byte value) {
            addCriterion("deliver_times =", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesNotEqualTo(Byte value) {
            addCriterion("deliver_times <>", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesGreaterThan(Byte value) {
            addCriterion("deliver_times >", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesGreaterThanOrEqualTo(Byte value) {
            addCriterion("deliver_times >=", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesLessThan(Byte value) {
            addCriterion("deliver_times <", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesLessThanOrEqualTo(Byte value) {
            addCriterion("deliver_times <=", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesIn(List<Byte> values) {
            addCriterion("deliver_times in", values, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesNotIn(List<Byte> values) {
            addCriterion("deliver_times not in", values, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesBetween(Byte value1, Byte value2) {
            addCriterion("deliver_times between", value1, value2, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesNotBetween(Byte value1, Byte value2) {
            addCriterion("deliver_times not between", value1, value2, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andReduplicateIsNull() {
            addCriterion("reduplicate is null");
            return (Criteria) this;
        }

        public Criteria andReduplicateIsNotNull() {
            addCriterion("reduplicate is not null");
            return (Criteria) this;
        }

        public Criteria andReduplicateEqualTo(Byte value) {
            addCriterion("reduplicate =", value, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateNotEqualTo(Byte value) {
            addCriterion("reduplicate <>", value, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateGreaterThan(Byte value) {
            addCriterion("reduplicate >", value, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateGreaterThanOrEqualTo(Byte value) {
            addCriterion("reduplicate >=", value, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateLessThan(Byte value) {
            addCriterion("reduplicate <", value, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateLessThanOrEqualTo(Byte value) {
            addCriterion("reduplicate <=", value, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateIn(List<Byte> values) {
            addCriterion("reduplicate in", values, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateNotIn(List<Byte> values) {
            addCriterion("reduplicate not in", values, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateBetween(Byte value1, Byte value2) {
            addCriterion("reduplicate between", value1, value2, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andReduplicateNotBetween(Byte value1, Byte value2) {
            addCriterion("reduplicate not between", value1, value2, "reduplicate");
            return (Criteria) this;
        }

        public Criteria andMountTimeIsNull() {
            addCriterion("mount_time is null");
            return (Criteria) this;
        }

        public Criteria andMountTimeIsNotNull() {
            addCriterion("mount_time is not null");
            return (Criteria) this;
        }

        public Criteria andMountTimeEqualTo(Date value) {
            addCriterion("mount_time =", value, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeNotEqualTo(Date value) {
            addCriterion("mount_time <>", value, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeGreaterThan(Date value) {
            addCriterion("mount_time >", value, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mount_time >=", value, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeLessThan(Date value) {
            addCriterion("mount_time <", value, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeLessThanOrEqualTo(Date value) {
            addCriterion("mount_time <=", value, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeIn(List<Date> values) {
            addCriterion("mount_time in", values, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeNotIn(List<Date> values) {
            addCriterion("mount_time not in", values, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeBetween(Date value1, Date value2) {
            addCriterion("mount_time between", value1, value2, "mountTime");
            return (Criteria) this;
        }

        public Criteria andMountTimeNotBetween(Date value1, Date value2) {
            addCriterion("mount_time not between", value1, value2, "mountTime");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Byte value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Byte value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Byte value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Byte value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Byte value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Byte value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Byte> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Byte> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Byte value1, Byte value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Byte value1, Byte value2) {
            addCriterion("priority not between", value1, value2, "priority");
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

        public Criteria andLastModTimeIsNull() {
            addCriterion("last_mod_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIsNotNull() {
            addCriterion("last_mod_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModTimeEqualTo(Date value) {
            addCriterion("last_mod_time =", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotEqualTo(Date value) {
            addCriterion("last_mod_time <>", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeGreaterThan(Date value) {
            addCriterion("last_mod_time >", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_mod_time >=", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeLessThan(Date value) {
            addCriterion("last_mod_time <", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_mod_time <=", value, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeIn(List<Date> values) {
            addCriterion("last_mod_time in", values, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotIn(List<Date> values) {
            addCriterion("last_mod_time not in", values, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeBetween(Date value1, Date value2) {
            addCriterion("last_mod_time between", value1, value2, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andLastModTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_mod_time not between", value1, value2, "lastModTime");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameIsNull() {
            addCriterion("category_view_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameIsNotNull() {
            addCriterion("category_view_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameEqualTo(String value) {
            addCriterion("category_view_name =", value, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameNotEqualTo(String value) {
            addCriterion("category_view_name <>", value, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameGreaterThan(String value) {
            addCriterion("category_view_name >", value, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_view_name >=", value, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameLessThan(String value) {
            addCriterion("category_view_name <", value, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameLessThanOrEqualTo(String value) {
            addCriterion("category_view_name <=", value, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameLike(String value) {
            addCriterion("category_view_name like", value, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameNotLike(String value) {
            addCriterion("category_view_name not like", value, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameIn(List<String> values) {
            addCriterion("category_view_name in", values, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameNotIn(List<String> values) {
            addCriterion("category_view_name not in", values, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameBetween(String value1, String value2) {
            addCriterion("category_view_name between", value1, value2, "categoryViewName");
            return (Criteria) this;
        }

        public Criteria andCategoryViewNameNotBetween(String value1, String value2) {
            addCriterion("category_view_name not between", value1, value2, "categoryViewName");
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

        public Criteria andPoiStatusIsNull() {
            addCriterion("poi_status is null");
            return (Criteria) this;
        }

        public Criteria andPoiStatusIsNotNull() {
            addCriterion("poi_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoiStatusEqualTo(String value) {
            addCriterion("poi_status =", value, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusNotEqualTo(String value) {
            addCriterion("poi_status <>", value, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusGreaterThan(String value) {
            addCriterion("poi_status >", value, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusGreaterThanOrEqualTo(String value) {
            addCriterion("poi_status >=", value, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusLessThan(String value) {
            addCriterion("poi_status <", value, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusLessThanOrEqualTo(String value) {
            addCriterion("poi_status <=", value, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusLike(String value) {
            addCriterion("poi_status like", value, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusNotLike(String value) {
            addCriterion("poi_status not like", value, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusIn(List<String> values) {
            addCriterion("poi_status in", values, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusNotIn(List<String> values) {
            addCriterion("poi_status not in", values, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusBetween(String value1, String value2) {
            addCriterion("poi_status between", value1, value2, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiStatusNotBetween(String value1, String value2) {
            addCriterion("poi_status not between", value1, value2, "poiStatus");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameIsNull() {
            addCriterion("poi_info_name is null");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameIsNotNull() {
            addCriterion("poi_info_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameEqualTo(String value) {
            addCriterion("poi_info_name =", value, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameNotEqualTo(String value) {
            addCriterion("poi_info_name <>", value, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameGreaterThan(String value) {
            addCriterion("poi_info_name >", value, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("poi_info_name >=", value, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameLessThan(String value) {
            addCriterion("poi_info_name <", value, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameLessThanOrEqualTo(String value) {
            addCriterion("poi_info_name <=", value, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameLike(String value) {
            addCriterion("poi_info_name like", value, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameNotLike(String value) {
            addCriterion("poi_info_name not like", value, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameIn(List<String> values) {
            addCriterion("poi_info_name in", values, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameNotIn(List<String> values) {
            addCriterion("poi_info_name not in", values, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameBetween(String value1, String value2) {
            addCriterion("poi_info_name between", value1, value2, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andPoiInfoNameNotBetween(String value1, String value2) {
            addCriterion("poi_info_name not between", value1, value2, "poiInfoName");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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