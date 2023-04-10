package com.example.demo.service.impl;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	
	@Autowired
	private DemoRepository repo;

	@Override
	public List<Demo> getDataService() {
		return repo.findAll();
	}

	@Override
	public void postDataService(Demo demo) {
		repo.save(demo);
	
		
	}

	@Override
	public void putDataService(Demo demo, int id) {
		Optional<Demo> d = repo.findById(id);
		if(d.isPresent()) {
			demo.setId(id);
			repo.save(demo);
		}

	}

	@Override
	public void deleteDataService(int id) {
		repo.deleteById(id);
		
	}

}
