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
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer memberId;
	//
	private String name;
	//
	private String username;
	//
	private String password;
	//
	private String sex;
	//
	private String grade;
	//
	private String classes;
	//
	private String studentNum;
	//
	private String telephone;
	//
	private Date admissionTime;
	//
	private String volNum;
	//
	private String department;
	//
	private String email;
	//
	private String address;
	//
	private String remarks;

	private String roleName;

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	/**
	 * 设置：
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	/**
	 * 获取：
	 */
	public Integer getMemberId() {
		return memberId;
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
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * 获取：
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * 设置：
	 */
	public void setClasses(String classes) {
		this.classes = classes;
	}
	/**
	 * 获取：
	 */
	public String getClasses() {
		return classes;
	}
	/**
	 * 设置：
	 */
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	/**
	 * 获取：
	 */
	public String getStudentNum() {
		return studentNum;
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
	public void setAdmissionTime(Date admissionTime) {
		this.admissionTime = admissionTime;
	}
	/**
	 * 获取：
	 */
	public Date getAdmissionTime() {
		return admissionTime;
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
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * 获取：
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：
	 */
	public String getAddress() {
		return address;
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
