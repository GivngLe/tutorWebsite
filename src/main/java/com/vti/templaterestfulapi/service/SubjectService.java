package com.vti.templaterestfulapi.service;

import com.vti.templaterestfulapi.models2.Subject;
import com.vti.templaterestfulapi.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public Subject create(Subject subject){
        return subjectRepository.save(subject);
    }

    public List<Subject> findAll(){
        return subjectRepository.findAll();
    }


}
