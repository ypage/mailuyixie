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

import com.framework.entity.DiscussEntity;
import com.framework.service.DiscussService;
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
@RequestMapping("discuss")
public class DiscussController {
	@Autowired
	private DiscussService discussService;
	
	@RequestMapping("/discuss.html")
	public String list(){
		return "discuss/discuss.html";
	}
	
	@RequestMapping("/discuss_add.html")
	public String add(){
		return "discuss/discuss_add.html";
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
		List<DiscussEntity> discussList = discussService.queryList(map);
		int total = discussService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(discussList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{discussId}")

	public R info(@PathVariable("discussId") Integer discussId){
		DiscussEntity discuss = discussService.queryObject(discussId);
		
		return R.ok().put("discuss", discuss);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")

	public R save(@RequestBody DiscussEntity discuss){
		discussService.save(discuss);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")

	public R update(@RequestBody DiscussEntity discuss){
		discussService.update(discuss);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")

	public R delete(@RequestBody Integer[] discussIds){
		discussService.deleteBatch(discussIds);
		
		return R.ok();
	}
	
}
