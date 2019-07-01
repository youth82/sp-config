package com.tedu.sp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo1Application.class, args);
	}

}
