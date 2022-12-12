package com.springBoot.ioc.pojo.test;

/**
 * @Description: IOC实例测试类
 * @Author Walter
 * @Date 2022/12/8 17:46
 * @Version 1.0
 */

import com.springBoot.ioc.pojo.Student;
import com.springBoot.ioc.pojo.config.MySpringBootConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTestDemo {
    private static final Logger log= LoggerFactory. getLogger(IocTestDemo.class);
    public static void main(String[] args) {
        ApplicationContext context=new
                AnnotationConfigApplicationContext(MySpringBootConfig.class);
        Student student=context.getBean(Student.class);
        log.info("id= "+(student.getId()+""));
        log.info("username= "+student.getUsername());
        log.info("password= "+student.getPassword());
    }
}
