package io.nilayshah.course_api.service;

import java.util.List;

import io.nilayshah.course_api.dto.CourseDto;
import io.nilayshah.course_api.entities.Topic;

public interface CourseService {
	public List <CourseDto> getAllCourse();
	public Topic getCourseByID(String Id);
	public void UpdatedCourseByID(CourseDto courseDto);
	public void DeleteCourseByID(String Id);
}
