package cn.onecloud.serviceconsulfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: IHelloService
 * @Description:
 * @Author: Chengjw
 * @Date: 2018/11/1 20:40
 */

@FeignClient(value = "service-consul-hi")
public interface IHelloService {

    @RequestMapping(value = "/home")
    public String hi(@RequestParam(value = "name") String name);

}
