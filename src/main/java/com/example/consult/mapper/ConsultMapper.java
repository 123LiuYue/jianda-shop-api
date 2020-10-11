package com.example.consult.mapper;

import com.example.consult.entity.Consult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/9 16:21
 * 咨询 mapper
 */
@Mapper
public interface ConsultMapper {
    /**
     * 查询所有
     * @return List
     */
    List<Consult> findAll();

}
