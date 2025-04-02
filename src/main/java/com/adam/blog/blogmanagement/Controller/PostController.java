package com.adam.blog.blogmanagement.Controller;

import com.adam.blog.blogmanagement.Entity.Post;
import com.adam.blog.blogmanagement.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<String> createPost(Post post){
        postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body("Post created successfully");
    }

    @GetMapping("{id}")
    public ResponseEntity<String> getPostById(Post post){
        postService.findById(post.getId());
        return ResponseEntity.status(HttpStatus.OK).body("Success");
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updatePostByIs(Post post){
        postService.updatePost(post);
        return ResponseEntity.ok("Post is updated");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletePost(@PathVariable("id") int postId){
        postService.deletePost(postId);
        return ResponseEntity.ok("Post is deleted");
    }
}
