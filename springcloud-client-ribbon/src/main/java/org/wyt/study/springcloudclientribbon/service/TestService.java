package org.wyt.study.springcloudclientribbon.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@Service("testService")
public class TestService {

    @Resource
    @Qualifier(value = "rest")
    private RestTemplate rest;

    public String hi(String name) {
        //return rest.getForObject("http://localhost:8082/hi?name=" + name, String.class);
        return rest.getForObject("http://s1/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
