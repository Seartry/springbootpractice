package com.zhangxp.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zhangxp.spring.aop.DemoAnnotationService;
import com.zhangxp.spring.aop.DemoMethodService;
import com.zhangxp.spring.config.AopConfig;
import com.zhangxp.spring.config.DiConfig;
import com.zhangxp.spring.config.ElConfig;
import com.zhangxp.spring.config.JavaConfig;
import com.zhangxp.spring.config.PrePostConfig;
import com.zhangxp.spring.config.ScopeConfigService;
import com.zhangxp.spring.prepost.BeanWayService;
import com.zhangxp.spring.prepost.JSR250WayService;
import com.zhangxp.spring.scope.DemoPrototypeService;
import com.zhangxp.spring.scope.DemoSingletonService;
import com.zhangxp.spring.service.UseFunctionService;

public class Main {
	public static void main(String[] args) {
		prepostTest();
	}
	
	public static void prepostTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		context.close();
	}
	
	public static void elTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		ElConfig elConfig = context.getBean(ElConfig.class);
		elConfig.outputResources();
		context.close();
	}
	
	public static void scopeTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfigService.class);
		DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);
		System.out.println("判断singletonService1和singletonServic2是否相等："+singletonService1.equals(singletonService2));
		System.out.println("判断prototypeService1和prototypeService2是否相等："+prototypeService1.equals(prototypeService2));
		
		context.close();
	}
	
	public static void aopTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
		DemoMethodService methodService = context.getBean(DemoMethodService.class);
		annotationService.add();
		methodService.add();
		context.close();
	}
	
	
	public static void javaTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello());
		context.close();
	}
	
	public static void diTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello());
		context.close();
	}
	
	
}
