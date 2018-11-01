package cn.onecloud.servicefeign.service.impl;

import cn.onecloud.servicefeign.service.ISchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements ISchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
