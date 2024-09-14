package com.learn.quiz.service;

import java.util.List;

import com.learn.quiz.entity.Quiz;

public interface QuizService {


    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
    
}
