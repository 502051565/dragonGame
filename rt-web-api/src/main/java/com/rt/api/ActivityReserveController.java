package com.rt.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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

        activityReserve.setCreateTime(LocalDateTime.now());
        activityReserve.setUpdateTime(LocalDateTime.now());
        activityReserveService.save(activityReserve);
        return R.ok();
    }




}
