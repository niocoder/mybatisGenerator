package test.pojo;

import java.util.Date;

/** 
 * 这个类来源于:pre_group_found
 * 创建时间 : 2018-08-30
 */
public class PreGroupFound {
    /**
     * 主键ID
     */
    private Integer foundId;

    /**
     * 用户ID（团长ID）
     */
    private Integer userId;

    /**
     * 活动ID
     */
    private Integer activityId;

    /**
     * 拼团人数
     */
    private Integer groupNum;

    /**
     * 团购状态（0：团购未完成，1：团购已完成）
     */
    private Integer groupStatus;

    /**
     * 创建时间（发起日期）
     */
    private Date createTime;

    public PreGroupFound(Integer foundId, Integer userId, Integer activityId, Integer groupNum, Integer groupStatus, Date createTime) {
        this.foundId = foundId;
        this.userId = userId;
        this.activityId = activityId;
        this.groupNum = groupNum;
        this.groupStatus = groupStatus;
        this.createTime = createTime;
    }

    public PreGroupFound() {
        super();
    }

    /**
     *  get 主键ID
     */
    public Integer getFoundId() {
        return foundId;
    }

    /**
     *  set 主键ID
     */
    public void setFoundId(Integer foundId) {
        this.foundId = foundId;
    }

    /**
     *  get 用户ID（团长ID）
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *  set 用户ID（团长ID）
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *  get 活动ID
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     *  set 活动ID
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     *  get 拼团人数
     */
    public Integer getGroupNum() {
        return groupNum;
    }

    /**
     *  set 拼团人数
     */
    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    /**
     *  get 团购状态（0：团购未完成，1：团购已完成）
     */
    public Integer getGroupStatus() {
        return groupStatus;
    }

    /**
     *  set 团购状态（0：团购未完成，1：团购已完成）
     */
    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }

    /**
     *  get 创建时间（发起日期）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  set 创建时间（发起日期）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}