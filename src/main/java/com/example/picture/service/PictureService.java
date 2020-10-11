package com.example.picture.service;

import com.example.picture.entity.Picture;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/9/28 14:53
 * 图片 service
 */
public interface PictureService {
    /**
     * 查询所有
     * @return
     */
    List<Picture> selectAll();

}
