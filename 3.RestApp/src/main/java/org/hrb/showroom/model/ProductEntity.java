package org.hrb.showroom.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// In this class brand_id is the foreign key and implemented below.

@Entity(name="products")
@Table(name="products")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	int productId;
	
	//with this hibernate knows that brand_id will be found at BrandEntity class and foreign key is brand_id
	//@ManyToOne(targetEntity=BrandEntity.class)
	//@JoinColumn(name="brand_id")	
	//BrandEntity brandEntity;
	
	@Column(name="brand_id")	
	int brandId;
	
	@Column(name="product_name")	
	String productName;

	@Column(name="category")
	String category;

	@Column(name="cost")
	int cost;
	
	public ProductEntity() {
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	
	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	/*
	 * public BrandEntity getBrandEntity() { return brandEntity; }
	 * 
	 * public void setBrandEntity(BrandEntity brandEntity) { this.brandEntity =
	 * brandEntity; }
	 */
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", brandId=" + brandId + ", productName=" + productName
				+ ", category=" + category + ", cost=" + cost + "]";
	}

	
	
	
	

}
















