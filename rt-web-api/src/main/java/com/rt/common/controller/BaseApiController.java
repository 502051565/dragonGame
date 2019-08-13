package com.rt.common.controller;

import com.rt.api.bean.WxCookieBean;
import com.rt.common.enums.BizExceptionEnum;
import com.rt.common.exception.RestException;
import com.rt.common.utils.AESUtils;
import com.rt.common.utils.JsonUtils;
import com.rt.util.CookieUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

public class BaseApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseApiController.class);
    //将用户信息存储cookie中,加密秘钥
    @Value("${wx.cookie.scrte}")
    private String wxCookieScrte;
    //前段cookies中存储的name ,用此值来判定微信用户是否授权, 授权后会将微信用户信息 储存到cookies中
    @Value("${wx.cookie.user.key}")
    private String wxCookieUserKey;




    /**
     * 带参重定向
     *
     * @param path
     * @return
     */
    protected String redirect(String path) {
        return "redirect:" + path;
    }

    /**
     * 不带参重定向
     *
     * @param response
     * @param path
     * @return
     */
    protected String redirect(HttpServletResponse response, String path) {
        try {
            response.sendRedirect(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getPageNum(int start,int pageSize){
        int totalPageNum = (start + pageSize - 1) / pageSize;
        return totalPageNum+1;
    }

    protected WxCookieBean getWxCookieBean(HttpServletRequest request) {
        //TODO 调试信息
        if(true) {
            WxCookieBean bena = WxCookieBean.buildBean(2L,"ob7Xo1Y-ynvpXz1ba2D6mrGXnvcU");
            return bena;
        }

        try {
            Cookie cookieUser = CookieUtils.getCookie(request, wxCookieUserKey);
            String value="";
            if(cookieUser==null){
                value = request.getAttribute(wxCookieUserKey).toString();
            }else{
                //解密
                value = cookieUser.getValue();
            }
            String beanJson = AESUtils.decrypt(wxCookieScrte,value);

            //解码
            beanJson = URLDecoder.decode(beanJson, "utf-8");
            WxCookieBean bean = JsonUtils.toObject(beanJson, WxCookieBean.class);
            return bean;
        }catch (Exception e){
            LOGGER.error("获取WxCookieBean存储微信用户信息异常",e);
            throw new RestException(BizExceptionEnum.USER_NOT_EXISTED.getCode(),BizExceptionEnum.USER_NOT_EXISTED.getMessage());
        }

    }
}
