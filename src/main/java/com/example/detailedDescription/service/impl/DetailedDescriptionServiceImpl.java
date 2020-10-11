package com.example.detailedDescription.service.impl;

import com.example.detailedDescription.entity.DetailedDescription;
import com.example.detailedDescription.mapper.DetailedDescriptionMapper;
import com.example.detailedDescription.service.DetailedDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuyue
 * @date 2020/10/10 16:45
 *商品详情内容 service impl
 */
@Service
public class DetailedDescriptionServiceImpl implements DetailedDescriptionService {
    @Autowired
    private DetailedDescriptionMapper detailedDescriptionMapper;

    @Override
    public DetailedDescription getfindByIdAll(String commodityId) {

        return detailedDescriptionMapper.findByIdAll(commodityId);
    }
}
