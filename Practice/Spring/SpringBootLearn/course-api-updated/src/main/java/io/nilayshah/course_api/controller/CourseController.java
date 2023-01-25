package io.nilayshah.course_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.nilayshah.course_api.dto.CourseDto;
import io.nilayshah.course_api.service.CourseService;
import io.nilayshah.course_api.util.URLConstants;
@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping(value=URLConstants.COURSE_BASE_URL,consumes= {URLConstants.APPLICATION_JSON})
	public List <CourseDto> getAllCourse(@PathVariable String topicId)
	{
		return courseService.getAllCourse(topicId);
	}
	
	@PostMapping(value = URLConstants.COURSE_BASE_URL)
	public void addTopic(@PathVariable String topicId,@RequestBody CourseDto courseDto)
	{
		courseService.addCourse(topicId,courseDto);
	}
	
	@PutMapping(value = URLConstants.COURSE_BASE_URL_WITH_PATH)
	public void UpdateCourse(@PathVariable String topicId,@RequestBody CourseDto courseDto)
	{
		courseService.updatedCourseByID(topicId,courseDto);
	}
	
	@DeleteMapping(value= URLConstants.COURSE_BASE_URL_WITH_PATH)
	public void deleteById(@PathVariable String id)
	{
		courseService.deleteCourseByID(id);
	}
	

	@GetMapping(value = URLConstants.COURSE_BASE_URL_WITH_PATH)
	public CourseDto getCourseByIdAsPath(@PathVariable String id)
	{
		return courseService.getCourseByID(id);
	}
}
