package com.scm.SCM;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
