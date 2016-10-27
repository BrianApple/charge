package com.hzzh.charge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：tb_base_station表的查询条件类StationExample
 * 内容摘要：tb_base_station表的各个元素的查询条件
 * @author 工具生成
 * @version 1.0 2016年10月26日
 */
public class StationExample {

    /** 排序 */
    protected String orderByClause;
    /** 去重 */
    protected boolean distinct;
    /** 条件集合 */
    protected List<Criteria> oredCriteria;
    /** 分页 当前条数 */
    protected Integer currentSize;
    /** 分页 每页显示条数 */
    protected Integer pageSize;

    public StationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 取得 排序
     * @return 排序
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设定 排序
     * @param orderByClause 排序
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 取得 去重
     * @return 去重
     */
    public boolean getDistinct() {
        return distinct;
    }

    /**
     * 设定 去重
     * @param distinct 去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 取得 条件集合
     * @return 条件集合
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 设定 条件集合
     * @param oredCriteria 条件集合
     */
    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }

    /**
     * 取得 分页 当前条数
     * @return 分页 当前条数
     */
    public Integer getCurrentSize() {
        return currentSize;
    }

    /**
     * 设定 分页 当前条数
     * @param currentSize 分页 当前条数
     */
    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    /**
     * 取得 分页 每页显示条数
     * @return 分页 每页显示条数
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设定 分页 每页显示条数
     * @param pageSize 分页 每页显示条数
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
            if(value != null && !value.equals("") && !value.equals("%null%") && !value.equals("%%")){
                criteria.add(new Criterion(condition, value));
            }
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andguidIsNull() {
            addCriterion("tbs.GUID_ is null");
            return (Criteria) this;
        }

        public Criteria andguidIsNotNull() {
            addCriterion("tbs.GUID_ is not null");
            return (Criteria) this;
        }

        public Criteria andguidEqualTo(String value) {
            addCriterion("tbs.GUID_ =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotEqualTo(String value) {
            addCriterion("tbs.GUID_ <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThan(String value) {
            addCriterion("tbs.GUID_ >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.GUID_ >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThan(String value) {
            addCriterion("tbs.GUID_ <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThanOrEqualTo(String value) {
            addCriterion("tbs.GUID_ <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidIn(List<String> values) {
            addCriterion("tbs.GUID_ in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotIn(List<String> values) {
            addCriterion("tbs.GUID_ not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLike(String value) {
            addCriterion("tbs.GUID_ like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotLike(String value) {
            addCriterion("tbs.GUID_ not like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidBetween(Integer value1, Integer value2) {
            addCriterion("tbs.GUID_ between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.GUID_ not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andnameIsNull() {
            addCriterion("tbs.NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andnameIsNotNull() {
            addCriterion("tbs.NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andnameEqualTo(String value) {
            addCriterion("tbs.NAME_ =", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotEqualTo(String value) {
            addCriterion("tbs.NAME_ <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameGreaterThan(String value) {
            addCriterion("tbs.NAME_ >", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.NAME_ >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameLessThan(String value) {
            addCriterion("tbs.NAME_ <", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameLessThanOrEqualTo(String value) {
            addCriterion("tbs.NAME_ <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameIn(List<String> values) {
            addCriterion("tbs.NAME_ in", values, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotIn(List<String> values) {
            addCriterion("tbs.NAME_ not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andnameLike(String value) {
            addCriterion("tbs.NAME_ like", "%" + value + "%", "name");
            return (Criteria) this;
        }

        public Criteria andnameNotLike(String value) {
            addCriterion("tbs.NAME_ not like", "%" + value + "%", "name");
            return (Criteria) this;
        }

        public Criteria andnameBetween(Integer value1, Integer value2) {
            addCriterion("tbs.NAME_ between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.NAME_ not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andshortNameIsNull() {
            addCriterion("tbs.SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andshortNameIsNotNull() {
            addCriterion("tbs.SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andshortNameEqualTo(String value) {
            addCriterion("tbs.SHORT_NAME =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameNotEqualTo(String value) {
            addCriterion("tbs.SHORT_NAME <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameGreaterThan(String value) {
            addCriterion("tbs.SHORT_NAME >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.SHORT_NAME >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameLessThan(String value) {
            addCriterion("tbs.SHORT_NAME <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameLessThanOrEqualTo(String value) {
            addCriterion("tbs.SHORT_NAME <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameIn(List<String> values) {
            addCriterion("tbs.SHORT_NAME in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameNotIn(List<String> values) {
            addCriterion("tbs.SHORT_NAME not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameLike(String value) {
            addCriterion("tbs.SHORT_NAME like", "%" + value + "%", "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameNotLike(String value) {
            addCriterion("tbs.SHORT_NAME not like", "%" + value + "%", "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameBetween(Integer value1, Integer value2) {
            addCriterion("tbs.SHORT_NAME between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andshortNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.SHORT_NAME not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andcodeIsNull() {
            addCriterion("tbs.CODE_ is null");
            return (Criteria) this;
        }

        public Criteria andcodeIsNotNull() {
            addCriterion("tbs.CODE_ is not null");
            return (Criteria) this;
        }

        public Criteria andcodeEqualTo(String value) {
            addCriterion("tbs.CODE_ =", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeNotEqualTo(String value) {
            addCriterion("tbs.CODE_ <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeGreaterThan(String value) {
            addCriterion("tbs.CODE_ >", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.CODE_ >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeLessThan(String value) {
            addCriterion("tbs.CODE_ <", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeLessThanOrEqualTo(String value) {
            addCriterion("tbs.CODE_ <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeIn(List<String> values) {
            addCriterion("tbs.CODE_ in", values, "code");
            return (Criteria) this;
        }

        public Criteria andcodeNotIn(List<String> values) {
            addCriterion("tbs.CODE_ not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andcodeLike(String value) {
            addCriterion("tbs.CODE_ like", "%" + value + "%", "code");
            return (Criteria) this;
        }

        public Criteria andcodeNotLike(String value) {
            addCriterion("tbs.CODE_ not like", "%" + value + "%", "code");
            return (Criteria) this;
        }

        public Criteria andcodeBetween(Integer value1, Integer value2) {
            addCriterion("tbs.CODE_ between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.CODE_ not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andrefCodeIsNull() {
            addCriterion("tbs.REF_CODE is null");
            return (Criteria) this;
        }

        public Criteria andrefCodeIsNotNull() {
            addCriterion("tbs.REF_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andrefCodeEqualTo(String value) {
            addCriterion("tbs.REF_CODE =", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeNotEqualTo(String value) {
            addCriterion("tbs.REF_CODE <>", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeGreaterThan(String value) {
            addCriterion("tbs.REF_CODE >", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.REF_CODE >=", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeLessThan(String value) {
            addCriterion("tbs.REF_CODE <", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeLessThanOrEqualTo(String value) {
            addCriterion("tbs.REF_CODE <=", value, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeIn(List<String> values) {
            addCriterion("tbs.REF_CODE in", values, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeNotIn(List<String> values) {
            addCriterion("tbs.REF_CODE not in", values, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeLike(String value) {
            addCriterion("tbs.REF_CODE like", "%" + value + "%", "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeNotLike(String value) {
            addCriterion("tbs.REF_CODE not like", "%" + value + "%", "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeBetween(Integer value1, Integer value2) {
            addCriterion("tbs.REF_CODE between", value1, value2, "refCode");
            return (Criteria) this;
        }

        public Criteria andrefCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.REF_CODE not between", value1, value2, "refCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeIsNull() {
            addCriterion("tbs.INDUSTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andindustryCodeIsNotNull() {
            addCriterion("tbs.INDUSTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andindustryCodeEqualTo(String value) {
            addCriterion("tbs.INDUSTRY_CODE =", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeNotEqualTo(String value) {
            addCriterion("tbs.INDUSTRY_CODE <>", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeGreaterThan(String value) {
            addCriterion("tbs.INDUSTRY_CODE >", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.INDUSTRY_CODE >=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeLessThan(String value) {
            addCriterion("tbs.INDUSTRY_CODE <", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeLessThanOrEqualTo(String value) {
            addCriterion("tbs.INDUSTRY_CODE <=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeIn(List<String> values) {
            addCriterion("tbs.INDUSTRY_CODE in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeNotIn(List<String> values) {
            addCriterion("tbs.INDUSTRY_CODE not in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeLike(String value) {
            addCriterion("tbs.INDUSTRY_CODE like", "%" + value + "%", "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeNotLike(String value) {
            addCriterion("tbs.INDUSTRY_CODE not like", "%" + value + "%", "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeBetween(Integer value1, Integer value2) {
            addCriterion("tbs.INDUSTRY_CODE between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.INDUSTRY_CODE not between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryNameIsNull() {
            addCriterion("tbs.INDUSTRY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andindustryNameIsNotNull() {
            addCriterion("tbs.INDUSTRY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andindustryNameEqualTo(String value) {
            addCriterion("tbs.INDUSTRY_NAME =", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameNotEqualTo(String value) {
            addCriterion("tbs.INDUSTRY_NAME <>", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameGreaterThan(String value) {
            addCriterion("tbs.INDUSTRY_NAME >", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.INDUSTRY_NAME >=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameLessThan(String value) {
            addCriterion("tbs.INDUSTRY_NAME <", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameLessThanOrEqualTo(String value) {
            addCriterion("tbs.INDUSTRY_NAME <=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameIn(List<String> values) {
            addCriterion("tbs.INDUSTRY_NAME in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameNotIn(List<String> values) {
            addCriterion("tbs.INDUSTRY_NAME not in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameLike(String value) {
            addCriterion("tbs.INDUSTRY_NAME like", "%" + value + "%", "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameNotLike(String value) {
            addCriterion("tbs.INDUSTRY_NAME not like", "%" + value + "%", "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameBetween(Integer value1, Integer value2) {
            addCriterion("tbs.INDUSTRY_NAME between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.INDUSTRY_NAME not between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andareaIdIsNull() {
            addCriterion("tbs.AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andareaIdIsNotNull() {
            addCriterion("tbs.AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andareaIdEqualTo(String value) {
            addCriterion("tbs.AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdNotEqualTo(String value) {
            addCriterion("tbs.AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdGreaterThan(String value) {
            addCriterion("tbs.AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdLessThan(String value) {
            addCriterion("tbs.AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdLessThanOrEqualTo(String value) {
            addCriterion("tbs.AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdIn(List<String> values) {
            addCriterion("tbs.AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdNotIn(List<String> values) {
            addCriterion("tbs.AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdLike(String value) {
            addCriterion("tbs.AREA_ID like", "%" + value + "%", "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdNotLike(String value) {
            addCriterion("tbs.AREA_ID not like", "%" + value + "%", "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdBetween(Integer value1, Integer value2) {
            addCriterion("tbs.AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andareaCodeIsNull() {
            addCriterion("tbs.AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andareaCodeIsNotNull() {
            addCriterion("tbs.AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andareaCodeEqualTo(String value) {
            addCriterion("tbs.AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeNotEqualTo(String value) {
            addCriterion("tbs.AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeGreaterThan(String value) {
            addCriterion("tbs.AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeLessThan(String value) {
            addCriterion("tbs.AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeLessThanOrEqualTo(String value) {
            addCriterion("tbs.AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeIn(List<String> values) {
            addCriterion("tbs.AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeNotIn(List<String> values) {
            addCriterion("tbs.AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeLike(String value) {
            addCriterion("tbs.AREA_CODE like", "%" + value + "%", "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeNotLike(String value) {
            addCriterion("tbs.AREA_CODE not like", "%" + value + "%", "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeBetween(Integer value1, Integer value2) {
            addCriterion("tbs.AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaNameIsNull() {
            addCriterion("tbs.AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andareaNameIsNotNull() {
            addCriterion("tbs.AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andareaNameEqualTo(String value) {
            addCriterion("tbs.AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameNotEqualTo(String value) {
            addCriterion("tbs.AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameGreaterThan(String value) {
            addCriterion("tbs.AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameLessThan(String value) {
            addCriterion("tbs.AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameLessThanOrEqualTo(String value) {
            addCriterion("tbs.AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameIn(List<String> values) {
            addCriterion("tbs.AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameNotIn(List<String> values) {
            addCriterion("tbs.AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameLike(String value) {
            addCriterion("tbs.AREA_NAME like", "%" + value + "%", "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameNotLike(String value) {
            addCriterion("tbs.AREA_NAME not like", "%" + value + "%", "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameBetween(Integer value1, Integer value2) {
            addCriterion("tbs.AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIsNull() {
            addCriterion("tbs.COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIsNotNull() {
            addCriterion("tbs.COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andcompanyIdEqualTo(String value) {
            addCriterion("tbs.COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotEqualTo(String value) {
            addCriterion("tbs.COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdGreaterThan(String value) {
            addCriterion("tbs.COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLessThan(String value) {
            addCriterion("tbs.COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLessThanOrEqualTo(String value) {
            addCriterion("tbs.COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIn(List<String> values) {
            addCriterion("tbs.COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotIn(List<String> values) {
            addCriterion("tbs.COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLike(String value) {
            addCriterion("tbs.COMPANY_ID like", "%" + value + "%", "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotLike(String value) {
            addCriterion("tbs.COMPANY_ID not like", "%" + value + "%", "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("tbs.COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andaddressIsNull() {
            addCriterion("tbs.ADDRESS_ is null");
            return (Criteria) this;
        }

        public Criteria andaddressIsNotNull() {
            addCriterion("tbs.ADDRESS_ is not null");
            return (Criteria) this;
        }

        public Criteria andaddressEqualTo(String value) {
            addCriterion("tbs.ADDRESS_ =", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotEqualTo(String value) {
            addCriterion("tbs.ADDRESS_ <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressGreaterThan(String value) {
            addCriterion("tbs.ADDRESS_ >", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.ADDRESS_ >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLessThan(String value) {
            addCriterion("tbs.ADDRESS_ <", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLessThanOrEqualTo(String value) {
            addCriterion("tbs.ADDRESS_ <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressIn(List<String> values) {
            addCriterion("tbs.ADDRESS_ in", values, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotIn(List<String> values) {
            addCriterion("tbs.ADDRESS_ not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLike(String value) {
            addCriterion("tbs.ADDRESS_ like", "%" + value + "%", "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotLike(String value) {
            addCriterion("tbs.ADDRESS_ not like", "%" + value + "%", "address");
            return (Criteria) this;
        }

        public Criteria andaddressBetween(Integer value1, Integer value2) {
            addCriterion("tbs.ADDRESS_ between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.ADDRESS_ not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andlonIsNull() {
            addCriterion("tbs.LON is null");
            return (Criteria) this;
        }

        public Criteria andlonIsNotNull() {
            addCriterion("tbs.LON is not null");
            return (Criteria) this;
        }

        public Criteria andlonEqualTo(String value) {
            addCriterion("tbs.LON =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonNotEqualTo(String value) {
            addCriterion("tbs.LON <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonGreaterThan(String value) {
            addCriterion("tbs.LON >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.LON >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonLessThan(String value) {
            addCriterion("tbs.LON <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonLessThanOrEqualTo(String value) {
            addCriterion("tbs.LON <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonIn(List<String> values) {
            addCriterion("tbs.LON in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andlonNotIn(List<String> values) {
            addCriterion("tbs.LON not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andlonLike(String value) {
            addCriterion("tbs.LON like", "%" + value + "%", "lon");
            return (Criteria) this;
        }

        public Criteria andlonNotLike(String value) {
            addCriterion("tbs.LON not like", "%" + value + "%", "lon");
            return (Criteria) this;
        }

        public Criteria andlonBetween(Integer value1, Integer value2) {
            addCriterion("tbs.LON between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andlonNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.LON not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andlatIsNull() {
            addCriterion("tbs.LAT is null");
            return (Criteria) this;
        }

        public Criteria andlatIsNotNull() {
            addCriterion("tbs.LAT is not null");
            return (Criteria) this;
        }

        public Criteria andlatEqualTo(String value) {
            addCriterion("tbs.LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatNotEqualTo(String value) {
            addCriterion("tbs.LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatGreaterThan(String value) {
            addCriterion("tbs.LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatLessThan(String value) {
            addCriterion("tbs.LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatLessThanOrEqualTo(String value) {
            addCriterion("tbs.LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatIn(List<String> values) {
            addCriterion("tbs.LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andlatNotIn(List<String> values) {
            addCriterion("tbs.LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andlatLike(String value) {
            addCriterion("tbs.LAT like", "%" + value + "%", "lat");
            return (Criteria) this;
        }

        public Criteria andlatNotLike(String value) {
            addCriterion("tbs.LAT not like", "%" + value + "%", "lat");
            return (Criteria) this;
        }

        public Criteria andlatBetween(Integer value1, Integer value2) {
            addCriterion("tbs.LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andlatNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andpicturePathIsNull() {
            addCriterion("tbs.PICTURE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andpicturePathIsNotNull() {
            addCriterion("tbs.PICTURE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andpicturePathEqualTo(String value) {
            addCriterion("tbs.PICTURE_PATH =", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathNotEqualTo(String value) {
            addCriterion("tbs.PICTURE_PATH <>", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathGreaterThan(String value) {
            addCriterion("tbs.PICTURE_PATH >", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.PICTURE_PATH >=", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathLessThan(String value) {
            addCriterion("tbs.PICTURE_PATH <", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathLessThanOrEqualTo(String value) {
            addCriterion("tbs.PICTURE_PATH <=", value, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathIn(List<String> values) {
            addCriterion("tbs.PICTURE_PATH in", values, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathNotIn(List<String> values) {
            addCriterion("tbs.PICTURE_PATH not in", values, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathLike(String value) {
            addCriterion("tbs.PICTURE_PATH like", "%" + value + "%", "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathNotLike(String value) {
            addCriterion("tbs.PICTURE_PATH not like", "%" + value + "%", "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathBetween(Integer value1, Integer value2) {
            addCriterion("tbs.PICTURE_PATH between", value1, value2, "picturePath");
            return (Criteria) this;
        }

        public Criteria andpicturePathNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.PICTURE_PATH not between", value1, value2, "picturePath");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyIsNull() {
            addCriterion("tbs.MANAGEMENT_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyIsNotNull() {
            addCriterion("tbs.MANAGEMENT_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyEqualTo(String value) {
            addCriterion("tbs.MANAGEMENT_COMPANY =", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyNotEqualTo(String value) {
            addCriterion("tbs.MANAGEMENT_COMPANY <>", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyGreaterThan(String value) {
            addCriterion("tbs.MANAGEMENT_COMPANY >", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.MANAGEMENT_COMPANY >=", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyLessThan(String value) {
            addCriterion("tbs.MANAGEMENT_COMPANY <", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyLessThanOrEqualTo(String value) {
            addCriterion("tbs.MANAGEMENT_COMPANY <=", value, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyIn(List<String> values) {
            addCriterion("tbs.MANAGEMENT_COMPANY in", values, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyNotIn(List<String> values) {
            addCriterion("tbs.MANAGEMENT_COMPANY not in", values, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyLike(String value) {
            addCriterion("tbs.MANAGEMENT_COMPANY like", "%" + value + "%", "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyNotLike(String value) {
            addCriterion("tbs.MANAGEMENT_COMPANY not like", "%" + value + "%", "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyBetween(Integer value1, Integer value2) {
            addCriterion("tbs.MANAGEMENT_COMPANY between", value1, value2, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andmanagementCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.MANAGEMENT_COMPANY not between", value1, value2, "managementCompany");
            return (Criteria) this;
        }

        public Criteria andcompletedDateIsNull() {
            addCriterion("tbs.COMPLETED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andcompletedDateIsNotNull() {
            addCriterion("tbs.COMPLETED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andcompletedDateEqualTo(String value) {
            addCriterion("tbs.COMPLETED_DATE =", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateNotEqualTo(String value) {
            addCriterion("tbs.COMPLETED_DATE <>", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateGreaterThan(String value) {
            addCriterion("tbs.COMPLETED_DATE >", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.COMPLETED_DATE >=", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateLessThan(String value) {
            addCriterion("tbs.COMPLETED_DATE <", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateLessThanOrEqualTo(String value) {
            addCriterion("tbs.COMPLETED_DATE <=", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateIn(List<String> values) {
            addCriterion("tbs.COMPLETED_DATE in", values, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateNotIn(List<String> values) {
            addCriterion("tbs.COMPLETED_DATE not in", values, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateLike(String value) {
            addCriterion("tbs.COMPLETED_DATE like", "%" + value + "%", "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateNotLike(String value) {
            addCriterion("tbs.COMPLETED_DATE not like", "%" + value + "%", "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateBetween(Integer value1, Integer value2) {
            addCriterion("tbs.COMPLETED_DATE between", value1, value2, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcompletedDateNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.COMPLETED_DATE not between", value1, value2, "completedDate");
            return (Criteria) this;
        }

        public Criteria andcontactPersonIsNull() {
            addCriterion("tbs.CONTACT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andcontactPersonIsNotNull() {
            addCriterion("tbs.CONTACT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andcontactPersonEqualTo(String value) {
            addCriterion("tbs.CONTACT_PERSON =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonNotEqualTo(String value) {
            addCriterion("tbs.CONTACT_PERSON <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonGreaterThan(String value) {
            addCriterion("tbs.CONTACT_PERSON >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.CONTACT_PERSON >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonLessThan(String value) {
            addCriterion("tbs.CONTACT_PERSON <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonLessThanOrEqualTo(String value) {
            addCriterion("tbs.CONTACT_PERSON <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonIn(List<String> values) {
            addCriterion("tbs.CONTACT_PERSON in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonNotIn(List<String> values) {
            addCriterion("tbs.CONTACT_PERSON not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonLike(String value) {
            addCriterion("tbs.CONTACT_PERSON like", "%" + value + "%", "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonNotLike(String value) {
            addCriterion("tbs.CONTACT_PERSON not like", "%" + value + "%", "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonBetween(Integer value1, Integer value2) {
            addCriterion("tbs.CONTACT_PERSON between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.CONTACT_PERSON not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andcontactTelIsNull() {
            addCriterion("tbs.CONTACT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andcontactTelIsNotNull() {
            addCriterion("tbs.CONTACT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andcontactTelEqualTo(String value) {
            addCriterion("tbs.CONTACT_TEL =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelNotEqualTo(String value) {
            addCriterion("tbs.CONTACT_TEL <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelGreaterThan(String value) {
            addCriterion("tbs.CONTACT_TEL >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.CONTACT_TEL >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelLessThan(String value) {
            addCriterion("tbs.CONTACT_TEL <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelLessThanOrEqualTo(String value) {
            addCriterion("tbs.CONTACT_TEL <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelIn(List<String> values) {
            addCriterion("tbs.CONTACT_TEL in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelNotIn(List<String> values) {
            addCriterion("tbs.CONTACT_TEL not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelLike(String value) {
            addCriterion("tbs.CONTACT_TEL like", "%" + value + "%", "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelNotLike(String value) {
            addCriterion("tbs.CONTACT_TEL not like", "%" + value + "%", "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelBetween(Integer value1, Integer value2) {
            addCriterion("tbs.CONTACT_TEL between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andcontactTelNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.CONTACT_TEL not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andrunstatusIsNull() {
            addCriterion("tbs.RUNSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andrunstatusIsNotNull() {
            addCriterion("tbs.RUNSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andrunstatusEqualTo(String value) {
            addCriterion("tbs.RUNSTATUS =", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusNotEqualTo(String value) {
            addCriterion("tbs.RUNSTATUS <>", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusGreaterThan(String value) {
            addCriterion("tbs.RUNSTATUS >", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.RUNSTATUS >=", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusLessThan(String value) {
            addCriterion("tbs.RUNSTATUS <", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusLessThanOrEqualTo(String value) {
            addCriterion("tbs.RUNSTATUS <=", value, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusIn(List<String> values) {
            addCriterion("tbs.RUNSTATUS in", values, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusNotIn(List<String> values) {
            addCriterion("tbs.RUNSTATUS not in", values, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusLike(String value) {
            addCriterion("tbs.RUNSTATUS like", "%" + value + "%", "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusNotLike(String value) {
            addCriterion("tbs.RUNSTATUS not like", "%" + value + "%", "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusBetween(Integer value1, Integer value2) {
            addCriterion("tbs.RUNSTATUS between", value1, value2, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.RUNSTATUS not between", value1, value2, "runstatus");
            return (Criteria) this;
        }

        public Criteria andrunDaysIsNull() {
            addCriterion("tbs.RUN_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andrunDaysIsNotNull() {
            addCriterion("tbs.RUN_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andrunDaysEqualTo(String value) {
            addCriterion("tbs.RUN_DAYS =", value, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysNotEqualTo(String value) {
            addCriterion("tbs.RUN_DAYS <>", value, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysGreaterThan(String value) {
            addCriterion("tbs.RUN_DAYS >", value, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.RUN_DAYS >=", value, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysLessThan(String value) {
            addCriterion("tbs.RUN_DAYS <", value, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysLessThanOrEqualTo(String value) {
            addCriterion("tbs.RUN_DAYS <=", value, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysIn(List<String> values) {
            addCriterion("tbs.RUN_DAYS in", values, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysNotIn(List<String> values) {
            addCriterion("tbs.RUN_DAYS not in", values, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysLike(String value) {
            addCriterion("tbs.RUN_DAYS like", "%" + value + "%", "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysNotLike(String value) {
            addCriterion("tbs.RUN_DAYS not like", "%" + value + "%", "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysBetween(Integer value1, Integer value2) {
            addCriterion("tbs.RUN_DAYS between", value1, value2, "runDays");
            return (Criteria) this;
        }

        public Criteria andrunDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.RUN_DAYS not between", value1, value2, "runDays");
            return (Criteria) this;
        }

        public Criteria andstatusIsNull() {
            addCriterion("tbs.STATUS_ is null");
            return (Criteria) this;
        }

        public Criteria andstatusIsNotNull() {
            addCriterion("tbs.STATUS_ is not null");
            return (Criteria) this;
        }

        public Criteria andstatusEqualTo(String value) {
            addCriterion("tbs.STATUS_ =", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotEqualTo(String value) {
            addCriterion("tbs.STATUS_ <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusGreaterThan(String value) {
            addCriterion("tbs.STATUS_ >", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tbs.STATUS_ >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLessThan(String value) {
            addCriterion("tbs.STATUS_ <", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLessThanOrEqualTo(String value) {
            addCriterion("tbs.STATUS_ <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusIn(List<String> values) {
            addCriterion("tbs.STATUS_ in", values, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotIn(List<String> values) {
            addCriterion("tbs.STATUS_ not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLike(String value) {
            addCriterion("tbs.STATUS_ like", "%" + value + "%", "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotLike(String value) {
            addCriterion("tbs.STATUS_ not like", "%" + value + "%", "status");
            return (Criteria) this;
        }

        public Criteria andstatusBetween(Integer value1, Integer value2) {
            addCriterion("tbs.STATUS_ between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tbs.STATUS_ not between", value1, value2, "status");
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
        protected Criterion() {
            super();
        }

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