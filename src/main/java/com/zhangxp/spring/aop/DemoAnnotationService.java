package com.zhangxp.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Action(name="注解式拦截的add操作")
	public void add() {
		System.out.println("方法名："+this.getClass());
	}
}
