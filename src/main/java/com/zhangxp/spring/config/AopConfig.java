package com.zhangxp.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zhangxp.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
