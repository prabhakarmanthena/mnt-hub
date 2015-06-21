/**
 * 
 */
package com.mtn.core.dao;

import java.util.List;

/**
 * @author Prabhakar Manthena
 *
 */
public interface SQLDao {
	
	List<?> findBySqlQuery(String sqlQuery, Class<?> cl);

}
