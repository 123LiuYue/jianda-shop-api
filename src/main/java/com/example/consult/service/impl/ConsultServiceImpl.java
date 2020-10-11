package com.example.consult.service.impl;

import com.example.consult.entity.Consult;
import com.example.consult.mapper.ConsultMapper;
import com.example.consult.service.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuyue
 * @date 2020/10/9 16:25
 * 咨询 service impl
 */
@Service
public class ConsultServiceImpl implements ConsultService {
    @Autowired
    private ConsultMapper consultMapper;

    /**
     * 查询所有
     * @return List
     */
    @Override
    public List<Consult> getfindAll() {
        return consultMapper.findAll();
    }
}
