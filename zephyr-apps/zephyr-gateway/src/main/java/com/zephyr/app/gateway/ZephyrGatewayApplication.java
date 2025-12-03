package com.zephyr.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 35533
 * @desc: Zephyr 网关
 * @since: 2025-12-03 20:19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZephyrGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZephyrGatewayApplication.class, args);
	}
}
