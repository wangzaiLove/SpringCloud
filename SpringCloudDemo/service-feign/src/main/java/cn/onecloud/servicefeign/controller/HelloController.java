package cn.onecloud.servicefeign.controller;

import cn.onecloud.servicefeign.service.ISchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    ISchedualServiceHi iSchedualServiceHi;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name",defaultValue = "abc") String name){
        return iSchedualServiceHi.sayHiFromClientOne(name);
    }

}
