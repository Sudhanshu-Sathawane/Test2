package com.java;

import java.servelet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String display(@RequestParam("empNo") String empNo,@RequestParam("empName") String empName,@RequestParam("empSal") String empSal,@RequestParam("empDes") String empDes
			,Model m) {
		
		String mssg="Hello"+empName;
		String data ="Your details are [ "+empNo+" , "+empName+" , "+empSal+" , "+empDes+" ]"; // to show Employee Details
		
		//add a message to the model
		m.addAttribute("message", mssg);
		m.addAttribute("message", data);
		return "viewpage";
	}
}