package com.reg.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tbluser")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonProperty("fullName")
	private String fullName;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("dob")
	private String dateOfBirth;
	@JsonProperty("address")
	private String address;
	@JsonProperty("email")
	private String email;
	@JsonProperty("password")
	private String password;
}

