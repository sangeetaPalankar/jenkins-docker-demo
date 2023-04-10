package com.example.demo.model;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="DemoTable", schema ="demo_database")
public class Demo {
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String city;

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
}
