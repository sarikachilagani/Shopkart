package com.springboot.shopkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.shopkart.model.ProductModel;
import com.springboot.shopkart.model.ProductResponse;
import com.springboot.shopkart.repo.ProductRepo;


@RestController
@RequestMapping("/product")
public class ProductConroller {

	@Autowired
	ProductRepo productRepo;
	
	@GetMapping("/allProducts")
	public List<ProductModel> allProducts(){
		return productRepo.findAll();
	}
	@PostMapping("/addProduct")
	public ProductModel addProduct(@RequestBody ProductModel productModel) {
		return productRepo.save(productModel);
	}
	
	@PutMapping("/update/{id}")
	public ProductModel updateProduct(@PathVariable("id") Long productId,@RequestBody ProductModel productModel ) {
		 return productRepo.save(productModel);
		
		 
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable("id") Long productId) {
		 productRepo.deleteById(productId);
		 return "deleted succesful";
	}
}
