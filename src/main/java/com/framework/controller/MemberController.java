package com.framework.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.shiro.authc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import com.framework.entity.MemberEntity;
import com.framework.service.MemberService;
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
@RequestMapping("member")
public class MemberController {
	@Autowired
	private MemberService memberService;


	@RequestMapping("/member.html")
	public String list(){
		return "member/member.html";
	}
	
	@RequestMapping("/member_add.html")
	public String add(){
		return "member/member_add.html";
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
		List<MemberEntity> memberList = memberService.queryList(map);
		int total = memberService.queryTotal(map);
		
		PageUtils pageUtil = new PageUtils(memberList, total, limit, page);
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@ResponseBody
	@RequestMapping("/info/{memberId}")

	public R info(@PathVariable("memberId") Integer memberId){
		MemberEntity member = memberService.queryObject(memberId);
		
		return R.ok().put("member", member);
	}

	/**
	 * 登录
	 */
	//method = RequestMethod.POST
	@ResponseBody
	@RequestMapping(value = "/login")
	public R login(String username,String password) throws IOException {


		try {
/*			Subject subject = ShiroUtils.getSubject();
			// sha256加密
			password = new Sha256Hash(password).toHex();*/
			 MemberEntity member=new MemberEntity();
			member=memberService.login(username,password);

			if(null!=member){
			//	member.setRoleName("user");
				return R.ok().put("user", member);
			}else {
				return R.error().put("msg","错误");
			}

		/*	UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			subject.login(token);*/

		} catch (UnknownAccountException e) {
			return R.error(e.getMessage());
		} catch (IncorrectCredentialsException e) {
			return R.error(e.getMessage());
		} catch (LockedAccountException e) {
			return R.error(e.getMessage());
		} catch (AuthenticationException e) {
			return R.error("账户验证失败");
		}



	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@RequestMapping("/save")

	public R save(@RequestBody MemberEntity member){
		memberService.save(member);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")

	public R update(@RequestBody MemberEntity member){
		memberService.update(member);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@ResponseBody
	@RequestMapping("/delete")

	public R delete(@RequestBody Integer[] memberIds){
		memberService.deleteBatch(memberIds);
		
		return R.ok();
	}
	
}
