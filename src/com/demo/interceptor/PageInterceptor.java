package com.demo.interceptor;

import org.apache.jasper.tagplugins.jstl.core.Redirect;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;
import com.jfinal.render.RedirectRender;

public class PageInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation ai) {
		System.out.println("intercept---->star");
		System.out.println(ai.getActionKey());//action 链接
		System.out.println(ai.getController().getRequest().getContextPath());//项目目录
		//ai.getController().redirect(ai.getController().getRequest().getContextPath());
		//ai.getController().setUrlPara("");
		System.out.println("intercept---->end");
	}

}
