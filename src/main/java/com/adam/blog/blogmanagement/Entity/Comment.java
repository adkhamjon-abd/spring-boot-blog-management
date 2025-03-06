package com.adam.blog.blogmanagement.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private int postId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private int userId;

    @Column(nullable = false)
    private String Content;

    @Column(nullable = false)
    private LocalDateTime timestamp;


}
//Comments (ID, PostID, UserID, Content, Timestamp).

