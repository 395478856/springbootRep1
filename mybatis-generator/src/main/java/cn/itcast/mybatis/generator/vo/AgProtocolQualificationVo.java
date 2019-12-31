package cn.itcast.mybatis.generator.vo;

import java.util.Date;

public class AgProtocolQualificationVo {
    private Long id;

    private Long protocolId;

    private String protocolName;

    private Long supplierCode;

    private String supplierName;

    private String deliverId;

    private Boolean deliverType;

    private String fromDistrictId;

    private String fromDistrictName;

    private Long fromOrgId;

    private String fromOrgName;

    private Long approvalOrgId;

    private String approvalOrgName;

    private Boolean source;

    private Boolean bizType;

    private Integer trait;

    private Boolean state;

    private String approvalComment;

    private Boolean isDeleted;

    private String creator;

    private String modifier;

    private Date gmtCreated;

    private Date gmtModified;

    private String protocolType;

    private Long netId;

    private String contactName;

    private String contactPhone;

    private String instanceCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName == null ? null : protocolName.trim();
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

    public String getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(String deliverId) {
        this.deliverId = deliverId == null ? null : deliverId.trim();
    }

    public Boolean getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(Boolean deliverType) {
        this.deliverType = deliverType;
    }

    public String getFromDistrictId() {
        return fromDistrictId;
    }

    public void setFromDistrictId(String fromDistrictId) {
        this.fromDistrictId = fromDistrictId == null ? null : fromDistrictId.trim();
    }

    public String getFromDistrictName() {
        return fromDistrictName;
    }

    public void setFromDistrictName(String fromDistrictName) {
        this.fromDistrictName = fromDistrictName == null ? null : fromDistrictName.trim();
    }

    public Long getFromOrgId() {
        return fromOrgId;
    }

    public void setFromOrgId(Long fromOrgId) {
        this.fromOrgId = fromOrgId;
    }

    public String getFromOrgName() {
        return fromOrgName;
    }

    public void setFromOrgName(String fromOrgName) {
        this.fromOrgName = fromOrgName == null ? null : fromOrgName.trim();
    }

    public Long getApprovalOrgId() {
        return approvalOrgId;
    }

    public void setApprovalOrgId(Long approvalOrgId) {
        this.approvalOrgId = approvalOrgId;
    }

    public String getApprovalOrgName() {
        return approvalOrgName;
    }

    public void setApprovalOrgName(String approvalOrgName) {
        this.approvalOrgName = approvalOrgName == null ? null : approvalOrgName.trim();
    }

    public Boolean getSource() {
        return source;
    }

    public void setSource(Boolean source) {
        this.source = source;
    }

    public Boolean getBizType() {
        return bizType;
    }

    public void setBizType(Boolean bizType) {
        this.bizType = bizType;
    }

    public Integer getTrait() {
        return trait;
    }

    public void setTrait(Integer trait) {
        this.trait = trait;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getApprovalComment() {
        return approvalComment;
    }

    public void setApprovalComment(String approvalComment) {
        this.approvalComment = approvalComment == null ? null : approvalComment.trim();
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

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType == null ? null : protocolType.trim();
    }

    public Long getNetId() {
        return netId;
    }

    public void setNetId(Long netId) {
        this.netId = netId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getInstanceCode() {
        return instanceCode;
    }

    public void setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode == null ? null : instanceCode.trim();
    }

    @Override
    public String toString() {
        return "AgProtocolQualification{" +
                "id=" + id +
                ", protocolId=" + protocolId +
                ", protocolName='" + protocolName + '\'' +
                ", supplierCode=" + supplierCode +
                ", supplierName='" + supplierName + '\'' +
                ", deliverId='" + deliverId + '\'' +
                ", deliverType=" + deliverType +
                ", fromDistrictId='" + fromDistrictId + '\'' +
                ", fromDistrictName='" + fromDistrictName + '\'' +
                ", fromOrgId=" + fromOrgId +
                ", fromOrgName='" + fromOrgName + '\'' +
                ", approvalOrgId=" + approvalOrgId +
                ", approvalOrgName='" + approvalOrgName + '\'' +
                ", source=" + source +
                ", bizType=" + bizType +
                ", trait=" + trait +
                ", state=" + state +
                ", approvalComment='" + approvalComment + '\'' +
                ", isDeleted=" + isDeleted +
                ", creator='" + creator + '\'' +
                ", modifier='" + modifier + '\'' +
                ", gmtCreated=" + gmtCreated +
                ", gmtModified=" + gmtModified +
                ", protocolType='" + protocolType + '\'' +
                ", netId=" + netId +
                ", contactName='" + contactName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", instanceCode='" + instanceCode + '\'' +
                '}';
    }
}