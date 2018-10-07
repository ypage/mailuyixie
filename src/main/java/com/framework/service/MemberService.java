package com.framework.service;

import com.framework.entity.MemberEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public interface MemberService {

	 MemberEntity login(String username, String password);

	MemberEntity queryObject(Integer memberId);
	
	List<MemberEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(MemberEntity member);
	
	void update(MemberEntity member);
	
	void delete(Integer memberId);
	
	void deleteBatch(Integer[] memberIds);
}
