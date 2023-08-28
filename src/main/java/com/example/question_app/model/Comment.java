package com.example.question_app.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "comment")
@Data
public class Comment {
    @Id
    Long id;
    Long postId;
    Long userId;
    @Lob
    @Column(columnDefinition = "text")
    String text;
}
