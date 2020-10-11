package com.example.commodity.mapper;

import com.example.commodity.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/7 10:21
 * 图片 mapper
 */
@Mapper
public interface CommodityMapper {
    /**
     * 查询所有
     * @return
     */
    List<Commodity> findAll();
}
