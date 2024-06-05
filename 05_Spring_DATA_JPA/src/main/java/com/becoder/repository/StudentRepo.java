package com.becoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.becoder.entities.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
