package com.zhangxp.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class UseFunctionService {

//	@Autowired
	private FunctionService functionService;
	
	public String sayHello() {
		return functionService.sayHello();
	}
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
}
