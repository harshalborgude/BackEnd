package org.hrb.model;

public class Brand {
	int brandId;
	String brandName;
	
	public Brand() {
		
	}

	public Brand(String string) {
		this.brandName = string;
	}
	
	public Brand(String brandName,int brandId) {
		
		this.brandName = brandName;
		this.brandId=brandId;
	}	
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}
	
	

}
