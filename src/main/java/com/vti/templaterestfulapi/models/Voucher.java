package com.vti.templaterestfulapi.models;

import com.vti.templaterestfulapi.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class Voucher {


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "classroom")
    public static class Classroom {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;
        @Column(nullable = false)
        private String className;
        @Column(nullable = false)
        private String subject;
        @Column(nullable = false)
        private String time;
        @Column(nullable = false)
        private String address;
        @Column(nullable = false)
        private double tuition;
        private List<User> users;

    }
}
