package com.org.spring.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = " com.org.spring")
@EnableAspectJAutoProxy
public class Config {
	

}
