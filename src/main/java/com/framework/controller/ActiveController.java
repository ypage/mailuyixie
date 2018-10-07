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

import com.framework.entity.ActiveEntity;
import com.framework.service.ActiveService;
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
@RequestMapping("active")
public class ActiveController {
	@Autowired
	private ActiveService activeService;
	
	@RequestMapping("/active.html")
	public String list(){
		return "active/active.html";
	}
	
	@RequestMapping("/active_add.html")
	public String add(){
		return "active/active_add.html";
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
		List<ActiveEntity> activeList = activeService.queryList(map);
		int total = activeService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(activeList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{activeId}")

	public R info(@PathVariable("activeId") Integer activeId){
		ActiveEntity active = activeService.queryObject(activeId);
		
		return R.ok().put("active", active);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")

	public R save(@RequestBody ActiveEntity active){
		activeService.save(active);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")

	public R update(@RequestBody ActiveEntity active){
		activeService.update(active);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")

	public R delete(@RequestBody Integer[] activeIds){
		activeService.deleteBatch(activeIds);
		
		return R.ok();
	}
	
}
