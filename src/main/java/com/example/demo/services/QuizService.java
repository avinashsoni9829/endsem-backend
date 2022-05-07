package com.example.demo.services;

import java.util.Set;

import com.example.demo.entity.Quiz;

public interface QuizService {
	
	   public Quiz addQuiz(Quiz quiz);
	   
	   public Quiz updateQuiz(Quiz quiz);
	   
	   public Quiz getQuizById(Long id);
	   
	   public Set<Quiz> getQuizzes();
	   
	   public void deleteQuiz(Long id);
	   

}
