package com.vti.templaterestfulapi.models2;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Profile {
    @Id
    private Long id;

    @Transient
    public static final String SEQUENCE_NAME = "profile_sequence";
    private String name;
    private String address;
    private Date birthDay;
    private String idPerson;
    private String avatar;
    private List<String> listDegreeImage;
    private List<Subject> listSubject;




}
