package com.example.test.entrypoint;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.core.Course;
import com.example.test.core.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Optional<Course> getCourseDetails(@PathVariable String id) {
		return courseService.getCourseDetails(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	
}
