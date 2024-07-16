package com.kh.app11;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class App11Application {

	public static void main(String[] args) {
		SpringApplication.run(App11Application.class, args);
	}

}
