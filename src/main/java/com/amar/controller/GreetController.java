package com.amar.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@RequestMapping(value="/greet/{name}",method=RequestMethod.GET)
	public String greet(@PathVariable String name)
	{
		String greet="hellow !! "+ name + "How are you";
		return greet;
	}
}
