package com.vti.templaterestfulapi.models2;



import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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
@Table(name = "user")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	@Column(nullable = false)
    private String name;
	@Column(nullable = false)
    private String address;
	@Column(nullable = false)
    private String phone;
	@Column(nullable = false)
    private String email;
	@Column(nullable = false)
    private String password;
	private String googleID;
    @CreatedDate
    private Date createdTime;

    @LastModifiedDate
    private Date modifiedDate;

    private boolean isActive;

    private long parentID;

}
