package com.learn.question.service;

import java.util.List;

import com.learn.question.entity.Question;

public interface QuestionService {

	
	Question create(Question question);
	List<Question> get();
	Question getOne(Long id);

	List<Question> getQuestionsOfQuiz(Long quizId);


	
	
}
