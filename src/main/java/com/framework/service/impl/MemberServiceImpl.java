package com.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.framework.dao.MemberDao;
import com.framework.entity.MemberEntity;
import com.framework.service.MemberService;



@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public MemberEntity queryObject(Integer memberId){
		return memberDao.queryObject(memberId);
	}
	@Override
	public MemberEntity login(String username, String password){

		return  memberDao.login(username,password);
	}
	@Override
	public List<MemberEntity> queryList(Map<String, Object> map){
		return memberDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return memberDao.queryTotal(map);
	}
	
	@Override
	public void save(MemberEntity member){
		memberDao.save(member);
	}
	
	@Override
	public void update(MemberEntity member){
		memberDao.update(member);
	}
	
	@Override
	public void delete(Integer memberId){
		memberDao.delete(memberId);
	}
	
	@Override
	public void deleteBatch(Integer[] memberIds){
		memberDao.deleteBatch(memberIds);
	}
	
}
