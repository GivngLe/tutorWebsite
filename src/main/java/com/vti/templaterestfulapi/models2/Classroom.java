package com.vti.templaterestfulapi.models2;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "classroom")
public class Classroom {

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
