package com.lx.springcloudlearn.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//不使用下面的注解，只是用spring.cloud.config.bootstrap=true并做相关配置，可以关闭通过web直接访问config-server的功能
@EnableConfigServer
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
