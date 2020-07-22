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
	
	//����û�
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(Model model,String name,String age,String sex,String address) throws Exception{
		//System.out.println("��ʼע��");
		employeeService.insertEmployee(name, age, sex, address);
		model.addAttribute("tip", "success");
		return "insert";
	}
	//��ת�����ҳ��
	@RequestMapping(value="/ToUpdate.action")
	public String ToUpdat() {
		//System.out.println("����ע��ҳ��");
		return "update";
	}
	//��ת����֤��ҳ��
		@RequestMapping(value="/ToMsg.action")
		public String ToMsg() {
			//System.out.println("����ע��ҳ��");
			return "MsgLogin";
		}
	
	//��ת���޸�ҳ��
		@RequestMapping(value="/Toinsert.action")
		public String Toinsert() {
			//System.out.println("����ע��ҳ��");
			return "insert";
		}
//	//��ת����ѯҳ��
//	@RequestMapping(value="/ToSeleteAll")
//	public String ToSeleteAll() {
//		//System.out.println("����ע��ҳ��");
//		return "employees";
//	}
	//ɾ���û�
	
	//��ѯ�����û�
	@RequestMapping(value="/ToSeleteAll",method=RequestMethod.GET)
	public String seleteAll(Model model,HttpSession session) {
		List<employee> employees = employeeService.selectAllEmployee();
		
		session.setAttribute("employees", employees);
		model.addAttribute("employees", employees);
		return "employees";
	}
	//�޸��û�
		@RequestMapping(value="/update",method=RequestMethod.POST)
		public String update(Model model,HttpSession session,String name,String age,String sex,String address) {
			
			if(employeeService.selectEmployee(name)!=null) {
				employeeService.updateEmployee(name, age, sex, address);
				return "update";
			}
			return "error";
			
		}
	//��ת��ɾ������
		@RequestMapping(value="/ToDelete.action")
		public String ToDelete() {
			//System.out.println("����ע��ҳ��");
			return "delete";
		}
		//ɾ���û�
		@RequestMapping(value="/delete",method=RequestMethod.POST)
		public String delete(Model model,HttpSession session,String name) {
			
			if(employeeService.selectEmployee(name)!=null) {
				employeeService.deleteEmployee(name);
				return "delete";
			}
			return "error";
			
		}		
	/*
	 * ��ȡ��Ҫ�޸��û�����Ϣ
	 
	@RequestMapping(value="ToUpdate/{name}",method=RequestMethod.GET)
	public String updateUserView(@PathVariable("name") String name,Model model) {
		employee e=employeeService.selectEmployee(name);
		model.addAttribute("employee",e);
		return "update";
	}*/
}
