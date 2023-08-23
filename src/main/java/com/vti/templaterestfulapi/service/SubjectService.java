package com.vti.templaterestfulapi.service;

import com.vti.templaterestfulapi.models2.Subject;
import com.vti.templaterestfulapi.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;
@Configurable
@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    public Subject create(Subject subject){
        return subjectRepository.save(subject);
    }

    public List<Subject> findAll(){
        return subjectRepository.findAll();
    }


}
