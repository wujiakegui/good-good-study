package com.xiao.shardingjdbc02.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiao.shardingjdbc02.model.Course;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author huangxiao
 * @Date 2022-06-30
 */
@Repository
@MapperScan("com.xiao.shardingjdbc02.mapper")
public interface CourseMapper extends BaseMapper<Course> {

}
