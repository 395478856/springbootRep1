package cn.itcast.mybatis.generator.model;

public class ZcyCodesetItem {
    private Long zcyCodesetItemId;

    private Long zcyCodesetId;

    private String zcyCode;

    private String zcyCodeset;

    private Integer zcyCodesetDivisionId;

    private Integer year;

    private String code;

    private String name;

    private Byte dataVersion;

    private Byte delFlag;

    private String district;

    private String description;

    public Long getZcyCodesetItemId() {
        return zcyCodesetItemId;
    }

    public void setZcyCodesetItemId(Long zcyCodesetItemId) {
        this.zcyCodesetItemId = zcyCodesetItemId;
    }

    public Long getZcyCodesetId() {
        return zcyCodesetId;
    }

    public void setZcyCodesetId(Long zcyCodesetId) {
        this.zcyCodesetId = zcyCodesetId;
    }

    public String getZcyCode() {
        return zcyCode;
    }

    public void setZcyCode(String zcyCode) {
        this.zcyCode = zcyCode == null ? null : zcyCode.trim();
    }

    public String getZcyCodeset() {
        return zcyCodeset;
    }

    public void setZcyCodeset(String zcyCodeset) {
        this.zcyCodeset = zcyCodeset == null ? null : zcyCodeset.trim();
    }

    public Integer getZcyCodesetDivisionId() {
        return zcyCodesetDivisionId;
    }

    public void setZcyCodesetDivisionId(Integer zcyCodesetDivisionId) {
        this.zcyCodesetDivisionId = zcyCodesetDivisionId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Byte dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}