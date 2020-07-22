package com.dao;
import com.po.*;
public interface employeeDao {
	public employee checkUser(int id);
	public void insertEmployee(String name,String age,String sex,String address);
}
