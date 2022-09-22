package org.hrb.showroom.services;

import java.util.List;

import org.hrb.showroom.DAO.BrandsDAO;
import org.hrb.showroom.model.BrandEntity;
import org.hrb.showroom.resources.Brands;

// from this service layer we will interact with DAO layer
public class BrandsService {
	
	BrandsDAO DAO=new BrandsDAO();
	
	public List<BrandEntity> getBrands(){
		
		List<BrandEntity> list =DAO.getBrands();
		return list;
	}

	public BrandEntity getBrand(int brandId) {
		
		return DAO.getBrand(brandId);
	}


	public void setBrands(BrandEntity brand) {
		
		DAO.setBrands(brand);
	}

	public void updateBrand(BrandEntity updatedBrand) {
		
		DAO.updateBrands(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		
		DAO.deleteBrand(brandId);
	}

	

}
