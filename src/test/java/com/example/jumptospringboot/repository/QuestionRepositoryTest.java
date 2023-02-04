package com.example.jumptospringboot.repository;

import com.example.jumptospringboot.domain.Answer;
import com.example.jumptospringboot.domain.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QuestionRepositoryTest {

    @Autowired
    private QuestionRepository questionRepository;

//    private final AnswerRepository answerRepository;

//    @Autowired
//    public QuestionRepositoryTest(QuestionRepository questionRepository, AnswerRepository answerRepository) {
//        this.questionRepository = questionRepository;
//        this.answerRepository = answerRepository;
//    }

    @Test
    void testJpa() {
//        Question question1 = Question.builder().subject("sbb가 무엇인가요").content("sbb가 에 대해서 알고 싶습니다.").createdAt(LocalDateTime.now()).build();
//        questionRepository.save(question1);
//        Question question2 = Question.builder().subject("스프링부트 모델 질문입니다").content("id는 자동으로 생성되는지").createdAt(LocalDateTime.now()).build();
//        questionRepository.save(question2);

        Question question1 = Question.builder()
                .subject("스프링부트 모델 질문입니다.")
                .content("id는 자동으로 생성되나요?")
                .createDate(LocalDateTime.now())
                .build();
        questionRepository.save(question1);


//        List<Question> all = questionRepository.findAll();
//        assertEquals(2, all.size());


//        String subject = questionRepository.findById(1)
//                .map(Question::getSubject)
//                .orElseThrow(RuntimeException::new);
//        assertEquals("sbb가 무엇인가요", subject);


//        Question q1 = questionRepository.findBySubject("sbb가 무엇인가요");
//        assertEquals(1, q1.getId());


//        Question q2 = questionRepository.findBySubjectAndContent(
//                "sbb가 무엇인가요", "sbb가 에 대해서 알고 싶습니다."
//        );
//        assertEquals(1, q2.getId());


//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);


//        assertEquals(2, questionRepository.count());
//        Optional<Question> oq = questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        questionRepository.delete(q);
//        assertEquals(1, questionRepository.count());


//        Optional<Question> oq = questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);
//        a.setCreatedAt(LocalDateTime.now());
//        answerRepository.save(a);


//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());




//        이렇게 필요한 시점에 데이터를 가져오는 방식을 Lazy 방식이라고 함
//        이와 반대로 q 객체를 조회할때 답변 리스트를 모두 가져오는 방식은 Eager 방식이라고 함.
//        @OneToMany, @ManyToOne 애너테이션의 옵션으로 fetch=FetchType.LAZY 또는 fetch=FetchType.EAGER 처럼 가져오는 방식을 설정할 수 있는데
//        이 책에서는 따로 지정하지 않고 항상 디폴트 값을 사용할 것이다.
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        List<Answer> answerList = q.getAnswerList();
//        assertEquals(1, answerList.size());
//        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
    }
}