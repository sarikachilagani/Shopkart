package com.springboot.shopkart.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Products")
public class ProductModel {
	@Id
	private Long productId;
	private String productName;
	private int quantity;
	private String brand;
	private int price;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date deliveryDate;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public ProductModel(Long productId, String productName, int quantity, String brand, int price, Date deliveryDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.deliveryDate = deliveryDate;
	}
	public ProductModel() {
		super();
		
	}
	
	
	

}
