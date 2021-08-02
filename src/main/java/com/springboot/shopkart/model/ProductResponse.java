package com.springboot.shopkart.model;

public class ProductResponse {
	private String msg;
	private ProductModel productModel;
	
	public void setMsg(String message) {
		this.msg=message;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setProductModel(ProductModel product) {
		this.productModel=product;
	}
}
