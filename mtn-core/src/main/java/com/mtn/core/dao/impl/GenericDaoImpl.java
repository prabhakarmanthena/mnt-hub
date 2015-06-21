package com.mtn.core.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mtn.core.dao.GenericDao;


/**
 * @author Prabhakar Manthena
 *
 */
    class GenericDaoImpl<T> implements GenericDao<T> {
	
	@Autowired	
	private SessionFactory sessionFactory; 
	
	@Override
	public void save(T t) {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T findById(Integer id) {
		return (T) sessionFactory.getCurrentSession().get(getModelClass() , id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByHqlQuery(String hqlQuery) {
		return  (List<T>)sessionFactory.getCurrentSession().createQuery(hqlQuery).list();
	}	
	
	@Override
	public void delete(T t) {
		sessionFactory.getCurrentSession().delete(t);		
	}
	
	@SuppressWarnings("unchecked")
	public Class<T> getModelClass(){
		return ((Class<T>)((ParameterizedType)this.getClass().
				getGenericSuperclass()).getActualTypeArguments()[0]);
	}
}
