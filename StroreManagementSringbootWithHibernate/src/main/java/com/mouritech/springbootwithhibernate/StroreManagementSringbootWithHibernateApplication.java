package com.mouritech.springbootwithhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StroreManagementSringbootWithHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(StroreManagementSringbootWithHibernateApplication.class, args);
	}

}
