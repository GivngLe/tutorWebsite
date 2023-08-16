package com.vti.templaterestfulapi.repositories;

import com.vti.templaterestfulapi.models2.CourseStatus;
import com.vti.templaterestfulapi.models2.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course, Long> {



        List<Course> findAllByStatus(int status);


}
