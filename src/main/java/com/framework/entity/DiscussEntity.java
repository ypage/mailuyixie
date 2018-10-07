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
public class DiscussEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer discussId;
	//
	private String username;
	//
	private Date time;
	//
	private String content;

	/**
	 * 设置：
	 */
	public void setDiscussId(Integer discussId) {
		this.discussId = discussId;
	}
	/**
	 * 获取：
	 */
	public Integer getDiscussId() {
		return discussId;
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
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：
	 */
	public String getContent() {
		return content;
	}
}
