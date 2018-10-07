package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.DonationDao;
import com.framework.entity.DonationEntity;
import com.framework.service.DonationService;



@Service("donationService")
public class DonationServiceImpl implements DonationService {
	@Autowired
	private DonationDao donationDao;
	
	@Override
	public DonationEntity queryObject(Integer donationId){
		return donationDao.queryObject(donationId);
	}
	
	@Override
	public List<DonationEntity> queryList(Map<String, Object> map){
		return donationDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return donationDao.queryTotal(map);
	}
	
	@Override
	public void save(DonationEntity donation){
		donationDao.save(donation);
	}
	
	@Override
	public void update(DonationEntity donation){
		donationDao.update(donation);
	}
	
	@Override
	public void delete(Integer donationId){
		donationDao.delete(donationId);
	}
	
	@Override
	public void deleteBatch(Integer[] donationIds){
		donationDao.deleteBatch(donationIds);
	}
	
}
