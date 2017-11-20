package com.ytl.yshu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月8日
 * <p/>
 * Description : 基础拦截器
 */
public class CommonFilter implements Filter {
	
	private static Logger logger = Logger.getLogger(CommonFilter.class);

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.info("conmonFilter get 》》》》》》》》》 ");
		System.out.println("conmonFilter get");
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}