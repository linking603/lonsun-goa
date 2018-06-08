package cn.lonsun.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProcessInstanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessInstanceExample() {
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

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("process_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("process_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(BigDecimal value) {
            addCriterion("process_instance_id =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(BigDecimal value) {
            addCriterion("process_instance_id <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(BigDecimal value) {
            addCriterion("process_instance_id >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("process_instance_id >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(BigDecimal value) {
            addCriterion("process_instance_id <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("process_instance_id <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<BigDecimal> values) {
            addCriterion("process_instance_id in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<BigDecimal> values) {
            addCriterion("process_instance_id not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("process_instance_id between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("process_instance_id not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(BigDecimal value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(BigDecimal value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(BigDecimal value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(BigDecimal value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<BigDecimal> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<BigDecimal> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameIsNull() {
            addCriterion("process_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameIsNotNull() {
            addCriterion("process_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameEqualTo(String value) {
            addCriterion("process_nick_name =", value, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameNotEqualTo(String value) {
            addCriterion("process_nick_name <>", value, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameGreaterThan(String value) {
            addCriterion("process_nick_name >", value, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_nick_name >=", value, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameLessThan(String value) {
            addCriterion("process_nick_name <", value, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameLessThanOrEqualTo(String value) {
            addCriterion("process_nick_name <=", value, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameLike(String value) {
            addCriterion("process_nick_name like", value, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameNotLike(String value) {
            addCriterion("process_nick_name not like", value, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameIn(List<String> values) {
            addCriterion("process_nick_name in", values, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameNotIn(List<String> values) {
            addCriterion("process_nick_name not in", values, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameBetween(String value1, String value2) {
            addCriterion("process_nick_name between", value1, value2, "processNickName");
            return (Criteria) this;
        }

        public Criteria andProcessNickNameNotBetween(String value1, String value2) {
            addCriterion("process_nick_name not between", value1, value2, "processNickName");
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