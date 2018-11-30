package com.yorkehan.pojo;

import java.io.Serializable;
import java.util.Date;

public class RoleAuth implements Serializable {
    private Integer roleAuthId;

    private Integer roleId;

    private Integer authId;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getRoleAuthId() {
        return roleAuthId;
    }

    public void setRoleAuthId(Integer roleAuthId) {
        this.roleAuthId = roleAuthId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
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