package com.example.springserver.service;


import com.example.springserver.dao.blackListHandle;
import com.example.springserver.po.JsonResult;

import com.example.springserver.po.blackList;
import com.example.springserver.po.shaixuan;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/blackListService")
@Api(tags = "黑名单")
public class blackListService {
    Logger logger = Logger.getLogger(this.getClass().toString());

    @Autowired
    private blackListHandle blackListHandle;
    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    @ApiOperation(value = "获取所有黑名单",response = blackList.class)
    public JsonResult<List<blackList>> getAllBlackList(){
        return new JsonResult<>(blackListHandle.findAll());
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(value = "插入一条黑名单记录",response = int.class)
    public JsonResult<Integer> insertBlackList(@RequestBody blackList blackList1){

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        blackList1.setStartTime(formatter.format(date));
        blackList1.setUpdateTime(formatter.format(date));
        return new JsonResult<>(blackListHandle.AddOne(blackList1));

    }
    @RequestMapping(value = "/find",method = RequestMethod.POST)
    @ApiOperation(value = "根据条件查找符合的黑名单记录")
    public JsonResult<List<blackList>> findWith(@RequestBody shaixuan Shaixuan){
        System.out.println(Shaixuan.toString());
        return new JsonResult<>(blackListHandle.find(Shaixuan));
    }



    @RequestMapping(value = "/updateBlackList",method = RequestMethod.POST)
    @ApiOperation(value = "更新黑名单记录")
    public JsonResult<Integer> updateBlackList(@RequestBody blackList blackList1){
        logger.info(blackList1.toString());

        return new JsonResult<>(blackListHandle.UpdateBlackList(blackList1));
    }
    @RequestMapping(value = "/deleteBlackList",method = RequestMethod.POST)
    @ApiOperation(value = "根据uuid删除对应的黑名单记录")
    public JsonResult<Integer> deleteBlackList(@RequestParam("uuid") String uuid){
        logger.info("删除uuid为:"+uuid+"的记录");
        JsonResult<Integer> result= new JsonResult<>(blackListHandle.deleteBlackList(uuid));
    if (result.data==0) {
        logger.warning("未找到对应数据");
        result.msg="fail";
    }
    return result;
    }
}
