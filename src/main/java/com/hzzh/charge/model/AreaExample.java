package com.hzzh.charge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：tb_sys_area表的查询条件类AreaExample
 * 内容摘要：tb_sys_area表的各个元素的查询条件
 * @author 工具生成
 * @version 1.0 2016年10月24日
 */
public class AreaExample {

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

    public AreaExample() {
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
            addCriterion("tsa.GUID_ is null");
            return (Criteria) this;
        }

        public Criteria andguidIsNotNull() {
            addCriterion("tsa.GUID_ is not null");
            return (Criteria) this;
        }

        public Criteria andguidEqualTo(String value) {
            addCriterion("tsa.GUID_ =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotEqualTo(String value) {
            addCriterion("tsa.GUID_ <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThan(String value) {
            addCriterion("tsa.GUID_ >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThanOrEqualTo(String value) {
            addCriterion("tsa.GUID_ >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThan(String value) {
            addCriterion("tsa.GUID_ <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThanOrEqualTo(String value) {
            addCriterion("tsa.GUID_ <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidIn(List<String> values) {
            addCriterion("tsa.GUID_ in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotIn(List<String> values) {
            addCriterion("tsa.GUID_ not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLike(String value) {
            addCriterion("tsa.GUID_ like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotLike(String value) {
            addCriterion("tsa.GUID_ not like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidBetween(Integer value1, Integer value2) {
            addCriterion("tsa.GUID_ between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotBetween(Integer value1, Integer value2) {
            addCriterion("tsa.GUID_ not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andnameIsNull() {
            addCriterion("tsa.NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andnameIsNotNull() {
            addCriterion("tsa.NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andnameEqualTo(String value) {
            addCriterion("tsa.NAME_ =", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotEqualTo(String value) {
            addCriterion("tsa.NAME_ <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameGreaterThan(String value) {
            addCriterion("tsa.NAME_ >", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameGreaterThanOrEqualTo(String value) {
            addCriterion("tsa.NAME_ >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameLessThan(String value) {
            addCriterion("tsa.NAME_ <", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameLessThanOrEqualTo(String value) {
            addCriterion("tsa.NAME_ <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andnameIn(List<String> values) {
            addCriterion("tsa.NAME_ in", values, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotIn(List<String> values) {
            addCriterion("tsa.NAME_ not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andnameLike(String value) {
            addCriterion("tsa.NAME_ like", "%" + value + "%", "name");
            return (Criteria) this;
        }

        public Criteria andnameNotLike(String value) {
            addCriterion("tsa.NAME_ not like", "%" + value + "%", "name");
            return (Criteria) this;
        }

        public Criteria andnameBetween(Integer value1, Integer value2) {
            addCriterion("tsa.NAME_ between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andnameNotBetween(Integer value1, Integer value2) {
            addCriterion("tsa.NAME_ not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andcodeIsNull() {
            addCriterion("tsa.CODE_ is null");
            return (Criteria) this;
        }

        public Criteria andcodeIsNotNull() {
            addCriterion("tsa.CODE_ is not null");
            return (Criteria) this;
        }

        public Criteria andcodeEqualTo(String value) {
            addCriterion("tsa.CODE_ =", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeNotEqualTo(String value) {
            addCriterion("tsa.CODE_ <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeGreaterThan(String value) {
            addCriterion("tsa.CODE_ >", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tsa.CODE_ >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeLessThan(String value) {
            addCriterion("tsa.CODE_ <", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeLessThanOrEqualTo(String value) {
            addCriterion("tsa.CODE_ <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andcodeIn(List<String> values) {
            addCriterion("tsa.CODE_ in", values, "code");
            return (Criteria) this;
        }

        public Criteria andcodeNotIn(List<String> values) {
            addCriterion("tsa.CODE_ not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andcodeLike(String value) {
            addCriterion("tsa.CODE_ like", "%" + value + "%", "code");
            return (Criteria) this;
        }

        public Criteria andcodeNotLike(String value) {
            addCriterion("tsa.CODE_ not like", "%" + value + "%", "code");
            return (Criteria) this;
        }

        public Criteria andcodeBetween(Integer value1, Integer value2) {
            addCriterion("tsa.CODE_ between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tsa.CODE_ not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andparentCodeIsNull() {
            addCriterion("tsa.PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andparentCodeIsNotNull() {
            addCriterion("tsa.PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andparentCodeEqualTo(String value) {
            addCriterion("tsa.PARENT_CODE =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeNotEqualTo(String value) {
            addCriterion("tsa.PARENT_CODE <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeGreaterThan(String value) {
            addCriterion("tsa.PARENT_CODE >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tsa.PARENT_CODE >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeLessThan(String value) {
            addCriterion("tsa.PARENT_CODE <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeLessThanOrEqualTo(String value) {
            addCriterion("tsa.PARENT_CODE <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeIn(List<String> values) {
            addCriterion("tsa.PARENT_CODE in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeNotIn(List<String> values) {
            addCriterion("tsa.PARENT_CODE not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeLike(String value) {
            addCriterion("tsa.PARENT_CODE like", "%" + value + "%", "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeNotLike(String value) {
            addCriterion("tsa.PARENT_CODE not like", "%" + value + "%", "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeBetween(Integer value1, Integer value2) {
            addCriterion("tsa.PARENT_CODE between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andparentCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tsa.PARENT_CODE not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andeCodeIsNull() {
            addCriterion("tsa.E_CODE is null");
            return (Criteria) this;
        }

        public Criteria andeCodeIsNotNull() {
            addCriterion("tsa.E_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andeCodeEqualTo(String value) {
            addCriterion("tsa.E_CODE =", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeNotEqualTo(String value) {
            addCriterion("tsa.E_CODE <>", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeGreaterThan(String value) {
            addCriterion("tsa.E_CODE >", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tsa.E_CODE >=", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeLessThan(String value) {
            addCriterion("tsa.E_CODE <", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeLessThanOrEqualTo(String value) {
            addCriterion("tsa.E_CODE <=", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeIn(List<String> values) {
            addCriterion("tsa.E_CODE in", values, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeNotIn(List<String> values) {
            addCriterion("tsa.E_CODE not in", values, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeLike(String value) {
            addCriterion("tsa.E_CODE like", "%" + value + "%", "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeNotLike(String value) {
            addCriterion("tsa.E_CODE not like", "%" + value + "%", "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeBetween(Integer value1, Integer value2) {
            addCriterion("tsa.E_CODE between", value1, value2, "eCode");
            return (Criteria) this;
        }

        public Criteria andeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("tsa.E_CODE not between", value1, value2, "eCode");
            return (Criteria) this;
        }

        public Criteria andstatusIsNull() {
            addCriterion("tsa.STATUS_ is null");
            return (Criteria) this;
        }

        public Criteria andstatusIsNotNull() {
            addCriterion("tsa.STATUS_ is not null");
            return (Criteria) this;
        }

        public Criteria andstatusEqualTo(String value) {
            addCriterion("tsa.STATUS_ =", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotEqualTo(String value) {
            addCriterion("tsa.STATUS_ <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusGreaterThan(String value) {
            addCriterion("tsa.STATUS_ >", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tsa.STATUS_ >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLessThan(String value) {
            addCriterion("tsa.STATUS_ <", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLessThanOrEqualTo(String value) {
            addCriterion("tsa.STATUS_ <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusIn(List<String> values) {
            addCriterion("tsa.STATUS_ in", values, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotIn(List<String> values) {
            addCriterion("tsa.STATUS_ not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLike(String value) {
            addCriterion("tsa.STATUS_ like", "%" + value + "%", "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotLike(String value) {
            addCriterion("tsa.STATUS_ not like", "%" + value + "%", "status");
            return (Criteria) this;
        }

        public Criteria andstatusBetween(Integer value1, Integer value2) {
            addCriterion("tsa.STATUS_ between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tsa.STATUS_ not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andlonIsNull() {
            addCriterion("tsa.LON is null");
            return (Criteria) this;
        }

        public Criteria andlonIsNotNull() {
            addCriterion("tsa.LON is not null");
            return (Criteria) this;
        }

        public Criteria andlonEqualTo(String value) {
            addCriterion("tsa.LON =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonNotEqualTo(String value) {
            addCriterion("tsa.LON <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonGreaterThan(String value) {
            addCriterion("tsa.LON >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonGreaterThanOrEqualTo(String value) {
            addCriterion("tsa.LON >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonLessThan(String value) {
            addCriterion("tsa.LON <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonLessThanOrEqualTo(String value) {
            addCriterion("tsa.LON <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andlonIn(List<String> values) {
            addCriterion("tsa.LON in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andlonNotIn(List<String> values) {
            addCriterion("tsa.LON not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andlonLike(String value) {
            addCriterion("tsa.LON like", "%" + value + "%", "lon");
            return (Criteria) this;
        }

        public Criteria andlonNotLike(String value) {
            addCriterion("tsa.LON not like", "%" + value + "%", "lon");
            return (Criteria) this;
        }

        public Criteria andlonBetween(Integer value1, Integer value2) {
            addCriterion("tsa.LON between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andlonNotBetween(Integer value1, Integer value2) {
            addCriterion("tsa.LON not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andlatIsNull() {
            addCriterion("tsa.LAT is null");
            return (Criteria) this;
        }

        public Criteria andlatIsNotNull() {
            addCriterion("tsa.LAT is not null");
            return (Criteria) this;
        }

        public Criteria andlatEqualTo(String value) {
            addCriterion("tsa.LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatNotEqualTo(String value) {
            addCriterion("tsa.LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatGreaterThan(String value) {
            addCriterion("tsa.LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatGreaterThanOrEqualTo(String value) {
            addCriterion("tsa.LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatLessThan(String value) {
            addCriterion("tsa.LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatLessThanOrEqualTo(String value) {
            addCriterion("tsa.LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andlatIn(List<String> values) {
            addCriterion("tsa.LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andlatNotIn(List<String> values) {
            addCriterion("tsa.LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andlatLike(String value) {
            addCriterion("tsa.LAT like", "%" + value + "%", "lat");
            return (Criteria) this;
        }

        public Criteria andlatNotLike(String value) {
            addCriterion("tsa.LAT not like", "%" + value + "%", "lat");
            return (Criteria) this;
        }

        public Criteria andlatBetween(Integer value1, Integer value2) {
            addCriterion("tsa.LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andlatNotBetween(Integer value1, Integer value2) {
            addCriterion("tsa.LAT not between", value1, value2, "lat");
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