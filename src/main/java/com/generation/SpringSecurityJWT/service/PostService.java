package com.generation.SpringSecurityJWT.service;

import com.generation.SpringSecurityJWT.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    Post save(Post post);

    Post getPost(Long id);

    List<Post> getPosts();

    void delete(Long id);
    
    List<Post> findByUserId(Long id);

}
