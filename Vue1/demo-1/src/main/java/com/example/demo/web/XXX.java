package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XXX {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
}
