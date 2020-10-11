package com.example.title.mapper;

import com.example.title.entity.Title;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 9:37
 * 标题 mapper
 */
@Mapper
public interface TitleMapper {

    /**
     * 查询所有
     * @return List
     */
    List<Title> findAll();

    /**
     * 连表查询
     * @param id
     * @return Title
     */
    Title connectAll(String id);

}
