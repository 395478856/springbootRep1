package cn.itcast.mybatis.generator.model;

public class GeneralLogWithBLOBs extends GeneralLog {
    private String userHost;

    private String argument;

    public String getUserHost() {
        return userHost;
    }

    public void setUserHost(String userHost) {
        this.userHost = userHost == null ? null : userHost.trim();
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument == null ? null : argument.trim();
    }
}