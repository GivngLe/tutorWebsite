package com.vti.templaterestfulapi.models2;



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
