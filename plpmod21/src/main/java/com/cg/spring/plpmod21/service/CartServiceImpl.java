package com.cg.spring.plpmod21.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.plpmod21.beans.Cart;
import com.cg.spring.plpmod21.repo.CartRepo;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartRepo repo;
	@Override
	public void addToCart(Cart c) {
		
		repo.save(c);
	}
	@Override
	public void deleteFromCart(int p_id) {
		repo.deleteById(p_id);
	}
	@Override
	public Iterable<Cart> getCartProducts() {
		
		return repo.findAll();
	}
	@Override
	public boolean isAvailable(int p_id) {
		
		return repo.existsById(p_id);
	}
	@Override
	public void updateCart(Cart c) {
		repo.save(c);	
	}
	@Override
	public void getCartProductById(int p_id) {
		repo.findById(p_id);
		
	}
	
	

}
