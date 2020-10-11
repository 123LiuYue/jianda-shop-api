package com.example.title.service.impl;

import com.example.content.entity.Content;
import com.example.title.entity.Title;
import com.example.title.mapper.TitleMapper;
import com.example.title.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 9:41
 * 标题 service impl
 */
@Service
public class TitleServiceImpl implements TitleService {
    @Autowired
    private TitleMapper titleMapper;

    /**
     * 查询所有
     * @return List
     */
    @Override
    public List<Title> selectByAll() {
        return titleMapper.findAll();
    }

    /**
     * 连表查询
     * @param id
     * @return Content
     */
    @Override
    public Title findByIdAll(String id) {
        return titleMapper.connectAll(id);
    }
}
