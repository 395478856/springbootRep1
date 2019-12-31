package cn.itcast.mybatis.generator.model;

import java.util.Date;

public class TUser {
    private Integer id;

    private String cUserId;

    private String cName;

    private Integer cProvinceId;

    private Integer cCityId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcUserId() {
        return cUserId;
    }

    public void setcUserId(String cUserId) {
        this.cUserId = cUserId == null ? null : cUserId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getcProvinceId() {
        return cProvinceId;
    }

    public void setcProvinceId(Integer cProvinceId) {
        this.cProvinceId = cProvinceId;
    }

    public Integer getcCityId() {
        return cCityId;
    }

    public void setcCityId(Integer cCityId) {
        this.cCityId = cCityId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}