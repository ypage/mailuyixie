package com.framework.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Yuan
 * @email 496080373@qq.com
 * @date 2018-04-19 11:16:22
 */
public class ActiveEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer activeId;
	//
	private String name;
	//
	private String place;
	//
	private Date time;
	//
	private String leader;
	//
	private String parter;
	//
	private String remarks;
	//
	private String activeNum;
	//
	private String money;

	/**
	 * 设置：
	 */
	public void setActiveId(Integer activeId) {
		this.activeId = activeId;
	}
	/**
	 * 获取：
	 */
	public Integer getActiveId() {
		return activeId;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * 获取：
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * 设置：
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**
	 * 获取：
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * 设置：
	 */
	public void setLeader(String leader) {
		this.leader = leader;
	}
	/**
	 * 获取：
	 */
	public String getLeader() {
		return leader;
	}
	/**
	 * 设置：
	 */
	public void setParter(String parter) {
		this.parter = parter;
	}
	/**
	 * 获取：
	 */
	public String getParter() {
		return parter;
	}
	/**
	 * 设置：
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置：
	 */
	public void setActiveNum(String activeNum) {
		this.activeNum = activeNum;
	}
	/**
	 * 获取：
	 */
	public String getActiveNum() {
		return activeNum;
	}
	/**
	 * 设置：
	 */
	public void setMoney(String money) {
		this.money = money;
	}
	/**
	 * 获取：
	 */
	public String getMoney() {
		return money;
	}
}
