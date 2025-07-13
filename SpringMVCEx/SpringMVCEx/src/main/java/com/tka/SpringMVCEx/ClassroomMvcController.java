package com.tka.SpringMVCEx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ClassroomMvcController {
	@GetMapping("openhomepage")
	public String showhomepage(Model model) {
	model.addAttribute("msg", "hello");
	return "home";
	}
	@PostMapping("register")
	public String register(@ModelAttribute Classroom classroom, Model model) {
	model.addAttribute("msg", "hello");
	System.err.println(classroom);
	return "home";
	}
}
