package com.hzzh.charge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：t_ev_card表的查询条件类CardExample
 * 内容摘要：t_ev_card表的各个元素的查询条件
 * @author 工具生成
 * @version 1.0 2016年10月19日
 */
public class CardExample {

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

    public CardExample() {
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
            addCriterion("tec.GUID_ is null");
            return (Criteria) this;
        }

        public Criteria andguidIsNotNull() {
            addCriterion("tec.GUID_ is not null");
            return (Criteria) this;
        }

        public Criteria andguidEqualTo(String value) {
            addCriterion("tec.GUID_ =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotEqualTo(String value) {
            addCriterion("tec.GUID_ <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThan(String value) {
            addCriterion("tec.GUID_ >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThanOrEqualTo(String value) {
            addCriterion("tec.GUID_ >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThan(String value) {
            addCriterion("tec.GUID_ <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThanOrEqualTo(String value) {
            addCriterion("tec.GUID_ <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidIn(List<String> values) {
            addCriterion("tec.GUID_ in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotIn(List<String> values) {
            addCriterion("tec.GUID_ not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLike(String value) {
            addCriterion("tec.GUID_ like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotLike(String value) {
            addCriterion("tec.GUID_ not like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidBetween(Integer value1, Integer value2) {
            addCriterion("tec.GUID_ between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.GUID_ not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andcardNoIsNull() {
            addCriterion("tec.CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andcardNoIsNotNull() {
            addCriterion("tec.CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andcardNoEqualTo(String value) {
            addCriterion("tec.CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotEqualTo(String value) {
            addCriterion("tec.CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoGreaterThan(String value) {
            addCriterion("tec.CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("tec.CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLessThan(String value) {
            addCriterion("tec.CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLessThanOrEqualTo(String value) {
            addCriterion("tec.CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoIn(List<String> values) {
            addCriterion("tec.CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotIn(List<String> values) {
            addCriterion("tec.CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLike(String value) {
            addCriterion("tec.CARD_NO like", "%" + value + "%", "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotLike(String value) {
            addCriterion("tec.CARD_NO not like", "%" + value + "%", "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoBetween(Integer value1, Integer value2) {
            addCriterion("tec.CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcarNoIsNull() {
            addCriterion("tec.CAR_NO is null");
            return (Criteria) this;
        }

        public Criteria andcarNoIsNotNull() {
            addCriterion("tec.CAR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andcarNoEqualTo(String value) {
            addCriterion("tec.CAR_NO =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotEqualTo(String value) {
            addCriterion("tec.CAR_NO <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoGreaterThan(String value) {
            addCriterion("tec.CAR_NO >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoGreaterThanOrEqualTo(String value) {
            addCriterion("tec.CAR_NO >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLessThan(String value) {
            addCriterion("tec.CAR_NO <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLessThanOrEqualTo(String value) {
            addCriterion("tec.CAR_NO <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoIn(List<String> values) {
            addCriterion("tec.CAR_NO in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotIn(List<String> values) {
            addCriterion("tec.CAR_NO not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLike(String value) {
            addCriterion("tec.CAR_NO like", "%" + value + "%", "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotLike(String value) {
            addCriterion("tec.CAR_NO not like", "%" + value + "%", "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoBetween(Integer value1, Integer value2) {
            addCriterion("tec.CAR_NO between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.CAR_NO not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIsNull() {
            addCriterion("tec.COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIsNotNull() {
            addCriterion("tec.COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andcompanyIdEqualTo(String value) {
            addCriterion("tec.COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotEqualTo(String value) {
            addCriterion("tec.COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdGreaterThan(String value) {
            addCriterion("tec.COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("tec.COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLessThan(String value) {
            addCriterion("tec.COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLessThanOrEqualTo(String value) {
            addCriterion("tec.COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIn(List<String> values) {
            addCriterion("tec.COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotIn(List<String> values) {
            addCriterion("tec.COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLike(String value) {
            addCriterion("tec.COMPANY_ID like", "%" + value + "%", "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotLike(String value) {
            addCriterion("tec.COMPANY_ID not like", "%" + value + "%", "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("tec.COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyNameIsNull() {
            addCriterion("tec.COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andcompanyNameIsNotNull() {
            addCriterion("tec.COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andcompanyNameEqualTo(String value) {
            addCriterion("tec.COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameNotEqualTo(String value) {
            addCriterion("tec.COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameGreaterThan(String value) {
            addCriterion("tec.COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("tec.COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameLessThan(String value) {
            addCriterion("tec.COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameLessThanOrEqualTo(String value) {
            addCriterion("tec.COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameIn(List<String> values) {
            addCriterion("tec.COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameNotIn(List<String> values) {
            addCriterion("tec.COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameLike(String value) {
            addCriterion("tec.COMPANY_NAME like", "%" + value + "%", "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameNotLike(String value) {
            addCriterion("tec.COMPANY_NAME not like", "%" + value + "%", "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameBetween(Integer value1, Integer value2) {
            addCriterion("tec.COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andownerIdIsNull() {
            addCriterion("tec.OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andownerIdIsNotNull() {
            addCriterion("tec.OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andownerIdEqualTo(String value) {
            addCriterion("tec.OWNER_ID =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdNotEqualTo(String value) {
            addCriterion("tec.OWNER_ID <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdGreaterThan(String value) {
            addCriterion("tec.OWNER_ID >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdGreaterThanOrEqualTo(String value) {
            addCriterion("tec.OWNER_ID >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdLessThan(String value) {
            addCriterion("tec.OWNER_ID <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdLessThanOrEqualTo(String value) {
            addCriterion("tec.OWNER_ID <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdIn(List<String> values) {
            addCriterion("tec.OWNER_ID in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdNotIn(List<String> values) {
            addCriterion("tec.OWNER_ID not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdLike(String value) {
            addCriterion("tec.OWNER_ID like", "%" + value + "%", "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdNotLike(String value) {
            addCriterion("tec.OWNER_ID not like", "%" + value + "%", "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdBetween(Integer value1, Integer value2) {
            addCriterion("tec.OWNER_ID between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.OWNER_ID not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerNameIsNull() {
            addCriterion("tec.OWNER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andownerNameIsNotNull() {
            addCriterion("tec.OWNER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andownerNameEqualTo(String value) {
            addCriterion("tec.OWNER_NAME =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameNotEqualTo(String value) {
            addCriterion("tec.OWNER_NAME <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameGreaterThan(String value) {
            addCriterion("tec.OWNER_NAME >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameGreaterThanOrEqualTo(String value) {
            addCriterion("tec.OWNER_NAME >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameLessThan(String value) {
            addCriterion("tec.OWNER_NAME <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameLessThanOrEqualTo(String value) {
            addCriterion("tec.OWNER_NAME <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameIn(List<String> values) {
            addCriterion("tec.OWNER_NAME in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameNotIn(List<String> values) {
            addCriterion("tec.OWNER_NAME not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameLike(String value) {
            addCriterion("tec.OWNER_NAME like", "%" + value + "%", "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameNotLike(String value) {
            addCriterion("tec.OWNER_NAME not like", "%" + value + "%", "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameBetween(Integer value1, Integer value2) {
            addCriterion("tec.OWNER_NAME between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.OWNER_NAME not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andcardBalanceIsNull() {
            addCriterion("tec.CARD_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andcardBalanceIsNotNull() {
            addCriterion("tec.CARD_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andcardBalanceEqualTo(Long value) {
            addCriterion("tec.CARD_BALANCE =", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceNotEqualTo(Long value) {
            addCriterion("tec.CARD_BALANCE <>", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceGreaterThan(Long value) {
            addCriterion("tec.CARD_BALANCE >", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("tec.CARD_BALANCE >=", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceLessThan(Long value) {
            addCriterion("tec.CARD_BALANCE <", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceLessThanOrEqualTo(Long value) {
            addCriterion("tec.CARD_BALANCE <=", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceIn(List<Long> values) {
            addCriterion("tec.CARD_BALANCE in", values, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceNotIn(List<Long> values) {
            addCriterion("tec.CARD_BALANCE not in", values, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceLike(Long value) {
            addCriterion("tec.CARD_BALANCE like", "%" + value + "%", "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceNotLike(Long value) {
            addCriterion("tec.CARD_BALANCE not like", "%" + value + "%", "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceBetween(Integer value1, Integer value2) {
            addCriterion("tec.CARD_BALANCE between", value1, value2, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.CARD_BALANCE not between", value1, value2, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardStatusIsNull() {
            addCriterion("tec.CARD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andcardStatusIsNotNull() {
            addCriterion("tec.CARD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andcardStatusEqualTo(String value) {
            addCriterion("tec.CARD_STATUS =", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusNotEqualTo(String value) {
            addCriterion("tec.CARD_STATUS <>", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusGreaterThan(String value) {
            addCriterion("tec.CARD_STATUS >", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tec.CARD_STATUS >=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusLessThan(String value) {
            addCriterion("tec.CARD_STATUS <", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusLessThanOrEqualTo(String value) {
            addCriterion("tec.CARD_STATUS <=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusIn(List<String> values) {
            addCriterion("tec.CARD_STATUS in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusNotIn(List<String> values) {
            addCriterion("tec.CARD_STATUS not in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusLike(String value) {
            addCriterion("tec.CARD_STATUS like", "%" + value + "%", "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusNotLike(String value) {
            addCriterion("tec.CARD_STATUS not like", "%" + value + "%", "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusBetween(Integer value1, Integer value2) {
            addCriterion("tec.CARD_STATUS between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.CARD_STATUS not between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardTypeIsNull() {
            addCriterion("tec.CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andcardTypeIsNotNull() {
            addCriterion("tec.CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andcardTypeEqualTo(String value) {
            addCriterion("tec.CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeNotEqualTo(String value) {
            addCriterion("tec.CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeGreaterThan(String value) {
            addCriterion("tec.CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tec.CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeLessThan(String value) {
            addCriterion("tec.CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeLessThanOrEqualTo(String value) {
            addCriterion("tec.CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeIn(List<String> values) {
            addCriterion("tec.CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeNotIn(List<String> values) {
            addCriterion("tec.CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeLike(String value) {
            addCriterion("tec.CARD_TYPE like", "%" + value + "%", "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeNotLike(String value) {
            addCriterion("tec.CARD_TYPE not like", "%" + value + "%", "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeBetween(Integer value1, Integer value2) {
            addCriterion("tec.CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andcreatorIdIsNull() {
            addCriterion("tec.CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andcreatorIdIsNotNull() {
            addCriterion("tec.CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andcreatorIdEqualTo(String value) {
            addCriterion("tec.CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdNotEqualTo(String value) {
            addCriterion("tec.CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdGreaterThan(String value) {
            addCriterion("tec.CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("tec.CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdLessThan(String value) {
            addCriterion("tec.CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdLessThanOrEqualTo(String value) {
            addCriterion("tec.CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdIn(List<String> values) {
            addCriterion("tec.CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdNotIn(List<String> values) {
            addCriterion("tec.CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdLike(String value) {
            addCriterion("tec.CREATOR_ID like", "%" + value + "%", "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdNotLike(String value) {
            addCriterion("tec.CREATOR_ID not like", "%" + value + "%", "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("tec.CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andcreatorNameIsNull() {
            addCriterion("tec.CREATOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andcreatorNameIsNotNull() {
            addCriterion("tec.CREATOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andcreatorNameEqualTo(String value) {
            addCriterion("tec.CREATOR_NAME =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameNotEqualTo(String value) {
            addCriterion("tec.CREATOR_NAME <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameGreaterThan(String value) {
            addCriterion("tec.CREATOR_NAME >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("tec.CREATOR_NAME >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameLessThan(String value) {
            addCriterion("tec.CREATOR_NAME <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameLessThanOrEqualTo(String value) {
            addCriterion("tec.CREATOR_NAME <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameIn(List<String> values) {
            addCriterion("tec.CREATOR_NAME in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameNotIn(List<String> values) {
            addCriterion("tec.CREATOR_NAME not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameLike(String value) {
            addCriterion("tec.CREATOR_NAME like", "%" + value + "%", "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameNotLike(String value) {
            addCriterion("tec.CREATOR_NAME not like", "%" + value + "%", "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameBetween(Integer value1, Integer value2) {
            addCriterion("tec.CREATOR_NAME between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreatorNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.CREATOR_NAME not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andcreateTimeIsNull() {
            addCriterion("tec.CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andcreateTimeIsNotNull() {
            addCriterion("tec.CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andcreateTimeEqualTo(String value) {
            addCriterion("tec.CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeNotEqualTo(String value) {
            addCriterion("tec.CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeGreaterThan(String value) {
            addCriterion("tec.CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("tec.CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeLessThan(String value) {
            addCriterion("tec.CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeLessThanOrEqualTo(String value) {
            addCriterion("tec.CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeIn(List<String> values) {
            addCriterion("tec.CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeNotIn(List<String> values) {
            addCriterion("tec.CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeLike(String value) {
            addCriterion("tec.CREATE_TIME like", "%" + value + "%", "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeNotLike(String value) {
            addCriterion("tec.CREATE_TIME not like", "%" + value + "%", "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("tec.CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andcreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tec.CREATE_TIME not between", value1, value2, "createTime");
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