package com.example.consultant.service.impl;

import com.example.consult.service.ConsultService;
import com.example.consultant.entity.ConsultAnt;
import com.example.consultant.mapper.ConsultAntMapper;
import com.example.consultant.service.ConsultAntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/9 18:20
 * 咨询详情 service impl
 */
@Service
public class ConsultAntServiceImpl implements ConsultAntService {
    @Autowired
    private ConsultAntMapper consultAntMapper;

    /**
     * 查询所有
     * @return List
     */
    @Override
    public List<ConsultAnt> getfindAll() {
        return consultAntMapper.findALl();
    }

    /**
     * 根据外键id查询
     * @param consultId 外键id
     * @return ConsultAnt
     */
    @Override
    public ConsultAnt getByIdAll(String consultId) {
        return consultAntMapper.findByIdAll(consultId);
    }
}
