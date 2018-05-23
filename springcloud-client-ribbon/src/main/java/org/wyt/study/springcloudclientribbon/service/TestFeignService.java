package org.wyt.study.springcloudclientribbon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "s1")
public interface TestFeignService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);

}
