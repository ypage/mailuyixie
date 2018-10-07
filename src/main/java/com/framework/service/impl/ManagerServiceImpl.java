package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.ManagerDao;
import com.framework.entity.ManagerEntity;
import com.framework.service.ManagerService;



@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private ManagerDao managerDao;
	
	@Override
	public ManagerEntity queryObject(Integer adminId){
		return managerDao.queryObject(adminId);
	}
	
	@Override
	public List<ManagerEntity> queryList(Map<String, Object> map){
		return managerDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return managerDao.queryTotal(map);
	}
	
	@Override
	public void save(ManagerEntity manager){
		managerDao.save(manager);
	}
	
	@Override
	public void update(ManagerEntity manager){
		managerDao.update(manager);
	}
	
	@Override
	public void delete(Integer adminId){
		managerDao.delete(adminId);
	}
	
	@Override
	public void deleteBatch(Integer[] adminIds){
		managerDao.deleteBatch(adminIds);
	}
	
}
