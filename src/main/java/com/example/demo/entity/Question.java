package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Questions")
public class Question {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long quesid;
	  
	  private String question;
	  
	  private String image;
	  
	  private String option1;
	  
	  private String option2;
	  private String option3;
	  private String option4;
	  
	  private String answer;
	  
	  
     
	 @ManyToOne(fetch = FetchType.EAGER)
	 private Quiz quiz;



	public Long getQuesid() {
		return quesid;
	}



	public void setQuesid(Long quesid) {
		this.quesid = quesid;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getOption1() {
		return option1;
	}



	public void setOption1(String option1) {
		this.option1 = option1;
	}



	public String getOption2() {
		return option2;
	}



	public void setOption2(String option2) {
		this.option2 = option2;
	}



	public String getOption3() {
		return option3;
	}



	public void setOption3(String option3) {
		this.option3 = option3;
	}



	public String getOption4() {
		return option4;
	}



	public void setOption4(String option4) {
		this.option4 = option4;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public Quiz getQuiz() {
		return quiz;
	}



	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}



	public Question(Long quesid, String question, String image, String option1, String option2, String option3,
			String option4, String answer, Quiz quiz) {
		super();
		this.quesid = quesid;
		this.question = question;
		this.image = image;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.quiz = quiz;
	}



	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
     
	
	 
	 
	 
}
