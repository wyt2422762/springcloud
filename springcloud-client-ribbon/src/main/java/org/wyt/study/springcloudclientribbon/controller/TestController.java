package org.wyt.study.springcloudclientribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.wyt.study.springcloudclientribbon.service.TestFeignService;
import org.wyt.study.springcloudclientribbon.service.TestService;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;
    @Resource
    private TestFeignService testFeignService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam String name) {
        return testService.hi(name);
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return testFeignService.hi(name);
    }



}
