package com.spring.with.cloud.example.SpringCloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudconfigApplication.class, args);
	}

}
