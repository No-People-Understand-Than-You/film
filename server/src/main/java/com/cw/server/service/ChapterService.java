package com.cw.server.service;

import com.cw.server.domain.Chapter;
import com.cw.server.domain.ChapterExample;
import com.cw.server.domain.Test;
import com.cw.server.domain.TestExample;
import com.cw.server.dto.ChapterDto;
import com.cw.server.mapper.ChapterMapper;
import com.cw.server.mapper.TestMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<ChapterDto> list(){
        ChapterExample chapterExample = new ChapterExample();
        //chapterExample.createCriteria().andIdEqualTo(null);
        chapterExample.setOrderByClause("id desc"); //从小到大
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        ArrayList<ChapterDto> dtoArrayList = new ArrayList<>();
        for (Chapter a:
             chapterList) {
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(a,chapterDto);
            dtoArrayList.add(chapterDto);
        }
        return dtoArrayList;
    }
}
