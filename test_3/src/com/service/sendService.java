package com.service;

import java.util.List;


import javax.annotation.Resource;


import org.springframework.stereotype.Service;


import com.dao.sendDao;
import com.po.phoneModel;;



public interface sendService {
	
	//查找手机号是否被注册
	public boolean selectPhone(String phone);
	//注册手机号
	public void add(String phone,String code);
}
