package com.rt.modules.dragon.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 应用（游戏）表 一个游戏作为一个应用
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
public class TbCoreApp extends Model<TbCoreApp> {

    private static final long serialVersionUID = 1L;

    /**
     * 代码主键
     */
    private String appCode;

    /**
     * 名称
     */
    private String appName;

    /**
     * 应用KEY
     */
    private String appKey;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建使劲按
     */
    private LocalDate createTime;

    /**
     * 更新时间
     */
    private LocalDate updateTime;


    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
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
        return this.appCode;
    }

    @Override
    public String toString() {
        return "TbCoreApp{" +
        "appCode=" + appCode +
        ", appName=" + appName +
        ", appKey=" + appKey +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
