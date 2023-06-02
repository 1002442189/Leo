package com.example.leosystem.entity;

import lombok.Data;

@Data //lombok中的注解，自动生成get&set方法
public class User {

    private  Long id;
    private  String name;
    private  Integer age;
}
