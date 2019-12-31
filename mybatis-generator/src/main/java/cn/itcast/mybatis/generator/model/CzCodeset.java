package cn.itcast.mybatis.generator.model;

import java.util.Date;

public class CzCodeset {
    private Long czCodesetId;

    private String codeset;

    private String name;

    private Date timeReleased;

    private Byte byAnnual;

    private Byte byDistrict;

    private Byte hierarchy;

    private Integer dataVersion;

    public Long getCzCodesetId() {
        return czCodesetId;
    }

    public void setCzCodesetId(Long czCodesetId) {
        this.czCodesetId = czCodesetId;
    }

    public String getCodeset() {
        return codeset;
    }

    public void setCodeset(String codeset) {
        this.codeset = codeset == null ? null : codeset.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTimeReleased() {
        return timeReleased;
    }

    public void setTimeReleased(Date timeReleased) {
        this.timeReleased = timeReleased;
    }

    public Byte getByAnnual() {
        return byAnnual;
    }

    public void setByAnnual(Byte byAnnual) {
        this.byAnnual = byAnnual;
    }

    public Byte getByDistrict() {
        return byDistrict;
    }

    public void setByDistrict(Byte byDistrict) {
        this.byDistrict = byDistrict;
    }

    public Byte getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(Byte hierarchy) {
        this.hierarchy = hierarchy;
    }

    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }
}