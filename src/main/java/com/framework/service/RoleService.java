package com.framework.service;

import com.framework.entity.RoleEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface RoleService {
	
	RoleEntity queryObject(Integer roleId);
	
	List<RoleEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RoleEntity role);
	
	void update(RoleEntity role);
	
	void delete(Integer roleId);
	
	void deleteBatch(Integer[] roleIds);
}
