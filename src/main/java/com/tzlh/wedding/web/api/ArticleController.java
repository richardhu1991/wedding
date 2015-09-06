package com.tzlh.wedding.web.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("articles")
public class ArticleController {
	@RequestMapping(value = "/checkPreload")
	@ResponseBody
	public Object checkPreload() {
		return "success";
	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public Object save(
			@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "data", required = false) String data,
			HttpServletRequest request, HttpServletResponse response) {
		return "success";
	}

}
