package com.springBootProfiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootProfiles.domain.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
