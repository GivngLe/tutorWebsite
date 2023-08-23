package com.vti.templaterestfulapi.controller;

import com.vti.templaterestfulapi.dto.LoginForm;
import com.vti.templaterestfulapi.models.ResponseObject;
import com.vti.templaterestfulapi.models2.Subject;
import com.vti.templaterestfulapi.service.SubjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @PostMapping("/insert")
    public ResponseEntity<?> insert(@Valid @RequestBody Subject subject) {

        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject(200, "Ok",
                        subjectService.create(subject)));


    }
    @PostMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject(200, "Ok",
                        subjectService.findAll()));
    }

}
