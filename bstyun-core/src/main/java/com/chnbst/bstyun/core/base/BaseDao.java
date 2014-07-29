package com.chnbst.bstyun.core.base;

import java.util.List;
import java.util.Map;

public interface BaseDao {
	public <T> int insert(String sqlId,T object);
	public <T> int update(String sqlId,T object);
	public <T> int delete(String sqlId,T object);
	public <T> List<T> queryAll(String sqlId,Map<String, Object> params);
	public <T> List<T> queryAll(String sqlId,Object param);
	public Object queryOne(String sqlId,Map<String, Object> params);
	public Object queryOne(String sqlId,Object param);
}
