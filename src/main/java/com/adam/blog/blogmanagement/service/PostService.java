package com.adam.blog.blogmanagement.service;

import com.adam.blog.blogmanagement.Entity.Post;
import com.adam.blog.blogmanagement.repository.PostRepository;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Post findById(int postId){
        return postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("post not found"));
    }
    public Post createPost(Post post){
        postRepository.save(post);
        return post;
    }

    public void updatePost(Post post){
        Post existingPost = postRepository.findById(post.getId()).orElseThrow(() -> new IllegalArgumentException("Post not found"));
        existingPost.setTitle(post.getTitle());
        existingPost.setContent(post.getContent());
        postRepository.save(existingPost);
    }
    public void deletePost(int postId){
        if(!postRepository.existsById(postId)){
            throw new IllegalArgumentException("post not found");
        }
        postRepository.deleteById(postId);
    }
}
