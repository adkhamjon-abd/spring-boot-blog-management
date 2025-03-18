package com.adam.blog.blogmanagement.repository;

import com.adam.blog.blogmanagement.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepository extends JpaRepository<Comment, Integer> {

    @Query("select count(c) from comments c where c.post.id = :post_id")
    int countCommentsByPost(@Param("post_id") int postId);

    List<Comment> findByPostId(int postId);
}
