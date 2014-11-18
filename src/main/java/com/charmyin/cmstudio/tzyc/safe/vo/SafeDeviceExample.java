package com.charmyin.cmstudio.tzyc.safe.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SafeDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SafeDeviceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("TYPE_ID =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("TYPE_ID <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("TYPE_ID >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_ID >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("TYPE_ID <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("TYPE_ID <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("TYPE_ID like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("TYPE_ID not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("TYPE_ID in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("TYPE_ID not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("TYPE_ID between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("TYPE_ID not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNull() {
            addCriterion("DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("DEPART_ID =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("DEPART_ID <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("DEPART_ID >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_ID >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("DEPART_ID <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("DEPART_ID <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("DEPART_ID like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("DEPART_ID not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("DEPART_ID in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("DEPART_ID not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("DEPART_ID between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("DEPART_ID not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("BRAND is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("BRAND =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("BRAND <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("BRAND >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("BRAND <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("BRAND <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("BRAND like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("BRAND not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("BRAND in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("BRAND not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("BRAND between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("BRAND not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNull() {
            addCriterion("APPLICATION is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("APPLICATION is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("APPLICATION =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("APPLICATION <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("APPLICATION >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("APPLICATION <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("APPLICATION like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("APPLICATION not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("APPLICATION in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("APPLICATION not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("APPLICATION between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("APPLICATION not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIsNull() {
            addCriterion("OPENING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIsNotNull() {
            addCriterion("OPENING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningDateEqualTo(Date value) {
            addCriterionForJDBCDate("OPENING_DATE =", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPENING_DATE <>", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPENING_DATE >", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPENING_DATE >=", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateLessThan(Date value) {
            addCriterionForJDBCDate("OPENING_DATE <", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPENING_DATE <=", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIn(List<Date> values) {
            addCriterionForJDBCDate("OPENING_DATE in", values, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPENING_DATE not in", values, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPENING_DATE between", value1, value2, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPENING_DATE not between", value1, value2, "openingDate");
            return (Criteria) this;
        }

        public Criteria andEquipStatusIsNull() {
            addCriterion("EQUIP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEquipStatusIsNotNull() {
            addCriterion("EQUIP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEquipStatusEqualTo(Integer value) {
            addCriterion("EQUIP_STATUS =", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusNotEqualTo(Integer value) {
            addCriterion("EQUIP_STATUS <>", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusGreaterThan(Integer value) {
            addCriterion("EQUIP_STATUS >", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUIP_STATUS >=", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusLessThan(Integer value) {
            addCriterion("EQUIP_STATUS <", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusLessThanOrEqualTo(Integer value) {
            addCriterion("EQUIP_STATUS <=", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusIn(List<Integer> values) {
            addCriterion("EQUIP_STATUS in", values, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusNotIn(List<Integer> values) {
            addCriterion("EQUIP_STATUS not in", values, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusBetween(Integer value1, Integer value2) {
            addCriterion("EQUIP_STATUS between", value1, value2, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUIP_STATUS not between", value1, value2, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNull() {
            addCriterion("PRODUCTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNotNull() {
            addCriterion("PRODUCTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProductionDateEqualTo(Date value) {
            addCriterionForJDBCDate("PRODUCTION_DATE =", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRODUCTION_DATE <>", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PRODUCTION_DATE >", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRODUCTION_DATE >=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThan(Date value) {
            addCriterionForJDBCDate("PRODUCTION_DATE <", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRODUCTION_DATE <=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateIn(List<Date> values) {
            addCriterionForJDBCDate("PRODUCTION_DATE in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRODUCTION_DATE not in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRODUCTION_DATE between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRODUCTION_DATE not between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIsNull() {
            addCriterion("PRODUCTION_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIsNotNull() {
            addCriterion("PRODUCTION_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andProductionBatchEqualTo(String value) {
            addCriterion("PRODUCTION_BATCH =", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotEqualTo(String value) {
            addCriterion("PRODUCTION_BATCH <>", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchGreaterThan(String value) {
            addCriterion("PRODUCTION_BATCH >", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTION_BATCH >=", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLessThan(String value) {
            addCriterion("PRODUCTION_BATCH <", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTION_BATCH <=", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchLike(String value) {
            addCriterion("PRODUCTION_BATCH like", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotLike(String value) {
            addCriterion("PRODUCTION_BATCH not like", value, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchIn(List<String> values) {
            addCriterion("PRODUCTION_BATCH in", values, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotIn(List<String> values) {
            addCriterion("PRODUCTION_BATCH not in", values, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchBetween(String value1, String value2) {
            addCriterion("PRODUCTION_BATCH between", value1, value2, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andProductionBatchNotBetween(String value1, String value2) {
            addCriterion("PRODUCTION_BATCH not between", value1, value2, "productionBatch");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIsNull() {
            addCriterion("REGISTRATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIsNotNull() {
            addCriterion("REGISTRATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeEqualTo(String value) {
            addCriterion("REGISTRATION_CODE =", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotEqualTo(String value) {
            addCriterion("REGISTRATION_CODE <>", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeGreaterThan(String value) {
            addCriterion("REGISTRATION_CODE >", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRATION_CODE >=", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLessThan(String value) {
            addCriterion("REGISTRATION_CODE <", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLessThanOrEqualTo(String value) {
            addCriterion("REGISTRATION_CODE <=", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLike(String value) {
            addCriterion("REGISTRATION_CODE like", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotLike(String value) {
            addCriterion("REGISTRATION_CODE not like", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIn(List<String> values) {
            addCriterion("REGISTRATION_CODE in", values, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotIn(List<String> values) {
            addCriterion("REGISTRATION_CODE not in", values, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeBetween(String value1, String value2) {
            addCriterion("REGISTRATION_CODE between", value1, value2, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotBetween(String value1, String value2) {
            addCriterion("REGISTRATION_CODE not between", value1, value2, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeIsNull() {
            addCriterion("FINANCIAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeIsNotNull() {
            addCriterion("FINANCIAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeEqualTo(String value) {
            addCriterion("FINANCIAL_CODE =", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeNotEqualTo(String value) {
            addCriterion("FINANCIAL_CODE <>", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeGreaterThan(String value) {
            addCriterion("FINANCIAL_CODE >", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCIAL_CODE >=", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeLessThan(String value) {
            addCriterion("FINANCIAL_CODE <", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeLessThanOrEqualTo(String value) {
            addCriterion("FINANCIAL_CODE <=", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeLike(String value) {
            addCriterion("FINANCIAL_CODE like", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeNotLike(String value) {
            addCriterion("FINANCIAL_CODE not like", value, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeIn(List<String> values) {
            addCriterion("FINANCIAL_CODE in", values, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeNotIn(List<String> values) {
            addCriterion("FINANCIAL_CODE not in", values, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeBetween(String value1, String value2) {
            addCriterion("FINANCIAL_CODE between", value1, value2, "financialCode");
            return (Criteria) this;
        }

        public Criteria andFinancialCodeNotBetween(String value1, String value2) {
            addCriterion("FINANCIAL_CODE not between", value1, value2, "financialCode");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("MANUFACTURER like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARk is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARk is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARk =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARk <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARk >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARk >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARk <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARk <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARk like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARk not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARk in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARk not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARk between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARk not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("PLATE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("PLATE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("PLATE_NUMBER =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("PLATE_NUMBER <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("PLATE_NUMBER >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PLATE_NUMBER >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("PLATE_NUMBER <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("PLATE_NUMBER <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("PLATE_NUMBER like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("PLATE_NUMBER not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("PLATE_NUMBER in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("PLATE_NUMBER not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("PLATE_NUMBER between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("PLATE_NUMBER not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNull() {
            addCriterion("VEHICLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNotNull() {
            addCriterion("VEHICLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeEqualTo(String value) {
            addCriterion("VEHICLE_TYPE =", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotEqualTo(String value) {
            addCriterion("VEHICLE_TYPE <>", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThan(String value) {
            addCriterion("VEHICLE_TYPE >", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE >=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThan(String value) {
            addCriterion("VEHICLE_TYPE <", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_TYPE <=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLike(String value) {
            addCriterion("VEHICLE_TYPE like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotLike(String value) {
            addCriterion("VEHICLE_TYPE not like", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIn(List<String> values) {
            addCriterion("VEHICLE_TYPE in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotIn(List<String> values) {
            addCriterion("VEHICLE_TYPE not in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_TYPE not between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeIsNull() {
            addCriterion("INITIAL_REGISTE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeIsNotNull() {
            addCriterion("INITIAL_REGISTE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeEqualTo(Date value) {
            addCriterion("INITIAL_REGISTE_TIME =", value, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeNotEqualTo(Date value) {
            addCriterion("INITIAL_REGISTE_TIME <>", value, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeGreaterThan(Date value) {
            addCriterion("INITIAL_REGISTE_TIME >", value, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INITIAL_REGISTE_TIME >=", value, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeLessThan(Date value) {
            addCriterion("INITIAL_REGISTE_TIME <", value, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeLessThanOrEqualTo(Date value) {
            addCriterion("INITIAL_REGISTE_TIME <=", value, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeIn(List<Date> values) {
            addCriterion("INITIAL_REGISTE_TIME in", values, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeNotIn(List<Date> values) {
            addCriterion("INITIAL_REGISTE_TIME not in", values, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeBetween(Date value1, Date value2) {
            addCriterion("INITIAL_REGISTE_TIME between", value1, value2, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andInitialRegisteTimeNotBetween(Date value1, Date value2) {
            addCriterion("INITIAL_REGISTE_TIME not between", value1, value2, "initialRegisteTime");
            return (Criteria) this;
        }

        public Criteria andEngineCodeIsNull() {
            addCriterion("ENGINE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEngineCodeIsNotNull() {
            addCriterion("ENGINE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineCodeEqualTo(String value) {
            addCriterion("ENGINE_CODE =", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeNotEqualTo(String value) {
            addCriterion("ENGINE_CODE <>", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeGreaterThan(String value) {
            addCriterion("ENGINE_CODE >", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_CODE >=", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeLessThan(String value) {
            addCriterion("ENGINE_CODE <", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_CODE <=", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeLike(String value) {
            addCriterion("ENGINE_CODE like", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeNotLike(String value) {
            addCriterion("ENGINE_CODE not like", value, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeIn(List<String> values) {
            addCriterion("ENGINE_CODE in", values, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeNotIn(List<String> values) {
            addCriterion("ENGINE_CODE not in", values, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeBetween(String value1, String value2) {
            addCriterion("ENGINE_CODE between", value1, value2, "engineCode");
            return (Criteria) this;
        }

        public Criteria andEngineCodeNotBetween(String value1, String value2) {
            addCriterion("ENGINE_CODE not between", value1, value2, "engineCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeIsNull() {
            addCriterion("FRAME_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFrameCodeIsNotNull() {
            addCriterion("FRAME_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFrameCodeEqualTo(String value) {
            addCriterion("FRAME_CODE =", value, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeNotEqualTo(String value) {
            addCriterion("FRAME_CODE <>", value, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeGreaterThan(String value) {
            addCriterion("FRAME_CODE >", value, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FRAME_CODE >=", value, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeLessThan(String value) {
            addCriterion("FRAME_CODE <", value, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeLessThanOrEqualTo(String value) {
            addCriterion("FRAME_CODE <=", value, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeLike(String value) {
            addCriterion("FRAME_CODE like", value, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeNotLike(String value) {
            addCriterion("FRAME_CODE not like", value, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeIn(List<String> values) {
            addCriterion("FRAME_CODE in", values, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeNotIn(List<String> values) {
            addCriterion("FRAME_CODE not in", values, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeBetween(String value1, String value2) {
            addCriterion("FRAME_CODE between", value1, value2, "frameCode");
            return (Criteria) this;
        }

        public Criteria andFrameCodeNotBetween(String value1, String value2) {
            addCriterion("FRAME_CODE not between", value1, value2, "frameCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeIsNull() {
            addCriterion("VEHICLE_BOOK_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeIsNotNull() {
            addCriterion("VEHICLE_BOOK_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeEqualTo(String value) {
            addCriterion("VEHICLE_BOOK_CODE =", value, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeNotEqualTo(String value) {
            addCriterion("VEHICLE_BOOK_CODE <>", value, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeGreaterThan(String value) {
            addCriterion("VEHICLE_BOOK_CODE >", value, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICLE_BOOK_CODE >=", value, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeLessThan(String value) {
            addCriterion("VEHICLE_BOOK_CODE <", value, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeLessThanOrEqualTo(String value) {
            addCriterion("VEHICLE_BOOK_CODE <=", value, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeLike(String value) {
            addCriterion("VEHICLE_BOOK_CODE like", value, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeNotLike(String value) {
            addCriterion("VEHICLE_BOOK_CODE not like", value, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeIn(List<String> values) {
            addCriterion("VEHICLE_BOOK_CODE in", values, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeNotIn(List<String> values) {
            addCriterion("VEHICLE_BOOK_CODE not in", values, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeBetween(String value1, String value2) {
            addCriterion("VEHICLE_BOOK_CODE between", value1, value2, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBookCodeNotBetween(String value1, String value2) {
            addCriterion("VEHICLE_BOOK_CODE not between", value1, value2, "vehicleBookCode");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionIsNull() {
            addCriterion("ANNUAL_INSPECTION is null");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionIsNotNull() {
            addCriterion("ANNUAL_INSPECTION is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionEqualTo(String value) {
            addCriterion("ANNUAL_INSPECTION =", value, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionNotEqualTo(String value) {
            addCriterion("ANNUAL_INSPECTION <>", value, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionGreaterThan(String value) {
            addCriterion("ANNUAL_INSPECTION >", value, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionGreaterThanOrEqualTo(String value) {
            addCriterion("ANNUAL_INSPECTION >=", value, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionLessThan(String value) {
            addCriterion("ANNUAL_INSPECTION <", value, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionLessThanOrEqualTo(String value) {
            addCriterion("ANNUAL_INSPECTION <=", value, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionLike(String value) {
            addCriterion("ANNUAL_INSPECTION like", value, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionNotLike(String value) {
            addCriterion("ANNUAL_INSPECTION not like", value, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionIn(List<String> values) {
            addCriterion("ANNUAL_INSPECTION in", values, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionNotIn(List<String> values) {
            addCriterion("ANNUAL_INSPECTION not in", values, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionBetween(String value1, String value2) {
            addCriterion("ANNUAL_INSPECTION between", value1, value2, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andAnnualInspectionNotBetween(String value1, String value2) {
            addCriterion("ANNUAL_INSPECTION not between", value1, value2, "annualInspection");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("DRIVER =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("DRIVER <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("DRIVER >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("DRIVER >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("DRIVER <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("DRIVER <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("DRIVER like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("DRIVER not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("DRIVER in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("DRIVER not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("DRIVER between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("DRIVER not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNull() {
            addCriterion("CREATE_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNotNull() {
            addCriterion("CREATE_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampEqualTo(Long value) {
            addCriterion("CREATE_TIMESTAMP =", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotEqualTo(Long value) {
            addCriterion("CREATE_TIMESTAMP <>", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThan(Long value) {
            addCriterion("CREATE_TIMESTAMP >", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIMESTAMP >=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThan(Long value) {
            addCriterion("CREATE_TIMESTAMP <", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIMESTAMP <=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIn(List<Long> values) {
            addCriterion("CREATE_TIMESTAMP in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotIn(List<Long> values) {
            addCriterion("CREATE_TIMESTAMP not in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIMESTAMP between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIMESTAMP not between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("RECORD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("RECORD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(Integer value) {
            addCriterion("RECORD_STATUS =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(Integer value) {
            addCriterion("RECORD_STATUS <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(Integer value) {
            addCriterion("RECORD_STATUS >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORD_STATUS >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(Integer value) {
            addCriterion("RECORD_STATUS <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RECORD_STATUS <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<Integer> values) {
            addCriterion("RECORD_STATUS in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<Integer> values) {
            addCriterion("RECORD_STATUS not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_STATUS between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_STATUS not between", value1, value2, "recordStatus");
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