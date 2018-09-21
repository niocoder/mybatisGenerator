package test.pojo;

import java.util.Date;

/** 
 * 这个类来源于:pre_group_follow
 * 创建时间 : 2018-08-30
 */
public class PreGroupFollow {
    /**
     * 主键ID
     */
    private Integer followId;

    /**
     * 拼团ID
     */
    private Integer foundId;

    /**
     * 活动ID
     */
    private Integer activityId;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 团员ID
     */
    private Integer userId;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 支付状态（0：未支付，1：已支付）
     */
    private Integer payStatus;

    /**
     * 下单时间
     */
    private Date createTime;

    public PreGroupFollow(Integer followId, Integer foundId, Integer activityId, String orderId, Integer userId, Date payTime, String payType, Integer payStatus, Date createTime) {
        this.followId = followId;
        this.foundId = foundId;
        this.activityId = activityId;
        this.orderId = orderId;
        this.userId = userId;
        this.payTime = payTime;
        this.payType = payType;
        this.payStatus = payStatus;
        this.createTime = createTime;
    }

    public PreGroupFollow() {
        super();
    }

    /**
     *  get 主键ID
     */
    public Integer getFollowId() {
        return followId;
    }

    /**
     *  set 主键ID
     */
    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    /**
     *  get 拼团ID
     */
    public Integer getFoundId() {
        return foundId;
    }

    /**
     *  set 拼团ID
     */
    public void setFoundId(Integer foundId) {
        this.foundId = foundId;
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
     *  get 订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     *  set 订单号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     *  get 团员ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *  set 团员ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *  get 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     *  set 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     *  get 支付方式
     */
    public String getPayType() {
        return payType;
    }

    /**
     *  set 支付方式
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     *  get 支付状态（0：未支付，1：已支付）
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     *  set 支付状态（0：未支付，1：已支付）
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     *  get 下单时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *  set 下单时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}