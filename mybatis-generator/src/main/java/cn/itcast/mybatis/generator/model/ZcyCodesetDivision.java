package cn.itcast.mybatis.generator.model;

public class ZcyCodesetDivision {
    private Integer zcyCodesetDivisionId;

    private Long zcyCodesetId;

    private Integer year;

    private Integer items;

    private String district;

    public Integer getZcyCodesetDivisionId() {
        return zcyCodesetDivisionId;
    }

    public void setZcyCodesetDivisionId(Integer zcyCodesetDivisionId) {
        this.zcyCodesetDivisionId = zcyCodesetDivisionId;
    }

    public Long getZcyCodesetId() {
        return zcyCodesetId;
    }

    public void setZcyCodesetId(Long zcyCodesetId) {
        this.zcyCodesetId = zcyCodesetId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }
}