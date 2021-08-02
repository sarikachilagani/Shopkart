package com.springboot.shopkart.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CartModel {
	@Id
	private Long cartId;
	private String productName;
	private int quantity;
	private String brand;
	private int price;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date deliveryDate; 
	private int tax;
	private int totalBill;
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
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
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}
	public CartModel(Long cartId, String productName, int quantity, String brand, int price, Date deliveryDate, int tax,
			int totalBill) {
		super();
		this.cartId = cartId;
		this.productName = productName;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.deliveryDate = deliveryDate;
		this.tax = tax;
		this.totalBill = totalBill;
	}
	public CartModel() {
		super();
		
	}
	
	
}