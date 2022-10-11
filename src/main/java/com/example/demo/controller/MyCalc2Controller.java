package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyCalc2Controller {

	// This will route to index page/ home page

	@RequestMapping("/index")
	public String homePage() {
		return "index";
	}

	// This will route the client to input the two integer values num1 and num2 for addition operation

	@RequestMapping("/add")
	public String addPage() {
		return "add";

	}
	// This will route the client to sum of two integer values num1 and num2 

	@RequestMapping(path = "/addition", method = RequestMethod.POST)
	public String addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model)

	{
		System.out.println("num1 " + num1);

		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		return "addition";
	}
	// This will route to the multiplication of two numbers

	@RequestMapping("/multiply")
	public String multiply() {
		return "multiply";
	}
	// This will return the view and result of multiplication

	@RequestMapping(path = "/multiplication", method = RequestMethod.POST)
	public String multiplication(

			@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
		System.out.println("num1 " + num1);

		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		return "multiplication";
	}
	// This will route to the division of two numbers

	@RequestMapping("/divide")
	public String divide() {
		return "divide";
	}
	// This will return the view and result of division

	@RequestMapping(path = "/division", method = RequestMethod.POST)
	public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {

		System.out.println("num1 " + num1);
		return "division";
	}
	// This will route to the subtraction of two numbers

	@RequestMapping("/subtract")
	public String subtract() {
		return "subtract";
	}
	// This will return the view and subtraction of division

	@RequestMapping(path = "/subtraction", method = RequestMethod.POST)
	public String subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
		System.out.println("num1 " + num1);
	
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		return "subtraction";
	}

	public Object add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
