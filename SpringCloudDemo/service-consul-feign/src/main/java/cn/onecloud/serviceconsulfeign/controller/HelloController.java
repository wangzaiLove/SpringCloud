package cn.onecloud.serviceconsulfeign.controller;

import cn.onecloud.serviceconsulfeign.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description:
 * @Author: Chengjw
 * @Date: 2018/11/1 20:38
 */

@RestController
public class HelloController {

    @Autowired
    IHelloService iHelloService;

    @RequestMapping(value = "/hi")
    public String home(@RequestParam(value = "name") String name){
        return iHelloService.hi(name);
    }
}
