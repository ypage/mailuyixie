package com.framework.service;

import com.framework.entity.ActiveEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface ActiveService {
	
	ActiveEntity queryObject(Integer activeId);
	
	List<ActiveEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(ActiveEntity active);
	
	void update(ActiveEntity active);
	
	void delete(Integer activeId);
	
	void deleteBatch(Integer[] activeIds);
}
