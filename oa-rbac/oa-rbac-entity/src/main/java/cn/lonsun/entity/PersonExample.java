package cn.lonsun.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(BigDecimal value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(BigDecimal value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(BigDecimal value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(BigDecimal value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<BigDecimal> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<BigDecimal> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNull() {
            addCriterion("person_sex is null");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNotNull() {
            addCriterion("person_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSexEqualTo(Short value) {
            addCriterion("person_sex =", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotEqualTo(Short value) {
            addCriterion("person_sex <>", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThan(Short value) {
            addCriterion("person_sex >", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThanOrEqualTo(Short value) {
            addCriterion("person_sex >=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThan(Short value) {
            addCriterion("person_sex <", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThanOrEqualTo(Short value) {
            addCriterion("person_sex <=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexIn(List<Short> values) {
            addCriterion("person_sex in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotIn(List<Short> values) {
            addCriterion("person_sex not in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexBetween(Short value1, Short value2) {
            addCriterion("person_sex between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotBetween(Short value1, Short value2) {
            addCriterion("person_sex not between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonMobileIsNull() {
            addCriterion("person_mobile is null");
            return (Criteria) this;
        }

        public Criteria andPersonMobileIsNotNull() {
            addCriterion("person_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andPersonMobileEqualTo(String value) {
            addCriterion("person_mobile =", value, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileNotEqualTo(String value) {
            addCriterion("person_mobile <>", value, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileGreaterThan(String value) {
            addCriterion("person_mobile >", value, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileGreaterThanOrEqualTo(String value) {
            addCriterion("person_mobile >=", value, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileLessThan(String value) {
            addCriterion("person_mobile <", value, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileLessThanOrEqualTo(String value) {
            addCriterion("person_mobile <=", value, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileLike(String value) {
            addCriterion("person_mobile like", value, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileNotLike(String value) {
            addCriterion("person_mobile not like", value, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileIn(List<String> values) {
            addCriterion("person_mobile in", values, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileNotIn(List<String> values) {
            addCriterion("person_mobile not in", values, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileBetween(String value1, String value2) {
            addCriterion("person_mobile between", value1, value2, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonMobileNotBetween(String value1, String value2) {
            addCriterion("person_mobile not between", value1, value2, "personMobile");
            return (Criteria) this;
        }

        public Criteria andPersonPositionIsNull() {
            addCriterion("person_position is null");
            return (Criteria) this;
        }

        public Criteria andPersonPositionIsNotNull() {
            addCriterion("person_position is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPositionEqualTo(String value) {
            addCriterion("person_position =", value, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionNotEqualTo(String value) {
            addCriterion("person_position <>", value, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionGreaterThan(String value) {
            addCriterion("person_position >", value, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionGreaterThanOrEqualTo(String value) {
            addCriterion("person_position >=", value, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionLessThan(String value) {
            addCriterion("person_position <", value, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionLessThanOrEqualTo(String value) {
            addCriterion("person_position <=", value, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionLike(String value) {
            addCriterion("person_position like", value, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionNotLike(String value) {
            addCriterion("person_position not like", value, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionIn(List<String> values) {
            addCriterion("person_position in", values, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionNotIn(List<String> values) {
            addCriterion("person_position not in", values, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionBetween(String value1, String value2) {
            addCriterion("person_position between", value1, value2, "personPosition");
            return (Criteria) this;
        }

        public Criteria andPersonPositionNotBetween(String value1, String value2) {
            addCriterion("person_position not between", value1, value2, "personPosition");
            return (Criteria) this;
        }

        public Criteria andIsMainIsNull() {
            addCriterion("is_main is null");
            return (Criteria) this;
        }

        public Criteria andIsMainIsNotNull() {
            addCriterion("is_main is not null");
            return (Criteria) this;
        }

        public Criteria andIsMainEqualTo(Short value) {
            addCriterion("is_main =", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotEqualTo(Short value) {
            addCriterion("is_main <>", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainGreaterThan(Short value) {
            addCriterion("is_main >", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainGreaterThanOrEqualTo(Short value) {
            addCriterion("is_main >=", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLessThan(Short value) {
            addCriterion("is_main <", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainLessThanOrEqualTo(Short value) {
            addCriterion("is_main <=", value, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainIn(List<Short> values) {
            addCriterion("is_main in", values, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotIn(List<Short> values) {
            addCriterion("is_main not in", values, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainBetween(Short value1, Short value2) {
            addCriterion("is_main between", value1, value2, "isMain");
            return (Criteria) this;
        }

        public Criteria andIsMainNotBetween(Short value1, Short value2) {
            addCriterion("is_main not between", value1, value2, "isMain");
            return (Criteria) this;
        }

        public Criteria andRoleIdsIsNull() {
            addCriterion("role_ids is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdsIsNotNull() {
            addCriterion("role_ids is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdsEqualTo(String value) {
            addCriterion("role_ids =", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsNotEqualTo(String value) {
            addCriterion("role_ids <>", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsGreaterThan(String value) {
            addCriterion("role_ids >", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsGreaterThanOrEqualTo(String value) {
            addCriterion("role_ids >=", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsLessThan(String value) {
            addCriterion("role_ids <", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsLessThanOrEqualTo(String value) {
            addCriterion("role_ids <=", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsLike(String value) {
            addCriterion("role_ids like", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsNotLike(String value) {
            addCriterion("role_ids not like", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsIn(List<String> values) {
            addCriterion("role_ids in", values, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsNotIn(List<String> values) {
            addCriterion("role_ids not in", values, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsBetween(String value1, String value2) {
            addCriterion("role_ids between", value1, value2, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsNotBetween(String value1, String value2) {
            addCriterion("role_ids not between", value1, value2, "roleIds");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdIsNull() {
            addCriterion("department_organ_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdIsNotNull() {
            addCriterion("department_organ_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdEqualTo(BigDecimal value) {
            addCriterion("department_organ_id =", value, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdNotEqualTo(BigDecimal value) {
            addCriterion("department_organ_id <>", value, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdGreaterThan(BigDecimal value) {
            addCriterion("department_organ_id >", value, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("department_organ_id >=", value, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdLessThan(BigDecimal value) {
            addCriterion("department_organ_id <", value, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("department_organ_id <=", value, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdIn(List<BigDecimal> values) {
            addCriterion("department_organ_id in", values, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdNotIn(List<BigDecimal> values) {
            addCriterion("department_organ_id not in", values, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("department_organ_id between", value1, value2, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOrganIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("department_organ_id not between", value1, value2, "departmentOrganId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdIsNull() {
            addCriterion("department_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdIsNotNull() {
            addCriterion("department_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdEqualTo(BigDecimal value) {
            addCriterion("department_unit_id =", value, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdNotEqualTo(BigDecimal value) {
            addCriterion("department_unit_id <>", value, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdGreaterThan(BigDecimal value) {
            addCriterion("department_unit_id >", value, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("department_unit_id >=", value, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdLessThan(BigDecimal value) {
            addCriterion("department_unit_id <", value, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("department_unit_id <=", value, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdIn(List<BigDecimal> values) {
            addCriterion("department_unit_id in", values, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdNotIn(List<BigDecimal> values) {
            addCriterion("department_unit_id not in", values, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("department_unit_id between", value1, value2, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andDepartmentUnitIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("department_unit_id not between", value1, value2, "departmentUnitId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(BigDecimal value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(BigDecimal value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(BigDecimal value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(BigDecimal value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<BigDecimal> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<BigDecimal> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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