package com.yuanwj.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.Arrays;

@SpringBootApplication
@EnableConfigServer
public class Application {

	private static final Logger LOG= LoggerFactory.getLogger(Application.class);

	@Inject
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void printStacke(){
		LOG.debug("项目启动默认环境为{}", Arrays.toString(environment.getActiveProfiles()));
		LOG.debug("配置信息为{}",environment.getProperty("config.hello"));
	}
}
