package com.vti.templaterestfulapi.models;


import jakarta.persistence.*;
import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class Payment {
//    @Id
//    private int id;
//    private String name;
//    private String number;
//    private int type;
//
//}
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private String paymentMethod;
    @Column(nullable = false)
    private String paymentInfo;
    @Column(nullable = false)
    private boolean confirmed;

}
