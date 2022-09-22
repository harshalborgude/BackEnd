package org.hrb.showroom.resources;

import java.util.List;

import org.hrb.showroom.model.ProductEntity;
import org.hrb.showroom.services.ProductsService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom/brands")
public class Products {
	
	ProductsService productsService=new ProductsService();
	
	@GET
	@Path("/{brandId}/products")
	//@Path("/dummy")
    @Produces(MediaType.APPLICATION_JSON)
	public List<ProductEntity> getProductsByBrands(@PathParam("brandId")int brandId,
			@QueryParam("category") String category,@QueryParam("start") int start,
			@QueryParam("end") int end)  {
		
		System.out.println("inside getProductsByBrands!");
		List<ProductEntity> productList;
		
		if(category!=null){
			System.out.println("inside if");
			productList= productsService.getProductsByBrandsAndCategory(brandId,category);
			System.out.println("productList :"+productList);
			
			
		}else {
			System.out.println("inside else");
			productList= productsService.getProductsByBrands(brandId);
	    	System.out.println("productList :"+productList);
	    	
		}
		if(end>0) {
			productList=productList.subList(start,end);
		}
		
		return productList;
	}

}
