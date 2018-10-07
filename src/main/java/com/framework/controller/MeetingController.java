package com.framework.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import com.framework.entity.MeetingEntity;
import com.framework.service.MeetingService;
import com.framework.utils.PageUtils;
import com.framework.utils.R;


/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
@Controller
@RequestMapping("meeting")
public class MeetingController {
	@Autowired
	private MeetingService meetingService;
	
	@RequestMapping("/meeting.html")
	public String list(){
		return "meeting/meeting.html";
	}
	
	@RequestMapping("/meeting_add.html")
	public String add(){
		return "meeting/meeting_add.html";
	}
	
	/**
	 * 列表
	 */
	@ResponseBody
	@RequestMapping("/list")

	public R list(Integer page, Integer limit){
		Map<String, Object> map = new HashMap<>();
		map.put("offset", (page - 1) * limit);
		map.put("limit", limit);
		
		//查询列表数据
		List<MeetingEntity> meetingList = meetingService.queryList(map);
		int total = meetingService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(meetingList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{meetingId}")

	public R info(@PathVariable("meetingId") Integer meetingId){
		MeetingEntity meeting = meetingService.queryObject(meetingId);
		
		return R.ok().put("meeting", meeting);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")

	public R save(@RequestBody MeetingEntity meeting){
		meetingService.save(meeting);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")

	public R update(@RequestBody MeetingEntity meeting){
		meetingService.update(meeting);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")

	public R delete(@RequestBody Integer[] meetingIds){
		meetingService.deleteBatch(meetingIds);
		
		return R.ok();
	}
	
}
