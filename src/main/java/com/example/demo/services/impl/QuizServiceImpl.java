package com.example.demo.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Quiz;
import com.example.demo.repository.QuizRepository;
import com.example.demo.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
   
	@Autowired
	private QuizRepository quizRepository;
	
	@Override
	public Quiz addQuiz(Quiz quiz) {
		return this.quizRepository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		return this.quizRepository.save(quiz);
	}

	@Override
	public Quiz getQuizById(Long id) {
		return this.quizRepository.getById(id);
	}

	@Override
	public Set<Quiz> getQuizzes() {
		return new LinkedHashSet<>(this.quizRepository.findAll());
	}

	@Override
	public void deleteQuiz(Long id) {
		this.quizRepository.deleteById(id);
		
		
	}

}
