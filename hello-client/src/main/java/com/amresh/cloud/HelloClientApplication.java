package com.amresh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@EnableHystrixDashboard
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.amresh")
public class HelloClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}
}




