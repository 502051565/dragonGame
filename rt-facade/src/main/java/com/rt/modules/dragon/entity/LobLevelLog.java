package com.rt.modules.dragon.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 等级日志表
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
public class LobLevelLog extends Model<LobLevelLog> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Long id;

    /**
     * 角色ID
     */
    @TableField("ROLEID")
    private String roleid;

    /**
     * 角色名
     */
    @TableField("ROLENAME")
    private String rolename;

    /**
     * 服务器组号
     */
    @TableField("GROUPID")
    private String groupid;

    /**
     * cyid
     */
    @TableField("USERID")
    private String userid;

    /**
     * 等级
     */
    @TableField("ROLELEVEL")
    private Long rolelevel;

    /**
     * 渠道
     */
    @TableField("CHANNEL")
    private String channel;

    /**
     * 日期的天
     */
    @TableField("DAYTIME")
    private String daytime;

    /**
     * 时间
     */
    @TableField("LOGTIME")
    private LocalDate logtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getRolelevel() {
        return rolelevel;
    }

    public void setRolelevel(Long rolelevel) {
        this.rolelevel = rolelevel;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public LocalDate getLogtime() {
        return logtime;
    }

    public void setLogtime(LocalDate logtime) {
        this.logtime = logtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LobLevelLog{" +
        "id=" + id +
        ", roleid=" + roleid +
        ", rolename=" + rolename +
        ", groupid=" + groupid +
        ", userid=" + userid +
        ", rolelevel=" + rolelevel +
        ", channel=" + channel +
        ", daytime=" + daytime +
        ", logtime=" + logtime +
        "}";
    }
}
