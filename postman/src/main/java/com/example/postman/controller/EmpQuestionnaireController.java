package com.example.postman.controller;

import com.example.postman.entity.EmployeeQuestionnaireEntity;
import com.example.postman.exception.APIFailureException;
import com.example.postman.responseModel.QuestionnaireResponse;
import com.example.postman.service.EmpQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmpQuestionnaireController {

    @Autowired
    private EmpQuestionnaireService empQuestionnaireService;

    @PostMapping("/addEmpQuestionnaire")
    public EmployeeQuestionnaireEntity addEmpQ(@RequestBody EmployeeQuestionnaireEntity employeeQuestionnaire) throws APIFailureException
    {
        System.out.println(employeeQuestionnaire);
        if(employeeQuestionnaire == null) {
            throw new APIFailureException("EmployeeQuestionnaireEntity is not found");
        }
        return empQuestionnaireService.create(employeeQuestionnaire);
    }

    @PostMapping("/getAnswerUsingKeyword")
    public QuestionnaireResponse getAnswer(@RequestParam String question) throws APIFailureException{
        System.out.println(question);
        if(question == null) {
            throw new APIFailureException("Question is empty");
        }
        return empQuestionnaireService.getAnswer(question);
    }

    @PostMapping("/getAnswer")
    public QuestionnaireResponse getAnswerByQuestion(@RequestParam String question) throws APIFailureException{
        System.out.println(question);
        if(question == null) {
            throw new APIFailureException("Question is empty");
        }
        return empQuestionnaireService.getAnswerByQuestion(question);
    }


}
