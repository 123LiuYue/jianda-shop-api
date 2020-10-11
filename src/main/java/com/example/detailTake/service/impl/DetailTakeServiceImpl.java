package com.example.detailTake.service.impl;

import com.example.detailTake.entity.DetailTake;
import com.example.detailTake.mapper.DetailTakeMapper;
import com.example.detailTake.service.DetailTakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/10 15:23
 * 商品详情轮播图片 service impl
 */
@Service
public class DetailTakeServiceImpl implements DetailTakeService {

    /**
     * 注入mapper接口
     */
    @Autowired
    private DetailTakeMapper detailTakeMapper;

    @Override
    public List<DetailTake> getByIdAll(String commodityId) {
        return detailTakeMapper.findByIdAll(commodityId);
    }
}
