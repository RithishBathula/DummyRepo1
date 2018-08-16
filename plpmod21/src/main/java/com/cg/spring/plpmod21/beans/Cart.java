package com.cg.spring.plpmod21.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int c_id;
	
	private int p_id;
	private BigDecimal cartAmount;
	private String p_name;
	private int p_quantity;
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
	
	public int getP_quantity() {
		return p_quantity;
	}
	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}
	
	public Cart(int c_id, int p_id, BigDecimal cartAmount, String p_name, int p_quantity) {
		super();
		this.c_id = c_id;
		this.p_id = p_id;
		this.cartAmount = cartAmount;
		this.p_name = p_name;
		this.p_quantity = p_quantity;
	}
	public Cart() {
		super();
	}
	
}
