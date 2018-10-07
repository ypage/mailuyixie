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
public class FinanceEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer financeId;
	//
	private String total;
	//
	private String name;
	//
	private Date time;
	//
	private String cost;
	//
	private String type;
	//
	private String reason;

	/**
	 * 设置：
	 */
	public void setFinanceId(Integer financeId) {
		this.financeId = financeId;
	}
	/**
	 * 获取：
	 */
	public Integer getFinanceId() {
		return financeId;
	}
	/**
	 * 设置：
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	/**
	 * 获取：
	 */
	public String getTotal() {
		return total;
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
	public void setCost(String cost) {
		this.cost = cost;
	}
	/**
	 * 获取：
	 */
	public String getCost() {
		return cost;
	}
	/**
	 * 设置：
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * 获取：
	 */
	public String getReason() {
		return reason;
	}
}
