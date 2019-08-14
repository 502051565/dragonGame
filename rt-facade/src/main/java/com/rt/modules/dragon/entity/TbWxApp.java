package com.rt.modules.dragon.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 微信设置表
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
public class TbWxApp extends Model<TbWxApp> {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    private String appId;

    /**
     * 名称
     */
    private String appName;

    /**
     * 安全密钥
     */
    private String secret;

    /**
     * TOKEN 统一刷新token
     */
    private String token;

    /**
     * STATUS
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDate createTime;

    /**
     * 更新时间
     */
    private LocalDate updateTime;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "TbWxApp{" +
        "appId=" + appId +
        ", appName=" + appName +
        ", secret=" + secret +
        ", token=" + token +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
