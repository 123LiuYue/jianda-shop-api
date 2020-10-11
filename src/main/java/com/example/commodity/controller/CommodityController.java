package com.example.commodity.controller;

import com.example.commodity.entity.Commodity;
import com.example.commodity.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/7 10:31
 * 图片 controller
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private CommodityServiceImpl commodityServiceImpl;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAll")
    public List<Commodity> findAll(){
        List<Commodity> commodity = commodityServiceImpl.selectAll();
        return commodity;
    }

}
