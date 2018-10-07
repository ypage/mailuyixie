package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.DiscussDao;
import com.framework.entity.DiscussEntity;
import com.framework.service.DiscussService;



@Service("discussService")
public class DiscussServiceImpl implements DiscussService {
	@Autowired
	private DiscussDao discussDao;
	
	@Override
	public DiscussEntity queryObject(Integer discussId){
		return discussDao.queryObject(discussId);
	}
	
	@Override
	public List<DiscussEntity> queryList(Map<String, Object> map){
		return discussDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return discussDao.queryTotal(map);
	}
	
	@Override
	public void save(DiscussEntity discuss){
		discussDao.save(discuss);
	}
	
	@Override
	public void update(DiscussEntity discuss){
		discussDao.update(discuss);
	}
	
	@Override
	public void delete(Integer discussId){
		discussDao.delete(discussId);
	}
	
	@Override
	public void deleteBatch(Integer[] discussIds){
		discussDao.deleteBatch(discussIds);
	}
	
}
