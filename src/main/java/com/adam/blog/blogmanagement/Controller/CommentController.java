package com.adam.blog.blogmanagement.Controller;

import com.adam.blog.blogmanagement.Entity.Comment;
import com.adam.blog.blogmanagement.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PostMapping
    public void createComment(Comment comment){
        commentService.createComment(comment);
    }

    // So if the name of the endpoint matches the name of the parameter then @PathVariable is without explicit matching
    @GetMapping("/post/{postId}")
    public List<Comment> getCommentByPost(@PathVariable int postId){
        return commentService.getCommentsByPost(postId);
    }

    // Here the name of the endpoint does not match so it was tied explicitly
    @GetMapping("{id}")
    public Comment getCommentById(@PathVariable("id") int commentId){
        return commentService.getCommentById(commentId);
    }

    @PutMapping("{id}")
    public Comment updateCommentById(@PathVariable("id") int commentId, @RequestBody Comment comment){
        return commentService.updateComment(commentId, comment.getContent());
    }

    @DeleteMapping("{id}")
    public void deleteComentById(@PathVariable("id") int commentId) {
        commentService.deleteCommentById(commentId);
    }

    @PostMapping("/count/{postId}")
    public int countPostsById(@PathVariable int postId){
        return commentService.countCommentsByPost(postId);
    }

}
