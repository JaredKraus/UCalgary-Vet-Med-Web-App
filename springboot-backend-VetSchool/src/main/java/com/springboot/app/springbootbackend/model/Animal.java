package com.springboot.app.springbootbackend.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.Data;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@JsonFilter("Filter")
@Table(name="animal")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="animal_id")
	private Integer animalId;
	
	@Column(name = "animal_name", nullable = false)
	private String animalName;
	
	@Column(name = "animal_type", nullable = false)
	private String animalType;

	@Column(name = "sex", nullable = false)
	private String sex;

	@Column(name = "profile_photo", nullable = false)
	private String profilePhoto;

	@Column(name="birth_date")
	private String birthDate;

	@Column(name="color")
	private String color;

	@Column(name="active")
	private String active;

	@Column(name="microchip_num")
	private String microchipNum;

	@Column(name="breed")
	private String breed;

	@Column(name="last_checkup")
	private String lastCheckup;

	@Column(name="status")
	private String status;

	@Column(name="location")
	private String location;

	@OneToMany(mappedBy = "animalId")  // this is the name in the corresponding table
	List<Weight> weights;

	@OneToMany(mappedBy = "animalId")
	List<ProfileImage> images;

	@OneToMany(mappedBy = "animalId")
	List<MedicalIssue> medicalIssues;

	@OneToMany(mappedBy = "animalId")
	List<Prescription> prescriptions;

}