package com.example.springserver.dao.imp;


import com.example.springserver.dao.blackListHandle;
import com.example.springserver.mapper.blackListMapper;
import com.example.springserver.po.blackList;
import com.example.springserver.po.shaixuan;
import com.example.springserver.service.blackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class blackListImp implements blackListHandle {
    @Autowired
    private blackListMapper blackListMapper;
    @Override
    public List<blackList> findAll() {
        return blackListMapper.findAll();
    }
    @Override
    public int AddOne(blackList blackList) {
        return blackListMapper.AddOne(blackList);
    }
    @Override
    public List<blackList> find(shaixuan shaixuan){
        return blackListMapper.find(shaixuan);
    }
    @Override
    public int UpdateBlackList(blackList blackList) {
        return blackListMapper.UpdateBlackList(blackList);
    }
    @Override
    public List<blackList> findByUuid(String uuid){
        return blackListMapper.findByUuid(uuid);
    }
    @Override
    public int deleteBlackList(String uuid) {
        return blackListMapper.deleteBlackList(uuid);
    }
}
