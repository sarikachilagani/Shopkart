package com.springboot.shopkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.shopkart.model.CartModel;
import com.springboot.shopkart.repo.CartRepo;

@RestController
@RequestMapping("/orders")
public class CartController {

	@Autowired
	CartRepo cartRepo;
	
	@PostMapping("/checkout")
	public CartModel checkOut(@RequestBody CartModel cartModel ) {
		return cartRepo.save(cartModel);
	}
	
	@GetMapping("/viewCheckout")
	public List<CartModel> checkOut() {
		return cartRepo.findAll();
	} 
	
	@DeleteMapping("/deleteCheckout/{id}")
	public String deleteProduct(@PathVariable("id") Long cartId) {
		cartRepo.deleteById(cartId);
		 return "deleted succesful";
	}
}
