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

import com.framework.entity.FinanceEntity;
import com.framework.service.FinanceService;
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
@RequestMapping("finance")
public class FinanceController {
	@Autowired
	private FinanceService financeService;
	
	@RequestMapping("/finance.html")
	public String list(){
		return "finance/finance.html";
	}
	
	@RequestMapping("/finance_add.html")
	public String add(){
		return "finance/finance_add.html";
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
		List<FinanceEntity> financeList = financeService.queryList(map);
		int total = financeService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(financeList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{financeId}")

	public R info(@PathVariable("financeId") Integer financeId){
		FinanceEntity finance = financeService.queryObject(financeId);
		
		return R.ok().put("finance", finance);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")

	public R save(@RequestBody FinanceEntity finance){
		financeService.save(finance);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")

	public R update(@RequestBody FinanceEntity finance){
		financeService.update(finance);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")

	public R delete(@RequestBody Integer[] financeIds){
		financeService.deleteBatch(financeIds);
		
		return R.ok();
	}
	
}
