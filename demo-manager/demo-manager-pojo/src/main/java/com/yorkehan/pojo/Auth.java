package com.yorkehan.pojo;

import java.io.Serializable;
import java.util.Date;

public class Auth implements Serializable {
    private Integer authId;

    private String authInfo;

    private Byte authStatus;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(String authInfo) {
        this.authInfo = authInfo == null ? null : authInfo.trim();
    }

    public Byte getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Byte authStatus) {
        this.authStatus = authStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}