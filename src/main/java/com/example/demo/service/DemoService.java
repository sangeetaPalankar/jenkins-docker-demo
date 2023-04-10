package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;


public interface DemoService {

	List<Demo> getDataService();

	void postDataService(Demo demo);

	void putDataService(Demo demo, int id);

	void deleteDataService(int id);

}
