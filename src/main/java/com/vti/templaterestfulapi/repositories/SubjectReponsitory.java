package com.vti.templaterestfulapi.repositories;

import com.vti.templaterestfulapi.models.Rating;
import com.vti.templaterestfulapi.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectReponsitory extends JpaRepository<Subject, Integer> {

}
