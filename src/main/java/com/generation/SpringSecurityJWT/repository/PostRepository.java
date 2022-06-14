package com.generation.SpringSecurityJWT.repository;

import com.generation.SpringSecurityJWT.model.Post;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	List<Post> findByUsuarioId(Long id);
}
