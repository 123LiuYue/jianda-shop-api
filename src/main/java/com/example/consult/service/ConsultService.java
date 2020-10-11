package com.example.consult.service;

import com.example.consult.entity.Consult;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/9 16:22
 * 咨询 service
 */
public interface ConsultService {
    /**
     * 查询所有
     * @return List
     */
    List<Consult> getfindAll();
}
