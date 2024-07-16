package com.kh.app02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class App02Application {

	public static void main(String[] args) {
		SpringApplication.run(App02Application.class, args);
	}

}
