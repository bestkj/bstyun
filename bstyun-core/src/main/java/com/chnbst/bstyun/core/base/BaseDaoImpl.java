package com.chnbst.bstyun.core.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl extends SqlSessionDaoSupport implements BaseDao {
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	protected String namepace;
	@Override
	public <T> int insert(String sqlId, T object) {
		return this.getSqlSession().insert(namepace + sqlId, object);
	}

	@Override
	public <T> int update(String sqlId, T object) {
		return this.getSqlSession().update(namepace + sqlId,object);
	}

	@Override
	public <T> int delete(String sqlId, T object) {
		return this.getSqlSession().delete(namepace + sqlId, object);
	}

	@Override
	public <T> List<T> queryAll(String sqlId, Object param) {
		return this.getSqlSession().selectList(namepace + sqlId,param);
	}
	
	@Override
	public <T> List<T> queryAll(String sqlId, Map<String, Object> params) {
		return this.getSqlSession().selectList(namepace + sqlId,params);
	}

	@Override
	public Object queryOne(String sqlId, Object param) {
		return this.getSqlSession().selectOne(namepace + sqlId,param);
	}
	
	@Override
	public Object queryOne(String sqlId, Map<String, Object> params) {
		return this.getSqlSession().selectOne(namepace + sqlId,params);
	}

}
