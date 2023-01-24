package io.nilayshah.course_api.dto;

import org.springframework.http.converter.StringHttpMessageConverter;

import lombok.Data;
@Data
public class CourseDto {
	private String courseId;
	private String courseName;
	private String courseDescription;
}
