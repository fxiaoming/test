package com.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.employee;;
public interface employeeDao {
	public employee checkUser(int id);
	//增加用户
	public void insertEmployee(@Param("name")String name,@Param("age")String age,@Param("sex")String sex,@Param("address")String address);
	//删除用户
	public Integer deleteEmployee(@Param("name")String name);
	//修改用户
	public void updateEmployee(@Param("name")String name,@Param("age")String age,@Param("sex")String sex,@Param("address")String address);
	//查询用户
	public List<employee> selectAllEmployee();
	//查询单个用户
	public employee selectEmployee(@Param("name")String name);
}
