package com.example.consult.controller;

import com.example.consult.entity.Consult;
import com.example.consult.service.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/9 16:26
 *咨询 controller
 */
@RestController
@RequestMapping("/consult")
public class ConsultController {

    @Autowired
    private ConsultService consultService;

    /**
     * 查询所有
     * @return List
     */
    @GetMapping("/findAll")
    public List<Consult> findAll(){
        List<Consult> consultsList = consultService.getfindAll();
        return consultsList;

    }

}
