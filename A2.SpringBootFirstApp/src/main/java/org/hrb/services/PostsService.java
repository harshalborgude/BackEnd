package org.hrb.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hrb.entity.Post;
import org.springframework.stereotype.Service;

// This class will be treated as a service.
@Service
public class PostsService {
	
	List<Post> posts = new ArrayList<Post>(
			Arrays.asList(
					new Post(1,"Data Type","Sample text"),	
					new Post(2,"classed ","Sample text"),
					new Post(3,"Objects","Sample text"),
					new Post(4,"Access specifier","Sample text"),
					new Post(5,"OOPs overview","Sample text")
			));

/*	public PostsService() {
		posts.add(new Post(1,"Data Type","Sample text"));
		posts.add(new Post(2,"classed ","Sample text"));
		posts.add(new Post(3,"Objects","Sample text"));
		posts.add(new Post(4,"Access specifier","Sample text"));
		posts.add(new Post(5,"OOPs overview","Sample text"));
		
	} */
	
	public List<Post> getPosts(){
		return posts;
		
	}
	
	public Post getPost(int id){
		
		for (Post post : posts) {
			if(post.getPostId()==id) {
				return post;
			}
		}
	
		return null;	
	}

	public void addPost(Post post) {
		
		posts.add(post);
	}

	public void updatePost(Post post, int id) {
		
		for(int i=0; i<posts.size();i++) {
			
			Post tempPost=posts.get(i);
			if(tempPost.getPostId()==id) {
				posts.set(i, post);
			}
			
		}
		
	}

	public void deletePost(int id) {
		
		for(int i=0;i<posts.size();i++) {
			
			Post tempPost=posts.get(i);
			if(tempPost.getPostId()==id) {
				posts.remove(i);
			}
		}
		
	}

}
