package com.example.jumptospringboot.service;

import com.example.jumptospringboot.domain.Answer;
import com.example.jumptospringboot.domain.Question;
import com.example.jumptospringboot.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service @RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        answerRepository.save(
                Answer.builder()
                        .content(content)
                        .createDate(LocalDateTime.now())
                        .question(question)
                        .build()
        );
    }

}

