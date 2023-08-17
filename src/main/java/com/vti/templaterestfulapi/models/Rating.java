package com.vti.templaterestfulapi.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private Long id;
    private double score;



}








