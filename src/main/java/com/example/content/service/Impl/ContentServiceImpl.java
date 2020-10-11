package com.example.content.service.Impl;

import com.example.content.entity.Content;
import com.example.content.mapper.ContentMapper;
import com.example.content.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 10:08
 * 内容 service impl
 */
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentMapper contentMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Content> selectByAll() {
        return contentMapper.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Override
    public Content selectById(String id) {
        return contentMapper.findByIdAll(id);
    }
}
