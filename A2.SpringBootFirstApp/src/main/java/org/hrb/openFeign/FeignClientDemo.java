package org.hrb.openFeign;

import java.util.List;
import org.hrb.dto.*;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(url = "https://jsonplaceholder.typicode.com",name = "USER-CLIENT")
public interface FeignClientDemo {
	
	
	// endpoint : https://jsonplaceholder.typicode.com/posts
	@GetMapping("/posts")
	public List<Posts> getPosts();

}
