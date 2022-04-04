package com.example.test.core;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainCourseService implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses() {
		return courseRepository.getAllCourses();
	}

	public void addCourse(Course course) {
		courseRepository.addCourse(course);
	}

	public Optional<Course> getCourseDetails(String id) {
		return courseRepository.getCourseDetails(id);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteCourse(id);
	}
}
