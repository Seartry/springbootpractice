package com.zhangxp.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zhangxp.spring.prepost.BeanWayService;
import com.zhangxp.spring.prepost.JSR250WayService;

@Configuration
@ComponentScan("com.zhangxp.spring.prepost")
public class PrePostConfig {

	@Bean(initMethod="init",destroyMethod="destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
	
}
