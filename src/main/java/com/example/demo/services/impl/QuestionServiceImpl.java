package com.example.demo.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Question;
import com.example.demo.entity.Quiz;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
    
	@Autowired
	private QuestionRepository questionRepository;
	
	
	@Override
	public Question addQuestion(Question q) {
		return this.questionRepository.save(q);
	}

	@Override
	public Question updateQuestion(Question q) {
		return this.questionRepository.save(q);
		
	}

	@Override
	public Question getQuestionById(Long id) {
		return this.questionRepository.getById(id);
	}

	@Override
	public void deleteQuestion(Long id) {
        this.questionRepository.deleteById(id);
		
	}

	@Override
	public Set<Question> getQuestionOfQuiz(Quiz q) {
		return this.questionRepository.findByQuiz(q);
		
	}
	

}
