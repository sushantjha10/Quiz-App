package com.drogon.quizapp.controller;

import com.drogon.quizapp.Question;
import com.drogon.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public String getAllQuestions(){
        return List<Question> questionService.getAllQuestions();
    }
}
