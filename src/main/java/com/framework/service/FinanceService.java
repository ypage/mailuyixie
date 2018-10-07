package com.framework.service;

import com.framework.entity.FinanceEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface FinanceService {
	
	FinanceEntity queryObject(Integer financeId);
	
	List<FinanceEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(FinanceEntity finance);
	
	void update(FinanceEntity finance);
	
	void delete(Integer financeId);
	
	void deleteBatch(Integer[] financeIds);
}
