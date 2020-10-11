package com.example.picture.mapper;

import com.example.picture.entity.Picture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/9/28 14:46
 * 图片 mapper
 */
@Mapper
public interface PictureMapper {

    /**
     * 查询所有图片
     * @return
     */
    List<Picture> findAll();

}
