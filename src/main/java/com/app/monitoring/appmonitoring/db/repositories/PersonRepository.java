package com.app.monitoring.appmonitoring.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.monitoring.appmonitoring.db.entities.PersonEntity;


@Repository
public interface PersonRepository  extends JpaRepository<PersonEntity, Integer>{

}
