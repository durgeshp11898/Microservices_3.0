package com.learn.quiz.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.quiz.entity.Quiz;
import com.learn.quiz.repository.QuizRepository;
import com.learn.quiz.service.QuestionClient;
import com.learn.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{


	@Autowired
	QuizRepository quizRepository;

	@Autowired
	QuestionClient questionClient;

	@Override
	public Quiz add(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		List<Quiz> quizzes = quizRepository.findAll();

		List<Quiz> newQuizList=quizzes.stream().map(quiz ->{
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());


		return newQuizList;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz quiz = quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz Not Found"));

		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));

		return quiz;
	}

}
