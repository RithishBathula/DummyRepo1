package com.cg.spring.plpmod21.service;

import java.util.Optional;

import com.cg.spring.plpmod21.beans.Cart;

public interface CartService {

	public void addToCart(Cart c);
	public void deleteFromCart(int p_id);
	public Iterable<Cart> getCartProducts();
	public boolean isAvailable(int p_id);
	public void getCartProductById(int p_id);
	public void updateCart(Cart c);
}
