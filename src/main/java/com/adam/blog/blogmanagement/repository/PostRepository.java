package com.adam.blog.blogmanagement.repository;

import com.adam.blog.blogmanagement.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
