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
public class MeetingEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer meetingId;
	//
	private String title;
	//
	private Date time;
	//
	private String address;
	//
	private String personnel;
	//
	private String content;
	//
	private String picture;
	//
	private String doc;

	/**
	 * 设置：
	 */
	public void setMeetingId(Integer meetingId) {
		this.meetingId = meetingId;
	}
	/**
	 * 获取：
	 */
	public Integer getMeetingId() {
		return meetingId;
	}
	/**
	 * 设置：
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：
	 */
	public String getTitle() {
		return title;
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
	public void setPersonnel(String personnel) {
		this.personnel = personnel;
	}
	/**
	 * 获取：
	 */
	public String getPersonnel() {
		return personnel;
	}
	/**
	 * 设置：
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/**
	 * 获取：
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * 设置：
	 */
	public void setDoc(String doc) {
		this.doc = doc;
	}
	/**
	 * 获取：
	 */
	public String getDoc() {
		return doc;
	}
}
