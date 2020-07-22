package com.service;
import com.po.*;;
public interface employeeService {
	
	public void insertEmployee(String name,String age,String sex,String address);
	public employee checkUser(int id);
}
