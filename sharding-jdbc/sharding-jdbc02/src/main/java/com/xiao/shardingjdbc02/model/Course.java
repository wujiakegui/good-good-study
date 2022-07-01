package com.xiao.shardingjdbc02.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import java.io.Serializable;

/**
 * @Description
 * @Author huangxiao
 * @Date 2022-06-30
 */
@Data
@AutoConfigureOrder
@NoArgsConstructor
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cid
     */
    private Long cid;

    /**
     * 姓名
     */
    private String cname;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 状态
     */
    private String status;

}