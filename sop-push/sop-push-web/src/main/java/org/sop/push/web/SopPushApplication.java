package org.sop.push.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.csc.push"})
@EntityScan(basePackages = {"com.csc.push"})
@ComponentScan(basePackages = {"com.csc.push"})
public class SopPushApplication {

	public static void main(String[] args) {
		SpringApplication.run(SopPushApplication.class, args);
	}
}
