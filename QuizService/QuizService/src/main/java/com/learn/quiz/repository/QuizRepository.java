package com.learn.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.quiz.entity.Quiz;

public interface QuizRepository  extends JpaRepository<Quiz, Long>{

}
