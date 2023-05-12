package com.exam.ccproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@SpringBootApplication
@RestController
public class CcprojectApplication {
	
	@GetMapping("/")
	public String welcome(){
		return "Welcome All";	
	}
	
	@GetMapping("/restaurants")
	public Map<String,HashMap<String,Integer>> getRestuarents(){
		HashMap<String,Integer> menu1= new HashMap<String,Integer>();
		menu1.put("Burger", 10);
		menu1.put("fries", 5);
		menu1.put("Meal", 20);
		
		HashMap<String,Integer> menu2= new HashMap<String,Integer>();
		menu2.put("Burger", 3);
		menu2.put("fries", 1);
		menu2.put("Meal", 10);
		
		HashMap<String,HashMap<String,Integer>> restaurants= new HashMap<String,HashMap<String,Integer>>();
		restaurants.put("McDonalds", menu2);
		restaurants.put("Subway", menu1);
		
		return restaurants;
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CcprojectApplication.class, args);
	}

}
