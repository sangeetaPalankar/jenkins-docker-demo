package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.demo.model.Demo;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
//		ApplicationContext ac = new FileSystemXmlApplicationContext( "demo1/src/main/java/com/example/demo/beans.xml" );
//        
//		Demo demo = ac.getBean(Demo.class);
//		System.out.println(demo);
	}


}
