package com.zhangxp.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhangxp.spring.service.FunctionService;
import com.zhangxp.spring.service.UseFunctionService;

@Configuration
public class JavaConfig {

	@Bean
	public FunctionService functionService() {
		FunctionService functionService = new FunctionService();
		return functionService;
	}
////	@Bean
//	public UseFunctionService useFunctionService() {
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService());
//		return useFunctionService;
//	}
	@Bean
	public UseFunctionService userFunctinoService(FunctionService functionService) {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService);
		return useFunctionService;
	}
}
