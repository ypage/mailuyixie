package com.framework.service;

import com.framework.entity.DiscussEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface DiscussService {
	
	DiscussEntity queryObject(Integer discussId);
	
	List<DiscussEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(DiscussEntity discuss);
	
	void update(DiscussEntity discuss);
	
	void delete(Integer discussId);
	
	void deleteBatch(Integer[] discussIds);
}
