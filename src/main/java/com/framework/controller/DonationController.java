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

import com.framework.entity.DonationEntity;
import com.framework.service.DonationService;
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
@RequestMapping("donation")
public class DonationController {
	@Autowired
	private DonationService donationService;
	
	@RequestMapping("/donation.html")
	public String list(){
		return "donation/donation.html";
	}
	
	@RequestMapping("/donation_add.html")
	public String add(){
		return "donation/donation_add.html";
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
		List<DonationEntity> donationList = donationService.queryList(map);
		int total = donationService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(donationList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{donationId}")

	public R info(@PathVariable("donationId") Integer donationId){
		DonationEntity donation = donationService.queryObject(donationId);
		
		return R.ok().put("donation", donation);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")

	public R save(@RequestBody DonationEntity donation){
		donationService.save(donation);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")

	public R update(@RequestBody DonationEntity donation){
		donationService.update(donation);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")

	public R delete(@RequestBody Integer[] donationIds){
		donationService.deleteBatch(donationIds);
		
		return R.ok();
	}
	
}
