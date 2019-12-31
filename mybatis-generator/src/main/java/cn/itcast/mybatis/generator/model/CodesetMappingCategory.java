package cn.itcast.mybatis.generator.model;

import java.util.Date;

public class CodesetMappingCategory {
    private Long codesetMappingCategoryId;

    private Integer codesetMappingId;

    private Long relationId;

    private Long czCodesetItemId;

    private String categoryCode;

    private String categoryName;

    private Date timeReleased;

    private Integer year;

    private String description;

    public Long getCodesetMappingCategoryId() {
        return codesetMappingCategoryId;
    }

    public void setCodesetMappingCategoryId(Long codesetMappingCategoryId) {
        this.codesetMappingCategoryId = codesetMappingCategoryId;
    }

    public Integer getCodesetMappingId() {
        return codesetMappingId;
    }

    public void setCodesetMappingId(Integer codesetMappingId) {
        this.codesetMappingId = codesetMappingId;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Long getCzCodesetItemId() {
        return czCodesetItemId;
    }

    public void setCzCodesetItemId(Long czCodesetItemId) {
        this.czCodesetItemId = czCodesetItemId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Date getTimeReleased() {
        return timeReleased;
    }

    public void setTimeReleased(Date timeReleased) {
        this.timeReleased = timeReleased;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}