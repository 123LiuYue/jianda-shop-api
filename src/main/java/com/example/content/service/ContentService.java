package com.example.content.service;

import com.example.content.entity.Content;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 10:06
 * 内容 service
 */
public interface ContentService {
    /**
     * 查询所有
     * @return List
     */
    List<Content> selectByAll();

    /**
     * 根据id查询
     * @param titleId
     * @return
     */
    Content selectById(String titleId);
}
