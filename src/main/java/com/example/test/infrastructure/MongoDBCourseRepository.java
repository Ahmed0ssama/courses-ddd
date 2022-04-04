package com.example.test.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.test.core.Course;
import com.example.test.core.CourseRepository;

@Repository
public class MongoDBCourseRepository implements CourseRepository{
	
	@Autowired
	private SpringDataMongoCourseRepository courseRepository;
	
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public Optional<Course> getCourseDetails(String id) {
		return courseRepository.findById(id);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}
