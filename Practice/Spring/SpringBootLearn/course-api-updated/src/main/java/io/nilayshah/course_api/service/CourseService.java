package io.nilayshah.course_api.service;

import java.util.List;

import io.nilayshah.course_api.dto.CourseDto;

public interface CourseService {
	public void addCourse(String topicId,CourseDto courseDto);
	public CourseDto getCourseByID(String id);
	public void updatedCourseByID(String topicId,CourseDto courseDto);
	public void deleteCourseByID(String id);
	public List<CourseDto> getAllCourse(String topicId);
}

