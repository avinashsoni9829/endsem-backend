package com.example.demo.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Question;
import com.example.demo.entity.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz q);
   
}
