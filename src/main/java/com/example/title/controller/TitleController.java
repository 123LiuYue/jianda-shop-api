package com.example.title.controller;

import com.example.title.entity.Title;
import com.example.title.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/8 9:42
 * 标题 controller
 */
@RestController
@RequestMapping("/title")
public class TitleController {
    @Autowired
    private TitleService titleService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/finAll")
    public List<Title> findAll(){
        List<Title> list = titleService.selectByAll();
        return list;
    }

    /**
     * 连表查询
     * @param id
     * @return Content
     */
    @GetMapping("/findByIdAll")
    public Title findByIdAll(String id){
        Title title = titleService.findByIdAll(id);
        System.out.println("接收到了请求");
        return title;
    }


}
