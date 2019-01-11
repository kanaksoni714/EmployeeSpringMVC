package com.cg.app.employee.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.app.employee.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/accept")
	public String askDetails(Map map) {
		map.put("employee", new Employee());
		return "Input";
	}

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String save(@RequestParam("empId") int empId, @RequestParam("empName") String empName,
			@RequestParam("salary") int salary, Model model) {
		Employee employee = new Employee(empId, empName, salary);
		model.addAttribute("employee", employee);
		return "Display";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("employee") Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			return "input";
		}
		return "Display";
	}
//		@RequestMapping(value="/save", method= RequestMethod.POST)
//		public String askDetails(@ModelAttribute("employee") Employee employee,BindingResult result) {
//			
//		}
}
