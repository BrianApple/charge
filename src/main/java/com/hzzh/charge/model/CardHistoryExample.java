package com.hzzh.charge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：t_ev_card_history表的查询条件类CardHistoryExample
 * 内容摘要：t_ev_card_history表的各个元素的查询条件
 * @author 工具生成
 * @version 1.0 2016年10月20日
 */
public class CardHistoryExample {

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

    public CardHistoryExample() {
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
            addCriterion("tech.GUID_ is null");
            return (Criteria) this;
        }

        public Criteria andguidIsNotNull() {
            addCriterion("tech.GUID_ is not null");
            return (Criteria) this;
        }

        public Criteria andguidEqualTo(String value) {
            addCriterion("tech.GUID_ =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotEqualTo(String value) {
            addCriterion("tech.GUID_ <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThan(String value) {
            addCriterion("tech.GUID_ >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidGreaterThanOrEqualTo(String value) {
            addCriterion("tech.GUID_ >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThan(String value) {
            addCriterion("tech.GUID_ <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLessThanOrEqualTo(String value) {
            addCriterion("tech.GUID_ <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andguidIn(List<String> values) {
            addCriterion("tech.GUID_ in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotIn(List<String> values) {
            addCriterion("tech.GUID_ not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andguidLike(String value) {
            addCriterion("tech.GUID_ like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotLike(String value) {
            addCriterion("tech.GUID_ not like", "%" + value + "%", "guid");
            return (Criteria) this;
        }

        public Criteria andguidBetween(Integer value1, Integer value2) {
            addCriterion("tech.GUID_ between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andguidNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.GUID_ not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andcardNoIsNull() {
            addCriterion("tech.CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andcardNoIsNotNull() {
            addCriterion("tech.CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andcardNoEqualTo(String value) {
            addCriterion("tech.CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotEqualTo(String value) {
            addCriterion("tech.CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoGreaterThan(String value) {
            addCriterion("tech.CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("tech.CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLessThan(String value) {
            addCriterion("tech.CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLessThanOrEqualTo(String value) {
            addCriterion("tech.CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoIn(List<String> values) {
            addCriterion("tech.CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotIn(List<String> values) {
            addCriterion("tech.CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoLike(String value) {
            addCriterion("tech.CARD_NO like", "%" + value + "%", "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotLike(String value) {
            addCriterion("tech.CARD_NO not like", "%" + value + "%", "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcardNoNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andcarNoIsNull() {
            addCriterion("tech.CAR_NO is null");
            return (Criteria) this;
        }

        public Criteria andcarNoIsNotNull() {
            addCriterion("tech.CAR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andcarNoEqualTo(String value) {
            addCriterion("tech.CAR_NO =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotEqualTo(String value) {
            addCriterion("tech.CAR_NO <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoGreaterThan(String value) {
            addCriterion("tech.CAR_NO >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoGreaterThanOrEqualTo(String value) {
            addCriterion("tech.CAR_NO >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLessThan(String value) {
            addCriterion("tech.CAR_NO <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLessThanOrEqualTo(String value) {
            addCriterion("tech.CAR_NO <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoIn(List<String> values) {
            addCriterion("tech.CAR_NO in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotIn(List<String> values) {
            addCriterion("tech.CAR_NO not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoLike(String value) {
            addCriterion("tech.CAR_NO like", "%" + value + "%", "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotLike(String value) {
            addCriterion("tech.CAR_NO not like", "%" + value + "%", "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoBetween(Integer value1, Integer value2) {
            addCriterion("tech.CAR_NO between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andcarNoNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CAR_NO not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIsNull() {
            addCriterion("tech.COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIsNotNull() {
            addCriterion("tech.COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andcompanyIdEqualTo(String value) {
            addCriterion("tech.COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotEqualTo(String value) {
            addCriterion("tech.COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdGreaterThan(String value) {
            addCriterion("tech.COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("tech.COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLessThan(String value) {
            addCriterion("tech.COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLessThanOrEqualTo(String value) {
            addCriterion("tech.COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdIn(List<String> values) {
            addCriterion("tech.COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotIn(List<String> values) {
            addCriterion("tech.COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdLike(String value) {
            addCriterion("tech.COMPANY_ID like", "%" + value + "%", "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotLike(String value) {
            addCriterion("tech.COMPANY_ID not like", "%" + value + "%", "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("tech.COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andcompanyNameIsNull() {
            addCriterion("tech.COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andcompanyNameIsNotNull() {
            addCriterion("tech.COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andcompanyNameEqualTo(String value) {
            addCriterion("tech.COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameNotEqualTo(String value) {
            addCriterion("tech.COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameGreaterThan(String value) {
            addCriterion("tech.COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("tech.COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameLessThan(String value) {
            addCriterion("tech.COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameLessThanOrEqualTo(String value) {
            addCriterion("tech.COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameIn(List<String> values) {
            addCriterion("tech.COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameNotIn(List<String> values) {
            addCriterion("tech.COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameLike(String value) {
            addCriterion("tech.COMPANY_NAME like", "%" + value + "%", "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameNotLike(String value) {
            addCriterion("tech.COMPANY_NAME not like", "%" + value + "%", "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameBetween(Integer value1, Integer value2) {
            addCriterion("tech.COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andcompanyNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andownerIdIsNull() {
            addCriterion("tech.OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andownerIdIsNotNull() {
            addCriterion("tech.OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andownerIdEqualTo(String value) {
            addCriterion("tech.OWNER_ID =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdNotEqualTo(String value) {
            addCriterion("tech.OWNER_ID <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdGreaterThan(String value) {
            addCriterion("tech.OWNER_ID >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdGreaterThanOrEqualTo(String value) {
            addCriterion("tech.OWNER_ID >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdLessThan(String value) {
            addCriterion("tech.OWNER_ID <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdLessThanOrEqualTo(String value) {
            addCriterion("tech.OWNER_ID <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdIn(List<String> values) {
            addCriterion("tech.OWNER_ID in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdNotIn(List<String> values) {
            addCriterion("tech.OWNER_ID not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdLike(String value) {
            addCriterion("tech.OWNER_ID like", "%" + value + "%", "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdNotLike(String value) {
            addCriterion("tech.OWNER_ID not like", "%" + value + "%", "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdBetween(Integer value1, Integer value2) {
            addCriterion("tech.OWNER_ID between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.OWNER_ID not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andownerNameIsNull() {
            addCriterion("tech.OWNER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andownerNameIsNotNull() {
            addCriterion("tech.OWNER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andownerNameEqualTo(String value) {
            addCriterion("tech.OWNER_NAME =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameNotEqualTo(String value) {
            addCriterion("tech.OWNER_NAME <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameGreaterThan(String value) {
            addCriterion("tech.OWNER_NAME >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameGreaterThanOrEqualTo(String value) {
            addCriterion("tech.OWNER_NAME >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameLessThan(String value) {
            addCriterion("tech.OWNER_NAME <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameLessThanOrEqualTo(String value) {
            addCriterion("tech.OWNER_NAME <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameIn(List<String> values) {
            addCriterion("tech.OWNER_NAME in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameNotIn(List<String> values) {
            addCriterion("tech.OWNER_NAME not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameLike(String value) {
            addCriterion("tech.OWNER_NAME like", "%" + value + "%", "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameNotLike(String value) {
            addCriterion("tech.OWNER_NAME not like", "%" + value + "%", "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameBetween(Integer value1, Integer value2) {
            addCriterion("tech.OWNER_NAME between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andownerNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.OWNER_NAME not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceIsNull() {
            addCriterion("tech.CARD_OLD_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceIsNotNull() {
            addCriterion("tech.CARD_OLD_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceEqualTo(Long value) {
            addCriterion("tech.CARD_OLD_BALANCE =", value, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceNotEqualTo(Long value) {
            addCriterion("tech.CARD_OLD_BALANCE <>", value, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceGreaterThan(Long value) {
            addCriterion("tech.CARD_OLD_BALANCE >", value, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_OLD_BALANCE >=", value, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceLessThan(Long value) {
            addCriterion("tech.CARD_OLD_BALANCE <", value, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceLessThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_OLD_BALANCE <=", value, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceIn(List<Long> values) {
            addCriterion("tech.CARD_OLD_BALANCE in", values, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceNotIn(List<Long> values) {
            addCriterion("tech.CARD_OLD_BALANCE not in", values, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceLike(Long value) {
            addCriterion("tech.CARD_OLD_BALANCE like", "%" + value + "%", "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceNotLike(Long value) {
            addCriterion("tech.CARD_OLD_BALANCE not like", "%" + value + "%", "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_OLD_BALANCE between", value1, value2, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardOldBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_OLD_BALANCE not between", value1, value2, "cardOldBalance");
            return (Criteria) this;
        }

        public Criteria andcardMoneyIsNull() {
            addCriterion("tech.CARD_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andcardMoneyIsNotNull() {
            addCriterion("tech.CARD_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andcardMoneyEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY =", value, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyNotEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY <>", value, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyGreaterThan(Long value) {
            addCriterion("tech.CARD_MONEY >", value, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY >=", value, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyLessThan(Long value) {
            addCriterion("tech.CARD_MONEY <", value, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyLessThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY <=", value, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyIn(List<Long> values) {
            addCriterion("tech.CARD_MONEY in", values, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyNotIn(List<Long> values) {
            addCriterion("tech.CARD_MONEY not in", values, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyLike(Long value) {
            addCriterion("tech.CARD_MONEY like", "%" + value + "%", "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyNotLike(Long value) {
            addCriterion("tech.CARD_MONEY not like", "%" + value + "%", "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_MONEY between", value1, value2, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_MONEY not between", value1, value2, "cardMoney");
            return (Criteria) this;
        }

        public Criteria andcardBalanceIsNull() {
            addCriterion("tech.CARD_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andcardBalanceIsNotNull() {
            addCriterion("tech.CARD_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andcardBalanceEqualTo(Long value) {
            addCriterion("tech.CARD_BALANCE =", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceNotEqualTo(Long value) {
            addCriterion("tech.CARD_BALANCE <>", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceGreaterThan(Long value) {
            addCriterion("tech.CARD_BALANCE >", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_BALANCE >=", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceLessThan(Long value) {
            addCriterion("tech.CARD_BALANCE <", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceLessThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_BALANCE <=", value, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceIn(List<Long> values) {
            addCriterion("tech.CARD_BALANCE in", values, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceNotIn(List<Long> values) {
            addCriterion("tech.CARD_BALANCE not in", values, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceLike(Long value) {
            addCriterion("tech.CARD_BALANCE like", "%" + value + "%", "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceNotLike(Long value) {
            addCriterion("tech.CARD_BALANCE not like", "%" + value + "%", "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_BALANCE between", value1, value2, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_BALANCE not between", value1, value2, "cardBalance");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhIsNull() {
            addCriterion("tech.CARD_MONEY_YH is null");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhIsNotNull() {
            addCriterion("tech.CARD_MONEY_YH is not null");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_YH =", value, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhNotEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_YH <>", value, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhGreaterThan(Long value) {
            addCriterion("tech.CARD_MONEY_YH >", value, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhGreaterThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_YH >=", value, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhLessThan(Long value) {
            addCriterion("tech.CARD_MONEY_YH <", value, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhLessThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_YH <=", value, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhIn(List<Long> values) {
            addCriterion("tech.CARD_MONEY_YH in", values, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhNotIn(List<Long> values) {
            addCriterion("tech.CARD_MONEY_YH not in", values, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhLike(Long value) {
            addCriterion("tech.CARD_MONEY_YH like", "%" + value + "%", "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhNotLike(Long value) {
            addCriterion("tech.CARD_MONEY_YH not like", "%" + value + "%", "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_MONEY_YH between", value1, value2, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyYhNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_MONEY_YH not between", value1, value2, "cardMoneyYh");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzIsNull() {
            addCriterion("tech.CARD_MONEY_TZ is null");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzIsNotNull() {
            addCriterion("tech.CARD_MONEY_TZ is not null");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_TZ =", value, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzNotEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_TZ <>", value, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzGreaterThan(Long value) {
            addCriterion("tech.CARD_MONEY_TZ >", value, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzGreaterThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_TZ >=", value, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzLessThan(Long value) {
            addCriterion("tech.CARD_MONEY_TZ <", value, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzLessThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_TZ <=", value, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzIn(List<Long> values) {
            addCriterion("tech.CARD_MONEY_TZ in", values, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzNotIn(List<Long> values) {
            addCriterion("tech.CARD_MONEY_TZ not in", values, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzLike(Long value) {
            addCriterion("tech.CARD_MONEY_TZ like", "%" + value + "%", "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzNotLike(Long value) {
            addCriterion("tech.CARD_MONEY_TZ not like", "%" + value + "%", "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_MONEY_TZ between", value1, value2, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyTzNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_MONEY_TZ not between", value1, value2, "cardMoneyTz");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfIsNull() {
            addCriterion("tech.CARD_MONEY_JF is null");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfIsNotNull() {
            addCriterion("tech.CARD_MONEY_JF is not null");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_JF =", value, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfNotEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_JF <>", value, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfGreaterThan(Long value) {
            addCriterion("tech.CARD_MONEY_JF >", value, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfGreaterThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_JF >=", value, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfLessThan(Long value) {
            addCriterion("tech.CARD_MONEY_JF <", value, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfLessThanOrEqualTo(Long value) {
            addCriterion("tech.CARD_MONEY_JF <=", value, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfIn(List<Long> values) {
            addCriterion("tech.CARD_MONEY_JF in", values, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfNotIn(List<Long> values) {
            addCriterion("tech.CARD_MONEY_JF not in", values, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfLike(Long value) {
            addCriterion("tech.CARD_MONEY_JF like", "%" + value + "%", "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfNotLike(Long value) {
            addCriterion("tech.CARD_MONEY_JF not like", "%" + value + "%", "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_MONEY_JF between", value1, value2, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardMoneyJfNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_MONEY_JF not between", value1, value2, "cardMoneyJf");
            return (Criteria) this;
        }

        public Criteria andcardTypeIsNull() {
            addCriterion("tech.CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andcardTypeIsNotNull() {
            addCriterion("tech.CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andcardTypeEqualTo(String value) {
            addCriterion("tech.CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeNotEqualTo(String value) {
            addCriterion("tech.CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeGreaterThan(String value) {
            addCriterion("tech.CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tech.CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeLessThan(String value) {
            addCriterion("tech.CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeLessThanOrEqualTo(String value) {
            addCriterion("tech.CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeIn(List<String> values) {
            addCriterion("tech.CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeNotIn(List<String> values) {
            addCriterion("tech.CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeLike(String value) {
            addCriterion("tech.CARD_TYPE like", "%" + value + "%", "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeNotLike(String value) {
            addCriterion("tech.CARD_TYPE not like", "%" + value + "%", "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andcardStatusIsNull() {
            addCriterion("tech.CARD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andcardStatusIsNotNull() {
            addCriterion("tech.CARD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andcardStatusEqualTo(String value) {
            addCriterion("tech.CARD_STATUS =", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusNotEqualTo(String value) {
            addCriterion("tech.CARD_STATUS <>", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusGreaterThan(String value) {
            addCriterion("tech.CARD_STATUS >", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tech.CARD_STATUS >=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusLessThan(String value) {
            addCriterion("tech.CARD_STATUS <", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusLessThanOrEqualTo(String value) {
            addCriterion("tech.CARD_STATUS <=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusIn(List<String> values) {
            addCriterion("tech.CARD_STATUS in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusNotIn(List<String> values) {
            addCriterion("tech.CARD_STATUS not in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusLike(String value) {
            addCriterion("tech.CARD_STATUS like", "%" + value + "%", "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusNotLike(String value) {
            addCriterion("tech.CARD_STATUS not like", "%" + value + "%", "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_STATUS between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andcardStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.CARD_STATUS not between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeIsNull() {
            addCriterion("tech.OPERATOR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeIsNotNull() {
            addCriterion("tech.OPERATOR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeEqualTo(String value) {
            addCriterion("tech.OPERATOR_TYPE =", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeNotEqualTo(String value) {
            addCriterion("tech.OPERATOR_TYPE <>", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeGreaterThan(String value) {
            addCriterion("tech.OPERATOR_TYPE >", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tech.OPERATOR_TYPE >=", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeLessThan(String value) {
            addCriterion("tech.OPERATOR_TYPE <", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeLessThanOrEqualTo(String value) {
            addCriterion("tech.OPERATOR_TYPE <=", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeIn(List<String> values) {
            addCriterion("tech.OPERATOR_TYPE in", values, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeNotIn(List<String> values) {
            addCriterion("tech.OPERATOR_TYPE not in", values, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeLike(String value) {
            addCriterion("tech.OPERATOR_TYPE like", "%" + value + "%", "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeNotLike(String value) {
            addCriterion("tech.OPERATOR_TYPE not like", "%" + value + "%", "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeBetween(Integer value1, Integer value2) {
            addCriterion("tech.OPERATOR_TYPE between", value1, value2, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.OPERATOR_TYPE not between", value1, value2, "operatorType");
            return (Criteria) this;
        }

        public Criteria andoperatorIdIsNull() {
            addCriterion("tech.OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andoperatorIdIsNotNull() {
            addCriterion("tech.OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andoperatorIdEqualTo(String value) {
            addCriterion("tech.OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdNotEqualTo(String value) {
            addCriterion("tech.OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdGreaterThan(String value) {
            addCriterion("tech.OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("tech.OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdLessThan(String value) {
            addCriterion("tech.OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdLessThanOrEqualTo(String value) {
            addCriterion("tech.OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdIn(List<String> values) {
            addCriterion("tech.OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdNotIn(List<String> values) {
            addCriterion("tech.OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdLike(String value) {
            addCriterion("tech.OPERATOR_ID like", "%" + value + "%", "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdNotLike(String value) {
            addCriterion("tech.OPERATOR_ID not like", "%" + value + "%", "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("tech.OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andoperatorNameIsNull() {
            addCriterion("tech.OPERATOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andoperatorNameIsNotNull() {
            addCriterion("tech.OPERATOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andoperatorNameEqualTo(String value) {
            addCriterion("tech.OPERATOR_NAME =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameNotEqualTo(String value) {
            addCriterion("tech.OPERATOR_NAME <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameGreaterThan(String value) {
            addCriterion("tech.OPERATOR_NAME >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("tech.OPERATOR_NAME >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameLessThan(String value) {
            addCriterion("tech.OPERATOR_NAME <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameLessThanOrEqualTo(String value) {
            addCriterion("tech.OPERATOR_NAME <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameIn(List<String> values) {
            addCriterion("tech.OPERATOR_NAME in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameNotIn(List<String> values) {
            addCriterion("tech.OPERATOR_NAME not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameLike(String value) {
            addCriterion("tech.OPERATOR_NAME like", "%" + value + "%", "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameNotLike(String value) {
            addCriterion("tech.OPERATOR_NAME not like", "%" + value + "%", "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameBetween(Integer value1, Integer value2) {
            addCriterion("tech.OPERATOR_NAME between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperatorNameNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.OPERATOR_NAME not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andoperateTimeIsNull() {
            addCriterion("tech.OPERATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andoperateTimeIsNotNull() {
            addCriterion("tech.OPERATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andoperateTimeEqualTo(String value) {
            addCriterion("tech.OPERATE_TIME =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeNotEqualTo(String value) {
            addCriterion("tech.OPERATE_TIME <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeGreaterThan(String value) {
            addCriterion("tech.OPERATE_TIME >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("tech.OPERATE_TIME >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeLessThan(String value) {
            addCriterion("tech.OPERATE_TIME <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeLessThanOrEqualTo(String value) {
            addCriterion("tech.OPERATE_TIME <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeIn(List<String> values) {
            addCriterion("tech.OPERATE_TIME in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeNotIn(List<String> values) {
            addCriterion("tech.OPERATE_TIME not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeLike(String value) {
            addCriterion("tech.OPERATE_TIME like", "%" + value + "%", "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeNotLike(String value) {
            addCriterion("tech.OPERATE_TIME not like", "%" + value + "%", "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeBetween(Integer value1, Integer value2) {
            addCriterion("tech.OPERATE_TIME between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andoperateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tech.OPERATE_TIME not between", value1, value2, "operateTime");
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