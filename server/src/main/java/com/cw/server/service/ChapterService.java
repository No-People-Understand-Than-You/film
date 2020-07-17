package com.cw.server.service;

import com.cw.server.domain.Chapter;
import com.cw.server.domain.ChapterExample;
import com.cw.server.domain.Test;
import com.cw.server.domain.TestExample;
import com.cw.server.mapper.ChapterMapper;
import com.cw.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<Chapter> list(){
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.createCriteria().andIdEqualTo("");
        chapterExample.setOrderByClause("id desc"); //从小到大
        return chapterMapper.selectByExample(chapterExample);
    }
}
