package com.example.content.mapper;

import com.example.content.entity.Content;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 10:05
 * 内容 mapper
 */
@Mapper
public interface ContentMapper {
    /**
     * 查询所有
     * @return List
     */
    List<Content> findAll();

    /**
     * 根据id查询
     * @param titleId
     * @return Content
     */
    Content findByIdAll(String titleId);

}
