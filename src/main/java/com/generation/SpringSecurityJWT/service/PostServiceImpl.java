package com.generation.SpringSecurityJWT.service;

import com.generation.SpringSecurityJWT.model.Post;
import com.generation.SpringSecurityJWT.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPost(Long id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElse(null);
    }

    @Override
    public List<Post> getPosts() {
        return (List<Post>) postRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        postRepository.deleteById(id);
    }

	@Override
	public List<Post> findByUserId(Long id) {
		return postRepository.findByUsuarioId(id);
	}

}
