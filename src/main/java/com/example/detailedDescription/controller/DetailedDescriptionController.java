package com.example.detailedDescription.controller;

import com.example.detailedDescription.entity.DetailedDescription;
import com.example.detailedDescription.service.DetailedDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyue
 * @date 2020/10/10 16:47
 * 商品详情内容 controller
 */
@RestController
@RequestMapping("/detailedDescription")
public class DetailedDescriptionController {
    @Autowired
    private DetailedDescriptionService detailedDescriptionService;

    /**
     * 根据外键id查询
     * @param commodityId 外键id
     * @return DetailedDescription
     */
    @GetMapping("/findByIdAll")
    public DetailedDescription findByIdAll(@RequestParam String commodityId){
        DetailedDescription detailedDescription = detailedDescriptionService.getfindByIdAll(commodityId);
        return detailedDescription;
    }

}
