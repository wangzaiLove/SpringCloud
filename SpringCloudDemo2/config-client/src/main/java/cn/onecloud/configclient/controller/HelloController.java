package cn.onecloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description:
 * @Author: Chengjw
 * @Date: 2018/11/1 22:30
 */

@RestController
public class HelloController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hello")
    public String hello(){
        return foo;
    }
}
