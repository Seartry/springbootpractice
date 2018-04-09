package com.zhangxp.spring.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.zhangxp.spring.el")
@PropertySource("classpath:test.properties")
public class ElConfig {

	@Value("I love you !")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{T(java.lang.Math).random() * 100.0}")
	private double randomNumber;
	
	@Value("#{demoService.another}")
	private String another;
	
	@Value("${book.name}")
	private String bookName;
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Autowired
	private Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer  propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResources() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(another);
			System.out.println(bookName);
			System.out.println(testUrl);
			System.out.println(environment);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
