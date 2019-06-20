package com.tengfei.data.model;

import java.io.Serializable;
import java.util.Date;

public class Links implements Serializable {
    private Integer linksId;

    private String linksName;

    private String url;

    private Integer sort;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer createUserId;

    private Integer modifiedUserId;

    private static final long serialVersionUID = 1L;

    public Integer getLinksId() {
        return linksId;
    }

    public void setLinksId(Integer linksId) {
        this.linksId = linksId;
    }

    public String getLinksName() {
        return linksName;
    }

    public void setLinksName(String linksName) {
        this.linksName = linksName == null ? null : linksName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", linksId=").append(linksId);
        sb.append(", linksName=").append(linksName);
        sb.append(", url=").append(url);
        sb.append(", sort=").append(sort);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", modifiedUserId=").append(modifiedUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}