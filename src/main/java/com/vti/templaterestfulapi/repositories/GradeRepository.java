package com.vti.templaterestfulapi.repositories;

import com.vti.templaterestfulapi.models2.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository  extends JpaRepository<Grade, Integer> {
}
