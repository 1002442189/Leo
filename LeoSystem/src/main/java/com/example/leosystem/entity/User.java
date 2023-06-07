package com.example.leosystem.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


@Data //lombok中的注解，自动生成get&set方法
public class User {

    private  Long id;
    @ApiModelProperty(value="标题")
    private  String title;
    @ApiModelProperty(value="内容")
    private  String content;
    @ApiModelProperty(value="创建时间")
    private Date createTime;
}
