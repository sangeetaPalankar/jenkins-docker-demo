package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/api")
public class DemoController {
	@Autowired
	private DemoService service;
	
	@GetMapping(path="/getdata")
	public List<Demo> getData(){
		
		return service.getDataService();
	}
	
	@PostMapping(path="/postdata")
	public void postdata(@RequestBody Demo demo) {
		service.postDataService(demo);
	}

	
	@PutMapping(path="/putdata/{id}")
	public void putdata(@PathVariable int id,  @RequestBody Demo demo) {
		service.putDataService(demo, id);
   	}
	
	@DeleteMapping(path ="/deletedata/{id}")
	public void deletedata(@PathVariable int id) {
		service.deleteDataService(id);

	}
}
