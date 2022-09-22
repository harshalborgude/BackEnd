package org.hrb.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.hrb.repository.PostRepository;
import org.hrb.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

// This class will be treated as a service.
// all the crud operations will be managed by PostRepository object which extends CrudRepository<Post, Integer>
@Service
public class PostsService {
	
/*	List<Post> posts = new ArrayList<Post>();
	public PostsService() {
		posts.add(new Post(1,"Data Type","Sample text"));
		posts.add(new Post(2,"classed ","Sample text"));
		posts.add(new Post(3,"Objects","Sample text"));
		posts.add(new Post(4,"Access specifier","Sample text"));
		posts.add(new Post(5,"OOPs overview","Sample text"));	
	} */
	
	@Autowired
	private PostRepository repository;
	
	
	public List<Post> getPosts(){
		
		List<Post> list=new ArrayList<>();
		//this findall method will give us entire set of rows	
		//repository.findAll();
		
		for(Post post:repository.findAll()) {
			list.add(post);
		}
		System.out.println("list of posts :"+list);
		return list;
		
	}
	
	public Post getPost(int id){
		
		/*for (Post post : repository.findAll()) {
			if(post.getPostId()==id) {
				System.out.println("post :"+post);
				return post;
			}
		}*/
		
	// finById return the optional object and .get() converts it to optional object , or we can change return type to Optional<Post>
		return repository.findById(id).get();	
	}
	
	public void addPost(Post post) {
		
		repository.save(post);
	}
	
	public void updatePost(Post post) {
		
		// save method will update the record if id already present otherwise it will create new row
		repository.save(post);
		
	}

	public void deletePost(int id) {
		
		repository.deleteById(id);
		
	}

}
