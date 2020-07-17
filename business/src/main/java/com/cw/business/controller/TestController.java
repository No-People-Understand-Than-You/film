package com.cw.business.controller;

import com.cw.server.domain.Test;
import com.cw.server.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//@RequestMapping("/system")  //这种方法还是太低级了， 看配置文件context方式
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public List<Test> test(){
        return testService.list();
    }
}
