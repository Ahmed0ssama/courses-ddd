package com.example.test.infrastructure;

//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

import com.example.test.core.Course;

public interface SpringDataMongoCourseRepository extends MongoRepository<Course, String>{
//	@Query(value="{}", fields="{name: 1, description: 1}")
//	List<Course> findAll();
}
