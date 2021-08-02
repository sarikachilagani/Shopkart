package com.springboot.shopkart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.shopkart.model.UserModel;


@Repository
public interface UserRepo extends JpaRepository<UserModel,Long> {
	

}
