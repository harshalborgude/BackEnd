package org.hrb.repository;

import org.hrb.entity.Post;
import org.springframework.data.repository.CrudRepository;

// CRUD operation - creat , read , update , delete
// CrudRepository<T, ID> - T : entity class - Post , ID : primary key data type - Integer
// we dont need to implement any business logic inside this class for any CRUD operation 

public interface PostRepository extends CrudRepository<Post, Integer>{

}
