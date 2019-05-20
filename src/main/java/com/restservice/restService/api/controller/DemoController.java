package com.restservice.restService.api.controller;

import com.restservice.restService.api.ao.DemoParamAO;
import com.restservice.restService.entity.DemoParameter;
import com.restservice.restService.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName ProductController
 * @Description TODO
 * @Author goodman
 * @Date 2019-04-30 10:59
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/demo")
@Api(value = "获取参数接口", tags = "获取参数接口")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @ApiOperation(value = "获取参数")
    @RequestMapping(value = "/getParameters", method = RequestMethod.POST)
    public DemoParameter greeting(@RequestParam String url, @RequestParam String parameterNames) {
        DemoParamAO demoParamAO = new DemoParamAO(url, parameterNames);
        return demoService.getParameters(demoParamAO);
    }
}
