/**
 * 
 */
package com.mtn.core.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mtn.core.dao.SQLDao;

/**
 * @author Prabhakar Manthena
 *
 */
 class SQlDaoImpl implements SQLDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<?> findBySqlQuery(String sqlQuery, Class<?> cl) {
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery(sqlQuery);
		if(cl !=null)
		query.addEntity(cl);
		return query.list();
	}
		
}
