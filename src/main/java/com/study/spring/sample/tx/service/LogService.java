package com.study.spring.sample.tx.service;

import com.study.spring.sample.tx.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.spring.sample.tx.dao.LogDao;

@Service
public class LogService {

	@Autowired
	private LogDao logDao;

	@Autowired
	private DataSourceTransactionManager txManager;

	// @Transactional
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	// @Transactional(propagation = Propagation.NESTED)
	public void insertLog(Log log) {
		this.logDao.insert(log);
	}

}
