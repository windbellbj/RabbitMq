package com.lxl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void show(){
		System.out.println("\n\tApplication is : http://127.0.0.1:8080\n");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		show();
	}
}
