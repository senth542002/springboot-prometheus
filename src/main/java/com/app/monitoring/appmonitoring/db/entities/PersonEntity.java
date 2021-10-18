package com.app.monitoring.appmonitoring.db.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "PERSON")
@NoArgsConstructor
public class PersonEntity implements Serializable{
	private static final long serialVersionUID = -8003246612943943723L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int personId;
	
	private String firstName;
	private String lastName;
	private String email;
	
	public PersonEntity( String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public PersonEntity(int personId, String firstName, String lastName, String email) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
}
