package org.hrb.showroom.resources;

// 1) GET,POST,PUT,DELETE method
// 2) HATEOAS implemented which contains self reference link/links.


import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.hrb.showroom.model.BrandEntity;
import org.hrb.showroom.model.Link;
import org.hrb.showroom.model.ProductEntity;
import org.hrb.showroom.services.BrandsService;
import org.hrb.showroom.services.ProductsService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.UriInfo;

// to get URI : http://localhost:8080/showroom/getBrands
// here showroom is class level patter (master) and getBrands is child pattern 
// if all of the child patter are same and serving different request then thats fine
// whenever GET rested it will go to method of GET and similarly
// To send response back we have to return Response object. 

// as here every method has /brands so add in class level parameter.
@Path("/showroom/brands")
public class Brands {

	// this service object we will use to call service layer methods
	// in this way we can optimize the code
	BrandsService service = new BrandsService();
	ProductsService productsService = new ProductsService();

	/* /showroom/getBrands */
	@GET
	// @Path("/brands")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BrandEntity> getBrands() {

		// List<BrandEntity> brandList=new BrandsService().getBrands();
		List<BrandEntity> brandList = service.getBrands();
		return brandList;

	}

	@GET
	@Path("/{brandId}")
	@Produces(MediaType.APPLICATION_JSON)
	public BrandEntity getBrand(@PathParam("brandId") int brandId, @Context UriInfo uri) {

		Link link1 = new Link(uri.getAbsolutePath().toString(), "Link1");
		Link link2= new Link(uri.getAbsolutePathBuilder().path("products").build().toString(), "Link2");
		BrandEntity brand = service.getBrand(brandId);
		//brand.setLink(link1);
		List<Link> links = new ArrayList<>();
		links.add(link1);
		links.add(link2);
		brand.setLink(links);
		return brand;

	}
	// response of this method is, this contains self link and it is known as HATEOAS
	/*
	 * { "brandId": 2, 
	 * "brandName": "BMW", 
	 * "link": { "link": "http://localhost:8080/RestApp/showroom/brands/2",
	 *           "rel": "self" 
	 *         }
	 * }
	 * 
	 */

	
	
	// here returning Response object with CREATED status(201) , in this way we can
	// override status.
	@POST
	// @Path("/brands")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON) // json to send status object
	// @Produces(MediaType.TEXT_HTML) // can also use this in place of plain
	// @Produces(MediaType.TEXT_PLAIN)
	public Response postBrands(BrandEntity brand, @Context UriInfo uri) {

		URI location = uri.getAbsolutePath(); // using this uri variable , will get the absolute path and store into
												// location variable
												// location will be : http://localhost:8080/RestApp/showroom/brands/
		System.out.println("inside POST method! ");
		System.out.println(" brand :" + brand);
		// new BrandsService().setBrands(brand);
		service.setBrands(brand);

		// return Response.status(Status.CREATED).build(); // to send the response
		// object with created status
		// return Response.status(Status.CREATED).entity("OK").build(); // to send ok as
		// plain text
		// return Response.status(Status.CREATED).entity(brand).build(); // to send
		// brand object as a response
		return Response.created(location).entity(brand).build();
	}

	@PUT
	// @Path("/brands/{brandId}")
	@Path("/{brandId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putBrands(@PathParam("brandId") int brandId, BrandEntity updatedBrand) {

		updatedBrand.setBrandId(brandId);
		// new BrandsService().updateBrand(updatedBrand);
		service.updateBrand(updatedBrand);
	}

	@DELETE
	// @Path("/brands/{brandId}")
	@Path("/{brandId}")
	public void deleteBrands(@PathParam("brandId") int brandId) {

		// new BrandsService().deleteBrand(brandId);
		service.deleteBrand(brandId);
	}

	// using thic mechanism API call will be delegated to products class
	/*
	 * @Path("/{brandId}/products") public Products prodctsDelegation() {
	 * 
	 * return new Products();
	 * 
	 * }
	 */

	/*
	 * @GET
	 * 
	 * @Path("/{brandId}/products")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public List<ProductEntity>
	 * getProductsByBrands(@PathParam("brandId")int brandId) {
	 * 
	 * 
	 * List<ProductEntity> productList=productsService.getProductsByBrands(brandId);
	 * System.out.println("productList :"+productList); return productList;
	 * 
	 * }
	 */

	/*
	 * // without brand id
	 * 
	 * @PUT
	 * 
	 * @Path("/brands//{brandName}/{brandId}")
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String putBrands(@PathParam("brandId")
	 * int brandId,@PathParam("brandName") String brandName) { return
	 * "Update brands name and id :"+brandName+","+brandId;
	 * 
	 * }
	 * 
	 * // in this way we can accept multiple parameters
	 * 
	 * @DELETE
	 * 
	 * @Path("/brands/{brandId}")
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String deleteBrands() { return
	 * "Delete brands";
	 * 
	 * }
	 */

}
