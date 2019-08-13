package com.rt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 常规控制器
 *
 * @author fengshuonan
 * @date 2017-08-23 16:02
 */
@RestController
//@RequestMapping("/user")
public class ExampleController {

    @RequestMapping("/user/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("请求成功!");
    }
//    @RequestMapping("/user/aa")
//    public ResponseEntity aa(@RequestBody SimpleObject entity){
//        return ResponseEntity.ok(entity);
//    }
    @RequestMapping("/test")
    public ResponseEntity test(){
            return ResponseEntity.ok("请求成功!");
    }
}
