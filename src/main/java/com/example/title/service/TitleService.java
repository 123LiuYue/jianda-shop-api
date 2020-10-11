package com.example.title.service;

import com.example.content.entity.Content;
import com.example.title.entity.Title;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 9:39
 * 标题 service
 */
public interface TitleService {
    /**
     * 查询所有
     * @return List
     */
    List<Title> selectByAll();

    /**
     * 连表
     * @param id
     * @return Title
     */
    Title findByIdAll(String id);

}
