package cn.itcast.mybatis.generator.model;

import java.math.BigDecimal;
import java.util.Date;

public class AgProtocol {
    private Long id;

    private String protocolNo;

    private String protocolName;

    private Long projectId;

    private String projectNo;

    private String projectName;

    private Long orgId;

    private String orgName;

    private Long supplierCode;

    private String supplierName;

    private String supplierContactPerson;

    private String supplierContactPhone;

    private Boolean bidState;

    private Long statusStep;

    private String statusComment;

    private Boolean state;

    private Boolean mode;

    private Boolean source;

    private Integer trait;

    private Boolean bizType;

    private String bizTypeName;

    private Date applyDate;

    private Date implStartDate;

    private Date implEndDate;

    private BigDecimal discountRate;

    private String entrustOrgIds;

    private String remark;

    private Boolean isDeleted;

    private String creator;

    private String modifier;

    private Date gmtCreated;

    private Date gmtModified;

    private Boolean isContainGoods;

    private String contactPerson;

    private String contactPhone;

    private String districtId;

    private String districtName;

    private Date suspendStartDate;

    private Date suspendEndDate;

    private Long depositAmount;

    private Boolean protocolType;

    private Long netId;

    private String instanceCode;

    private String supplierTag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName == null ? null : protocolName.trim();
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Long getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(Long supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierContactPerson() {
        return supplierContactPerson;
    }

    public void setSupplierContactPerson(String supplierContactPerson) {
        this.supplierContactPerson = supplierContactPerson == null ? null : supplierContactPerson.trim();
    }

    public String getSupplierContactPhone() {
        return supplierContactPhone;
    }

    public void setSupplierContactPhone(String supplierContactPhone) {
        this.supplierContactPhone = supplierContactPhone == null ? null : supplierContactPhone.trim();
    }

    public Boolean getBidState() {
        return bidState;
    }

    public void setBidState(Boolean bidState) {
        this.bidState = bidState;
    }

    public Long getStatusStep() {
        return statusStep;
    }

    public void setStatusStep(Long statusStep) {
        this.statusStep = statusStep;
    }

    public String getStatusComment() {
        return statusComment;
    }

    public void setStatusComment(String statusComment) {
        this.statusComment = statusComment == null ? null : statusComment.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getMode() {
        return mode;
    }

    public void setMode(Boolean mode) {
        this.mode = mode;
    }

    public Boolean getSource() {
        return source;
    }

    public void setSource(Boolean source) {
        this.source = source;
    }

    public Integer getTrait() {
        return trait;
    }

    public void setTrait(Integer trait) {
        this.trait = trait;
    }

    public Boolean getBizType() {
        return bizType;
    }

    public void setBizType(Boolean bizType) {
        this.bizType = bizType;
    }

    public String getBizTypeName() {
        return bizTypeName;
    }

    public void setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName == null ? null : bizTypeName.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getImplStartDate() {
        return implStartDate;
    }

    public void setImplStartDate(Date implStartDate) {
        this.implStartDate = implStartDate;
    }

    public Date getImplEndDate() {
        return implEndDate;
    }

    public void setImplEndDate(Date implEndDate) {
        this.implEndDate = implEndDate;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public String getEntrustOrgIds() {
        return entrustOrgIds;
    }

    public void setEntrustOrgIds(String entrustOrgIds) {
        this.entrustOrgIds = entrustOrgIds == null ? null : entrustOrgIds.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getIsContainGoods() {
        return isContainGoods;
    }

    public void setIsContainGoods(Boolean isContainGoods) {
        this.isContainGoods = isContainGoods;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public Date getSuspendStartDate() {
        return suspendStartDate;
    }

    public void setSuspendStartDate(Date suspendStartDate) {
        this.suspendStartDate = suspendStartDate;
    }

    public Date getSuspendEndDate() {
        return suspendEndDate;
    }

    public void setSuspendEndDate(Date suspendEndDate) {
        this.suspendEndDate = suspendEndDate;
    }

    public Long getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Boolean getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Boolean protocolType) {
        this.protocolType = protocolType;
    }

    public Long getNetId() {
        return netId;
    }

    public void setNetId(Long netId) {
        this.netId = netId;
    }

    public String getInstanceCode() {
        return instanceCode;
    }

    public void setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode == null ? null : instanceCode.trim();
    }

    public String getSupplierTag() {
        return supplierTag;
    }

    public void setSupplierTag(String supplierTag) {
        this.supplierTag = supplierTag == null ? null : supplierTag.trim();
    }
}