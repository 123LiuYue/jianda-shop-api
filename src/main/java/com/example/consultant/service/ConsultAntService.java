package com.example.consultant.service;

import com.example.consultant.entity.ConsultAnt;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/9 18:18
 * 咨询详情 service
 */
public interface ConsultAntService {
    /**
     * 查询所有
     * @return List
     */
    List<ConsultAnt> getfindAll();

    /**
     * 根据外键id查询
     * @param consultId 外键id
     * @return ConsultAnt
     */
    ConsultAnt getByIdAll(String consultId);

}
