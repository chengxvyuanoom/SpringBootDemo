package com.restservice.restService.entity;

import java.util.List;
import java.util.Map;

/**
 * @CLassName ProductParameter
 * @Description TODO
 * @Author goodman
 * @Date 2019-04-30 11:20
 * @Version 1.0
 **/
public class ProductParameter {

    private Map<String, Object> status;

    private List<String> data;

    public Map<String, Object> getStatus() {
        return status;
    }

    public void setStatus(Map<String, Object> status) {
        this.status = status;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
