package com.example.jumptospringboot.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter  @Builder
public class Answer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;

    @Column(columnDefinition = "TEXT") private String content;

    private LocalDateTime createDate;

    @ManyToOne private Question question;

}
