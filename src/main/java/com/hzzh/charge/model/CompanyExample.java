package com.hzzh.charge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：tb_sys_company表的查询条件类CompanyExample
 * 内容摘要：tb_sys_company表的各个元素的查询条件
 * @author 工具生成
 * @version 1.0 2016年11月28日
 */
public class CompanyExample {

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

    public CompanyExample() {
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
            addCriterion("tsc.GUID_ is null");
            return (Criteria) this;
        }

        public Criteria andguidIsNotNull() {
            addCriterion("tsc.GUID_ is not null");
            return (Criteria) this;
        }

        public Criteria andguidEqualTo(String value) {
            addCriterion("tsc.GUID_ =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotEqualTo(String value) {
            addCriterion("tsc.GUID_ <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThan(String value) {
            addCriterion("tsc.GUID_ >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.GUID_ >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThan(String value) {
            addCriterion("tsc.GUID_ <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThanOrEqualTo(String value) {
            addCriterion("tsc.GUID_ <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidIn(List<String> values) {
            addCriterion("tsc.GUID_ in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotIn(List<String> values) {
            addCriterion("tsc.GUID_ not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLike(String value) {
            addCriterion("tsc.GUID_ like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotLike(String value) {
            addCriterion("tsc.GUID_ not like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidBetween(Integer value1, Integer value2) {
            addCriterion("tsc.GUID_ between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.GUID_ not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andnameIsNull() {
            addCriterion("tsc.NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andnameIsNotNull() {
            addCriterion("tsc.NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andnameEqualTo(String value) {
            addCriterion("tsc.NAME_ =", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotEqualTo(String value) {
            addCriterion("tsc.NAME_ <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameGreaterThan(String value) {
            addCriterion("tsc.NAME_ >", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.NAME_ >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameLessThan(String value) {
            addCriterion("tsc.NAME_ <", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameLessThanOrEqualTo(String value) {
            addCriterion("tsc.NAME_ <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameIn(List<String> values) {
            addCriterion("tsc.NAME_ in", values, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotIn(List<String> values) {
            addCriterion("tsc.NAME_ not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andnameLike(String value) {
            addCriterion("tsc.NAME_ like", "%" + value + "%", "name");
            return (Criteria) this;
        }

        public Criteria andnameNotLike(String value) {
            addCriterion("tsc.NAME_ not like", "%" + value + "%", "name");
            return (Criteria) this;
        }

        public Criteria andnameBetween(Integer value1, Integer value2) {
            addCriterion("tsc.NAME_ between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.NAME_ not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andfullNameIsNull() {
            addCriterion("tsc.FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andfullNameIsNotNull() {
            addCriterion("tsc.FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andfullNameEqualTo(String value) {
            addCriterion("tsc.FULL_NAME =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameNotEqualTo(String value) {
            addCriterion("tsc.FULL_NAME <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameGreaterThan(String value) {
            addCriterion("tsc.FULL_NAME >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.FULL_NAME >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameLessThan(String value) {
            addCriterion("tsc.FULL_NAME <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameLessThanOrEqualTo(String value) {
            addCriterion("tsc.FULL_NAME <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameIn(List<String> values) {
            addCriterion("tsc.FULL_NAME in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameNotIn(List<String> values) {
            addCriterion("tsc.FULL_NAME not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameLike(String value) {
            addCriterion("tsc.FULL_NAME like", "%" + value + "%", "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameNotLike(String value) {
            addCriterion("tsc.FULL_NAME not like", "%" + value + "%", "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameBetween(Integer value1, Integer value2) {
            addCriterion("tsc.FULL_NAME between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andfullNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.FULL_NAME not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andindustryCodeIsNull() {
            addCriterion("tsc.INDUSTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andindustryCodeIsNotNull() {
            addCriterion("tsc.INDUSTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andindustryCodeEqualTo(String value) {
            addCriterion("tsc.INDUSTRY_CODE =", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeNotEqualTo(String value) {
            addCriterion("tsc.INDUSTRY_CODE <>", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeGreaterThan(String value) {
            addCriterion("tsc.INDUSTRY_CODE >", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.INDUSTRY_CODE >=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeLessThan(String value) {
            addCriterion("tsc.INDUSTRY_CODE <", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeLessThanOrEqualTo(String value) {
            addCriterion("tsc.INDUSTRY_CODE <=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeIn(List<String> values) {
            addCriterion("tsc.INDUSTRY_CODE in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeNotIn(List<String> values) {
            addCriterion("tsc.INDUSTRY_CODE not in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeLike(String value) {
            addCriterion("tsc.INDUSTRY_CODE like", "%" + value + "%", "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeNotLike(String value) {
            addCriterion("tsc.INDUSTRY_CODE not like", "%" + value + "%", "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeBetween(Integer value1, Integer value2) {
            addCriterion("tsc.INDUSTRY_CODE between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.INDUSTRY_CODE not between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andindustryNameIsNull() {
            addCriterion("tsc.INDUSTRY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andindustryNameIsNotNull() {
            addCriterion("tsc.INDUSTRY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andindustryNameEqualTo(String value) {
            addCriterion("tsc.INDUSTRY_NAME =", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameNotEqualTo(String value) {
            addCriterion("tsc.INDUSTRY_NAME <>", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameGreaterThan(String value) {
            addCriterion("tsc.INDUSTRY_NAME >", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.INDUSTRY_NAME >=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameLessThan(String value) {
            addCriterion("tsc.INDUSTRY_NAME <", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameLessThanOrEqualTo(String value) {
            addCriterion("tsc.INDUSTRY_NAME <=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameIn(List<String> values) {
            addCriterion("tsc.INDUSTRY_NAME in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameNotIn(List<String> values) {
            addCriterion("tsc.INDUSTRY_NAME not in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameLike(String value) {
            addCriterion("tsc.INDUSTRY_NAME like", "%" + value + "%", "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameNotLike(String value) {
            addCriterion("tsc.INDUSTRY_NAME not like", "%" + value + "%", "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameBetween(Integer value1, Integer value2) {
            addCriterion("tsc.INDUSTRY_NAME between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andindustryNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.INDUSTRY_NAME not between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andportalIdIsNull() {
            addCriterion("tsc.PORTAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andportalIdIsNotNull() {
            addCriterion("tsc.PORTAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andportalIdEqualTo(String value) {
            addCriterion("tsc.PORTAL_ID =", value, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdNotEqualTo(String value) {
            addCriterion("tsc.PORTAL_ID <>", value, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdGreaterThan(String value) {
            addCriterion("tsc.PORTAL_ID >", value, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.PORTAL_ID >=", value, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdLessThan(String value) {
            addCriterion("tsc.PORTAL_ID <", value, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdLessThanOrEqualTo(String value) {
            addCriterion("tsc.PORTAL_ID <=", value, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdIn(List<String> values) {
            addCriterion("tsc.PORTAL_ID in", values, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdNotIn(List<String> values) {
            addCriterion("tsc.PORTAL_ID not in", values, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdLike(String value) {
            addCriterion("tsc.PORTAL_ID like", "%" + value + "%", "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdNotLike(String value) {
            addCriterion("tsc.PORTAL_ID not like", "%" + value + "%", "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdBetween(Integer value1, Integer value2) {
            addCriterion("tsc.PORTAL_ID between", value1, value2, "portalId");
            return (Criteria) this;
        }

        public Criteria andportalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.PORTAL_ID not between", value1, value2, "portalId");
            return (Criteria) this;
        }

        public Criteria andstatusIsNull() {
            addCriterion("tsc.STATUS_ is null");
            return (Criteria) this;
        }

        public Criteria andstatusIsNotNull() {
            addCriterion("tsc.STATUS_ is not null");
            return (Criteria) this;
        }

        public Criteria andstatusEqualTo(String value) {
            addCriterion("tsc.STATUS_ =", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotEqualTo(String value) {
            addCriterion("tsc.STATUS_ <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusGreaterThan(String value) {
            addCriterion("tsc.STATUS_ >", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.STATUS_ >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLessThan(String value) {
            addCriterion("tsc.STATUS_ <", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLessThanOrEqualTo(String value) {
            addCriterion("tsc.STATUS_ <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusIn(List<String> values) {
            addCriterion("tsc.STATUS_ in", values, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotIn(List<String> values) {
            addCriterion("tsc.STATUS_ not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLike(String value) {
            addCriterion("tsc.STATUS_ like", "%" + value + "%", "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotLike(String value) {
            addCriterion("tsc.STATUS_ not like", "%" + value + "%", "status");
            return (Criteria) this;
        }

        public Criteria andstatusBetween(Integer value1, Integer value2) {
            addCriterion("tsc.STATUS_ between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.STATUS_ not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andlogoPathIsNull() {
            addCriterion("tsc.LOGO_PATH is null");
            return (Criteria) this;
        }

        public Criteria andlogoPathIsNotNull() {
            addCriterion("tsc.LOGO_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andlogoPathEqualTo(String value) {
            addCriterion("tsc.LOGO_PATH =", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathNotEqualTo(String value) {
            addCriterion("tsc.LOGO_PATH <>", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathGreaterThan(String value) {
            addCriterion("tsc.LOGO_PATH >", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.LOGO_PATH >=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathLessThan(String value) {
            addCriterion("tsc.LOGO_PATH <", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathLessThanOrEqualTo(String value) {
            addCriterion("tsc.LOGO_PATH <=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathIn(List<String> values) {
            addCriterion("tsc.LOGO_PATH in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathNotIn(List<String> values) {
            addCriterion("tsc.LOGO_PATH not in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathLike(String value) {
            addCriterion("tsc.LOGO_PATH like", "%" + value + "%", "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathNotLike(String value) {
            addCriterion("tsc.LOGO_PATH not like", "%" + value + "%", "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathBetween(Integer value1, Integer value2) {
            addCriterion("tsc.LOGO_PATH between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andlogoPathNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.LOGO_PATH not between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria anduserTypeIsNull() {
            addCriterion("tsc.USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria anduserTypeIsNotNull() {
            addCriterion("tsc.USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria anduserTypeEqualTo(String value) {
            addCriterion("tsc.USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeNotEqualTo(String value) {
            addCriterion("tsc.USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeGreaterThan(String value) {
            addCriterion("tsc.USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeLessThan(String value) {
            addCriterion("tsc.USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeLessThanOrEqualTo(String value) {
            addCriterion("tsc.USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeIn(List<String> values) {
            addCriterion("tsc.USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeNotIn(List<String> values) {
            addCriterion("tsc.USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeLike(String value) {
            addCriterion("tsc.USER_TYPE like", "%" + value + "%", "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeNotLike(String value) {
            addCriterion("tsc.USER_TYPE not like", "%" + value + "%", "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeBetween(Integer value1, Integer value2) {
            addCriterion("tsc.USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria anduserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andareaCodeIsNull() {
            addCriterion("tsc.AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andareaCodeIsNotNull() {
            addCriterion("tsc.AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andareaCodeEqualTo(String value) {
            addCriterion("tsc.AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeNotEqualTo(String value) {
            addCriterion("tsc.AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeGreaterThan(String value) {
            addCriterion("tsc.AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeLessThan(String value) {
            addCriterion("tsc.AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeLessThanOrEqualTo(String value) {
            addCriterion("tsc.AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeIn(List<String> values) {
            addCriterion("tsc.AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeNotIn(List<String> values) {
            addCriterion("tsc.AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeLike(String value) {
            addCriterion("tsc.AREA_CODE like", "%" + value + "%", "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeNotLike(String value) {
            addCriterion("tsc.AREA_CODE not like", "%" + value + "%", "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeBetween(Integer value1, Integer value2) {
            addCriterion("tsc.AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andareaNameIsNull() {
            addCriterion("tsc.AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andareaNameIsNotNull() {
            addCriterion("tsc.AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andareaNameEqualTo(String value) {
            addCriterion("tsc.AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameNotEqualTo(String value) {
            addCriterion("tsc.AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameGreaterThan(String value) {
            addCriterion("tsc.AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameLessThan(String value) {
            addCriterion("tsc.AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameLessThanOrEqualTo(String value) {
            addCriterion("tsc.AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameIn(List<String> values) {
            addCriterion("tsc.AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameNotIn(List<String> values) {
            addCriterion("tsc.AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameLike(String value) {
            addCriterion("tsc.AREA_NAME like", "%" + value + "%", "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameNotLike(String value) {
            addCriterion("tsc.AREA_NAME not like", "%" + value + "%", "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameBetween(Integer value1, Integer value2) {
            addCriterion("tsc.AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andareaNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.AREA_NAME not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andaddressIsNull() {
            addCriterion("tsc.ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andaddressIsNotNull() {
            addCriterion("tsc.ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andaddressEqualTo(String value) {
            addCriterion("tsc.ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotEqualTo(String value) {
            addCriterion("tsc.ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressGreaterThan(String value) {
            addCriterion("tsc.ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressGreaterThanOrEqualTo(String value) {
            addCriterion("tsc.ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLessThan(String value) {
            addCriterion("tsc.ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLessThanOrEqualTo(String value) {
            addCriterion("tsc.ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressIn(List<String> values) {
            addCriterion("tsc.ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotIn(List<String> values) {
            addCriterion("tsc.ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLike(String value) {
            addCriterion("tsc.ADDRESS like", "%" + value + "%", "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotLike(String value) {
            addCriterion("tsc.ADDRESS not like", "%" + value + "%", "address");
            return (Criteria) this;
        }

        public Criteria andaddressBetween(Integer value1, Integer value2) {
            addCriterion("tsc.ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotBetween(Integer value1, Integer value2) {
            addCriterion("tsc.ADDRESS not between", value1, value2, "address");
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