package com.platzi.springproject.configuration;

import com.platzi.springproject.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement2();
    }
    @Bean
    public MyOperation beanMyOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationWithDependency(){
        return new MyBeanWithDependencyImplement();
    }
}
