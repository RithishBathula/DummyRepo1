package com.cg.spring.plpmod21.beans;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int p_id;
	private String p_name;
	private String companyName;
	private BigDecimal p_price;
	private Date p_datemanufacturing;
	private String p_type;
	private int quantity;
	private int m_id;
	private String coupon_id;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BigDecimal getP_price() {
		return p_price;
	}
	public void setP_price(BigDecimal p_price) {
		this.p_price = p_price;
	}
	public Date getP_datemanufacturing() {
		return p_datemanufacturing;
	}
	public void setP_datemanufacturing(Date p_datemanufacturing) {
		this.p_datemanufacturing = p_datemanufacturing;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
	}
	public Product(int p_id, String p_name, String companyName, BigDecimal p_price, Date p_datemanufacturing, String p_type,
			int quantity, int m_id, String coupon_id) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.companyName = companyName;
		this.p_price = p_price;
		this.p_datemanufacturing = p_datemanufacturing;
		this.p_type = p_type;
		this.quantity = quantity;
		this.m_id = m_id;
		this.coupon_id = coupon_id;
	}
	public Product() {
		super();
	}
	
	
	
}
