package com.ServerImpl;

import com.po.employee;
import com.service.employeeService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.*;
@Service("userService")
public class employeeServiceImpl implements employeeService {
	@Resource
	private employeeDao employeedao;
	
//	@Override
//	@Transactional
//	public employee checkUser(int id) {
//		employee user=employeedao.checkUser(id);
//		if(user!=null) {
//			return user;
//		}
//		else
//		{
//			return null;
//		}
//	}
	@Override
	@Transactional
	public void insertEmployee(String name, String age, String sex, String address) {
		// TODO Auto-generated method stub
		 employeedao.insertEmployee(name, age, sex, address);
	}
	@Override
	@Transactional
	public void deleteEmployee(String name) {
		// TODO Auto-generated method stub
		employeedao.deleteEmployee(name);
	}
	@Override
	@Transactional
	public void updateEmployee(String name, String age, String sex, String address) {
		// TODO Auto-generated method stub
		employeedao.updateEmployee(name, age, sex, address);
	}
	@Override
	@Transactional
	public List<employee> selectAllEmployee() {
		// TODO Auto-generated method stub
		if(employeedao.selectAllEmployee()!=null) {
			return employeedao.selectAllEmployee();
		}
		return null;
	}
	@Override
	@Transactional
	public employee selectEmployee(String name) {
		// TODO Auto-generated method stub
		if(employeedao.selectEmployee(name)!=null) {
			return employeedao.selectEmployee(name);
		}
		return null;
	}
}
