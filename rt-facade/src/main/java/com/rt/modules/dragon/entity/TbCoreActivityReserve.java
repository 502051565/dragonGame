package com.rt.modules.dragon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 预约表
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
public class TbCoreActivityReserve extends Model<TbCoreActivityReserve> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 设备,1ios，2andorid
     */
    private int facility;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 邀请码
     */
    @TableField("Invitation_code")
    private String invitationCode;

    /**
     * 活动id
     */
    private Long activityId;

    /**
     * img验证码
     */
    @TableField(exist = false)
    private String imgCodeIOS;
    @TableField(exist = false)
    private String imgCodeAnd;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getFacility() {
        return facility;
    }

    public void setFacility(int facility) {
        this.facility = facility;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }


    public String getImgCodeIOS() {
        return imgCodeIOS;
    }

    public void setImgCodeIOS(String imgCodeIOS) {
        this.imgCodeIOS = imgCodeIOS;
    }

    public String getImgCodeAnd() {
        return imgCodeAnd;
    }

    public void setImgCodeAnd(String imgCodeAnd) {
        this.imgCodeAnd = imgCodeAnd;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TbCoreActivityReserve{" +
        "id=" + id +
        ", phone=" + phone +
        ", facility=" + facility +
        ", updateTime=" + updateTime +
        ", createTime=" + createTime +
        ", userId=" + userId +
        ", invitationCode=" + invitationCode +
        ", activityId=" + activityId +
        "}";
    }
}
