package org.hrb.showroom.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

// @GeneratedValue annotation will tell hibernate that this brand_id is automatically generated
// using this annotation , we will be able to fetch proper value in brand object otherwise will get id as 0 only.
@Entity(name="brands")
@Table(name="brands")
public class BrandEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="brand_id")
	int brandId;
	
	@Column(name="brand_name")
	String brandName;
	
	
	// here hibernate is trying to map colm with database table so getting exception bcz link is another model.
	// so this link is not a colomn that we have to specify to hibernate so 
	// @Transient is added to tell that its not a clm of db
	@Transient
	private List<Link> link; 


	public List<Link> getLink() {
		return link;
	}

	public void setLink(List<Link> link) {
		this.link = link;
	}

	public BrandEntity() {
		
	}

	public BrandEntity(int brandId, String brandName) {
		
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public void setBrandId(int brandId2) {
		this.brandId=brandId2;
		
	}

	public int getBrandId() {
		return this.brandId;
		
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
	
	
	
}
