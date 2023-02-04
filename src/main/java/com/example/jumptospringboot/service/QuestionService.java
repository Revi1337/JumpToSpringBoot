package com.example.jumptospringboot.service;

import com.example.jumptospringboot.domain.Question;
import com.example.jumptospringboot.exception.DataNotFoundException;
import com.example.jumptospringboot.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service @RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return questionRepository.findAll();
    }

    public Question getQuestion(Integer id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("question not found"));
    }

    public void create(String subject, String content) {
        questionRepository.save(
                Question.builder()
                    .subject(subject)
                    .content(content)
                    .createDate(LocalDateTime.now())
                    .build()
        );
    }


}
