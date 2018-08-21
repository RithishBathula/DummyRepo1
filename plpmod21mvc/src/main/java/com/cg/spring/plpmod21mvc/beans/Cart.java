package com.cg.spring.plpmod21mvc.beans;

import java.math.BigDecimal;


public class Cart {

	private int c_id;
	
	private int p_id;
	private BigDecimal cartAmount;
	private String p_name;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public BigDecimal getCartAmount() {
		return cartAmount;
	}
	public void setCartAmount(BigDecimal cartAmount) {
		this.cartAmount = cartAmount;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public Cart(int c_id, int p_id, BigDecimal cartAmount, String p_name) {
		super();
		this.c_id = c_id;
		this.p_id = p_id;
		this.cartAmount = cartAmount;
		this.p_name = p_name;
	}
	public Cart() {
		super();
	}
	
}
