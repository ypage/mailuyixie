package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.RoleDao;
import com.framework.entity.RoleEntity;
import com.framework.service.RoleService;



@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;
	
	@Override
	public RoleEntity queryObject(Integer roleId){
		return roleDao.queryObject(roleId);
	}
	
	@Override
	public List<RoleEntity> queryList(Map<String, Object> map){
		return roleDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return roleDao.queryTotal(map);
	}
	
	@Override
	public void save(RoleEntity role){
		roleDao.save(role);
	}
	
	@Override
	public void update(RoleEntity role){
		roleDao.update(role);
	}
	
	@Override
	public void delete(Integer roleId){
		roleDao.delete(roleId);
	}
	
	@Override
	public void deleteBatch(Integer[] roleIds){
		roleDao.deleteBatch(roleIds);
	}
	
}
