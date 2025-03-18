package com.adam.blog.blogmanagement.service;

import com.adam.blog.blogmanagement.Entity.Comment;
import com.adam.blog.blogmanagement.repository.CommentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    final CommentsRepository commentsRepository;

    public CommentService(CommentsRepository commentsRepository){
        this.commentsRepository = commentsRepository;
    }
    public void createComment(Comment comment){
        commentsRepository.save(comment);
    }

    public List<Comment> getCommentsByPost(int postId){
        //commentsRepository.
        return commentsRepository.findByPostId(postId);
    }

    public Comment getCommentById(int commentId){
        return commentsRepository.findById(commentId).orElseThrow(()-> new RuntimeException("not found"));
    }

    public Comment updateComment(int commentId, String content){
        Comment comment = commentsRepository.findById(commentId).orElseThrow(() -> new IllegalArgumentException("not found"));
        comment.setContent(content);
        commentsRepository.save(comment);
        return comment;
    }

    public void deleteCommentById(int id){
        commentsRepository.deleteById(id);
    }

    public int countCommentsByPost(int postId){
        return commentsRepository.countCommentsByPost(postId);
    }
}
