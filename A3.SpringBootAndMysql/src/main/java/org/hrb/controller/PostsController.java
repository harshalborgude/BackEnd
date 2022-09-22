package org.hrb.controller;

import java.util.ArrayList;
import java.util.List;
import org.hrb.entity.Post;
import org.hrb.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
// Autowire will create object by itself

@RestController
public class PostsController {
	
	@Autowired
	private PostsService service;
	
	// this will return all the posts
	// This list will be converted by default into spring boot
	@RequestMapping("/posts")
	public List<Post> getPosts(){
	
		List<Post> posts=service.getPosts();
		System.out.println("post :"+posts);
		return posts;
		//return new PostService.getPosts();
	}
	
	// it is a variable so its a within braces 
	// either argumement name should match with path var or should be provided with annotation to map properly. 
	@RequestMapping("/posts/{id}")
	 public Post getPost(@PathVariable("id") int tempId) {
		 
		 return service.getPost(tempId);
		 
	 }
	
	// using RequestMethod.POST means its a post request and having input parameter as a post object
	// so input json should get converted into Post object and var should get initialize
	// @RequestBody annotation will convert input of post request into Post object and will initialize it.
	// here post with crud is same bcz if id is new then it will add row and if id is present then update the data
	@RequestMapping(method=RequestMethod.POST,value="/posts")
	public String addPost(@RequestBody Post post) {
		System.out.println("inside addpost");
		service.addPost(post);
		return "post added";
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/posts")
	public void updatePost(@RequestBody Post post) {
		
		service.updatePost(post);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value = "/posts/{id}")
	public String deletPost(@PathVariable("id") int id) {
		
		service.deletePost(id);
		return "post deleted!";
	}
}















