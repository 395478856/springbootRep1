package cn.itcast.mybatis.generator.model;

public class SlowLogWithBLOBs extends SlowLog {
    private String userHost;

    private String sqlText;

    public String getUserHost() {
        return userHost;
    }

    public void setUserHost(String userHost) {
        this.userHost = userHost == null ? null : userHost.trim();
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText == null ? null : sqlText.trim();
    }
}