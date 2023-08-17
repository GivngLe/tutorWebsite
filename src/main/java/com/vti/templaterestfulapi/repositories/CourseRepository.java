package com.vti.templaterestfulapi.repositories;

import com.vti.templaterestfulapi.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course, Integer> {
    List<Course> findAllByActive(boolean active);
}