package com.adam.blog.blogmanagement.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;


}
//Users (ID, Name, Email, Password, Role).
//Posts (ID, Title, Content, Author, Timestamp).
//Comments (ID, PostID, UserID, Content, Timestamp).
//Files (ID, PostID, FilePath, Type).
