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

import com.framework.entity.RoleEntity;
import com.framework.service.RoleService;
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
@RequestMapping("role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/role.html")
	public String list(){
		return "role/role.html";
	}
	
	@RequestMapping("/role_add.html")
	public String add(){
		return "role/role_add.html";
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
		List<RoleEntity> roleList = roleService.queryList(map);
		int total = roleService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(roleList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{roleId}")

	public R info(@PathVariable("roleId") Integer roleId){
		RoleEntity role = roleService.queryObject(roleId);
		
		return R.ok().put("role", role);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")

	public R save(@RequestBody RoleEntity role){
		roleService.save(role);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")

	public R update(@RequestBody RoleEntity role){
		roleService.update(role);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")

	public R delete(@RequestBody Integer[] roleIds){
		roleService.deleteBatch(roleIds);
		
		return R.ok();
	}
	
}
