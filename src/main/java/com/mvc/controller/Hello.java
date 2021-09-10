package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String sayHi(@RequestParam(value = "name", defaultValue = "unknown", required = false) String name, 
			            @RequestParam("age") Integer age) {
		
		return "Hello " + name + ", " + age;
	}
	
	/*
	 * Lab:
	 * 路徑：/bmi?h=170&w=60
	 * 帶入：h 與 w 二個參數
	 * 結果：bmi = 20.76
	 * */
	@RequestMapping(value = "/bmi")
	@ResponseBody
	public String bmi(@RequestParam("h") Double h, @RequestParam("w") Double w) {
		double bmi = w / Math.pow(h/100, 2);
		return String.format("bmi = %.2f", bmi);
	}
	
	/*
	 * PathVariable
	 * 路徑：/exam/75 -> 結果：75 pass
	 * 路徑：/exam/45 -> 結果：45 fail
	 * */
	@RequestMapping(value = "/exam/{score}")
	@ResponseBody
	public String exam(@PathVariable("score") Integer score) {
		return score + " " + ((score >= 60)? "Pass" : "Fail");
	}
	
}
