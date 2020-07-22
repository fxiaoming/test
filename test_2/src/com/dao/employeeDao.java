package com.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.po.employee;;
public interface employeeDao {
	public employee checkUser(int id);
	//�����û�
	public void insertEmployee(@Param("name")String name,@Param("age")String age,@Param("sex")String sex,@Param("address")String address);
	//ɾ���û�
	public Integer deleteEmployee(@Param("name")String name);
	//�޸��û�
	public void updateEmployee(@Param("name")String name,@Param("age")String age,@Param("sex")String sex,@Param("address")String address);
	//��ѯ�û�
	public List<employee> selectAllEmployee();
	//��ѯ�����û�
	public employee selectEmployee(@Param("name")String name);
}
