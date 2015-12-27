package com.icoding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icoding.dao.EnterpriseDatabaseDao;
import com.icoding.dao.GenericDao;
import com.icoding.domain.EnterpriseDatabase;

@Service
@Transactional
public class EnterpriseDatabaseServiceImpl extends GenericServiceImpl<EnterpriseDatabase, Integer>
		implements EnterpriseDatabaseService {

	@Autowired
	private EnterpriseDatabaseDao enterpriseDatabaseDao;

	@Override
	GenericDao<EnterpriseDatabase, Integer> getDao() {
		return enterpriseDatabaseDao;
	}

}
