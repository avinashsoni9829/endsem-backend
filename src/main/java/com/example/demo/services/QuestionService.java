package com.example.demo.services;

import java.util.Set;

import com.example.demo.entity.Question;
import com.example.demo.entity.Quiz;

public interface QuestionService {
        public Question addQuestion(Question q);
        public Question updateQuestion(Question q);
        public Question getQuestionById(Long id);
        public void deleteQuestion(Long id);
        public Set<Question> getQuestionOfQuiz(Quiz q);
        
        
}
