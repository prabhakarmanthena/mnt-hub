package com.mtn.core.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@TransactionConfiguration(defaultRollback = true)
@ContextConfiguration({ "classpath:/application-core-context.xml" })
@Transactional  
@RunWith(SpringJUnit4ClassRunner.class) 
public class RoleDaoTest {

	@Autowired
	private RoleDao roleDao;
	@Test
	public void testFindById() {  
		System.out.println(roleDao.findById(1).getRoleName()); 
	}

	@Test
	public void testFindByHqlQuery() { 
		fail("Not yet implemented");
	} 

}
