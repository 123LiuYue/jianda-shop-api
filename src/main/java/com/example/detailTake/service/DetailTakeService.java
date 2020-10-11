package com.example.detailTake.service;

import com.example.detailTake.entity.DetailTake;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/10 15:21
 * 商品详情轮播图片 service
 */
public interface DetailTakeService {
    /**
     * 根据外键查询图片
     * @param commodityId 外键id
     * @return DetailTake
     */
    List<DetailTake> getByIdAll(String commodityId);

}
