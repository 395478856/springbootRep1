package cn.itcast.mybatis.generator.model;

public class AgProtocolWithBLOBs extends AgProtocol {
    private String saleDeliverIds;

    private String saleDeliverNames;

    private String serviceDeliverIds;

    private String serviceDeliverNames;

    private String extendedJson;

    private String deliverIds;

    private String deliverNames;

    private String effectiveDeliverIds;

    public String getSaleDeliverIds() {
        return saleDeliverIds;
    }

    public void setSaleDeliverIds(String saleDeliverIds) {
        this.saleDeliverIds = saleDeliverIds == null ? null : saleDeliverIds.trim();
    }

    public String getSaleDeliverNames() {
        return saleDeliverNames;
    }

    public void setSaleDeliverNames(String saleDeliverNames) {
        this.saleDeliverNames = saleDeliverNames == null ? null : saleDeliverNames.trim();
    }

    public String getServiceDeliverIds() {
        return serviceDeliverIds;
    }

    public void setServiceDeliverIds(String serviceDeliverIds) {
        this.serviceDeliverIds = serviceDeliverIds == null ? null : serviceDeliverIds.trim();
    }

    public String getServiceDeliverNames() {
        return serviceDeliverNames;
    }

    public void setServiceDeliverNames(String serviceDeliverNames) {
        this.serviceDeliverNames = serviceDeliverNames == null ? null : serviceDeliverNames.trim();
    }

    public String getExtendedJson() {
        return extendedJson;
    }

    public void setExtendedJson(String extendedJson) {
        this.extendedJson = extendedJson == null ? null : extendedJson.trim();
    }

    public String getDeliverIds() {
        return deliverIds;
    }

    public void setDeliverIds(String deliverIds) {
        this.deliverIds = deliverIds == null ? null : deliverIds.trim();
    }

    public String getDeliverNames() {
        return deliverNames;
    }

    public void setDeliverNames(String deliverNames) {
        this.deliverNames = deliverNames == null ? null : deliverNames.trim();
    }

    public String getEffectiveDeliverIds() {
        return effectiveDeliverIds;
    }

    public void setEffectiveDeliverIds(String effectiveDeliverIds) {
        this.effectiveDeliverIds = effectiveDeliverIds == null ? null : effectiveDeliverIds.trim();
    }
}