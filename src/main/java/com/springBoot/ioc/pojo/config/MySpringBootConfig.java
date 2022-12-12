package com.springBoot.ioc.pojo.config;

/**
 * @Description: 配置文件
 * @Author Walter
 * @Date 2022/12/8 17:46
 * @Version 1.0
 */

import com.springBoot.ioc.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringBootConfig {
    @Bean(name="student")
    public Student getStu(){
        Student student=new Student();
        student.setId(1L);
        student.setUsername("Tom");
        student.setPassword("123456");
        return student;
    }
}