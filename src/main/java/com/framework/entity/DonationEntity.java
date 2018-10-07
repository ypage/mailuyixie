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
public class DonationEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer donationId;
	//
	private Date time;
	//
	private String donationMan;
	//
	private String goods;
	//
	private String picture;
	//
	private Integer number;

	/**
	 * 设置：
	 */
	public void setDonationId(Integer donationId) {
		this.donationId = donationId;
	}
	/**
	 * 获取：
	 */
	public Integer getDonationId() {
		return donationId;
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
	public void setDonationMan(String donationMan) {
		this.donationMan = donationMan;
	}
	/**
	 * 获取：
	 */
	public String getDonationMan() {
		return donationMan;
	}
	/**
	 * 设置：
	 */
	public void setGoods(String goods) {
		this.goods = goods;
	}
	/**
	 * 获取：
	 */
	public String getGoods() {
		return goods;
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
	public void setNumber(Integer number) {
		this.number = number;
	}
	/**
	 * 获取：
	 */
	public Integer getNumber() {
		return number;
	}
}
