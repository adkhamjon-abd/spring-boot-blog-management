package com.adam.blog.blogmanagement.service;

import com.adam.blog.blogmanagement.Entity.Post;
import com.adam.blog.blogmanagement.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public void createPost(Post post){
        postRepository.save(post);
    }

    public void updatePost(Post post){
        Post existingPost = postRepository.findById(post.getId()).orElseThrow(() -> new RuntimeException("Post not found"));
        existingPost.setTitle(post.getTitle());
        existingPost.setContent(post.getContent());
        postRepository.save(existingPost);
    }
    public void deletePost(Post post){
        postRepository.deleteById(post.getId());
    }
}
