package com.example.eurekahystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableHystrixDashboard
public class EurekaHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHystrixDashboardApplication.class, args);
	}
}
