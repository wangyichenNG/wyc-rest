package poi.entity;

import java.util.Date;

public class ResturantModel {
    private Long   resturantId;
    private String resturantName;
    private String ResturantType;
    private Date createTime;

    public Long getResturantId() {
        return resturantId;
    }

    public void setResturantId(Long resturantId) {
        this.resturantId = resturantId;
    }

    public String getResturantName() {
        return resturantName;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public String getResturantType() {
        return ResturantType;
    }

    public void setResturantType(String resturantType) {
        ResturantType = resturantType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
