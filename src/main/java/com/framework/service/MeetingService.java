package com.framework.service;

import com.framework.entity.MeetingEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface MeetingService {
	
	MeetingEntity queryObject(Integer meetingId);
	
	List<MeetingEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(MeetingEntity meeting);
	
	void update(MeetingEntity meeting);
	
	void delete(Integer meetingId);
	
	void deleteBatch(Integer[] meetingIds);
}
