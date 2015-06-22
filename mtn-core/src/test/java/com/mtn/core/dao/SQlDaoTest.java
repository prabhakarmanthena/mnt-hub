package com.mtn.core.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.mtn.core.domain.MtnRole;
@TransactionConfiguration(defaultRollback = true)
@ContextConfiguration({ "classpath:/application-core-context.xml" })
@Transactional  
@RunWith(SpringJUnit4ClassRunner.class) 

public class SQlDaoTest {

	@Autowired
	private SQLDao sqlDao;
	@Test
	public void testFindBySqlQuery() {
		System.out.println(sqlDao.findBySqlQuery("select role_id,role_name from mtn_role", MtnRole.class));
	}

}
