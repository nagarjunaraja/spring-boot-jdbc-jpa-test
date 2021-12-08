package com.nagarjuna.database.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarjuna.database.entity.Person;

@Repository
public interface PersonSpringDataRepository 
				extends JpaRepository<Person, Integer>{
}
