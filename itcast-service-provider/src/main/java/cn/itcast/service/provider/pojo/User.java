package cn.itcast.service.provider.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "t_user")
public class User implements Serializable {
    @Id
    private Integer id;
    private String cUserId;
    private String cName;
    private Integer cProvinceId;
    private Integer cCityId;
    private Date createTime;
    private static final long serialVersionUID = 1L;

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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cUserId=").append(cUserId);
        sb.append(", cName=").append(cName);
        sb.append(", cProvinceId=").append(cProvinceId);
        sb.append(", cCityId=").append(cCityId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
