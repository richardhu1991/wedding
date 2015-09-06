package com.tzlh.wedding.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckController {
	
	@RequestMapping(value = "/checkPreload")
	@ResponseBody
	public Object checkPreload(){
		return "success";
	}

}
