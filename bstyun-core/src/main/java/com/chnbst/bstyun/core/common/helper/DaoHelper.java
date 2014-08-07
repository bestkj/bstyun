/**
 * 
 * @author LiQiange
 * @version 1.0
 * @date 2014-08-07
 */
package com.chnbst.bstyun.core.common.helper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.chnbst.bstyun.core.model.IPOJO;

public abstract class DaoHelper extends SqlSessionDaoSupport{
	private static SqlSessionTemplate sqlSessionTemplate;
	
	/**
	 * 新增
	 * @param nameSpace
	 * @param sqlID
	 * @param entity
	 * @return
	 */
	public static boolean insert(String nameSpace, String sqlID, IPOJO entity) {
		return sqlSessionTemplate.insert(getStatement(nameSpace, sqlID), entity)>=0?true:false;
	}
	
	/**
	 * 修改
	 * @param nameSpace
	 * @param sqlID
	 * @param entity
	 * @return
	 */
	public static boolean update(String nameSpace, String sqlID, IPOJO entity) {
		
		return sqlSessionTemplate.update(getStatement(nameSpace, sqlID), entity)>=0?true:false;
	}
	
	/**
	 * 删除
	 * @param nameSpace
	 * @param sqlID
	 * @param id
	 * @return
	 */
	public static boolean delete(String nameSpace, String sqlID, int id) {
		
		return sqlSessionTemplate.delete(getStatement(nameSpace, sqlID) , id)>=0?true:false;
	}
	
	/**
	 * 删除
	 * @param nameSpace
	 * @param sqlID
	 * @param entity
	 * @return
	 */
	public static boolean delete(String nameSpace, String sqlID, IPOJO entity) {
		
		return sqlSessionTemplate.delete(getStatement(nameSpace, sqlID), entity)>=0?true:false;
	}
	
	/**
	 * 查询总数
	 * @param nameSpace
	 * @param sqlID
	 * @param data
	 * @return
	 */
	public static int count(String nameSpace, String sqlID, Object data) {
		
		return sqlSessionTemplate.selectOne(getStatement(nameSpace, sqlID), data);
	}
	
	/**
	 * 查询单条
	 * @param nameSpace
	 * @param sqlID
	 * @param data
	 * @return
	 */
	public static Object query(String nameSpace, String sqlID, Object data) {
		
		return sqlSessionTemplate.selectOne(getStatement(nameSpace, sqlID), data);
	}
	
	/**
	 * 查询多条
	 * @param nameSpace
	 * @param sqlID
	 * @param data
	 * @return
	 */
	public static List<?> list(String nameSpace, String sqlID, Object data) {
		
		return sqlSessionTemplate.selectList(getStatement(nameSpace, sqlID), data);
	}
	

	
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public static SqlSessionTemplate getSqlSessionTemplate() {
		
		return sqlSessionTemplate;
	}
	
	private static String getStatement(String nameSpace, String sqlID) {
		
		return nameSpace + "." + sqlID;
	}
}
