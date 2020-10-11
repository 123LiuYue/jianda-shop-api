package com.example.detailedDescription.mapper;

import com.example.detailedDescription.entity.DetailedDescription;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liuyue
 * @date 2020/10/10 16:39
 * 商品详情内容 mapper
 */
@Mapper
public interface DetailedDescriptionMapper {

    /**
     * 根据外键id查询
     * @param commodityId 外键id
     * @return DetailedDescription
     */
    DetailedDescription findByIdAll(String commodityId);

}
