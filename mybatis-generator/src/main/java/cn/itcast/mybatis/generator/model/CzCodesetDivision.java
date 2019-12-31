package cn.itcast.mybatis.generator.model;

public class CzCodesetDivision {
    private Integer czCodesetDivisionId;

    private Long czCodesetId;

    private Integer year;

    private Integer items;

    private String district;

    public Integer getCzCodesetDivisionId() {
        return czCodesetDivisionId;
    }

    public void setCzCodesetDivisionId(Integer czCodesetDivisionId) {
        this.czCodesetDivisionId = czCodesetDivisionId;
    }

    public Long getCzCodesetId() {
        return czCodesetId;
    }

    public void setCzCodesetId(Long czCodesetId) {
        this.czCodesetId = czCodesetId;
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