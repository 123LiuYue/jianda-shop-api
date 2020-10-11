package com.example.commodity.service;

import com.example.commodity.entity.Commodity;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/7 10:25
 * 图片 service
 */
public interface CommodityService {
    /**
     * 查询所有
     * @return
     */
    List<Commodity> selectAll();
}
