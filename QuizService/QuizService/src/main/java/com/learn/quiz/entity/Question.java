package com.learn.quiz.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private  Long questionId;
    private  String question;
    private  Long quizId;
}