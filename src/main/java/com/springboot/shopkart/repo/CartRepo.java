package com.springboot.shopkart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.shopkart.model.CartModel;



public interface CartRepo extends JpaRepository<CartModel,Long>  {

}
