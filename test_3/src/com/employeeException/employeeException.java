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
		//��ӡ�쳣��Ϣ
		e.printStackTrace();
		//�����쳣������תҳ��
		ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", "������~ϵͳ��æ~");
        mv.setViewName("error");
        return mv;
	}

}
