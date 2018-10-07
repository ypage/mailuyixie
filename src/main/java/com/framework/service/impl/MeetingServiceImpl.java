package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.MeetingDao;
import com.framework.entity.MeetingEntity;
import com.framework.service.MeetingService;



@Service("meetingService")
public class MeetingServiceImpl implements MeetingService {
	@Autowired
	private MeetingDao meetingDao;
	
	@Override
	public MeetingEntity queryObject(Integer meetingId){
		return meetingDao.queryObject(meetingId);
	}
	
	@Override
	public List<MeetingEntity> queryList(Map<String, Object> map){
		return meetingDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return meetingDao.queryTotal(map);
	}
	
	@Override
	public void save(MeetingEntity meeting){
		meetingDao.save(meeting);
	}
	
	@Override
	public void update(MeetingEntity meeting){
		meetingDao.update(meeting);
	}
	
	@Override
	public void delete(Integer meetingId){
		meetingDao.delete(meetingId);
	}
	
	@Override
	public void deleteBatch(Integer[] meetingIds){
		meetingDao.deleteBatch(meetingIds);
	}
	
}
