package com.limatoeic.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.limatoeic.dto.NewDTO;

//@RestController = @Controller + @ResponseBody
//@Controller
@RestController
public class NewAPI {

//	@GetMapping("/test") = @RequestMapping + method
	@GetMapping(value = "/test")
	public String testAPI() {
		return "success";
	}

//	@RequestMapping(value = "/new", method = RequestMethod.POST)
//	@ResponseBody
//	public NewDTO createNew(@RequestBody NewDTO model) {
//		return model;
//	}

//	client > server
//	data: json
//	@RequestBody
//	json > newdto

//	server > client 
//	data: newdto
//	@ResponseBody
//	newdto > json

	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return model;
	}
}
