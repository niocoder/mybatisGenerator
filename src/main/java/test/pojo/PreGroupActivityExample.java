package test.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PreGroupActivityExample {
    protected String orderByClause;

    protected String column;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PreGroupActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getColumn() {
        return column;
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

    /** 
     * 这个类来源于:pre_group_activity
     * 创建时间 : 2018-08-30
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeIsNull() {
            addCriterion("activity_class_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeIsNotNull() {
            addCriterion("activity_class_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeEqualTo(Integer value) {
            addCriterion("activity_class_type =", value, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeNotEqualTo(Integer value) {
            addCriterion("activity_class_type <>", value, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeGreaterThan(Integer value) {
            addCriterion("activity_class_type >", value, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_class_type >=", value, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeLessThan(Integer value) {
            addCriterion("activity_class_type <", value, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeLessThanOrEqualTo(Integer value) {
            addCriterion("activity_class_type <=", value, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeIn(List<Integer> values) {
            addCriterion("activity_class_type in", values, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeNotIn(List<Integer> values) {
            addCriterion("activity_class_type not in", values, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeBetween(Integer value1, Integer value2) {
            addCriterion("activity_class_type between", value1, value2, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andActivityClassTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_class_type not between", value1, value2, "activityClassType");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andGroupNumberIsNull() {
            addCriterion("group_number is null");
            return (Criteria) this;
        }

        public Criteria andGroupNumberIsNotNull() {
            addCriterion("group_number is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNumberEqualTo(Integer value) {
            addCriterion("group_number =", value, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberNotEqualTo(Integer value) {
            addCriterion("group_number <>", value, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberGreaterThan(Integer value) {
            addCriterion("group_number >", value, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_number >=", value, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberLessThan(Integer value) {
            addCriterion("group_number <", value, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberLessThanOrEqualTo(Integer value) {
            addCriterion("group_number <=", value, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberIn(List<Integer> values) {
            addCriterion("group_number in", values, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberNotIn(List<Integer> values) {
            addCriterion("group_number not in", values, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberBetween(Integer value1, Integer value2) {
            addCriterion("group_number between", value1, value2, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andGroupNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("group_number not between", value1, value2, "groupNumber");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNull() {
            addCriterion("activity_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNotNull() {
            addCriterion("activity_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeEqualTo(Integer value) {
            addCriterion("activity_time =", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotEqualTo(Integer value) {
            addCriterion("activity_time <>", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThan(Integer value) {
            addCriterion("activity_time >", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_time >=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThan(Integer value) {
            addCriterion("activity_time <", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThanOrEqualTo(Integer value) {
            addCriterion("activity_time <=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIn(List<Integer> values) {
            addCriterion("activity_time in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotIn(List<Integer> values) {
            addCriterion("activity_time not in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeBetween(Integer value1, Integer value2) {
            addCriterion("activity_time between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_time not between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNull() {
            addCriterion("course_price is null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNotNull() {
            addCriterion("course_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceEqualTo(Integer value) {
            addCriterion("course_price =", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotEqualTo(Integer value) {
            addCriterion("course_price <>", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThan(Integer value) {
            addCriterion("course_price >", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_price >=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThan(Integer value) {
            addCriterion("course_price <", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThanOrEqualTo(Integer value) {
            addCriterion("course_price <=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIn(List<Integer> values) {
            addCriterion("course_price in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotIn(List<Integer> values) {
            addCriterion("course_price not in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceBetween(Integer value1, Integer value2) {
            addCriterion("course_price between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("course_price not between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceIsNull() {
            addCriterion("course_group_price is null");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceIsNotNull() {
            addCriterion("course_group_price is not null");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceEqualTo(Integer value) {
            addCriterion("course_group_price =", value, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceNotEqualTo(Integer value) {
            addCriterion("course_group_price <>", value, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceGreaterThan(Integer value) {
            addCriterion("course_group_price >", value, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_group_price >=", value, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceLessThan(Integer value) {
            addCriterion("course_group_price <", value, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceLessThanOrEqualTo(Integer value) {
            addCriterion("course_group_price <=", value, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceIn(List<Integer> values) {
            addCriterion("course_group_price in", values, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceNotIn(List<Integer> values) {
            addCriterion("course_group_price not in", values, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceBetween(Integer value1, Integer value2) {
            addCriterion("course_group_price between", value1, value2, "courseGroupPrice");
            return (Criteria) this;
        }

        public Criteria andCourseGroupPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("course_group_price not between", value1, value2, "courseGroupPrice");
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

        public Criteria andCourseNumberIsNull() {
            addCriterion("course_number is null");
            return (Criteria) this;
        }

        public Criteria andCourseNumberIsNotNull() {
            addCriterion("course_number is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNumberEqualTo(Integer value) {
            addCriterion("course_number =", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberNotEqualTo(Integer value) {
            addCriterion("course_number <>", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberGreaterThan(Integer value) {
            addCriterion("course_number >", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_number >=", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLessThan(Integer value) {
            addCriterion("course_number <", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("course_number <=", value, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberIn(List<Integer> values) {
            addCriterion("course_number in", values, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberNotIn(List<Integer> values) {
            addCriterion("course_number not in", values, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberBetween(Integer value1, Integer value2) {
            addCriterion("course_number between", value1, value2, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCourseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("course_number not between", value1, value2, "courseNumber");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
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

        public Criteria andShareTitleIsNull() {
            addCriterion("share_title is null");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNotNull() {
            addCriterion("share_title is not null");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualTo(String value) {
            addCriterion("share_title =", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualTo(String value) {
            addCriterion("share_title <>", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThan(String value) {
            addCriterion("share_title >", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("share_title >=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThan(String value) {
            addCriterion("share_title <", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualTo(String value) {
            addCriterion("share_title <=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLike(String value) {
            addCriterion("share_title like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotLike(String value) {
            addCriterion("share_title not like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIn(List<String> values) {
            addCriterion("share_title in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotIn(List<String> values) {
            addCriterion("share_title not in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleBetween(String value1, String value2) {
            addCriterion("share_title between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotBetween(String value1, String value2) {
            addCriterion("share_title not between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionIsNull() {
            addCriterion("share_description is null");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionIsNotNull() {
            addCriterion("share_description is not null");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionEqualTo(String value) {
            addCriterion("share_description =", value, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionNotEqualTo(String value) {
            addCriterion("share_description <>", value, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionGreaterThan(String value) {
            addCriterion("share_description >", value, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("share_description >=", value, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionLessThan(String value) {
            addCriterion("share_description <", value, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionLessThanOrEqualTo(String value) {
            addCriterion("share_description <=", value, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionLike(String value) {
            addCriterion("share_description like", value, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionNotLike(String value) {
            addCriterion("share_description not like", value, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionIn(List<String> values) {
            addCriterion("share_description in", values, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionNotIn(List<String> values) {
            addCriterion("share_description not in", values, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionBetween(String value1, String value2) {
            addCriterion("share_description between", value1, value2, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareDescriptionNotBetween(String value1, String value2) {
            addCriterion("share_description not between", value1, value2, "shareDescription");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlIsNull() {
            addCriterion("share_img_url is null");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlIsNotNull() {
            addCriterion("share_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlEqualTo(String value) {
            addCriterion("share_img_url =", value, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlNotEqualTo(String value) {
            addCriterion("share_img_url <>", value, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlGreaterThan(String value) {
            addCriterion("share_img_url >", value, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("share_img_url >=", value, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlLessThan(String value) {
            addCriterion("share_img_url <", value, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlLessThanOrEqualTo(String value) {
            addCriterion("share_img_url <=", value, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlLike(String value) {
            addCriterion("share_img_url like", value, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlNotLike(String value) {
            addCriterion("share_img_url not like", value, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlIn(List<String> values) {
            addCriterion("share_img_url in", values, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlNotIn(List<String> values) {
            addCriterion("share_img_url not in", values, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlBetween(String value1, String value2) {
            addCriterion("share_img_url between", value1, value2, "shareImgUrl");
            return (Criteria) this;
        }

        public Criteria andShareImgUrlNotBetween(String value1, String value2) {
            addCriterion("share_img_url not between", value1, value2, "shareImgUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /** 
     * 这个类来源于:pre_group_activity
     * 创建时间 : 2018-08-30
     */
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