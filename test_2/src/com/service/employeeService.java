package com.service;
import java.util.List;

import com.po.*;;
public interface employeeService {
	
	public void insertEmployee(String name,String age,String sex,String address);
	public void deleteEmployee(String name);
	public void updateEmployee(String name,String age,String sex,String address);
	public List<employee> selectAllEmployee();
	public employee selectEmployee(String name);
}
