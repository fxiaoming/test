package com.controller;
import com.service.*;
import com.po.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class employeeCotroller {
	@Autowired
	public employeeService employeeService;
	
	//添加用户
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(Model model,String name,String age,String sex,String address) throws Exception{
		//System.out.println("开始注册");
		employeeService.insertEmployee(name, age, sex, address);
		model.addAttribute("tip", "success");
		return "insert";
	}
	//跳转到添加页面
	@RequestMapping(value="/ToUpdate.action")
	public String ToUpdat() {
		//System.out.println("进入注册页面");
		return "update";
	}
	//跳转到验证码页面
		@RequestMapping(value="/ToMsg.action")
		public String ToMsg() {
			//System.out.println("进入注册页面");
			return "MsgLogin";
		}
	
	//跳转到修改页面
		@RequestMapping(value="/Toinsert.action")
		public String Toinsert() {
			//System.out.println("进入注册页面");
			return "insert";
		}
//	//跳转到查询页面
//	@RequestMapping(value="/ToSeleteAll")
//	public String ToSeleteAll() {
//		//System.out.println("进入注册页面");
//		return "employees";
//	}
	//删除用户
	
	//查询所有用户
	@RequestMapping(value="/ToSeleteAll",method=RequestMethod.GET)
	public String seleteAll(Model model,HttpSession session) {
		List<employee> employees = employeeService.selectAllEmployee();
		
		session.setAttribute("employees", employees);
		model.addAttribute("employees", employees);
		return "employees";
	}
	//修改用户
		@RequestMapping(value="/update",method=RequestMethod.POST)
		public String update(Model model,HttpSession session,String name,String age,String sex,String address) {
			
			if(employeeService.selectEmployee(name)!=null) {
				employeeService.updateEmployee(name, age, sex, address);
				return "update";
			}
			return "error";
			
		}
	//跳转到删除界面
		@RequestMapping(value="/ToDelete.action")
		public String ToDelete() {
			//System.out.println("进入注册页面");
			return "delete";
		}
		//删除用户
		@RequestMapping(value="/delete",method=RequestMethod.POST)
		public String delete(Model model,HttpSession session,String name) {
			
			if(employeeService.selectEmployee(name)!=null) {
				employeeService.deleteEmployee(name);
				return "delete";
			}
			return "error";
			
		}		
	/*
	 * 获取所要修改用户的信息
	 
	@RequestMapping(value="ToUpdate/{name}",method=RequestMethod.GET)
	public String updateUserView(@PathVariable("name") String name,Model model) {
		employee e=employeeService.selectEmployee(name);
		model.addAttribute("employee",e);
		return "update";
	}*/
}
