package cn.itcast.mybatis.generator.model;

import java.util.Date;

public class CodesetMapping {
    private Integer codesetMappingId;

    private Long czCodesetId;

    private Integer czYear;

    private Long zcyCodesetId;

    private Integer zcyYear;

    private Date timeMapped;

    private Long czCodesetDivisionId;

    private Long zcyCodesetDivisionId;

    private String czDistrict;

    private String zcyDistrict;

    private Integer gpcatalogs;

    public Integer getCodesetMappingId() {
        return codesetMappingId;
    }

    public void setCodesetMappingId(Integer codesetMappingId) {
        this.codesetMappingId = codesetMappingId;
    }

    public Long getCzCodesetId() {
        return czCodesetId;
    }

    public void setCzCodesetId(Long czCodesetId) {
        this.czCodesetId = czCodesetId;
    }

    public Integer getCzYear() {
        return czYear;
    }

    public void setCzYear(Integer czYear) {
        this.czYear = czYear;
    }

    public Long getZcyCodesetId() {
        return zcyCodesetId;
    }

    public void setZcyCodesetId(Long zcyCodesetId) {
        this.zcyCodesetId = zcyCodesetId;
    }

    public Integer getZcyYear() {
        return zcyYear;
    }

    public void setZcyYear(Integer zcyYear) {
        this.zcyYear = zcyYear;
    }

    public Date getTimeMapped() {
        return timeMapped;
    }

    public void setTimeMapped(Date timeMapped) {
        this.timeMapped = timeMapped;
    }

    public Long getCzCodesetDivisionId() {
        return czCodesetDivisionId;
    }

    public void setCzCodesetDivisionId(Long czCodesetDivisionId) {
        this.czCodesetDivisionId = czCodesetDivisionId;
    }

    public Long getZcyCodesetDivisionId() {
        return zcyCodesetDivisionId;
    }

    public void setZcyCodesetDivisionId(Long zcyCodesetDivisionId) {
        this.zcyCodesetDivisionId = zcyCodesetDivisionId;
    }

    public String getCzDistrict() {
        return czDistrict;
    }

    public void setCzDistrict(String czDistrict) {
        this.czDistrict = czDistrict == null ? null : czDistrict.trim();
    }

    public String getZcyDistrict() {
        return zcyDistrict;
    }

    public void setZcyDistrict(String zcyDistrict) {
        this.zcyDistrict = zcyDistrict == null ? null : zcyDistrict.trim();
    }

    public Integer getGpcatalogs() {
        return gpcatalogs;
    }

    public void setGpcatalogs(Integer gpcatalogs) {
        this.gpcatalogs = gpcatalogs;
    }
}