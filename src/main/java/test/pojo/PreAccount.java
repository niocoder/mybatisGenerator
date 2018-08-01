package test.pojo;

import java.util.Date;

/** 
 * 这个类来源于:pre_account
 * 创建时间 : 2018-08-01
 */
public class PreAccount {
    /**
     * ID
     */
    private Integer id;

    /**
     * 机构ID
     */
    private Integer organizationid;

    /**
     * 账户余额
     */
    private Double accountbalance;

    /**
     * 创建日期
     */
    private Date createdate;

    /**
     * 创建人
     */
    private Integer creator;

    /**
     * 修改日期
     */
    private Date modifieddate;

    /**
     * 修改人
     */
    private Integer modifier;

    public PreAccount(Integer id, Integer organizationid, Double accountbalance, Date createdate, Integer creator, Date modifieddate, Integer modifier) {
        this.id = id;
        this.organizationid = organizationid;
        this.accountbalance = accountbalance;
        this.createdate = createdate;
        this.creator = creator;
        this.modifieddate = modifieddate;
        this.modifier = modifier;
    }

    public PreAccount() {
        super();
    }

    /**
     *  get ID
     */
    public Integer getId() {
        return id;
    }

    /**
     *  set ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *  get 机构ID
     */
    public Integer getOrganizationid() {
        return organizationid;
    }

    /**
     *  set 机构ID
     */
    public void setOrganizationid(Integer organizationid) {
        this.organizationid = organizationid;
    }

    /**
     *  get 账户余额
     */
    public Double getAccountbalance() {
        return accountbalance;
    }

    /**
     *  set 账户余额
     */
    public void setAccountbalance(Double accountbalance) {
        this.accountbalance = accountbalance;
    }

    /**
     *  get 创建日期
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     *  set 创建日期
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     *  get 创建人
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     *  set 创建人
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     *  get 修改日期
     */
    public Date getModifieddate() {
        return modifieddate;
    }

    /**
     *  set 修改日期
     */
    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    /**
     *  get 修改人
     */
    public Integer getModifier() {
        return modifier;
    }

    /**
     *  set 修改人
     */
    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }
}