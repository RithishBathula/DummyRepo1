package com.cg.spring.plpmod21mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.plpmod21mvc.beans.Cart;
import com.cg.spring.plpmod21mvc.beans.Product;

@RestController
public class ProductFrontController {


	@RequestMapping("/index")
	public ModelAndView getProducts() {
		RestTemplate rt=new RestTemplate();
		Iterable<Product> p1 = rt.getForObject("http://localhost:9090/getallproducts",ArrayList.class);
		return new ModelAndView("index","prod",p1);
	}

	@RequestMapping("/carting/{p_id}")
	public ModelAndView getaddToWishlist(@PathVariable("p_id") int p_id) {
		RestTemplate rt= new RestTemplate();
		 
	  Cart s = rt.getForObject("http://localhost:9090/carting?p_id="+p_id, Cart.class);
		return new ModelAndView("cartsuccess","cart",s);
	 
	}
	@RequestMapping("/showall")
	public ModelAndView showItems() {
		RestTemplate rt= new RestTemplate();
		Iterable<Product>  i = rt.getForObject("http://localhost:9090/showall", ArrayList.class);
		return new ModelAndView("cart","cartProd",i);
	}
	@RequestMapping("/delete/{p_id}")
	public String deleteFromWishlist(@PathVariable("p_id") int p_id) {
		RestTemplate rt= new RestTemplate();
	 Cart d = rt.getForObject("http://localhost:9090/delete?p_id="+p_id, Cart.class);
		return "deleted";
	}
}
