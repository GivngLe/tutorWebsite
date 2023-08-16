package com.vti.templaterestfulapi.controller;

import com.vti.templaterestfulapi.models2.Course;
import com.vti.templaterestfulapi.models.ProductType;
import com.vti.templaterestfulapi.models.ResponseObject;
import com.vti.templaterestfulapi.service.CourseService;
import com.vti.templaterestfulapi.service.SequenceGeneratorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/insert")
    public ResponseEntity<?> insert(@RequestBody Course course) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject(200, "Ok",
                        courseService.insert(course)));
    }
    @PostMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject(200, "Ok",
                        courseService.findAll()));
    }
}
