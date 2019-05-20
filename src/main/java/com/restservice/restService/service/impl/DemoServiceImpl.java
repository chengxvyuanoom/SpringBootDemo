package com.restservice.restService.service.impl;

import com.google.common.collect.Maps;
import com.restservice.restService.api.ao.DemoParamAO;
import com.restservice.restService.entity.DemoParameter;
import com.restservice.restService.service.DemoService;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 * @CLassName DemoServiceImpl
 * @Description TODO
 * @Author goodman
 * @Date 2019-04-30 11:14
 * @Version 1.0
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public DemoParameter getParameters(DemoParamAO demoParamAO) {
        DemoParameter demoParameter = new DemoParameter();
        Map<String, Object> objectObjectHashMap = Maps.newHashMap();
        objectObjectHashMap.put("name", "value1");
        objectObjectHashMap.put("name1", true);
        demoParameter.setStatus(objectObjectHashMap);
        return demoParameter;
    }
}
