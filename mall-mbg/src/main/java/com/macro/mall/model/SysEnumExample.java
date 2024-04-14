package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysEnumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysEnumExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIsNull() {
            addCriterion("enum_type is null");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIsNotNull() {
            addCriterion("enum_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnumTypeEqualTo(String value) {
            addCriterion("enum_type =", value, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeNotEqualTo(String value) {
            addCriterion("enum_type <>", value, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeGreaterThan(String value) {
            addCriterion("enum_type >", value, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeGreaterThanOrEqualTo(String value) {
            addCriterion("enum_type >=", value, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeLessThan(String value) {
            addCriterion("enum_type <", value, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeLessThanOrEqualTo(String value) {
            addCriterion("enum_type <=", value, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeLike(String value) {
            addCriterion("enum_type like", value, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeNotLike(String value) {
            addCriterion("enum_type not like", value, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeIn(List<String> values) {
            addCriterion("enum_type in", values, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeNotIn(List<String> values) {
            addCriterion("enum_type not in", values, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeBetween(String value1, String value2) {
            addCriterion("enum_type between", value1, value2, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumTypeNotBetween(String value1, String value2) {
            addCriterion("enum_type not between", value1, value2, "enumType");
            return (Criteria) this;
        }

        public Criteria andEnumCodeIsNull() {
            addCriterion("enum_code is null");
            return (Criteria) this;
        }

        public Criteria andEnumCodeIsNotNull() {
            addCriterion("enum_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnumCodeEqualTo(String value) {
            addCriterion("enum_code =", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNotEqualTo(String value) {
            addCriterion("enum_code <>", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeGreaterThan(String value) {
            addCriterion("enum_code >", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enum_code >=", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeLessThan(String value) {
            addCriterion("enum_code <", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeLessThanOrEqualTo(String value) {
            addCriterion("enum_code <=", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeLike(String value) {
            addCriterion("enum_code like", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNotLike(String value) {
            addCriterion("enum_code not like", value, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeIn(List<String> values) {
            addCriterion("enum_code in", values, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNotIn(List<String> values) {
            addCriterion("enum_code not in", values, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeBetween(String value1, String value2) {
            addCriterion("enum_code between", value1, value2, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumCodeNotBetween(String value1, String value2) {
            addCriterion("enum_code not between", value1, value2, "enumCode");
            return (Criteria) this;
        }

        public Criteria andEnumValueIsNull() {
            addCriterion("enum_value is null");
            return (Criteria) this;
        }

        public Criteria andEnumValueIsNotNull() {
            addCriterion("enum_value is not null");
            return (Criteria) this;
        }

        public Criteria andEnumValueEqualTo(String value) {
            addCriterion("enum_value =", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueNotEqualTo(String value) {
            addCriterion("enum_value <>", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueGreaterThan(String value) {
            addCriterion("enum_value >", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueGreaterThanOrEqualTo(String value) {
            addCriterion("enum_value >=", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueLessThan(String value) {
            addCriterion("enum_value <", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueLessThanOrEqualTo(String value) {
            addCriterion("enum_value <=", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueLike(String value) {
            addCriterion("enum_value like", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueNotLike(String value) {
            addCriterion("enum_value not like", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueIn(List<String> values) {
            addCriterion("enum_value in", values, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueNotIn(List<String> values) {
            addCriterion("enum_value not in", values, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueBetween(String value1, String value2) {
            addCriterion("enum_value between", value1, value2, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueNotBetween(String value1, String value2) {
            addCriterion("enum_value not between", value1, value2, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueIsNull() {
            addCriterion("enum_map_value is null");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueIsNotNull() {
            addCriterion("enum_map_value is not null");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueEqualTo(String value) {
            addCriterion("enum_map_value =", value, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueNotEqualTo(String value) {
            addCriterion("enum_map_value <>", value, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueGreaterThan(String value) {
            addCriterion("enum_map_value >", value, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueGreaterThanOrEqualTo(String value) {
            addCriterion("enum_map_value >=", value, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueLessThan(String value) {
            addCriterion("enum_map_value <", value, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueLessThanOrEqualTo(String value) {
            addCriterion("enum_map_value <=", value, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueLike(String value) {
            addCriterion("enum_map_value like", value, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueNotLike(String value) {
            addCriterion("enum_map_value not like", value, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueIn(List<String> values) {
            addCriterion("enum_map_value in", values, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueNotIn(List<String> values) {
            addCriterion("enum_map_value not in", values, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueBetween(String value1, String value2) {
            addCriterion("enum_map_value between", value1, value2, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andEnumMapValueNotBetween(String value1, String value2) {
            addCriterion("enum_map_value not between", value1, value2, "enumMapValue");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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