package com.selftest.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.selftest.core.po.User;

public class LoginInterceptor implements HandlerInterceptor {

	private static final String User = null;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();
		if (url.indexOf("/login.action") >= 0) {
			return true;
		}
		HttpSession session = request.getSession();
		 User user = (User)session.getAttribute("USER_SESSION");
		 if (user != null) {
			return true;
		}
		 request.setAttribute("msg", "����û�е�¼�����ȵ�¼��");
		 request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}

}
