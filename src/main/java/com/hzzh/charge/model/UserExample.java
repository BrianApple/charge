package com.hzzh.charge.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * 类名称：user表的查询条件类UserExample
 * 内容摘要：user表的各个元素的查询条件
 * @author 工具生成
 * @version 1.0 2016年09月24日
 */
public class UserExample {

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

    public UserExample() {
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

        public Criteria andidIsNull() {
            addCriterion("u.id is null");
            return (Criteria) this;
        }

        public Criteria andidIsNotNull() {
            addCriterion("u.id is not null");
            return (Criteria) this;
        }

        public Criteria andidEqualTo(Integer value) {
            addCriterion("u.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andidNotEqualTo(Integer value) {
            addCriterion("u.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andidGreaterThan(Integer value) {
            addCriterion("u.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andidLessThan(Integer value) {
            addCriterion("u.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andidLessThanOrEqualTo(Integer value) {
            addCriterion("u.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andidIn(List<Integer> values) {
            addCriterion("u.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andidNotIn(List<Integer> values) {
            addCriterion("u.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andidLike(Integer value) {
            addCriterion("u.id like", "%" + value + "%", "id");
            return (Criteria) this;
        }

        public Criteria andidNotLike(Integer value) {
            addCriterion("u.id not like", "%" + value + "%", "id");
            return (Criteria) this;
        }

        public Criteria andidBetween(Integer value1, Integer value2) {
            addCriterion("u.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andidNotBetween(Integer value1, Integer value2) {
            addCriterion("u.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andusernameIsNull() {
            addCriterion("u.username is null");
            return (Criteria) this;
        }

        public Criteria andusernameIsNotNull() {
            addCriterion("u.username is not null");
            return (Criteria) this;
        }

        public Criteria andusernameEqualTo(String value) {
            addCriterion("u.username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andusernameNotEqualTo(String value) {
            addCriterion("u.username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andusernameGreaterThan(String value) {
            addCriterion("u.username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andusernameGreaterThanOrEqualTo(String value) {
            addCriterion("u.username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andusernameLessThan(String value) {
            addCriterion("u.username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andusernameLessThanOrEqualTo(String value) {
            addCriterion("u.username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andusernameIn(List<String> values) {
            addCriterion("u.username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andusernameNotIn(List<String> values) {
            addCriterion("u.username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andusernameLike(String value) {
            addCriterion("u.username like", "%" + value + "%", "username");
            return (Criteria) this;
        }

        public Criteria andusernameNotLike(String value) {
            addCriterion("u.username not like", "%" + value + "%", "username");
            return (Criteria) this;
        }

        public Criteria andusernameBetween(Integer value1, Integer value2) {
            addCriterion("u.username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andusernameNotBetween(Integer value1, Integer value2) {
            addCriterion("u.username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andbirthdayIsNull() {
            addCriterion("u.birthday is null");
            return (Criteria) this;
        }

        public Criteria andbirthdayIsNotNull() {
            addCriterion("u.birthday is not null");
            return (Criteria) this;
        }

        public Criteria andbirthdayEqualTo(Date value) {
            addCriterion("u.birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayNotEqualTo(Date value) {
            addCriterion("u.birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayGreaterThan(Date value) {
            addCriterion("u.birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("u.birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayLessThan(Date value) {
            addCriterion("u.birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayLessThanOrEqualTo(Date value) {
            addCriterion("u.birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayIn(List<Date> values) {
            addCriterion("u.birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayNotIn(List<Date> values) {
            addCriterion("u.birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayLike(Date value) {
            addCriterion("u.birthday like", "%" + value + "%", "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayNotLike(Date value) {
            addCriterion("u.birthday not like", "%" + value + "%", "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayBetween(Integer value1, Integer value2) {
            addCriterion("u.birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andbirthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("u.birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andsexIsNull() {
            addCriterion("u.sex is null");
            return (Criteria) this;
        }

        public Criteria andsexIsNotNull() {
            addCriterion("u.sex is not null");
            return (Criteria) this;
        }

        public Criteria andsexEqualTo(String value) {
            addCriterion("u.sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andsexNotEqualTo(String value) {
            addCriterion("u.sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andsexGreaterThan(String value) {
            addCriterion("u.sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andsexGreaterThanOrEqualTo(String value) {
            addCriterion("u.sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andsexLessThan(String value) {
            addCriterion("u.sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andsexLessThanOrEqualTo(String value) {
            addCriterion("u.sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andsexIn(List<String> values) {
            addCriterion("u.sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andsexNotIn(List<String> values) {
            addCriterion("u.sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andsexLike(String value) {
            addCriterion("u.sex like", "%" + value + "%", "sex");
            return (Criteria) this;
        }

        public Criteria andsexNotLike(String value) {
            addCriterion("u.sex not like", "%" + value + "%", "sex");
            return (Criteria) this;
        }

        public Criteria andsexBetween(Integer value1, Integer value2) {
            addCriterion("u.sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andsexNotBetween(Integer value1, Integer value2) {
            addCriterion("u.sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andaddressIsNull() {
            addCriterion("u.address is null");
            return (Criteria) this;
        }

        public Criteria andaddressIsNotNull() {
            addCriterion("u.address is not null");
            return (Criteria) this;
        }

        public Criteria andaddressEqualTo(String value) {
            addCriterion("u.address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotEqualTo(String value) {
            addCriterion("u.address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressGreaterThan(String value) {
            addCriterion("u.address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressGreaterThanOrEqualTo(String value) {
            addCriterion("u.address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLessThan(String value) {
            addCriterion("u.address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLessThanOrEqualTo(String value) {
            addCriterion("u.address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andaddressIn(List<String> values) {
            addCriterion("u.address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotIn(List<String> values) {
            addCriterion("u.address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andaddressLike(String value) {
            addCriterion("u.address like", "%" + value + "%", "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotLike(String value) {
            addCriterion("u.address not like", "%" + value + "%", "address");
            return (Criteria) this;
        }

        public Criteria andaddressBetween(Integer value1, Integer value2) {
            addCriterion("u.address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andaddressNotBetween(Integer value1, Integer value2) {
            addCriterion("u.address not between", value1, value2, "address");
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