package com.dao;
import org.apache.ibatis.annotations.Param;

import com.po.phoneModel;
public interface sendDao {
	public phoneModel selectPhone(@Param("phone")String phone);
	public void add(@Param("phone")String phone,@Param("code")String code);
}
