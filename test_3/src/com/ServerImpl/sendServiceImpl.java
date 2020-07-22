package com.ServerImpl;

import com.po.phoneModel;
import com.service.sendService;

import java.util.List;


import javax.annotation.Resource;


import org.springframework.stereotype.Service;


import com.dao.sendDao;
import com.po.phoneModel;
@Service
public class sendServiceImpl implements sendService{
	
	
	@Resource
	private sendDao dao;
	//查找手机号是否被注册
	
	//注册手机号
	
	@Override
	public boolean selectPhone(String phone) {
		// TODO Auto-generated method stub
		boolean flag = false;
		phoneModel phonenumber = dao.selectPhone(phone);

		if(phonenumber==null){
			flag=true;
		}
		return flag;
	}

	@Override
	public void add(String phone, String code) {
		// TODO Auto-generated method stub
		dao.add(phone, code);
	}

	
}

	