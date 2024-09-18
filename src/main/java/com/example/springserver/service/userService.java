package com.example.springserver.service;


import com.example.springserver.dao.UserHandle;
import com.example.springserver.mapper.userHandleMapper;
import com.example.springserver.po.JsonResult;
import com.example.springserver.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myBatisService")
public class userService {
    @Autowired
    private UserHandle handleMapper;
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public JsonResult<Integer> updateUser(@RequestBody User user, @Param("uuid") String Updateuuid){
        return new JsonResult<>(handleMapper.update(user,Updateuuid));
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public JsonResult<Integer> insertUser(@RequestBody User user){
        return new JsonResult<>(handleMapper.insert(user));
    }
    @RequestMapping(value = "/selectByphone",method = RequestMethod.POST)
    public JsonResult<List<User>> selectUser(@RequestParam("phonenum") String phoneNum){
        return new JsonResult<>(handleMapper.findByphone(phoneNum));
    }
    @RequestMapping(value = "/testDelete",method = RequestMethod.POST)
    public JsonResult<Integer> deleteUser(@RequestParam("uuid") String uuid){
        return new JsonResult<>(handleMapper.delete(uuid));
    }
    @RequestMapping(value = "/findall",method = RequestMethod.GET)
    public JsonResult<List<User>> findAll(){
        return new JsonResult<>(handleMapper.findAll());
    }
    @RequestMapping(value = "/findByName",method = RequestMethod.POST)
    public JsonResult<List<User>> findByName(@RequestParam("name") String name){
        return new JsonResult<>(handleMapper.findByName(name));
    }

}
