package cn.lonsun.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StepInstanceEOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StepInstanceEOExample() {
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

        public Criteria andStepInstanceIdIsNull() {
            addCriterion("step_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdIsNotNull() {
            addCriterion("step_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdEqualTo(BigDecimal value) {
            addCriterion("step_instance_id =", value, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdNotEqualTo(BigDecimal value) {
            addCriterion("step_instance_id <>", value, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdGreaterThan(BigDecimal value) {
            addCriterion("step_instance_id >", value, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("step_instance_id >=", value, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdLessThan(BigDecimal value) {
            addCriterion("step_instance_id <", value, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("step_instance_id <=", value, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdIn(List<BigDecimal> values) {
            addCriterion("step_instance_id in", values, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdNotIn(List<BigDecimal> values) {
            addCriterion("step_instance_id not in", values, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("step_instance_id between", value1, value2, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepInstanceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("step_instance_id not between", value1, value2, "stepInstanceId");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNull() {
            addCriterion("step_id is null");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNotNull() {
            addCriterion("step_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepIdEqualTo(BigDecimal value) {
            addCriterion("step_id =", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotEqualTo(BigDecimal value) {
            addCriterion("step_id <>", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThan(BigDecimal value) {
            addCriterion("step_id >", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("step_id >=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThan(BigDecimal value) {
            addCriterion("step_id <", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("step_id <=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdIn(List<BigDecimal> values) {
            addCriterion("step_id in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotIn(List<BigDecimal> values) {
            addCriterion("step_id not in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("step_id between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("step_id not between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepNickNameIsNull() {
            addCriterion("step_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andStepNickNameIsNotNull() {
            addCriterion("step_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andStepNickNameEqualTo(String value) {
            addCriterion("step_nick_name =", value, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameNotEqualTo(String value) {
            addCriterion("step_nick_name <>", value, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameGreaterThan(String value) {
            addCriterion("step_nick_name >", value, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("step_nick_name >=", value, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameLessThan(String value) {
            addCriterion("step_nick_name <", value, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameLessThanOrEqualTo(String value) {
            addCriterion("step_nick_name <=", value, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameLike(String value) {
            addCriterion("step_nick_name like", value, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameNotLike(String value) {
            addCriterion("step_nick_name not like", value, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameIn(List<String> values) {
            addCriterion("step_nick_name in", values, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameNotIn(List<String> values) {
            addCriterion("step_nick_name not in", values, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameBetween(String value1, String value2) {
            addCriterion("step_nick_name between", value1, value2, "stepNickName");
            return (Criteria) this;
        }

        public Criteria andStepNickNameNotBetween(String value1, String value2) {
            addCriterion("step_nick_name not between", value1, value2, "stepNickName");
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

        public Criteria andNextStepIdsIsNull() {
            addCriterion("next_step_ids is null");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsIsNotNull() {
            addCriterion("next_step_ids is not null");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsEqualTo(String value) {
            addCriterion("next_step_ids =", value, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsNotEqualTo(String value) {
            addCriterion("next_step_ids <>", value, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsGreaterThan(String value) {
            addCriterion("next_step_ids >", value, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsGreaterThanOrEqualTo(String value) {
            addCriterion("next_step_ids >=", value, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsLessThan(String value) {
            addCriterion("next_step_ids <", value, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsLessThanOrEqualTo(String value) {
            addCriterion("next_step_ids <=", value, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsLike(String value) {
            addCriterion("next_step_ids like", value, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsNotLike(String value) {
            addCriterion("next_step_ids not like", value, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsIn(List<String> values) {
            addCriterion("next_step_ids in", values, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsNotIn(List<String> values) {
            addCriterion("next_step_ids not in", values, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsBetween(String value1, String value2) {
            addCriterion("next_step_ids between", value1, value2, "nextStepIds");
            return (Criteria) this;
        }

        public Criteria andNextStepIdsNotBetween(String value1, String value2) {
            addCriterion("next_step_ids not between", value1, value2, "nextStepIds");
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