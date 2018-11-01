package cn.onecloud.servicefeign.service;

import cn.onecloud.servicefeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface ISchedualServiceHi {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "n") String name);
}
