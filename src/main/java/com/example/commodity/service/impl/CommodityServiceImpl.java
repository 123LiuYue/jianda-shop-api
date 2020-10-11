package com.example.commodity.service.impl;

import com.example.commodity.entity.Commodity;
import com.example.commodity.mapper.CommodityMapper;
import com.example.commodity.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/7 10:27
 * 商品 service impl
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    /**
     * 依赖注入
     */
    @Autowired
    private CommodityMapper commodityMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Commodity> selectAll() {
        List<Commodity> a = commodityMapper.findAll();
        return a;
    }
}
