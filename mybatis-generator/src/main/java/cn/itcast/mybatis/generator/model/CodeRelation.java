package cn.itcast.mybatis.generator.model;

public class CodeRelation {
    private Long relationId;

    private String czCode;

    private String czCodesetYear;

    private String czCodeVersion;

    private String zcyCode;

    private String zcyCodesetYear;

    private String zcyCodeVersion;

    private Integer codesetMappingId;

    private Long czCodesetItemId;

    private String zcyCodesetDistrictYear;

    private Long czCodesetId;

    private Integer gpcatalogs;

    private Long zcyCodesetId;

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public String getCzCode() {
        return czCode;
    }

    public void setCzCode(String czCode) {
        this.czCode = czCode == null ? null : czCode.trim();
    }

    public String getCzCodesetYear() {
        return czCodesetYear;
    }

    public void setCzCodesetYear(String czCodesetYear) {
        this.czCodesetYear = czCodesetYear == null ? null : czCodesetYear.trim();
    }

    public String getCzCodeVersion() {
        return czCodeVersion;
    }

    public void setCzCodeVersion(String czCodeVersion) {
        this.czCodeVersion = czCodeVersion == null ? null : czCodeVersion.trim();
    }

    public String getZcyCode() {
        return zcyCode;
    }

    public void setZcyCode(String zcyCode) {
        this.zcyCode = zcyCode == null ? null : zcyCode.trim();
    }

    public String getZcyCodesetYear() {
        return zcyCodesetYear;
    }

    public void setZcyCodesetYear(String zcyCodesetYear) {
        this.zcyCodesetYear = zcyCodesetYear == null ? null : zcyCodesetYear.trim();
    }

    public String getZcyCodeVersion() {
        return zcyCodeVersion;
    }

    public void setZcyCodeVersion(String zcyCodeVersion) {
        this.zcyCodeVersion = zcyCodeVersion == null ? null : zcyCodeVersion.trim();
    }

    public Integer getCodesetMappingId() {
        return codesetMappingId;
    }

    public void setCodesetMappingId(Integer codesetMappingId) {
        this.codesetMappingId = codesetMappingId;
    }

    public Long getCzCodesetItemId() {
        return czCodesetItemId;
    }

    public void setCzCodesetItemId(Long czCodesetItemId) {
        this.czCodesetItemId = czCodesetItemId;
    }

    public String getZcyCodesetDistrictYear() {
        return zcyCodesetDistrictYear;
    }

    public void setZcyCodesetDistrictYear(String zcyCodesetDistrictYear) {
        this.zcyCodesetDistrictYear = zcyCodesetDistrictYear == null ? null : zcyCodesetDistrictYear.trim();
    }

    public Long getCzCodesetId() {
        return czCodesetId;
    }

    public void setCzCodesetId(Long czCodesetId) {
        this.czCodesetId = czCodesetId;
    }

    public Integer getGpcatalogs() {
        return gpcatalogs;
    }

    public void setGpcatalogs(Integer gpcatalogs) {
        this.gpcatalogs = gpcatalogs;
    }

    public Long getZcyCodesetId() {
        return zcyCodesetId;
    }

    public void setZcyCodesetId(Long zcyCodesetId) {
        this.zcyCodesetId = zcyCodesetId;
    }
}