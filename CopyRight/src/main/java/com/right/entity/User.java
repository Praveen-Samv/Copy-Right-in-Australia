package com.right.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User_Info")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name =  "User_Name")
	private String userName;
	
	@Column(name =  "First_Name")
	private String firstName ;
	
	@Column(name = "Last_Name")
	private String lastName ;
	
	@Column(name =  "Email")
	private String email;
	

}
