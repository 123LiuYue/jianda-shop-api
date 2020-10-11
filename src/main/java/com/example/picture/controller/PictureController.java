package com.example.picture.controller;

import com.example.picture.entity.Picture;
import com.example.picture.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/9/28 14:45
 * 图片 controller
 */
@RestController
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    private PictureService pictureService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAll")
    public List<Picture> findAll(){
        List<Picture> pictures = pictureService.selectAll();
        return pictures;
    }

}
