package com.douzone.springbootex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
// 아래는 mvc관련 어노테이션 포함. ex) view resolver
@EnableAutoConfiguration
@ComponentScan("com.douzone.springbootex.controller")
public class BootApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
