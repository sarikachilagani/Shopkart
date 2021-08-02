package com.springboot.shopkart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.shopkart.model.ProductModel;


@Repository
public interface ProductRepo extends JpaRepository<ProductModel,Long> {

	

}
