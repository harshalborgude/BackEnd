package org.hrb.controller;

import org.hrb.model.Brand;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

//1) POST method implementation
// URI : http://localhost:8080/RestApp/showroom/brands -> (Content-Type : application/json)
/*{   
    "brandName": "brand1"
}*/
//2) PUT & delete
public class AppPost {
	
	static Client client=ClientBuilder.newClient();
	static WebTarget baseBrandUrl=   client.target("http://localhost:8080/RestApp/showroom/brands");
	static WebTarget brandUrl= baseBrandUrl.path("{brandId}");
	
	public static void main(String[] args) {
		
		//Brand object with brand name is converted into json format -> Entity.json(new Brand("my brand"))
		// Content type as application / json
		// post request is made and final response is recieved inside response -> postmans post request is done by this line
		Response response= baseBrandUrl.request(MediaType.APPLICATION_JSON).post(Entity.json(new Brand("my brand4")));
		
		// directly converting response directly in the form of object
		//response will be array of objects
		Brand[] response1= baseBrandUrl.request(MediaType.APPLICATION_JSON).get(Brand[].class);
		
		System.out.println("response :"+response.toString());
		
		for (Brand temp : response1) {
			System.out.println(temp);
		}
		
		// PUT operation
		
		Response response2= brandUrl.resolveTemplate("brandId", "2")
				.request(MediaType.APPLICATION_JSON)
				.put(Entity.json(new Brand("Yamaha")));
		System.out.println(response2.getStatus());
		
		// Delete operation
		
		Response response3= brandUrl.resolveTemplate("brandId", "7")
				.request(MediaType.APPLICATION_JSON)
				.delete();
		System.out.println(response3.getStatus());
		
	}

}
