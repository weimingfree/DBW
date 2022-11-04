package cn.xj.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andCnoIsNull() {
            addCriterion("Cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("Cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(String value) {
            addCriterion("Cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(String value) {
            addCriterion("Cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(String value) {
            addCriterion("Cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(String value) {
            addCriterion("Cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(String value) {
            addCriterion("Cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(String value) {
            addCriterion("Cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLike(String value) {
            addCriterion("Cno like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotLike(String value) {
            addCriterion("Cno not like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<String> values) {
            addCriterion("Cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<String> values) {
            addCriterion("Cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(String value1, String value2) {
            addCriterion("Cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(String value1, String value2) {
            addCriterion("Cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("Cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("Cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("Cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("Cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("Cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("Cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("Cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("Cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("Cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("Cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("Cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("Cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("Cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("Cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCpnoIsNull() {
            addCriterion("Cpno is null");
            return (Criteria) this;
        }

        public Criteria andCpnoIsNotNull() {
            addCriterion("Cpno is not null");
            return (Criteria) this;
        }

        public Criteria andCpnoEqualTo(String value) {
            addCriterion("Cpno =", value, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoNotEqualTo(String value) {
            addCriterion("Cpno <>", value, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoGreaterThan(String value) {
            addCriterion("Cpno >", value, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoGreaterThanOrEqualTo(String value) {
            addCriterion("Cpno >=", value, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoLessThan(String value) {
            addCriterion("Cpno <", value, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoLessThanOrEqualTo(String value) {
            addCriterion("Cpno <=", value, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoLike(String value) {
            addCriterion("Cpno like", value, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoNotLike(String value) {
            addCriterion("Cpno not like", value, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoIn(List<String> values) {
            addCriterion("Cpno in", values, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoNotIn(List<String> values) {
            addCriterion("Cpno not in", values, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoBetween(String value1, String value2) {
            addCriterion("Cpno between", value1, value2, "cpno");
            return (Criteria) this;
        }

        public Criteria andCpnoNotBetween(String value1, String value2) {
            addCriterion("Cpno not between", value1, value2, "cpno");
            return (Criteria) this;
        }

        public Criteria andCcreditIsNull() {
            addCriterion("Ccredit is null");
            return (Criteria) this;
        }

        public Criteria andCcreditIsNotNull() {
            addCriterion("Ccredit is not null");
            return (Criteria) this;
        }

        public Criteria andCcreditEqualTo(String value) {
            addCriterion("Ccredit =", value, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditNotEqualTo(String value) {
            addCriterion("Ccredit <>", value, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditGreaterThan(String value) {
            addCriterion("Ccredit >", value, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditGreaterThanOrEqualTo(String value) {
            addCriterion("Ccredit >=", value, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditLessThan(String value) {
            addCriterion("Ccredit <", value, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditLessThanOrEqualTo(String value) {
            addCriterion("Ccredit <=", value, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditLike(String value) {
            addCriterion("Ccredit like", value, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditNotLike(String value) {
            addCriterion("Ccredit not like", value, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditIn(List<String> values) {
            addCriterion("Ccredit in", values, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditNotIn(List<String> values) {
            addCriterion("Ccredit not in", values, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditBetween(String value1, String value2) {
            addCriterion("Ccredit between", value1, value2, "ccredit");
            return (Criteria) this;
        }

        public Criteria andCcreditNotBetween(String value1, String value2) {
            addCriterion("Ccredit not between", value1, value2, "ccredit");
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