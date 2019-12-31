package cn.itcast.mybatis.generator.model;

import java.util.Date;

public class CzCodesetItem {
    private Long czCodesetItemId;

    private Long czCodesetId;

    private String czCodeset;

    private Integer czCodesetDivisionId;

    private Integer year;

    private String district;

    private String code;

    private String name;

    private Byte dataVersion;

    private Byte delFlag;

    private Date timeReleased;

    private String czCode;

    private String description;

    public Long getCzCodesetItemId() {
        return czCodesetItemId;
    }

    public void setCzCodesetItemId(Long czCodesetItemId) {
        this.czCodesetItemId = czCodesetItemId;
    }

    public Long getCzCodesetId() {
        return czCodesetId;
    }

    public void setCzCodesetId(Long czCodesetId) {
        this.czCodesetId = czCodesetId;
    }

    public String getCzCodeset() {
        return czCodeset;
    }

    public void setCzCodeset(String czCodeset) {
        this.czCodeset = czCodeset == null ? null : czCodeset.trim();
    }

    public Integer getCzCodesetDivisionId() {
        return czCodesetDivisionId;
    }

    public void setCzCodesetDivisionId(Integer czCodesetDivisionId) {
        this.czCodesetDivisionId = czCodesetDivisionId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
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

    public Date getTimeReleased() {
        return timeReleased;
    }

    public void setTimeReleased(Date timeReleased) {
        this.timeReleased = timeReleased;
    }

    public String getCzCode() {
        return czCode;
    }

    public void setCzCode(String czCode) {
        this.czCode = czCode == null ? null : czCode.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}