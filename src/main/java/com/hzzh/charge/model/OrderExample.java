package com.hzzh.charge.model;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

/**
 * 类名称：t_ev_order表的查询条件类OrderExample
 * 内容摘要：t_ev_order表的各个元素的查询条件
 * @author 工具生成
 * @version 1.0 2016年10月13日
 */
public class OrderExample {

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

    public OrderExample() {
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
            addCriterion("teo.GUID_ is null");
            return (Criteria) this;
        }

        public Criteria andguidIsNotNull() {
            addCriterion("teo.GUID_ is not null");
            return (Criteria) this;
        }

        public Criteria andguidEqualTo(String value) {
            addCriterion("teo.GUID_ =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotEqualTo(String value) {
            addCriterion("teo.GUID_ <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThan(String value) {
            addCriterion("teo.GUID_ >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThanOrEqualTo(String value) {
            addCriterion("teo.GUID_ >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThan(String value) {
            addCriterion("teo.GUID_ <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThanOrEqualTo(String value) {
            addCriterion("teo.GUID_ <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidIn(List<String> values) {
            addCriterion("teo.GUID_ in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotIn(List<String> values) {
            addCriterion("teo.GUID_ not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLike(String value) {
            addCriterion("teo.GUID_ like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotLike(String value) {
            addCriterion("teo.GUID_ not like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidBetween(Integer value1, Integer value2) {
            addCriterion("teo.GUID_ between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.GUID_ not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andcarNoIsNull() {
            addCriterion("teo.CAR_NO is null");
            return (Criteria) this;
        }

        public Criteria andcarNoIsNotNull() {
            addCriterion("teo.CAR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andcarNoEqualTo(String value) {
            addCriterion("teo.CAR_NO =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotEqualTo(String value) {
            addCriterion("teo.CAR_NO <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoGreaterThan(String value) {
            addCriterion("teo.CAR_NO >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoGreaterThanOrEqualTo(String value) {
            addCriterion("teo.CAR_NO >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLessThan(String value) {
            addCriterion("teo.CAR_NO <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLessThanOrEqualTo(String value) {
            addCriterion("teo.CAR_NO <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoIn(List<String> values) {
            addCriterion("teo.CAR_NO in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotIn(List<String> values) {
            addCriterion("teo.CAR_NO not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLike(String value) {
            addCriterion("teo.CAR_NO like", "%" + value + "%", "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotLike(String value) {
            addCriterion("teo.CAR_NO not like", "%" + value + "%", "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoBetween(Integer value1, Integer value2) {
            addCriterion("teo.CAR_NO between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.CAR_NO not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andcardNoIsNull() {
            addCriterion("teo.CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andcardNoIsNotNull() {
            addCriterion("teo.CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andcardNoEqualTo(String value) {
            addCriterion("teo.CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotEqualTo(String value) {
            addCriterion("teo.CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoGreaterThan(String value) {
            addCriterion("teo.CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("teo.CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLessThan(String value) {
            addCriterion("teo.CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLessThanOrEqualTo(String value) {
            addCriterion("teo.CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoIn(List<String> values) {
            addCriterion("teo.CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotIn(List<String> values) {
            addCriterion("teo.CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLike(String value) {
            addCriterion("teo.CARD_NO like", "%" + value + "%", "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotLike(String value) {
            addCriterion("teo.CARD_NO not like", "%" + value + "%", "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoBetween(Integer value1, Integer value2) {
            addCriterion("teo.CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIsNull() {
            addCriterion("teo.COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIsNotNull() {
            addCriterion("teo.COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andcompanyIdEqualTo(String value) {
            addCriterion("teo.COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotEqualTo(String value) {
            addCriterion("teo.COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdGreaterThan(String value) {
            addCriterion("teo.COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("teo.COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLessThan(String value) {
            addCriterion("teo.COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLessThanOrEqualTo(String value) {
            addCriterion("teo.COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIn(List<String> values) {
            addCriterion("teo.COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotIn(List<String> values) {
            addCriterion("teo.COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLike(String value) {
            addCriterion("teo.COMPANY_ID like", "%" + value + "%", "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotLike(String value) {
            addCriterion("teo.COMPANY_ID not like", "%" + value + "%", "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("teo.COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andstationCodeIsNull() {
            addCriterion("teo.STATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andstationCodeIsNotNull() {
            addCriterion("teo.STATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andstationCodeEqualTo(String value) {
            addCriterion("teo.STATION_CODE =", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeNotEqualTo(String value) {
            addCriterion("teo.STATION_CODE <>", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeGreaterThan(String value) {
            addCriterion("teo.STATION_CODE >", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("teo.STATION_CODE >=", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeLessThan(String value) {
            addCriterion("teo.STATION_CODE <", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeLessThanOrEqualTo(String value) {
            addCriterion("teo.STATION_CODE <=", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeIn(List<String> values) {
            addCriterion("teo.STATION_CODE in", values, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeNotIn(List<String> values) {
            addCriterion("teo.STATION_CODE not in", values, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeLike(String value) {
            addCriterion("teo.STATION_CODE like", "%" + value + "%", "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeNotLike(String value) {
            addCriterion("teo.STATION_CODE not like", "%" + value + "%", "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeBetween(Integer value1, Integer value2) {
            addCriterion("teo.STATION_CODE between", value1, value2, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.STATION_CODE not between", value1, value2, "stationCode");
            return (Criteria) this;
        }

        public Criteria andstationNameIsNull() {
            addCriterion("teo.STATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andstationNameIsNotNull() {
            addCriterion("teo.STATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andstationNameEqualTo(String value) {
            addCriterion("teo.STATION_NAME =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameNotEqualTo(String value) {
            addCriterion("teo.STATION_NAME <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameGreaterThan(String value) {
            addCriterion("teo.STATION_NAME >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameGreaterThanOrEqualTo(String value) {
            addCriterion("teo.STATION_NAME >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameLessThan(String value) {
            addCriterion("teo.STATION_NAME <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameLessThanOrEqualTo(String value) {
            addCriterion("teo.STATION_NAME <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameIn(List<String> values) {
            addCriterion("teo.STATION_NAME in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameNotIn(List<String> values) {
            addCriterion("teo.STATION_NAME not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameLike(String value) {
            addCriterion("teo.STATION_NAME like", "%" + value + "%", "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameNotLike(String value) {
            addCriterion("teo.STATION_NAME not like", "%" + value + "%", "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameBetween(Integer value1, Integer value2) {
            addCriterion("teo.STATION_NAME between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andstationNameNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.STATION_NAME not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria anddevCodeIsNull() {
            addCriterion("teo.DEV_CODE is null");
            return (Criteria) this;
        }

        public Criteria anddevCodeIsNotNull() {
            addCriterion("teo.DEV_CODE is not null");
            return (Criteria) this;
        }

        public Criteria anddevCodeEqualTo(String value) {
            addCriterion("teo.DEV_CODE =", value, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeNotEqualTo(String value) {
            addCriterion("teo.DEV_CODE <>", value, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeGreaterThan(String value) {
            addCriterion("teo.DEV_CODE >", value, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeGreaterThanOrEqualTo(String value) {
            addCriterion("teo.DEV_CODE >=", value, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeLessThan(String value) {
            addCriterion("teo.DEV_CODE <", value, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeLessThanOrEqualTo(String value) {
            addCriterion("teo.DEV_CODE <=", value, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeIn(List<String> values) {
            addCriterion("teo.DEV_CODE in", values, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeNotIn(List<String> values) {
            addCriterion("teo.DEV_CODE not in", values, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeLike(String value) {
            addCriterion("teo.DEV_CODE like", "%" + value + "%", "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeNotLike(String value) {
            addCriterion("teo.DEV_CODE not like", "%" + value + "%", "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeBetween(Integer value1, Integer value2) {
            addCriterion("teo.DEV_CODE between", value1, value2, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.DEV_CODE not between", value1, value2, "devCode");
            return (Criteria) this;
        }

        public Criteria anddevNameIsNull() {
            addCriterion("teo.DEV_NAME is null");
            return (Criteria) this;
        }

        public Criteria anddevNameIsNotNull() {
            addCriterion("teo.DEV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria anddevNameEqualTo(String value) {
            addCriterion("teo.DEV_NAME =", value, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameNotEqualTo(String value) {
            addCriterion("teo.DEV_NAME <>", value, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameGreaterThan(String value) {
            addCriterion("teo.DEV_NAME >", value, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameGreaterThanOrEqualTo(String value) {
            addCriterion("teo.DEV_NAME >=", value, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameLessThan(String value) {
            addCriterion("teo.DEV_NAME <", value, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameLessThanOrEqualTo(String value) {
            addCriterion("teo.DEV_NAME <=", value, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameIn(List<String> values) {
            addCriterion("teo.DEV_NAME in", values, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameNotIn(List<String> values) {
            addCriterion("teo.DEV_NAME not in", values, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameLike(String value) {
            addCriterion("teo.DEV_NAME like", "%" + value + "%", "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameNotLike(String value) {
            addCriterion("teo.DEV_NAME not like", "%" + value + "%", "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameBetween(Integer value1, Integer value2) {
            addCriterion("teo.DEV_NAME between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria anddevNameNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.DEV_NAME not between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andchargeBeginIsNull() {
            addCriterion("teo.CHARGE_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andchargeBeginIsNotNull() {
            addCriterion("teo.CHARGE_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andchargeBeginEqualTo(String value) {
            addCriterion("teo.CHARGE_BEGIN =", value, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginNotEqualTo(String value) {
            addCriterion("teo.CHARGE_BEGIN <>", value, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginGreaterThan(String value) {
            addCriterion("teo.CHARGE_BEGIN >", value, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginGreaterThanOrEqualTo(String value) {
            addCriterion("teo.CHARGE_BEGIN >=", value, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginLessThan(String value) {
            addCriterion("teo.CHARGE_BEGIN <", value, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginLessThanOrEqualTo(String value) {
            addCriterion("teo.CHARGE_BEGIN <=", value, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginIn(List<String> values) {
            addCriterion("teo.CHARGE_BEGIN in", values, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginNotIn(List<String> values) {
            addCriterion("teo.CHARGE_BEGIN not in", values, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginLike(String value) {
            addCriterion("teo.CHARGE_BEGIN like", "%" + value + "%", "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginNotLike(String value) {
            addCriterion("teo.CHARGE_BEGIN not like", "%" + value + "%", "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginBetween(Integer value1, Integer value2) {
            addCriterion("teo.CHARGE_BEGIN between", value1, value2, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeBeginNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.CHARGE_BEGIN not between", value1, value2, "chargeBegin");
            return (Criteria) this;
        }

        public Criteria andchargeEndIsNull() {
            addCriterion("teo.CHARGE_END is null");
            return (Criteria) this;
        }

        public Criteria andchargeEndIsNotNull() {
            addCriterion("teo.CHARGE_END is not null");
            return (Criteria) this;
        }

        public Criteria andchargeEndEqualTo(String value) {
            addCriterion("teo.CHARGE_END =", value, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndNotEqualTo(String value) {
            addCriterion("teo.CHARGE_END <>", value, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndGreaterThan(String value) {
            addCriterion("teo.CHARGE_END >", value, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndGreaterThanOrEqualTo(String value) {
            addCriterion("teo.CHARGE_END >=", value, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndLessThan(String value) {
            addCriterion("teo.CHARGE_END <", value, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndLessThanOrEqualTo(String value) {
            addCriterion("teo.CHARGE_END <=", value, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndIn(List<String> values) {
            addCriterion("teo.CHARGE_END in", values, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndNotIn(List<String> values) {
            addCriterion("teo.CHARGE_END not in", values, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndLike(String value) {
            addCriterion("teo.CHARGE_END like", "%" + value + "%", "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndNotLike(String value) {
            addCriterion("teo.CHARGE_END not like", "%" + value + "%", "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndBetween(Integer value1, Integer value2) {
            addCriterion("teo.CHARGE_END between", value1, value2, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andchargeEndNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.CHARGE_END not between", value1, value2, "chargeEnd");
            return (Criteria) this;
        }

        public Criteria andelectricChargeIsNull() {
            addCriterion("teo.ELECTRIC_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andelectricChargeIsNotNull() {
            addCriterion("teo.ELECTRIC_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andelectricChargeEqualTo(BigDecimal value) {
            addCriterion("teo.ELECTRIC_CHARGE =", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeNotEqualTo(BigDecimal value) {
            addCriterion("teo.ELECTRIC_CHARGE <>", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGreaterThan(BigDecimal value) {
            addCriterion("teo.ELECTRIC_CHARGE >", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("teo.ELECTRIC_CHARGE >=", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeLessThan(BigDecimal value) {
            addCriterion("teo.ELECTRIC_CHARGE <", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("teo.ELECTRIC_CHARGE <=", value, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeIn(List<BigDecimal> values) {
            addCriterion("teo.ELECTRIC_CHARGE in", values, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeNotIn(List<BigDecimal> values) {
            addCriterion("teo.ELECTRIC_CHARGE not in", values, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeLike(BigDecimal value) {
            addCriterion("teo.ELECTRIC_CHARGE like", "%" + value + "%", "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeNotLike(BigDecimal value) {
            addCriterion("teo.ELECTRIC_CHARGE not like", "%" + value + "%", "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE between", value1, value2, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andelectricChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE not between", value1, value2, "electricCharge");
            return (Criteria) this;
        }

        public Criteria andexpenseIsNull() {
            addCriterion("teo.EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andexpenseIsNotNull() {
            addCriterion("teo.EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andexpenseEqualTo(String value) {
            addCriterion("teo.EXPENSE =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseNotEqualTo(String value) {
            addCriterion("teo.EXPENSE <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseGreaterThan(String value) {
            addCriterion("teo.EXPENSE >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseGreaterThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseLessThan(String value) {
            addCriterion("teo.EXPENSE <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseLessThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseIn(List<String> values) {
            addCriterion("teo.EXPENSE in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseNotIn(List<String> values) {
            addCriterion("teo.EXPENSE not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseLike(String value) {
            addCriterion("teo.EXPENSE like", "%" + value + "%", "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseNotLike(String value) {
            addCriterion("teo.EXPENSE not like", "%" + value + "%", "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andexpenseNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE not between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andrateJIsNull() {
            addCriterion("teo.RATE_J is null");
            return (Criteria) this;
        }

        public Criteria andrateJIsNotNull() {
            addCriterion("teo.RATE_J is not null");
            return (Criteria) this;
        }

        public Criteria andrateJEqualTo(String value) {
            addCriterion("teo.RATE_J =", value, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJNotEqualTo(String value) {
            addCriterion("teo.RATE_J <>", value, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJGreaterThan(String value) {
            addCriterion("teo.RATE_J >", value, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJGreaterThanOrEqualTo(String value) {
            addCriterion("teo.RATE_J >=", value, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJLessThan(String value) {
            addCriterion("teo.RATE_J <", value, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJLessThanOrEqualTo(String value) {
            addCriterion("teo.RATE_J <=", value, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJIn(List<String> values) {
            addCriterion("teo.RATE_J in", values, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJNotIn(List<String> values) {
            addCriterion("teo.RATE_J not in", values, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJLike(String value) {
            addCriterion("teo.RATE_J like", "%" + value + "%", "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJNotLike(String value) {
            addCriterion("teo.RATE_J not like", "%" + value + "%", "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJBetween(Integer value1, Integer value2) {
            addCriterion("teo.RATE_J between", value1, value2, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateJNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.RATE_J not between", value1, value2, "rateJ");
            return (Criteria) this;
        }

        public Criteria andrateFIsNull() {
            addCriterion("teo.RATE_F is null");
            return (Criteria) this;
        }

        public Criteria andrateFIsNotNull() {
            addCriterion("teo.RATE_F is not null");
            return (Criteria) this;
        }

        public Criteria andrateFEqualTo(String value) {
            addCriterion("teo.RATE_F =", value, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFNotEqualTo(String value) {
            addCriterion("teo.RATE_F <>", value, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFGreaterThan(String value) {
            addCriterion("teo.RATE_F >", value, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFGreaterThanOrEqualTo(String value) {
            addCriterion("teo.RATE_F >=", value, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFLessThan(String value) {
            addCriterion("teo.RATE_F <", value, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFLessThanOrEqualTo(String value) {
            addCriterion("teo.RATE_F <=", value, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFIn(List<String> values) {
            addCriterion("teo.RATE_F in", values, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFNotIn(List<String> values) {
            addCriterion("teo.RATE_F not in", values, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFLike(String value) {
            addCriterion("teo.RATE_F like", "%" + value + "%", "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFNotLike(String value) {
            addCriterion("teo.RATE_F not like", "%" + value + "%", "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFBetween(Integer value1, Integer value2) {
            addCriterion("teo.RATE_F between", value1, value2, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateFNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.RATE_F not between", value1, value2, "rateF");
            return (Criteria) this;
        }

        public Criteria andrateGIsNull() {
            addCriterion("teo.RATE_G is null");
            return (Criteria) this;
        }

        public Criteria andrateGIsNotNull() {
            addCriterion("teo.RATE_G is not null");
            return (Criteria) this;
        }

        public Criteria andrateGEqualTo(String value) {
            addCriterion("teo.RATE_G =", value, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGNotEqualTo(String value) {
            addCriterion("teo.RATE_G <>", value, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGGreaterThan(String value) {
            addCriterion("teo.RATE_G >", value, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGGreaterThanOrEqualTo(String value) {
            addCriterion("teo.RATE_G >=", value, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGLessThan(String value) {
            addCriterion("teo.RATE_G <", value, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGLessThanOrEqualTo(String value) {
            addCriterion("teo.RATE_G <=", value, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGIn(List<String> values) {
            addCriterion("teo.RATE_G in", values, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGNotIn(List<String> values) {
            addCriterion("teo.RATE_G not in", values, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGLike(String value) {
            addCriterion("teo.RATE_G like", "%" + value + "%", "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGNotLike(String value) {
            addCriterion("teo.RATE_G not like", "%" + value + "%", "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGBetween(Integer value1, Integer value2) {
            addCriterion("teo.RATE_G between", value1, value2, "rateG");
            return (Criteria) this;
        }

        public Criteria andrateGNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.RATE_G not between", value1, value2, "rateG");
            return (Criteria) this;
        }

        public Criteria andratePIsNull() {
            addCriterion("teo.RATE_P is null");
            return (Criteria) this;
        }

        public Criteria andratePIsNotNull() {
            addCriterion("teo.RATE_P is not null");
            return (Criteria) this;
        }

        public Criteria andratePEqualTo(String value) {
            addCriterion("teo.RATE_P =", value, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePNotEqualTo(String value) {
            addCriterion("teo.RATE_P <>", value, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePGreaterThan(String value) {
            addCriterion("teo.RATE_P >", value, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePGreaterThanOrEqualTo(String value) {
            addCriterion("teo.RATE_P >=", value, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePLessThan(String value) {
            addCriterion("teo.RATE_P <", value, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePLessThanOrEqualTo(String value) {
            addCriterion("teo.RATE_P <=", value, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePIn(List<String> values) {
            addCriterion("teo.RATE_P in", values, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePNotIn(List<String> values) {
            addCriterion("teo.RATE_P not in", values, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePLike(String value) {
            addCriterion("teo.RATE_P like", "%" + value + "%", "rateP");
            return (Criteria) this;
        }

        public Criteria andratePNotLike(String value) {
            addCriterion("teo.RATE_P not like", "%" + value + "%", "rateP");
            return (Criteria) this;
        }

        public Criteria andratePBetween(Integer value1, Integer value2) {
            addCriterion("teo.RATE_P between", value1, value2, "rateP");
            return (Criteria) this;
        }

        public Criteria andratePNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.RATE_P not between", value1, value2, "rateP");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJIsNull() {
            addCriterion("teo.ELECTRIC_CHARGE_J is null");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJIsNotNull() {
            addCriterion("teo.ELECTRIC_CHARGE_J is not null");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_J =", value, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJNotEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_J <>", value, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJGreaterThan(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_J >", value, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJGreaterThanOrEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_J >=", value, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJLessThan(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_J <", value, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJLessThanOrEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_J <=", value, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJIn(List<String> values) {
            addCriterion("teo.ELECTRIC_CHARGE_J in", values, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJNotIn(List<String> values) {
            addCriterion("teo.ELECTRIC_CHARGE_J not in", values, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJLike(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_J like", "%" + value + "%", "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJNotLike(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_J not like", "%" + value + "%", "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE_J between", value1, value2, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeJNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE_J not between", value1, value2, "electricChargeJ");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFIsNull() {
            addCriterion("teo.ELECTRIC_CHARGE_F is null");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFIsNotNull() {
            addCriterion("teo.ELECTRIC_CHARGE_F is not null");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_F =", value, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFNotEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_F <>", value, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFGreaterThan(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_F >", value, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFGreaterThanOrEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_F >=", value, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFLessThan(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_F <", value, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFLessThanOrEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_F <=", value, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFIn(List<String> values) {
            addCriterion("teo.ELECTRIC_CHARGE_F in", values, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFNotIn(List<String> values) {
            addCriterion("teo.ELECTRIC_CHARGE_F not in", values, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFLike(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_F like", "%" + value + "%", "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFNotLike(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_F not like", "%" + value + "%", "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE_F between", value1, value2, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeFNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE_F not between", value1, value2, "electricChargeF");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGIsNull() {
            addCriterion("teo.ELECTRIC_CHARGE_G is null");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGIsNotNull() {
            addCriterion("teo.ELECTRIC_CHARGE_G is not null");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_G =", value, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGNotEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_G <>", value, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGGreaterThan(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_G >", value, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGGreaterThanOrEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_G >=", value, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGLessThan(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_G <", value, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGLessThanOrEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_G <=", value, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGIn(List<String> values) {
            addCriterion("teo.ELECTRIC_CHARGE_G in", values, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGNotIn(List<String> values) {
            addCriterion("teo.ELECTRIC_CHARGE_G not in", values, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGLike(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_G like", "%" + value + "%", "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGNotLike(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_G not like", "%" + value + "%", "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE_G between", value1, value2, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargeGNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE_G not between", value1, value2, "electricChargeG");
            return (Criteria) this;
        }

        public Criteria andelectricChargePIsNull() {
            addCriterion("teo.ELECTRIC_CHARGE_P is null");
            return (Criteria) this;
        }

        public Criteria andelectricChargePIsNotNull() {
            addCriterion("teo.ELECTRIC_CHARGE_P is not null");
            return (Criteria) this;
        }

        public Criteria andelectricChargePEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_P =", value, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePNotEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_P <>", value, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePGreaterThan(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_P >", value, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePGreaterThanOrEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_P >=", value, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePLessThan(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_P <", value, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePLessThanOrEqualTo(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_P <=", value, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePIn(List<String> values) {
            addCriterion("teo.ELECTRIC_CHARGE_P in", values, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePNotIn(List<String> values) {
            addCriterion("teo.ELECTRIC_CHARGE_P not in", values, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePLike(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_P like", "%" + value + "%", "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePNotLike(String value) {
            addCriterion("teo.ELECTRIC_CHARGE_P not like", "%" + value + "%", "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE_P between", value1, value2, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andelectricChargePNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.ELECTRIC_CHARGE_P not between", value1, value2, "electricChargeP");
            return (Criteria) this;
        }

        public Criteria andexpenseJIsNull() {
            addCriterion("teo.EXPENSE_J is null");
            return (Criteria) this;
        }

        public Criteria andexpenseJIsNotNull() {
            addCriterion("teo.EXPENSE_J is not null");
            return (Criteria) this;
        }

        public Criteria andexpenseJEqualTo(String value) {
            addCriterion("teo.EXPENSE_J =", value, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJNotEqualTo(String value) {
            addCriterion("teo.EXPENSE_J <>", value, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJGreaterThan(String value) {
            addCriterion("teo.EXPENSE_J >", value, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJGreaterThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE_J >=", value, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJLessThan(String value) {
            addCriterion("teo.EXPENSE_J <", value, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJLessThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE_J <=", value, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJIn(List<String> values) {
            addCriterion("teo.EXPENSE_J in", values, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJNotIn(List<String> values) {
            addCriterion("teo.EXPENSE_J not in", values, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJLike(String value) {
            addCriterion("teo.EXPENSE_J like", "%" + value + "%", "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJNotLike(String value) {
            addCriterion("teo.EXPENSE_J not like", "%" + value + "%", "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE_J between", value1, value2, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseJNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE_J not between", value1, value2, "expenseJ");
            return (Criteria) this;
        }

        public Criteria andexpenseFIsNull() {
            addCriterion("teo.EXPENSE_F is null");
            return (Criteria) this;
        }

        public Criteria andexpenseFIsNotNull() {
            addCriterion("teo.EXPENSE_F is not null");
            return (Criteria) this;
        }

        public Criteria andexpenseFEqualTo(String value) {
            addCriterion("teo.EXPENSE_F =", value, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFNotEqualTo(String value) {
            addCriterion("teo.EXPENSE_F <>", value, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFGreaterThan(String value) {
            addCriterion("teo.EXPENSE_F >", value, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFGreaterThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE_F >=", value, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFLessThan(String value) {
            addCriterion("teo.EXPENSE_F <", value, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFLessThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE_F <=", value, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFIn(List<String> values) {
            addCriterion("teo.EXPENSE_F in", values, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFNotIn(List<String> values) {
            addCriterion("teo.EXPENSE_F not in", values, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFLike(String value) {
            addCriterion("teo.EXPENSE_F like", "%" + value + "%", "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFNotLike(String value) {
            addCriterion("teo.EXPENSE_F not like", "%" + value + "%", "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE_F between", value1, value2, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseFNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE_F not between", value1, value2, "expenseF");
            return (Criteria) this;
        }

        public Criteria andexpenseGIsNull() {
            addCriterion("teo.EXPENSE_G is null");
            return (Criteria) this;
        }

        public Criteria andexpenseGIsNotNull() {
            addCriterion("teo.EXPENSE_G is not null");
            return (Criteria) this;
        }

        public Criteria andexpenseGEqualTo(String value) {
            addCriterion("teo.EXPENSE_G =", value, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGNotEqualTo(String value) {
            addCriterion("teo.EXPENSE_G <>", value, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGGreaterThan(String value) {
            addCriterion("teo.EXPENSE_G >", value, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGGreaterThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE_G >=", value, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGLessThan(String value) {
            addCriterion("teo.EXPENSE_G <", value, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGLessThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE_G <=", value, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGIn(List<String> values) {
            addCriterion("teo.EXPENSE_G in", values, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGNotIn(List<String> values) {
            addCriterion("teo.EXPENSE_G not in", values, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGLike(String value) {
            addCriterion("teo.EXPENSE_G like", "%" + value + "%", "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGNotLike(String value) {
            addCriterion("teo.EXPENSE_G not like", "%" + value + "%", "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE_G between", value1, value2, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpenseGNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE_G not between", value1, value2, "expenseG");
            return (Criteria) this;
        }

        public Criteria andexpensePIsNull() {
            addCriterion("teo.EXPENSE_P is null");
            return (Criteria) this;
        }

        public Criteria andexpensePIsNotNull() {
            addCriterion("teo.EXPENSE_P is not null");
            return (Criteria) this;
        }

        public Criteria andexpensePEqualTo(String value) {
            addCriterion("teo.EXPENSE_P =", value, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePNotEqualTo(String value) {
            addCriterion("teo.EXPENSE_P <>", value, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePGreaterThan(String value) {
            addCriterion("teo.EXPENSE_P >", value, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePGreaterThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE_P >=", value, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePLessThan(String value) {
            addCriterion("teo.EXPENSE_P <", value, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePLessThanOrEqualTo(String value) {
            addCriterion("teo.EXPENSE_P <=", value, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePIn(List<String> values) {
            addCriterion("teo.EXPENSE_P in", values, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePNotIn(List<String> values) {
            addCriterion("teo.EXPENSE_P not in", values, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePLike(String value) {
            addCriterion("teo.EXPENSE_P like", "%" + value + "%", "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePNotLike(String value) {
            addCriterion("teo.EXPENSE_P not like", "%" + value + "%", "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE_P between", value1, value2, "expenseP");
            return (Criteria) this;
        }

        public Criteria andexpensePNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.EXPENSE_P not between", value1, value2, "expenseP");
            return (Criteria) this;
        }

        public Criteria andbalanceIsNull() {
            addCriterion("teo.BALANCE_ is null");
            return (Criteria) this;
        }

        public Criteria andbalanceIsNotNull() {
            addCriterion("teo.BALANCE_ is not null");
            return (Criteria) this;
        }

        public Criteria andbalanceEqualTo(String value) {
            addCriterion("teo.BALANCE_ =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceNotEqualTo(String value) {
            addCriterion("teo.BALANCE_ <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceGreaterThan(String value) {
            addCriterion("teo.BALANCE_ >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("teo.BALANCE_ >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceLessThan(String value) {
            addCriterion("teo.BALANCE_ <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceLessThanOrEqualTo(String value) {
            addCriterion("teo.BALANCE_ <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceIn(List<String> values) {
            addCriterion("teo.BALANCE_ in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceNotIn(List<String> values) {
            addCriterion("teo.BALANCE_ not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceLike(String value) {
            addCriterion("teo.BALANCE_ like", "%" + value + "%", "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceNotLike(String value) {
            addCriterion("teo.BALANCE_ not like", "%" + value + "%", "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceBetween(Integer value1, Integer value2) {
            addCriterion("teo.BALANCE_ between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andbalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.BALANCE_ not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andstopReasonIsNull() {
            addCriterion("teo.STOP_REASON is null");
            return (Criteria) this;
        }

        public Criteria andstopReasonIsNotNull() {
            addCriterion("teo.STOP_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andstopReasonEqualTo(String value) {
            addCriterion("teo.STOP_REASON =", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonNotEqualTo(String value) {
            addCriterion("teo.STOP_REASON <>", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonGreaterThan(String value) {
            addCriterion("teo.STOP_REASON >", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonGreaterThanOrEqualTo(String value) {
            addCriterion("teo.STOP_REASON >=", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonLessThan(String value) {
            addCriterion("teo.STOP_REASON <", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonLessThanOrEqualTo(String value) {
            addCriterion("teo.STOP_REASON <=", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonIn(List<String> values) {
            addCriterion("teo.STOP_REASON in", values, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonNotIn(List<String> values) {
            addCriterion("teo.STOP_REASON not in", values, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonLike(String value) {
            addCriterion("teo.STOP_REASON like", "%" + value + "%", "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonNotLike(String value) {
            addCriterion("teo.STOP_REASON not like", "%" + value + "%", "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonBetween(Integer value1, Integer value2) {
            addCriterion("teo.STOP_REASON between", value1, value2, "stopReason");
            return (Criteria) this;
        }

        public Criteria andstopReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.STOP_REASON not between", value1, value2, "stopReason");
            return (Criteria) this;
        }

        public Criteria andchargeTypeIsNull() {
            addCriterion("teo.CHARGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andchargeTypeIsNotNull() {
            addCriterion("teo.CHARGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andchargeTypeEqualTo(String value) {
            addCriterion("teo.CHARGE_TYPE =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeNotEqualTo(String value) {
            addCriterion("teo.CHARGE_TYPE <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeGreaterThan(String value) {
            addCriterion("teo.CHARGE_TYPE >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("teo.CHARGE_TYPE >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeLessThan(String value) {
            addCriterion("teo.CHARGE_TYPE <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeLessThanOrEqualTo(String value) {
            addCriterion("teo.CHARGE_TYPE <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeIn(List<String> values) {
            addCriterion("teo.CHARGE_TYPE in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeNotIn(List<String> values) {
            addCriterion("teo.CHARGE_TYPE not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeLike(String value) {
            addCriterion("teo.CHARGE_TYPE like", "%" + value + "%", "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeNotLike(String value) {
            addCriterion("teo.CHARGE_TYPE not like", "%" + value + "%", "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeBetween(Integer value1, Integer value2) {
            addCriterion("teo.CHARGE_TYPE between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andchargeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.CHARGE_TYPE not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andsendTagIsNull() {
            addCriterion("teo.SEND_TAG is null");
            return (Criteria) this;
        }

        public Criteria andsendTagIsNotNull() {
            addCriterion("teo.SEND_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andsendTagEqualTo(String value) {
            addCriterion("teo.SEND_TAG =", value, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagNotEqualTo(String value) {
            addCriterion("teo.SEND_TAG <>", value, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagGreaterThan(String value) {
            addCriterion("teo.SEND_TAG >", value, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagGreaterThanOrEqualTo(String value) {
            addCriterion("teo.SEND_TAG >=", value, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagLessThan(String value) {
            addCriterion("teo.SEND_TAG <", value, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagLessThanOrEqualTo(String value) {
            addCriterion("teo.SEND_TAG <=", value, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagIn(List<String> values) {
            addCriterion("teo.SEND_TAG in", values, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagNotIn(List<String> values) {
            addCriterion("teo.SEND_TAG not in", values, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagLike(String value) {
            addCriterion("teo.SEND_TAG like", "%" + value + "%", "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagNotLike(String value) {
            addCriterion("teo.SEND_TAG not like", "%" + value + "%", "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagBetween(Integer value1, Integer value2) {
            addCriterion("teo.SEND_TAG between", value1, value2, "sendTag");
            return (Criteria) this;
        }

        public Criteria andsendTagNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.SEND_TAG not between", value1, value2, "sendTag");
            return (Criteria) this;
        }

        public Criteria andportIsNull() {
            addCriterion("teo.PORT_ is null");
            return (Criteria) this;
        }

        public Criteria andportIsNotNull() {
            addCriterion("teo.PORT_ is not null");
            return (Criteria) this;
        }

        public Criteria andportEqualTo(String value) {
            addCriterion("teo.PORT_ =", value, "port");
            return (Criteria) this;
        }

        public Criteria andportNotEqualTo(String value) {
            addCriterion("teo.PORT_ <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andportGreaterThan(String value) {
            addCriterion("teo.PORT_ >", value, "port");
            return (Criteria) this;
        }

        public Criteria andportGreaterThanOrEqualTo(String value) {
            addCriterion("teo.PORT_ >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andportLessThan(String value) {
            addCriterion("teo.PORT_ <", value, "port");
            return (Criteria) this;
        }

        public Criteria andportLessThanOrEqualTo(String value) {
            addCriterion("teo.PORT_ <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andportIn(List<String> values) {
            addCriterion("teo.PORT_ in", values, "port");
            return (Criteria) this;
        }

        public Criteria andportNotIn(List<String> values) {
            addCriterion("teo.PORT_ not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andportLike(String value) {
            addCriterion("teo.PORT_ like", "%" + value + "%", "port");
            return (Criteria) this;
        }

        public Criteria andportNotLike(String value) {
            addCriterion("teo.PORT_ not like", "%" + value + "%", "port");
            return (Criteria) this;
        }

        public Criteria andportBetween(Integer value1, Integer value2) {
            addCriterion("teo.PORT_ between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andportNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.PORT_ not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andstatusIsNull() {
            addCriterion("teo.STATUS_ is null");
            return (Criteria) this;
        }

        public Criteria andstatusIsNotNull() {
            addCriterion("teo.STATUS_ is not null");
            return (Criteria) this;
        }

        public Criteria andstatusEqualTo(String value) {
            addCriterion("teo.STATUS_ =", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotEqualTo(String value) {
            addCriterion("teo.STATUS_ <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusGreaterThan(String value) {
            addCriterion("teo.STATUS_ >", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusGreaterThanOrEqualTo(String value) {
            addCriterion("teo.STATUS_ >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLessThan(String value) {
            addCriterion("teo.STATUS_ <", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLessThanOrEqualTo(String value) {
            addCriterion("teo.STATUS_ <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andstatusIn(List<String> values) {
            addCriterion("teo.STATUS_ in", values, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotIn(List<String> values) {
            addCriterion("teo.STATUS_ not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andstatusLike(String value) {
            addCriterion("teo.STATUS_ like", "%" + value + "%", "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotLike(String value) {
            addCriterion("teo.STATUS_ not like", "%" + value + "%", "status");
            return (Criteria) this;
        }

        public Criteria andstatusBetween(Integer value1, Integer value2) {
            addCriterion("teo.STATUS_ between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("teo.STATUS_ not between", value1, value2, "status");
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