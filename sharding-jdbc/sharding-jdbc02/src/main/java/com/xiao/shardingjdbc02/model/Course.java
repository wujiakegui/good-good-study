package com.xiao.shardingjdbc02.model;


import lombok.Data;

/**
 * @Description
 * @Author huangxiao
 * @Date 2022-06-30
 */
@Data
public class Course {

    private Long cid;
    private String cname;
    private Long userId;
    private String status;

}