package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class Hello {
	
	@RequestMapping(value = "/greet")
	@ResponseBody
	public String greet() {
		return "Hello Greet !";
	}
	
	/*
	 * 路徑：/sayhi?name=vincent&age=18
	 * 帶入：name 與 age 二個參數
	 * */
	@RequestMapping(value = "/sayhi")
	@ResponseBody
	public String sayHi(@RequestParam("name") String name, 
			            @RequestParam("age") Integer age) {
		
		return "Hello " + name + ", " + age;
	}
	
}
