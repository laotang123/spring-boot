package com.golaxy.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: ljf
 * @date: 2021/5/12 13:47
 * @description:
 * @modified By:
 * @version: $ 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaServerApplication.class);
	}
}
