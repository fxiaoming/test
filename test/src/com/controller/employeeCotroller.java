package com.controller;
import com.service.*;
import com.po.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class employeeCotroller {
	@Autowired
	public employeeService employeeService;
	
	
	@RequestMapping(value="/insert.action",method=RequestMethod.POST)
	public String insert(Model model,String name,String age,String sex,String address) throws Exception{
		System.out.println("开始注册");
		employeeService.insertEmployee(name, age, sex, address);
		model.addAttribute("tip", "success");
		return "index.jsp";
	}
	
	@RequestMapping(value="/Toinsert.action")
	public String Toinsert() {
		System.out.println("进入注册页面");
		return "insert";
	}
	
	
}
