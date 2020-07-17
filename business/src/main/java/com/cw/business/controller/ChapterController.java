package com.cw.business.controller;

import com.cw.server.domain.Chapter;
import com.cw.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//@RequestMapping("/system")  //这种方法还是太低级了， 看配置文件context方式
public class ChapterController {
    @Resource
    private ChapterService chapterService;

    @RequestMapping("/hello")
    public List<Chapter> chapter(){
        return chapterService.list();
    }
}
