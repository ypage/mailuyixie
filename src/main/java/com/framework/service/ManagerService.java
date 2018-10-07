package com.framework.service;

import com.framework.entity.ManagerEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface ManagerService {
	
	ManagerEntity queryObject(Integer adminId);
	
	List<ManagerEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(ManagerEntity manager);
	
	void update(ManagerEntity manager);
	
	void delete(Integer adminId);
	
	void deleteBatch(Integer[] adminIds);
}
