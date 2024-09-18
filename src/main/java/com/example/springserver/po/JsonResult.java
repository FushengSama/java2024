package com.example.springserver.po;

public class JsonResult <T>{
    public T data;
    public String msg;
    public String code;
    public JsonResult(){this.code="0";
    this.msg="success";

    }
    public JsonResult(T data){
        this.data = data;
        this.code="0";
        this.msg="success";

    }
    public JsonResult(T data,String msg){
        this.data = data;
        this.msg=msg;
        this.code="0";

    }
    public JsonResult(T data,String code,String msg){
        this.data = data;
        this.msg=msg;
        this.code=code;
    }

}
