package com.vti.templaterestfulapi.service;


import com.vti.templaterestfulapi.models.Course;
import com.vti.templaterestfulapi.models.ProductType;
import com.vti.templaterestfulapi.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Configurable
@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    public Course insert(Course course){
        course.setId((int) sequenceGeneratorService.generateSequence(Course.SEQUENCE_NAME));
        course.setCreatedDate(new Date());
        course.setGender(true);
        return courseRepository.insert(course);
    }

    public List<Course> findAll(){
        return courseRepository.findAllByActive(true);
    }

}
