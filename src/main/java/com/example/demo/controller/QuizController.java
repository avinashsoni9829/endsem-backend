package com.example.demo.controller;

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

import com.example.demo.entity.Quiz;
import com.example.demo.services.QuizService;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {
	
	 @Autowired
	 private QuizService quizService;
	 
	 @PostMapping("/")
	 public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz q){
		  return ResponseEntity.ok(this.quizService.addQuiz(q));
	 }
	 
	 @PutMapping("/")
	 public ResponseEntity<Quiz> updateQuiz(@RequestBody Quiz q){
		  return ResponseEntity.ok(this.quizService.updateQuiz(q));
	 }
	 
	 @GetMapping("/")
	 public ResponseEntity<?>getQuizzes(){
		  return ResponseEntity.ok(this.quizService.getQuizzes());
	 }
	 
	 @GetMapping("/{qId}")
	 public Quiz getQuizById(@PathVariable("qId") Long qId) {
		  return this.quizService.getQuizById(qId);
	 }
	 
	 @DeleteMapping("/{qId}")
	 public void DeleteQuiz(@PathVariable("qId")Long qId) {
		  this.quizService.deleteQuiz(qId);
	 }
	 

}
