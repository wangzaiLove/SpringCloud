package cn.onecloud.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/home")
    public String home(@RequestParam(value = "n",defaultValue = "旺仔") String name){
        return "hi " + name + " ,i am from port:" + port;
    }
}
