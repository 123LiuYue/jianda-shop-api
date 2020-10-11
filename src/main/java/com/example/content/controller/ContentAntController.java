package com.example.content.controller;

import com.example.content.entity.Content;
import com.example.content.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 10:09
 * 内容 controller
 */
@RestController
@RequestMapping("/content")
public class ContentAntController {
    @Autowired
    private ContentService contentService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAll")
    public List<Content> findAll(){
        List<Content> list = contentService.selectByAll();
        return list;
    }

    /**
     * 根据id查询
     * @param titleId
     * @return
     */
    @GetMapping("/findByIdAll")
    public Content findByIdAll(@RequestParam  String titleId){
        Content content =contentService.selectById(titleId);
        return content;
    }

}
