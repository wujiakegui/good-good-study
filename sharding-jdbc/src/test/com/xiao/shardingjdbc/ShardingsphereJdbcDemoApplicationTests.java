package com.xiao.shardingjdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiao.shardingjdbc.mapper.CourseMapper;
import com.xiao.shardingjdbc.model.Course;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description
 * @Author huangxiao
 * @Date 2022-06-30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingsphereJdbcDemoApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    /**
     * 添加课程
     */
    @Test
    public void addCourse() {
        Course course = new Course();
        //cid由我们设置的策略，雪花算法进行生成
        for (int i = 0; i < 10; i++) {
            course.setCname("Java");
            course.setUserId(200L + i);
            course.setStatus("Normal");
            courseMapper.insert(course);
        }
    }

    /**
     * 查询详情
     */
    @Test
    public void findCourseDetail() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid", 749286337235910657L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }

    /**
     * 查询列表
     */
    @Test
    public void findCourseList() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.orderBy(true,true, "user_id");
        List<Course> course = courseMapper.selectList(wrapper);
        System.out.println(course);
    }

}