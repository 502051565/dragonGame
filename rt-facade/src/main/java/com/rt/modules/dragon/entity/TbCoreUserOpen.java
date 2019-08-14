package com.rt.modules.dragon.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * TOKEN用户与其他用户表关系
 * </p>
 *
 * @author lwy
 * @since 2019-08-14
 */
public class TbCoreUserOpen extends Model<TbCoreUserOpen> {

    private static final long serialVersionUID = 1L;

    private String guid;

    private String openid;

    private Integer openType;


    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getOpenType() {
        return openType;
    }

    public void setOpenType(Integer openType) {
        this.openType = openType;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "TbCoreUserOpen{" +
        "guid=" + guid +
        ", openid=" + openid +
        ", openType=" + openType +
        "}";
    }
}
