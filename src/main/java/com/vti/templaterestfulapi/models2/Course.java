package com.vti.templaterestfulapi.models2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.security.auth.Subject;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Course {
    @Id
    private int courseId;
    @Transient
    public static final String SEQUENCE_NAME = "profile_sequence";
    private String courseName;
    private Grade grade;
    private Subject subject;
    private String email;
    private String studentName;
    private String address;
    private String parentName;
    private String phoneNumber;
    private Date createdDate;
    private Date startedDate;
    private Date finishedDate;

}
