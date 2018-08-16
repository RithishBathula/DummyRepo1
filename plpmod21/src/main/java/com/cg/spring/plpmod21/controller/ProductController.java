package com.cg.spring.plpmod21.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.plpmod21.beans.Cart;
import com.cg.spring.plpmod21.beans.Product;
import com.cg.spring.plpmod21.service.CartService;
//import com.cg.spring.plpmod21.service.CartService;
import com.cg.spring.plpmod21.service.ProductService;

@Controller
public class ProductController {
	int count = 1;
	@Autowired
	ProductService service;
	@Autowired
	CartService serviceCart;

	// @RequestMapping(method=RequestMethod.POST,value="/addproduct")
	// public void add(Product p) {
	// service.addProduct(p);
	// }

	// @RequestMapping("/getall")//,method=RequestMethod.GET)
	// public Iterable<Product> findAll() {
	//
	// return service.getAllProducts();
	//
	// }
	@RequestMapping("/demoo")
	public String showProductByIdPage() {
		return "demoo";
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView getProducts() {
		Iterable<Product> p1 = service.getAllProducts();
		return new ModelAndView("index", "prod", p1);
	}

	@RequestMapping(value = "/carting/{p_id}", method = RequestMethod.GET)
	public String cartProducts(@PathVariable("p_id") int p_id) {
		Optional<Product> prod = service.getProdById(p_id);
		if(serviceCart.isAvailable(p_id)) {
			
			//serviceCart.updateCart(c);
		}
		Product pro = prod.get();
		Cart c = new Cart();
		c.setP_id(p_id);
		c.setP_name(pro.getP_name());
		c.setCartAmount(pro.getP_price());
		c.setP_quantity(count);
		count++;
		serviceCart.addToCart(c);
		return "success";

	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView getCartProducts() {
		Iterable<Cart> c1=serviceCart.getCartProducts();
		return new ModelAndView("cart", "cartProd", c1);
	}

}
