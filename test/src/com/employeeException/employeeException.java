package com.employeeException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class employeeException implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object,
			Exception e) {
		// TODO Auto-generated method stub
		//打印异常信息
		e.printStackTrace();
		//保存异常并且跳转页面
		ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", "出错啦~系统繁忙~");
        mv.setViewName("error");
        return mv;
	}

}
