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

import com.framework.entity.ManagerEntity;
import com.framework.service.ManagerService;
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
@RequestMapping("manager")
public class ManagerController {
	@Autowired
	private ManagerService managerService;
	
	@RequestMapping("/manager.html")
	public String list(){
		return "manager/manager.html";
	}
	
	@RequestMapping("/manager_add.html")
	public String add(){
		return "manager/manager_add.html";
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
		List<ManagerEntity> managerList = managerService.queryList(map);
		int total = managerService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(managerList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{adminId}")

	public R info(@PathVariable("adminId") Integer adminId){
		ManagerEntity manager = managerService.queryObject(adminId);
		
		return R.ok().put("manager", manager);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")

	public R save(@RequestBody ManagerEntity manager){
		managerService.save(manager);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")

	public R update(@RequestBody ManagerEntity manager){
		managerService.update(manager);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")

	public R delete(@RequestBody Integer[] adminIds){
		managerService.deleteBatch(adminIds);
		
		return R.ok();
	}
	
}
