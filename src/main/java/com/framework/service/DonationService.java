package com.framework.service;

import com.framework.entity.DonationEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface DonationService {
	
	DonationEntity queryObject(Integer donationId);
	
	List<DonationEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(DonationEntity donation);
	
	void update(DonationEntity donation);
	
	void delete(Integer donationId);
	
	void deleteBatch(Integer[] donationIds);
}
