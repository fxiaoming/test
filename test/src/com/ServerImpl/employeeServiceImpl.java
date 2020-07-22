package com.ServerImpl;

import com.po.employee;
import com.service.employeeService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.*;
@Service("userService")
public class employeeServiceImpl implements employeeService {
	@Resource
	private employeeDao employeedao;
	
	@Override
	@Transactional
	public employee checkUser(int id) {
		employee user=employeedao.checkUser(id);
		if(user!=null) {
			return user;
		}
		else
		{
			return null;
		}
	}
	@Override
	@Transactional
	public void insertEmployee(String name, String age, String sex, String address) {
		// TODO Auto-generated method stub
		 employeedao.insertEmployee(name, age, sex, address);
	}
}
