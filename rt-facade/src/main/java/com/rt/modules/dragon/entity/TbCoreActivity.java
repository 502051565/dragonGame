package com.rt.modules.dragon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 活动信息 主要记录活动标识、key、是否有效、开始结束时间等
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
public class TbCoreActivity extends Model<TbCoreActivity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 活动代码
     */
    private String activityCode;

    /**
     * 应用代码 旧活动的game
     */
    private String appCode;

    /**
     * 活动名称
     */
    private String activityName;

    private String activityVersion;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 微信授权模式 是否开启微信 0 不开启 1 开启基础登陆 2 开启信息授权
     */
    private Boolean openWx;

    /**
     * 使用微信APP_ID
     */
    private String wxId;

    /**
     * 支持的账号类型 所有支持的类型数值总和。WECHAT(1，CHANGYOU(2，CYOU(4，CHANGYOUJIA(8，DJ(16
     */
    private Integer supportPlat;

    /**
     * 状态 0停用，1启用
     */
    private Boolean status;

    /**
     * 手机入口地址
     */
    private String mobileUrl;

    /**
     * PC入口地址
     */
    private String landingUrl;

    /**
     * 微信入口地址
     */
    private String wechatUrl;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityVersion() {
        return activityVersion;
    }

    public void setActivityVersion(String activityVersion) {
        this.activityVersion = activityVersion;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Boolean getOpenWx() {
        return openWx;
    }

    public void setOpenWx(Boolean openWx) {
        this.openWx = openWx;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public Integer getSupportPlat() {
        return supportPlat;
    }

    public void setSupportPlat(Integer supportPlat) {
        this.supportPlat = supportPlat;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getLandingUrl() {
        return landingUrl;
    }

    public void setLandingUrl(String landingUrl) {
        this.landingUrl = landingUrl;
    }

    public String getWechatUrl() {
        return wechatUrl;
    }

    public void setWechatUrl(String wechatUrl) {
        this.wechatUrl = wechatUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TbCoreActivity{" +
        "id=" + id +
        ", activityCode=" + activityCode +
        ", appCode=" + appCode +
        ", activityName=" + activityName +
        ", activityVersion=" + activityVersion +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", openWx=" + openWx +
        ", wxId=" + wxId +
        ", supportPlat=" + supportPlat +
        ", status=" + status +
        ", mobileUrl=" + mobileUrl +
        ", landingUrl=" + landingUrl +
        ", wechatUrl=" + wechatUrl +
        ", description=" + description +
        ", updateTime=" + updateTime +
        ", createTime=" + createTime +
        "}";
    }
}
