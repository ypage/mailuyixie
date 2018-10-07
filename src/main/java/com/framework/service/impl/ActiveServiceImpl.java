package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.ActiveDao;
import com.framework.entity.ActiveEntity;
import com.framework.service.ActiveService;



@Service("activeService")
public class ActiveServiceImpl implements ActiveService {
	@Autowired
	private ActiveDao activeDao;
	
	@Override
	public ActiveEntity queryObject(Integer activeId){
		return activeDao.queryObject(activeId);
	}
	
	@Override
	public List<ActiveEntity> queryList(Map<String, Object> map){
		return activeDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return activeDao.queryTotal(map);
	}
	
	@Override
	public void save(ActiveEntity active){
		activeDao.save(active);
	}
	
	@Override
	public void update(ActiveEntity active){
		activeDao.update(active);
	}
	
	@Override
	public void delete(Integer activeId){
		activeDao.delete(activeId);
	}
	
	@Override
	public void deleteBatch(Integer[] activeIds){
		activeDao.deleteBatch(activeIds);
	}
	
}
