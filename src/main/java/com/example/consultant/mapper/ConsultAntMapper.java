package com.example.consultant.mapper;

import com.example.consultant.entity.ConsultAnt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/9 18:17
 * 咨询详情 mapper
 */
@Mapper
public interface ConsultAntMapper {
    /**
     * 查询所有
     * @return List
     */
    List<ConsultAnt> findALl();

    /**
     * 根据外键id查询
     * @param consultId 外键
     * @return ConsultAnt
     */
    ConsultAnt findByIdAll(String consultId);

}
