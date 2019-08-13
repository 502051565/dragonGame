package com.rt.api.bean;


import java.io.Serializable;

/**
 * @ClassName:  WxCookieBean
 * @Description:
 * @author:  <a href="liuyafengwy@163.com">luffy</a>
 * @date:  2019/3/8 14:57
 */
public class WxCookieBean implements Serializable {

    private Long uid;
    private String openId;

    private WxCookieBean(){}

    private WxCookieBean(Long uid, String openId) {
        this.uid = uid;
        this.openId = openId;
    }

    public static WxCookieBean  buildBean(Long uid, String openId){
        WxCookieBean bean = new WxCookieBean(uid,openId);
        return bean;
    }


    public String getOpenId() {
        return openId;
    }

    public Long getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return "WxCookieBean{" +
                "uid=" + uid +
                ", openId='" + openId + '\'' +
                '}';
    }
}
