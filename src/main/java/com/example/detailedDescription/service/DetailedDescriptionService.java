package com.example.detailedDescription.service;

import com.example.detailedDescription.entity.DetailedDescription;

/**
 * @author liuyue
 * @date 2020/10/10 16:43
 * 商品详情内容 service
 */
public interface DetailedDescriptionService {
    /**
     * 根据外键id查询
     * @param commodityId 外键id
     * @return DetailedDescription
     */
    DetailedDescription getfindByIdAll(String commodityId);
}
