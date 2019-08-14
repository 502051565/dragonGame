package com.rt.modules.dragon.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.io.Serializable;

/**
 * <p>
 * 微信用户表
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
public class TbWxUser extends Model<TbWxUser> {

    private static final long serialVersionUID = 1L;

    /**
     * OPENID
     */
    private String openid;

    /**
     * 微信APP_ID
     */
    private String wxId;

    /**
     * UNIONID
     */
    private String unionid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别 0:未知，1:男，2:女
     */
    private Boolean sex;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 所在省份
     */
    private String province;

    /**
     * 所在国家
     */
    private String country;

    /**
     * 语言 简体中文是zh_CN
     */
    private String language;

    /**
     * 头像 最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     */
    private String headimgurl;

    /**
     * 用户特权 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
     */
    private String privilege;

    /**
     * 关注状态 0未关注，1已关注，2取消关注
     */
    private Boolean status;

    /**
     * '最后一次关注时间
     */
    private LocalDate lastSubscribeTime;

    /**
     * 第一次关注时间
     */
    private LocalDate firstSubscribeTime;

    /**
     * 邀请用户
     */
    private String preOpenid;

    /**
     * 创建时间
     */
    private LocalDate createTime;

    /**
     * 更新时间
     */
    private LocalDate updateTime;


    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getLastSubscribeTime() {
        return lastSubscribeTime;
    }

    public void setLastSubscribeTime(LocalDate lastSubscribeTime) {
        this.lastSubscribeTime = lastSubscribeTime;
    }

    public LocalDate getFirstSubscribeTime() {
        return firstSubscribeTime;
    }

    public void setFirstSubscribeTime(LocalDate firstSubscribeTime) {
        this.firstSubscribeTime = firstSubscribeTime;
    }

    public String getPreOpenid() {
        return preOpenid;
    }

    public void setPreOpenid(String preOpenid) {
        this.preOpenid = preOpenid;
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
        return this.openid;
    }

    @Override
    public String toString() {
        return "TbWxUser{" +
        "openid=" + openid +
        ", wxId=" + wxId +
        ", unionid=" + unionid +
        ", nickname=" + nickname +
        ", sex=" + sex +
        ", city=" + city +
        ", province=" + province +
        ", country=" + country +
        ", language=" + language +
        ", headimgurl=" + headimgurl +
        ", privilege=" + privilege +
        ", status=" + status +
        ", lastSubscribeTime=" + lastSubscribeTime +
        ", firstSubscribeTime=" + firstSubscribeTime +
        ", preOpenid=" + preOpenid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
