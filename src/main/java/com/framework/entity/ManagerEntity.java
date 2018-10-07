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
public class ManagerEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer adminId;
	//
	private String name;
	//
	private String username;
	//
	private String password;
	//
	private String sex;
	//
	private String qq;
	//
	private String telephone;
	//
	private String volNum;
	//
	private String position;
	//
	private String remarks;

	/**
	 * 设置：
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	/**
	 * 获取：
	 */
	public Integer getAdminId() {
		return adminId;
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
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}
	/**
	 * 获取：
	 */
	public String getQq() {
		return qq;
	}
	/**
	 * 设置：
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 设置：
	 */
	public void setVolNum(String volNum) {
		this.volNum = volNum;
	}
	/**
	 * 获取：
	 */
	public String getVolNum() {
		return volNum;
	}
	/**
	 * 设置：
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * 获取：
	 */
	public String getPosition() {
		return position;
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
}
