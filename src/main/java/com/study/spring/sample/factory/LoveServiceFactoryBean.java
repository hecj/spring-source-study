package com.study.spring.sample.factory;

import com.study.spring.service.LoveService;
import com.study.spring.service.LoveServiceImpl;
import org.springframework.beans.factory.FactoryBean;

public class LoveServiceFactoryBean implements FactoryBean<LoveService> {

	@Override
	public LoveService getObject() throws Exception {
		return new LoveServiceImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return LoveService.class;
	}
	
	@Override
	public boolean isSingleton() {
		return false;
	}
	
}
