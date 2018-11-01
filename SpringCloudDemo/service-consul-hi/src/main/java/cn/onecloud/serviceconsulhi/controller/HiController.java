package cn.onecloud.serviceconsulhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HiController
 * @Description:
 * @Author: Chengjw
 * @Date: 2018/10/31 23:07
 */
@RestController
public class HiController {

    @GetMapping(value = "/home")
    public String home(@RequestParam(value = "name") String name){
        return "hi,I am consul-hi service " + name;
    }
}
