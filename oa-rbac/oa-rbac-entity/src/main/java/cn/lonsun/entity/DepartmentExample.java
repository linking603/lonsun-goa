package cn.lonsun.entity;

import java.math.BigDecimal;
import java.util.List;

public class DepartmentExample extends AMockExample {
    public Criteria andDepartmentIdIsNull() {
        instance.addCriterion("department_id is null");
        return instance;
    }

    public Criteria andDepartmentIdIsNotNull() {
        instance.addCriterion("department_id is not null");
        return instance;
    }

    public Criteria andDepartmentIdEqualTo(BigDecimal value) {
        instance.addCriterion("department_id =", value, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdNotEqualTo(BigDecimal value) {
        instance.addCriterion("department_id <>", value, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdGreaterThan(BigDecimal value) {
        instance.addCriterion("department_id >", value, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdGreaterThanOrEqualTo(BigDecimal value) {
        instance.addCriterion("department_id >=", value, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdLessThan(BigDecimal value) {
        instance.addCriterion("department_id <", value, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdLessThanOrEqualTo(BigDecimal value) {
        instance.addCriterion("department_id <=", value, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdIn(List values) {
        instance.addCriterion("department_id in", values, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdNotIn(List values) {
        instance.addCriterion("department_id not in", values, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdBetween(BigDecimal value1, BigDecimal value2) {
        instance.addCriterion("department_id between", value1, value2, "departmentId");
        return instance;
    }

    public Criteria andDepartmentIdNotBetween(BigDecimal value1, BigDecimal value2) {
        instance.addCriterion("department_id not between", value1, value2, "departmentId");
        return instance;
    }

    public Criteria andDepartmentFullNameIsNull() {
        instance.addCriterion("department_full_name is null");
        return instance;
    }

    public Criteria andDepartmentFullNameIsNotNull() {
        instance.addCriterion("department_full_name is not null");
        return instance;
    }

    public Criteria andDepartmentFullNameEqualTo(String value) {
        instance.addCriterion("department_full_name =", value, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameNotEqualTo(String value) {
        instance.addCriterion("department_full_name <>", value, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameGreaterThan(String value) {
        instance.addCriterion("department_full_name >", value, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameGreaterThanOrEqualTo(String value) {
        instance.addCriterion("department_full_name >=", value, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameLessThan(String value) {
        instance.addCriterion("department_full_name <", value, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameLessThanOrEqualTo(String value) {
        instance.addCriterion("department_full_name <=", value, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameLike(String value) {
        instance.addCriterion("department_full_name like", value, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameNotLike(String value) {
        instance.addCriterion("department_full_name not like", value, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameIn(List<String> values) {
        instance.addCriterion("department_full_name in", values, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameNotIn(List<String> values) {
        instance.addCriterion("department_full_name not in", values, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameBetween(String value1, String value2) {
        instance.addCriterion("department_full_name between", value1, value2, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentFullNameNotBetween(String value1, String value2) {
        instance.addCriterion("department_full_name not between", value1, value2, "departmentFullName");
        return instance;
    }

    public Criteria andDepartmentShortNameIsNull() {
        instance.addCriterion("department_short_name is null");
        return instance;
    }

    public Criteria andDepartmentShortNameIsNotNull() {
        instance.addCriterion("department_short_name is not null");
        return instance;
    }

    public Criteria andDepartmentShortNameEqualTo(String value) {
        instance.addCriterion("department_short_name =", value, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameNotEqualTo(String value) {
        instance.addCriterion("department_short_name <>", value, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameGreaterThan(String value) {
        instance.addCriterion("department_short_name >", value, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameGreaterThanOrEqualTo(String value) {
        instance.addCriterion("department_short_name >=", value, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameLessThan(String value) {
        instance.addCriterion("department_short_name <", value, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameLessThanOrEqualTo(String value) {
        instance.addCriterion("department_short_name <=", value, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameLike(String value) {
        instance.addCriterion("department_short_name like", value, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameNotLike(String value) {
        instance.addCriterion("department_short_name not like", value, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameIn(List<String> values) {
        instance.addCriterion("department_short_name in", values, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameNotIn(List<String> values) {
        instance.addCriterion("department_short_name not in", values, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameBetween(String value1, String value2) {
        instance.addCriterion("department_short_name between", value1, value2, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentShortNameNotBetween(String value1, String value2) {
        instance.addCriterion("department_short_name not between", value1, value2, "departmentShortName");
        return instance;
    }

    public Criteria andDepartmentTypeIsNull() {
        instance.addCriterion("department_type is null");
        return instance;
    }

    public Criteria andDepartmentTypeIsNotNull() {
        instance.addCriterion("department_type is not null");
        return instance;
    }

    public Criteria andDepartmentTypeEqualTo(Short value) {
        instance.addCriterion("department_type =", value, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeNotEqualTo(Short value) {
        instance.addCriterion("department_type <>", value, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeGreaterThan(Short value) {
        instance.addCriterion("department_type >", value, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeGreaterThanOrEqualTo(Short value) {
        instance.addCriterion("department_type >=", value, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeLessThan(Short value) {
        instance.addCriterion("department_type <", value, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeLessThanOrEqualTo(Short value) {
        instance.addCriterion("department_type <=", value, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeIn(List<Short> values) {
        instance.addCriterion("department_type in", values, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeNotIn(List<Short> values) {
        instance.addCriterion("department_type not in", values, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeBetween(Short value1, Short value2) {
        instance.addCriterion("department_type between", value1, value2, "departmentType");
        return instance;
    }

    public Criteria andDepartmentTypeNotBetween(Short value1, Short value2) {
        instance.addCriterion("department_type not between", value1, value2, "departmentType");
        return instance;
    }

    public Criteria andDepartmentParentIdIsNull() {
        instance.addCriterion("department_parent_id is null");
        return instance;
    }

    public Criteria andDepartmentParentIdIsNotNull() {
        instance.addCriterion("department_parent_id is not null");
        return instance;
    }

    public Criteria andDepartmentParentIdEqualTo(BigDecimal value) {
        instance.addCriterion("department_parent_id =", value, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdNotEqualTo(BigDecimal value) {
        instance.addCriterion("department_parent_id <>", value, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdGreaterThan(BigDecimal value) {
        instance.addCriterion("department_parent_id >", value, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdGreaterThanOrEqualTo(BigDecimal value) {
        instance.addCriterion("department_parent_id >=", value, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdLessThan(BigDecimal value) {
        instance.addCriterion("department_parent_id <", value, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdLessThanOrEqualTo(BigDecimal value) {
        instance.addCriterion("department_parent_id <=", value, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdIn(List<BigDecimal> values) {
        instance.addCriterion("department_parent_id in", values, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdNotIn(List<BigDecimal> values) {
        instance.addCriterion("department_parent_id not in", values, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdBetween(BigDecimal value1, BigDecimal value2) {
        instance.addCriterion("department_parent_id between", value1, value2, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdNotBetween(BigDecimal value1, BigDecimal value2) {
        instance.addCriterion("department_parent_id not between", value1, value2, "departmentParentId");
        return instance;
    }

    public Criteria andDepartmentParentIdsIsNull() {
        instance.addCriterion("department_parent_ids is null");
        return instance;
    }

    public Criteria andDepartmentParentIdsIsNotNull() {
        instance.addCriterion("department_parent_ids is not null");
        return instance;
    }

    public Criteria andDepartmentParentIdsEqualTo(String value) {
        instance.addCriterion("department_parent_ids =", value, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsNotEqualTo(String value) {
        instance.addCriterion("department_parent_ids <>", value, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsGreaterThan(String value) {
        instance.addCriterion("department_parent_ids >", value, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsGreaterThanOrEqualTo(String value) {
        instance.addCriterion("department_parent_ids >=", value, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsLessThan(String value) {
        instance.addCriterion("department_parent_ids <", value, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsLessThanOrEqualTo(String value) {
        instance.addCriterion("department_parent_ids <=", value, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsLike(String value) {
        instance.addCriterion("department_parent_ids like", value, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsNotLike(String value) {
        instance.addCriterion("department_parent_ids not like", value, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsIn(List<String> values) {
        instance.addCriterion("department_parent_ids in", values, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsNotIn(List<String> values) {
        instance.addCriterion("department_parent_ids not in", values, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsBetween(String value1, String value2) {
        instance.addCriterion("department_parent_ids between", value1, value2, "departmentParentIds");
        return instance;
    }

    public Criteria andDepartmentParentIdsNotBetween(String value1, String value2) {
        instance.addCriterion("department_parent_ids not between", value1, value2, "departmentParentIds");
        return instance;
    }
}