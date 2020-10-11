package com.example.detailTake.controller;

import com.example.detailTake.entity.DetailTake;
import com.example.detailTake.service.DetailTakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/10 15:32
 * 商品详情轮播 controller
 */
@RestController
@RequestMapping("detailTake")
public class DetailTakeController {
    /**
     * 依赖注入
     */
    @Autowired
    private DetailTakeService detailTakeService;

    /**
     * 根据外键id查询
     * @param commodityId 外键id
     * @return DetailTake
     */
    @GetMapping("/findByIdAll")
    public List<DetailTake> findByIdAll(@RequestParam String commodityId){
        List<DetailTake> detailTakeList = detailTakeService.getByIdAll(commodityId);
        return detailTakeList;
    }

}
