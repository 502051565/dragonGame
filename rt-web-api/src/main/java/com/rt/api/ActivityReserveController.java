package com.rt.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.code.kaptcha.Constants;
import com.rt.common.page.R;
import com.rt.modules.dragon.entity.TbCoreActivityReserve;
import com.rt.modules.dragon.service.ITbCoreActivityReserveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

/**
 * @author monkey_lwy@163.com
 * @date 2019-08-14 11:51
 * @desc  活动预约
 */
@Controller
@RequestMapping("/api/activityReserve")
public class ActivityReserveController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActivityReserveController.class);
    private static String PREFIX = "api/game/";

    @Autowired
    private ITbCoreActivityReserveService activityReserveService;

    @GetMapping(value = "/index")
    public String index(Model model){
        QueryWrapper<TbCoreActivityReserve> qw = new QueryWrapper<>();
        int num = activityReserveService.count(qw);
        model.addAttribute("num",num);
        return PREFIX+"index";
    }

    @RequestMapping(value = "/save",method = {RequestMethod.POST})
    @ResponseBody
    public R save(@RequestBody TbCoreActivityReserve activityReserve, HttpServletRequest request) {

        HttpSession session = request.getSession();
        Object imgCode = session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if(activityReserve.getFacility()==1){
            if(!imgCode.toString().equals(activityReserve.getImgCodeIOS())){
                return R.error(1,"图片验证码不正确");
            }
        }else{
            if(!imgCode.toString().equals(activityReserve.getImgCodeAnd())){
                return R.error(1,"图片验证码不正确");
            }
        }
        session.removeAttribute(Constants.KAPTCHA_SESSION_KEY);
        activityReserve.setCreateTime(LocalDateTime.now());
        activityReserve.setUpdateTime(LocalDateTime.now());
        activityReserveService.save(activityReserve);
        return R.ok();
    }




}
