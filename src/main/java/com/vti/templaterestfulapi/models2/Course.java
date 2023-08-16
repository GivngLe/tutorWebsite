package com.vti.templaterestfulapi.models2;

import com.vti.templaterestfulapi.models.User;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Course {
    @Id
    private Long id;
    @Transient
    public static final String SEQUENCE_NAME = "course_sequence";
    private String name;
    private String studentName;
    private String parentName;
    private boolean genderStudent;
    private Date createDate;
    private Date startDate;
    private Date finishDate;
    private double price;
    private int status;
    private String phoneNumber;
    private User tutor;
    private List<User> tutorRequire;






}
