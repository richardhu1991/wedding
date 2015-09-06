package com.tzlh.wedding.web.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("pictures")
public class PictureController {
	@RequestMapping(value = "/checkPreload")
	@ResponseBody
	public Object checkPreload() {
		return "success";
	}
	
	
	@RequestMapping(value = "/upload")
	@ResponseBody
	public Object upload(
			@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "data", required = false) String data,
			@RequestParam(value = "uploadFile", required = false) MultipartFile uploadFile,
			HttpServletRequest request, HttpServletResponse response) {
		return "success";
	}
}
