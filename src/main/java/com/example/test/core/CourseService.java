package com.example.test.core;

import java.util.List;
import java.util.Optional;

public interface CourseService {
	List<Course> getAllCourses();

	void addCourse(Course course);

	Optional<Course> getCourseDetails(String id);

	void deleteCourse(String id);
}
