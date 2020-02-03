package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@RequestMapping("/add")
	public String hello(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		int k = i+j;
		return "Hello !!! The Result is : " + k ;
	}
	
	
	@RequestMapping("/list")
	public void ListTest(@RequestParam("t3") int i) {
		List <String> str = new ArrayList<String>(); 
		str.add("ABC");
		str.add("DEF");
		str.add("GHI");
		str.add("JKL");
		str.add("MNO");
		str.add("PQR");
		str.add("STU");
		str.add("VWX");
		str.add("YZ");
		
		for (String strloop : str) {
			System.out.println(strloop);
		}
	
	}
}
