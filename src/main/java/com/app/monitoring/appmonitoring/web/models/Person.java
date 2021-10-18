package com.app.monitoring.appmonitoring.web.models;

import java.io.Serializable;

import com.app.monitoring.appmonitoring.db.entities.PersonEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
	private static final long serialVersionUID = 3570556679061270028L;

	private int personId;
	private String firstName;
	private String lastName;
	private String email;

}
