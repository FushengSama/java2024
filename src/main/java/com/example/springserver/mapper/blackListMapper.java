package com.example.springserver.mapper;

import com.example.springserver.po.blackList;
import com.example.springserver.po.shaixuan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface blackListMapper {
List<blackList> findAll();
int AddOne(blackList BlackList);
List<blackList> find(shaixuan shaixuan);
int UpdateBlackList(blackList BlackList);
List<blackList> findByUuid(String uuid);
int deleteBlackList(String uuid);
}
