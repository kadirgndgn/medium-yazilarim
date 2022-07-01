package com.mediumyazi.mediumyazi.dataAccess.abstracts;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mediumyazi.mediumyazi.entities.concretes.Student;

public interface StudentDao extends MongoRepository<Student, Integer>{

}
