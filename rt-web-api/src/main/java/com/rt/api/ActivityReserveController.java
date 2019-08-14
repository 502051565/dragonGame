package com.rt.api;

import com.rt.modules.dragon.service.ITbCoreActivityReserveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String index(){
        return PREFIX+"index";


    }




}
