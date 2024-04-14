package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsBucketGoodsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsBucketGoodsDetailExample() {
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

        public Criteria andLocalCustIsNull() {
            addCriterion("local_cust is null");
            return (Criteria) this;
        }

        public Criteria andLocalCustIsNotNull() {
            addCriterion("local_cust is not null");
            return (Criteria) this;
        }

        public Criteria andLocalCustEqualTo(String value) {
            addCriterion("local_cust =", value, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustNotEqualTo(String value) {
            addCriterion("local_cust <>", value, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustGreaterThan(String value) {
            addCriterion("local_cust >", value, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustGreaterThanOrEqualTo(String value) {
            addCriterion("local_cust >=", value, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustLessThan(String value) {
            addCriterion("local_cust <", value, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustLessThanOrEqualTo(String value) {
            addCriterion("local_cust <=", value, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustLike(String value) {
            addCriterion("local_cust like", value, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustNotLike(String value) {
            addCriterion("local_cust not like", value, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustIn(List<String> values) {
            addCriterion("local_cust in", values, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustNotIn(List<String> values) {
            addCriterion("local_cust not in", values, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustBetween(String value1, String value2) {
            addCriterion("local_cust between", value1, value2, "localCust");
            return (Criteria) this;
        }

        public Criteria andLocalCustNotBetween(String value1, String value2) {
            addCriterion("local_cust not between", value1, value2, "localCust");
            return (Criteria) this;
        }

        public Criteria andHkCustIsNull() {
            addCriterion("hk_cust is null");
            return (Criteria) this;
        }

        public Criteria andHkCustIsNotNull() {
            addCriterion("hk_cust is not null");
            return (Criteria) this;
        }

        public Criteria andHkCustEqualTo(String value) {
            addCriterion("hk_cust =", value, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustNotEqualTo(String value) {
            addCriterion("hk_cust <>", value, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustGreaterThan(String value) {
            addCriterion("hk_cust >", value, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustGreaterThanOrEqualTo(String value) {
            addCriterion("hk_cust >=", value, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustLessThan(String value) {
            addCriterion("hk_cust <", value, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustLessThanOrEqualTo(String value) {
            addCriterion("hk_cust <=", value, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustLike(String value) {
            addCriterion("hk_cust like", value, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustNotLike(String value) {
            addCriterion("hk_cust not like", value, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustIn(List<String> values) {
            addCriterion("hk_cust in", values, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustNotIn(List<String> values) {
            addCriterion("hk_cust not in", values, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustBetween(String value1, String value2) {
            addCriterion("hk_cust between", value1, value2, "hkCust");
            return (Criteria) this;
        }

        public Criteria andHkCustNotBetween(String value1, String value2) {
            addCriterion("hk_cust not between", value1, value2, "hkCust");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdIsNull() {
            addCriterion("order_loading_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdIsNotNull() {
            addCriterion("order_loading_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdEqualTo(Long value) {
            addCriterion("order_loading_id =", value, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdNotEqualTo(Long value) {
            addCriterion("order_loading_id <>", value, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdGreaterThan(Long value) {
            addCriterion("order_loading_id >", value, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_loading_id >=", value, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdLessThan(Long value) {
            addCriterion("order_loading_id <", value, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdLessThanOrEqualTo(Long value) {
            addCriterion("order_loading_id <=", value, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdIn(List<Long> values) {
            addCriterion("order_loading_id in", values, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdNotIn(List<Long> values) {
            addCriterion("order_loading_id not in", values, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdBetween(Long value1, Long value2) {
            addCriterion("order_loading_id between", value1, value2, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andOrderLoadingIdNotBetween(Long value1, Long value2) {
            addCriterion("order_loading_id not between", value1, value2, "orderLoadingId");
            return (Criteria) this;
        }

        public Criteria andBucketIdIsNull() {
            addCriterion("bucket_id is null");
            return (Criteria) this;
        }

        public Criteria andBucketIdIsNotNull() {
            addCriterion("bucket_id is not null");
            return (Criteria) this;
        }

        public Criteria andBucketIdEqualTo(Long value) {
            addCriterion("bucket_id =", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdNotEqualTo(Long value) {
            addCriterion("bucket_id <>", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdGreaterThan(Long value) {
            addCriterion("bucket_id >", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bucket_id >=", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdLessThan(Long value) {
            addCriterion("bucket_id <", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdLessThanOrEqualTo(Long value) {
            addCriterion("bucket_id <=", value, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdIn(List<Long> values) {
            addCriterion("bucket_id in", values, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdNotIn(List<Long> values) {
            addCriterion("bucket_id not in", values, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdBetween(Long value1, Long value2) {
            addCriterion("bucket_id between", value1, value2, "bucketId");
            return (Criteria) this;
        }

        public Criteria andBucketIdNotBetween(Long value1, Long value2) {
            addCriterion("bucket_id not between", value1, value2, "bucketId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdIsNull() {
            addCriterion("cust_order_id is null");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdIsNotNull() {
            addCriterion("cust_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdEqualTo(Long value) {
            addCriterion("cust_order_id =", value, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdNotEqualTo(Long value) {
            addCriterion("cust_order_id <>", value, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdGreaterThan(Long value) {
            addCriterion("cust_order_id >", value, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_order_id >=", value, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdLessThan(Long value) {
            addCriterion("cust_order_id <", value, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_order_id <=", value, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdIn(List<Long> values) {
            addCriterion("cust_order_id in", values, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdNotIn(List<Long> values) {
            addCriterion("cust_order_id not in", values, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdBetween(Long value1, Long value2) {
            addCriterion("cust_order_id between", value1, value2, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andCustOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_order_id not between", value1, value2, "custOrderId");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("plate_number not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNull() {
            addCriterion("good_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNotNull() {
            addCriterion("good_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeEqualTo(String value) {
            addCriterion("good_type =", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotEqualTo(String value) {
            addCriterion("good_type <>", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThan(String value) {
            addCriterion("good_type >", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("good_type >=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThan(String value) {
            addCriterion("good_type <", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThanOrEqualTo(String value) {
            addCriterion("good_type <=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLike(String value) {
            addCriterion("good_type like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotLike(String value) {
            addCriterion("good_type not like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIn(List<String> values) {
            addCriterion("good_type in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotIn(List<String> values) {
            addCriterion("good_type not in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeBetween(String value1, String value2) {
            addCriterion("good_type between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotBetween(String value1, String value2) {
            addCriterion("good_type not between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeIsNull() {
            addCriterion("packing_type is null");
            return (Criteria) this;
        }

        public Criteria andPackingTypeIsNotNull() {
            addCriterion("packing_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackingTypeEqualTo(String value) {
            addCriterion("packing_type =", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeNotEqualTo(String value) {
            addCriterion("packing_type <>", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeGreaterThan(String value) {
            addCriterion("packing_type >", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("packing_type >=", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeLessThan(String value) {
            addCriterion("packing_type <", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeLessThanOrEqualTo(String value) {
            addCriterion("packing_type <=", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeLike(String value) {
            addCriterion("packing_type like", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeNotLike(String value) {
            addCriterion("packing_type not like", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeIn(List<String> values) {
            addCriterion("packing_type in", values, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeNotIn(List<String> values) {
            addCriterion("packing_type not in", values, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeBetween(String value1, String value2) {
            addCriterion("packing_type between", value1, value2, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeNotBetween(String value1, String value2) {
            addCriterion("packing_type not between", value1, value2, "packingType");
            return (Criteria) this;
        }

        public Criteria andFclNumberIsNull() {
            addCriterion("fcl_number is null");
            return (Criteria) this;
        }

        public Criteria andFclNumberIsNotNull() {
            addCriterion("fcl_number is not null");
            return (Criteria) this;
        }

        public Criteria andFclNumberEqualTo(Integer value) {
            addCriterion("fcl_number =", value, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberNotEqualTo(Integer value) {
            addCriterion("fcl_number <>", value, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberGreaterThan(Integer value) {
            addCriterion("fcl_number >", value, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcl_number >=", value, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberLessThan(Integer value) {
            addCriterion("fcl_number <", value, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberLessThanOrEqualTo(Integer value) {
            addCriterion("fcl_number <=", value, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberIn(List<Integer> values) {
            addCriterion("fcl_number in", values, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberNotIn(List<Integer> values) {
            addCriterion("fcl_number not in", values, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberBetween(Integer value1, Integer value2) {
            addCriterion("fcl_number between", value1, value2, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andFclNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fcl_number not between", value1, value2, "fclNumber");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIsNull() {
            addCriterion("unit_weight is null");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIsNotNull() {
            addCriterion("unit_weight is not null");
            return (Criteria) this;
        }

        public Criteria andUnitWeightEqualTo(BigDecimal value) {
            addCriterion("unit_weight =", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotEqualTo(BigDecimal value) {
            addCriterion("unit_weight <>", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightGreaterThan(BigDecimal value) {
            addCriterion("unit_weight >", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_weight >=", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightLessThan(BigDecimal value) {
            addCriterion("unit_weight <", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_weight <=", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIn(List<BigDecimal> values) {
            addCriterion("unit_weight in", values, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotIn(List<BigDecimal> values) {
            addCriterion("unit_weight not in", values, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_weight between", value1, value2, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_weight not between", value1, value2, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberIsNull() {
            addCriterion("addition_number is null");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberIsNotNull() {
            addCriterion("addition_number is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberEqualTo(Integer value) {
            addCriterion("addition_number =", value, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberNotEqualTo(Integer value) {
            addCriterion("addition_number <>", value, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberGreaterThan(Integer value) {
            addCriterion("addition_number >", value, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("addition_number >=", value, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberLessThan(Integer value) {
            addCriterion("addition_number <", value, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("addition_number <=", value, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberIn(List<Integer> values) {
            addCriterion("addition_number in", values, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberNotIn(List<Integer> values) {
            addCriterion("addition_number not in", values, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberBetween(Integer value1, Integer value2) {
            addCriterion("addition_number between", value1, value2, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("addition_number not between", value1, value2, "additionNumber");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1IsNull() {
            addCriterion("addition_weight1 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1IsNotNull() {
            addCriterion("addition_weight1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1EqualTo(BigDecimal value) {
            addCriterion("addition_weight1 =", value, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1NotEqualTo(BigDecimal value) {
            addCriterion("addition_weight1 <>", value, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1GreaterThan(BigDecimal value) {
            addCriterion("addition_weight1 >", value, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("addition_weight1 >=", value, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1LessThan(BigDecimal value) {
            addCriterion("addition_weight1 <", value, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("addition_weight1 <=", value, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1In(List<BigDecimal> values) {
            addCriterion("addition_weight1 in", values, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1NotIn(List<BigDecimal> values) {
            addCriterion("addition_weight1 not in", values, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("addition_weight1 between", value1, value2, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("addition_weight1 not between", value1, value2, "additionWeight1");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2IsNull() {
            addCriterion("addition_weight2 is null");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2IsNotNull() {
            addCriterion("addition_weight2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2EqualTo(BigDecimal value) {
            addCriterion("addition_weight2 =", value, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2NotEqualTo(BigDecimal value) {
            addCriterion("addition_weight2 <>", value, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2GreaterThan(BigDecimal value) {
            addCriterion("addition_weight2 >", value, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("addition_weight2 >=", value, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2LessThan(BigDecimal value) {
            addCriterion("addition_weight2 <", value, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("addition_weight2 <=", value, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2In(List<BigDecimal> values) {
            addCriterion("addition_weight2 in", values, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2NotIn(List<BigDecimal> values) {
            addCriterion("addition_weight2 not in", values, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("addition_weight2 between", value1, value2, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andAdditionWeight2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("addition_weight2 not between", value1, value2, "additionWeight2");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIsNull() {
            addCriterion("total_number is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIsNotNull() {
            addCriterion("total_number is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberEqualTo(Integer value) {
            addCriterion("total_number =", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotEqualTo(Integer value) {
            addCriterion("total_number <>", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberGreaterThan(Integer value) {
            addCriterion("total_number >", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_number >=", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberLessThan(Integer value) {
            addCriterion("total_number <", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberLessThanOrEqualTo(Integer value) {
            addCriterion("total_number <=", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIn(List<Integer> values) {
            addCriterion("total_number in", values, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotIn(List<Integer> values) {
            addCriterion("total_number not in", values, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberBetween(Integer value1, Integer value2) {
            addCriterion("total_number between", value1, value2, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("total_number not between", value1, value2, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIsNull() {
            addCriterion("total_weight is null");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIsNotNull() {
            addCriterion("total_weight is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWeightEqualTo(BigDecimal value) {
            addCriterion("total_weight =", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotEqualTo(BigDecimal value) {
            addCriterion("total_weight <>", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightGreaterThan(BigDecimal value) {
            addCriterion("total_weight >", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_weight >=", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightLessThan(BigDecimal value) {
            addCriterion("total_weight <", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_weight <=", value, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightIn(List<BigDecimal> values) {
            addCriterion("total_weight in", values, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotIn(List<BigDecimal> values) {
            addCriterion("total_weight not in", values, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_weight between", value1, value2, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andTotalWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_weight not between", value1, value2, "totalWeight");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIsNull() {
            addCriterion("freight_fee is null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIsNotNull() {
            addCriterion("freight_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFreightFeeEqualTo(BigDecimal value) {
            addCriterion("freight_fee =", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotEqualTo(BigDecimal value) {
            addCriterion("freight_fee <>", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeGreaterThan(BigDecimal value) {
            addCriterion("freight_fee >", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_fee >=", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeLessThan(BigDecimal value) {
            addCriterion("freight_fee <", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight_fee <=", value, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeIn(List<BigDecimal> values) {
            addCriterion("freight_fee in", values, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotIn(List<BigDecimal> values) {
            addCriterion("freight_fee not in", values, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_fee between", value1, value2, "freightFee");
            return (Criteria) this;
        }

        public Criteria andFreightFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight_fee not between", value1, value2, "freightFee");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateIsNull() {
            addCriterion("loading_confirm_state is null");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateIsNotNull() {
            addCriterion("loading_confirm_state is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateEqualTo(Integer value) {
            addCriterion("loading_confirm_state =", value, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateNotEqualTo(Integer value) {
            addCriterion("loading_confirm_state <>", value, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateGreaterThan(Integer value) {
            addCriterion("loading_confirm_state >", value, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("loading_confirm_state >=", value, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateLessThan(Integer value) {
            addCriterion("loading_confirm_state <", value, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateLessThanOrEqualTo(Integer value) {
            addCriterion("loading_confirm_state <=", value, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateIn(List<Integer> values) {
            addCriterion("loading_confirm_state in", values, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateNotIn(List<Integer> values) {
            addCriterion("loading_confirm_state not in", values, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateBetween(Integer value1, Integer value2) {
            addCriterion("loading_confirm_state between", value1, value2, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmStateNotBetween(Integer value1, Integer value2) {
            addCriterion("loading_confirm_state not between", value1, value2, "loadingConfirmState");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorIsNull() {
            addCriterion("loading_confirm_operator is null");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorIsNotNull() {
            addCriterion("loading_confirm_operator is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorEqualTo(String value) {
            addCriterion("loading_confirm_operator =", value, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorNotEqualTo(String value) {
            addCriterion("loading_confirm_operator <>", value, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorGreaterThan(String value) {
            addCriterion("loading_confirm_operator >", value, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("loading_confirm_operator >=", value, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorLessThan(String value) {
            addCriterion("loading_confirm_operator <", value, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorLessThanOrEqualTo(String value) {
            addCriterion("loading_confirm_operator <=", value, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorLike(String value) {
            addCriterion("loading_confirm_operator like", value, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorNotLike(String value) {
            addCriterion("loading_confirm_operator not like", value, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorIn(List<String> values) {
            addCriterion("loading_confirm_operator in", values, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorNotIn(List<String> values) {
            addCriterion("loading_confirm_operator not in", values, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorBetween(String value1, String value2) {
            addCriterion("loading_confirm_operator between", value1, value2, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmOperatorNotBetween(String value1, String value2) {
            addCriterion("loading_confirm_operator not between", value1, value2, "loadingConfirmOperator");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeIsNull() {
            addCriterion("loading_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeIsNotNull() {
            addCriterion("loading_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeEqualTo(Date value) {
            addCriterion("loading_confirm_time =", value, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeNotEqualTo(Date value) {
            addCriterion("loading_confirm_time <>", value, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeGreaterThan(Date value) {
            addCriterion("loading_confirm_time >", value, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loading_confirm_time >=", value, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeLessThan(Date value) {
            addCriterion("loading_confirm_time <", value, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("loading_confirm_time <=", value, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeIn(List<Date> values) {
            addCriterion("loading_confirm_time in", values, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeNotIn(List<Date> values) {
            addCriterion("loading_confirm_time not in", values, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("loading_confirm_time between", value1, value2, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andLoadingConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("loading_confirm_time not between", value1, value2, "loadingConfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateIsNull() {
            addCriterion("sending_confirm_state is null");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateIsNotNull() {
            addCriterion("sending_confirm_state is not null");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateEqualTo(Integer value) {
            addCriterion("sending_confirm_state =", value, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateNotEqualTo(Integer value) {
            addCriterion("sending_confirm_state <>", value, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateGreaterThan(Integer value) {
            addCriterion("sending_confirm_state >", value, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sending_confirm_state >=", value, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateLessThan(Integer value) {
            addCriterion("sending_confirm_state <", value, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateLessThanOrEqualTo(Integer value) {
            addCriterion("sending_confirm_state <=", value, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateIn(List<Integer> values) {
            addCriterion("sending_confirm_state in", values, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateNotIn(List<Integer> values) {
            addCriterion("sending_confirm_state not in", values, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateBetween(Integer value1, Integer value2) {
            addCriterion("sending_confirm_state between", value1, value2, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sending_confirm_state not between", value1, value2, "sendingConfirmState");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorIsNull() {
            addCriterion("sending_comfirm_operator is null");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorIsNotNull() {
            addCriterion("sending_comfirm_operator is not null");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorEqualTo(String value) {
            addCriterion("sending_comfirm_operator =", value, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorNotEqualTo(String value) {
            addCriterion("sending_comfirm_operator <>", value, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorGreaterThan(String value) {
            addCriterion("sending_comfirm_operator >", value, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("sending_comfirm_operator >=", value, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorLessThan(String value) {
            addCriterion("sending_comfirm_operator <", value, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorLessThanOrEqualTo(String value) {
            addCriterion("sending_comfirm_operator <=", value, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorLike(String value) {
            addCriterion("sending_comfirm_operator like", value, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorNotLike(String value) {
            addCriterion("sending_comfirm_operator not like", value, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorIn(List<String> values) {
            addCriterion("sending_comfirm_operator in", values, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorNotIn(List<String> values) {
            addCriterion("sending_comfirm_operator not in", values, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorBetween(String value1, String value2) {
            addCriterion("sending_comfirm_operator between", value1, value2, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmOperatorNotBetween(String value1, String value2) {
            addCriterion("sending_comfirm_operator not between", value1, value2, "sendingComfirmOperator");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeIsNull() {
            addCriterion("sending_comfirm_time is null");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeIsNotNull() {
            addCriterion("sending_comfirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeEqualTo(Date value) {
            addCriterion("sending_comfirm_time =", value, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeNotEqualTo(Date value) {
            addCriterion("sending_comfirm_time <>", value, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeGreaterThan(Date value) {
            addCriterion("sending_comfirm_time >", value, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sending_comfirm_time >=", value, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeLessThan(Date value) {
            addCriterion("sending_comfirm_time <", value, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("sending_comfirm_time <=", value, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeIn(List<Date> values) {
            addCriterion("sending_comfirm_time in", values, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeNotIn(List<Date> values) {
            addCriterion("sending_comfirm_time not in", values, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeBetween(Date value1, Date value2) {
            addCriterion("sending_comfirm_time between", value1, value2, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingComfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("sending_comfirm_time not between", value1, value2, "sendingComfirmTime");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesIsNull() {
            addCriterion("sending_confirm_notes is null");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesIsNotNull() {
            addCriterion("sending_confirm_notes is not null");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesEqualTo(String value) {
            addCriterion("sending_confirm_notes =", value, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesNotEqualTo(String value) {
            addCriterion("sending_confirm_notes <>", value, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesGreaterThan(String value) {
            addCriterion("sending_confirm_notes >", value, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesGreaterThanOrEqualTo(String value) {
            addCriterion("sending_confirm_notes >=", value, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesLessThan(String value) {
            addCriterion("sending_confirm_notes <", value, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesLessThanOrEqualTo(String value) {
            addCriterion("sending_confirm_notes <=", value, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesLike(String value) {
            addCriterion("sending_confirm_notes like", value, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesNotLike(String value) {
            addCriterion("sending_confirm_notes not like", value, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesIn(List<String> values) {
            addCriterion("sending_confirm_notes in", values, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesNotIn(List<String> values) {
            addCriterion("sending_confirm_notes not in", values, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesBetween(String value1, String value2) {
            addCriterion("sending_confirm_notes between", value1, value2, "sendingConfirmNotes");
            return (Criteria) this;
        }

        public Criteria andSendingConfirmNotesNotBetween(String value1, String value2) {
            addCriterion("sending_confirm_notes not between", value1, value2, "sendingConfirmNotes");
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