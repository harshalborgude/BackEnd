package org.hrb.showroom.services;

import java.util.List;

import org.hrb.showroom.DAO.ProductsDAO;
import org.hrb.showroom.model.ProductEntity;

public class ProductsService {
	
	ProductsDAO productsDAO=new ProductsDAO();

	public List<ProductEntity> getProductsByBrands(int brandId) {
		System.out.println("inside service");
		List<ProductEntity> productList=productsDAO.getProductsByBrands(brandId);
		return productList;
	}

	public List<ProductEntity> getProductsByBrandsAndCategory(int brandId, String category) {
		List<ProductEntity> productList=productsDAO.getProductsByBrandsAndCategory(brandId,category);
		return productList;
	}

}
