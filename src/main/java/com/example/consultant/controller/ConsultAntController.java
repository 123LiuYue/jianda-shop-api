package com.example.consultant.controller;

import com.example.consultant.entity.ConsultAnt;
import com.example.consultant.service.ConsultAntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/9 18:23
 * 咨询详情 controller
 */
@RestController
@RequestMapping("/consultant")
public class ConsultAntController {
    @Autowired
    private ConsultAntService consultAntService;

    /**
     * 查询所有
     * @return List
     */
    @GetMapping("/findAll")
    public List<ConsultAnt> findAll(){
        List<ConsultAnt> consultAntList = consultAntService.getfindAll();
        return consultAntList;

    }

    /**
     * 根据外键id查询
     * @param consultId 外键id
     * @return ConsultAnt
     */
    @GetMapping("/findByIdAll")
    public ConsultAnt findByIdAll(@RequestParam String consultId){
        ConsultAnt consultAnt = consultAntService.getByIdAll(consultId);
        return consultAnt;

    }




}
