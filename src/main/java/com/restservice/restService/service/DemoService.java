package com.restservice.restService.service;

import com.restservice.restService.api.ao.DemoParamAO;
import com.restservice.restService.entity.DemoParameter;

public interface DemoService {

    DemoParameter getParameters(DemoParamAO demoParamAO);
}
