package com.example.picture.service.impl;

import com.example.picture.entity.Picture;
import com.example.picture.mapper.PictureMapper;
import com.example.picture.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/9/28 14:55
 * 图片 service impl
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureMapper pictureMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Picture> selectAll() {
        return pictureMapper.findAll();
    }
}
