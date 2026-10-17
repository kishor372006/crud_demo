package com.example.crudSpringBootDemo.repository;

import com.example.crudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
