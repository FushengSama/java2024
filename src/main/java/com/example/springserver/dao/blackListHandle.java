package com.example.springserver.dao;

import com.example.springserver.po.blackList;
import com.example.springserver.po.shaixuan;

import java.util.List;

public interface blackListHandle {
    List<blackList> findAll();
    int AddOne(blackList blackList);
    List<blackList> find(shaixuan shaixuan);
    int UpdateBlackList(blackList blackList);
    List<blackList> findByUuid(String uuid);
    int deleteBlackList(String uuid);

}
