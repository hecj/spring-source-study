package com.study.spring.sample.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyArroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("--------- 环绕 -前增强");
		Object ret = invocation.proceed();
		System.out.println("--------- 环绕 -后增强");
		return ret;
	}

}
