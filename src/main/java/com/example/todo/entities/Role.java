package com.example.todo.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Role {

	public static final List<Role> admin = null;
	public static final List<Role> employee = null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "rolename")
	private String rolename;
	@CreationTimestamp
	private LocalDate date;
	// @JsonIgnore
	@ManyToMany(mappedBy = "role")
	private List<User> user = new ArrayList<>();

}
