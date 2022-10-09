package org.hrb.controller;

import java.util.ArrayList;
import java.util.List;

import org.hrb.dto.Posts;
import org.hrb.entity.Post;
import org.hrb.openFeign.FeignClientDemo;
import org.hrb.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//1) view all , GET , /posts
//2) view specific , GET , /posts/id 
//3) Add , POST , /posts
//4) Update , PUT , /posts
//5) Delete , Delete , /posts


@RestController
public class PostsController {
	
	PostsService service=new PostsService();
	
	@Autowired
	FeignClientDemo feignClientDemo;

	
	// getting users using feign client 
//	@RequestMapping(method = RequestMethod.GET,value = "/getAllPosts")
	@GetMapping("/getAllPosts")
	public List<Posts> getAllPosts(){
		return feignClientDemo.getPosts();
	}
	
	
	
	// this will return all the posts
	// This list will be converted by default into http response by spring boot RestController.
	@RequestMapping("/posts")
	public List<Post> getPosts(){
	
		List<Post> posts=service.getPosts();
		return posts;
		//return new PostService.getPosts();
	}
	
	// id is a variable so its a within braces 
	// either argumement name should match with path var or should be provided with annotation to map properly. 
	@RequestMapping("/posts/{id}")
	 public Post getPost(@PathVariable("id") int tempId) {
		 
		 return service.getPost(tempId);
		 
	 }
	
	// using RequestMethod.POST means its a post request and having input parameter as a post object
	// so input json should get converted into Post object and var should get initialize
	// @RequestBody annotation will convert input of post request into Post object and will initialize it.
	@RequestMapping(method=RequestMethod.POST,value="/posts")
	public void addPost(@RequestBody Post post) {
		
		service.addPost(post);
		
	}
	
		
	@RequestMapping(method=RequestMethod.PUT,value="/posts/{id}")
	public void updatePost(@RequestBody Post post,@PathVariable("id") int id) {
		
		service.updatePost(post,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value = "/posts/{id}")
	public void deletPost(@PathVariable("id") int id) {
		
		service.deletePost(id);
	}
}















