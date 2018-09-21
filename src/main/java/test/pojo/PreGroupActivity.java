package test.pojo;

import java.util.Date;

/** 
 * 这个类来源于:pre_group_activity
 * 创建时间 : 2018-08-30
 */
public class PreGroupActivity {
    /**
     * 主键ID（活动编号）
     */
    private Integer activityId;

    /**
     * 活动班型
     */
    private Integer activityClassType;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 活动结束时间
     */
    private Date endTime;

    /**
     * 成团人数
     */
    private Integer groupNumber;

    /**
     * 拼团活动时限（单位为小时）
     */
    private Integer activityTime;

    /**
     * 课程原价
     */
    private Integer coursePrice;

    /**
     * 课程团购价
     */
    private Integer courseGroupPrice;

    /**
     * 限购数量
     */
    private Integer totalNumber;

    /**
     * 课节数
     */
    private Integer courseNumber;

    /**
     * 创建人
     */
    private Integer creatorId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 分享标题
     */
    private String shareTitle;

    /**
     * 分享描述
     */
    private String shareDescription;

    /**
     * 分享缩略图
     */
    private String shareImgUrl;

    public PreGroupActivity(Integer activityId, Integer activityClassType, Date startTime, Date endTime, Integer groupNumber, Integer activityTime, Integer coursePrice, Integer courseGroupPrice, Integer totalNumber, Integer courseNumber, Integer creatorId, Date createTime, String shareTitle, String shareDescription, String shareImgUrl) {
        this.activityId = activityId;
        this.activityClassType = activityClassType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.groupNumber = groupNumber;
        this.activityTime = activityTime;
        this.coursePrice = coursePrice;
        this.courseGroupPrice = courseGroupPrice;
        this.totalNumber = totalNumber;
        this.courseNumber = courseNumber;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.shareTitle = shareTitle;
        this.shareDescription = shareDescription;
        this.shareImgUrl = shareImgUrl;
    }

    public PreGroupActivity() {
        super();
    }

    /**
     *  get 主键ID（活动编号）
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     *  set 主键ID（活动编号）
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     *  get 活动班型
     */
    public Integer getActivityClassType() {
        return activityClassType;
    }

    /**
     *  set 活动班型
     */
    public void setActivityClassType(Integer activityClassType) {
        this.activityClassType = activityClassType;
    }

    /**
     *  get 活动开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     *  set 活动开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     *  get 活动结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     *  set 活动结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     *  get 成团人数
     */
    public Integer getGroupNumber() {
        return groupNumber;
    }

    /**
     *  set 成团人数
     */
    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     *  get 拼团活动时限（单位为小时）
     */
    public Integer getActivityTime() {
        return activityTime;
    }

    /**
     *  set 拼团活动时限（单位为小时）
     */
    public void setActivityTime(Integer activityTime) {
        this.activityTime = activityTime;
    }

    /**
     *  get 课程原价
     */
    public Integer getCoursePrice() {
        return coursePrice;
    }

    /**
     *  set 课程原价
     */
    public void setCoursePrice(Integer coursePrice) {
        this.coursePrice = coursePrice;
    }

    /**
     *  get 课程团购价
     */
    public Integer getCourseGroupPrice() {
        return courseGroupPrice;
    }

    /**
     *  set 课程团购价
     */
    public void setCourseGroupPrice(Integer courseGroupPrice) {
        this.courseGroupPrice = courseGroupPrice;
    }

    /**
     *  get 限购数量
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    /**
     *  set 限购数量
     */
    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     *  get 课节数
     */
    public Integer getCourseNumber() {
        return courseNumber;
    }

    /**
     *  set 课节数
     */
    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    /**
     *  get 创建人
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     *  set 创建人
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     *  get 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  set 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *  get 分享标题
     */
    public String getShareTitle() {
        return shareTitle;
    }

    /**
     *  set 分享标题
     */
    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle == null ? null : shareTitle.trim();
    }

    /**
     *  get 分享描述
     */
    public String getShareDescription() {
        return shareDescription;
    }

    /**
     *  set 分享描述
     */
    public void setShareDescription(String shareDescription) {
        this.shareDescription = shareDescription == null ? null : shareDescription.trim();
    }

    /**
     *  get 分享缩略图
     */
    public String getShareImgUrl() {
        return shareImgUrl;
    }

    /**
     *  set 分享缩略图
     */
    public void setShareImgUrl(String shareImgUrl) {
        this.shareImgUrl = shareImgUrl == null ? null : shareImgUrl.trim();
    }
}