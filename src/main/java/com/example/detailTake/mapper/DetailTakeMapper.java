package com.example.detailTake.mapper;

import com.example.detailTake.entity.DetailTake;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/10 15:26
 * 商品详情轮播图片 mapper
 */
@Mapper
public interface DetailTakeMapper {

    List<DetailTake> findByIdAll(String commodityId);
}
