package com.mtn.core.dao;

import java.util.List;

/**
 * @author Prabhakar Manthena
 *
 */

public interface GenericDao<T> {
	
	T findById(Integer id);
	
	List<T> findByHqlQuery(String hqlQuery);
	
	void save(T t);	
	
	void delete(T t);
	
}
