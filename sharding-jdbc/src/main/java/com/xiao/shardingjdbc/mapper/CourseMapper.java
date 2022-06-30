package com.xiao.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiao.shardingjdbc.model.Course;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author huangxiao
 * @Date 2022-06-30
 */
@Repository
@MapperScan("com.xiao.shardingjdbc.mapper")
public interface CourseMapper extends BaseMapper<Course> {

}
