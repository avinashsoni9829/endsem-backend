package com.example.demo.controller;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Question;
import com.example.demo.entity.Quiz;
import com.example.demo.services.QuestionService;

@RestController
@RequestMapping("/question")
@CrossOrigin("*")
public class QuestionController {
	
	   @Autowired
	   private QuestionService questionService;
	   
	   @PostMapping("/")
	   public ResponseEntity<Question> addQuestion(@RequestBody Question q){
		     return ResponseEntity.ok(this.questionService.addQuestion(q));
	   }
	   
	   @PutMapping("/")
	   public ResponseEntity<Question> updateQuestion(@RequestBody Question q)
	   {
		    return ResponseEntity.ok(this.questionService.updateQuestion(q));
	   }
	   
	   @GetMapping("/quiz/{qId}")
	   public ResponseEntity<?> getAllQuestionFromQuiz(@PathVariable("qId")Long qId){
		    Quiz q = new Quiz();
		    q.setqId(qId);
		    Set<Question> questionsOfQuiz = this.questionService.getQuestionOfQuiz(q);
		    return ResponseEntity.ok(questionsOfQuiz);
			    
	   }
	   
	   @GetMapping("/{qId}")
	   public Question getSingleQ(@PathVariable("qId") Long qId) {
		    return this.questionService.getQuestionById(qId);
	   }
	   
	   @DeleteMapping("/{qId}")
	   public void deleteQ(@PathVariable("qId") Long qId) {
		   this.questionService.deleteQuestion(qId);
	   }
	   
	   

}
