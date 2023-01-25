package io.nilayshah.course_api.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nilayshah.course_api.dto.CourseDto;
import io.nilayshah.course_api.entities.Course;
import io.nilayshah.course_api.entities.Topic;
import io.nilayshah.course_api.repositories.CourseRepository;
import io.nilayshah.course_api.service.CourseService;



@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public CourseDto courseEntityToDto(Course course)
	{
		return modelMapper.map(course, CourseDto.class);
//		return courseDto;
	}
	
	List<CourseDto> courseDto=new ArrayList<CourseDto> ();
	List <Course> courses =new ArrayList <Course> ();

	public List<CourseDto> courseEntityToDto(List<Course> course)
	{
		for(Course courses:course)
		{
			courseDto.add(courseEntityToDto(courses));
		}
		return courseDto;
	}
	
	public Course courseDtoToEntity(CourseDto courseDto)
	{
		Course course = new Course();
		course = modelMapper.map(courseDto, Course.class);
		return course;
	}
	
	
	
	@Override
	public List<CourseDto> getAllCourse(String topicId) {	
		courseRepository.findByTopicTopicId(topicId).forEach(courses::add);
		return courseEntityToDto(courses);
	}

	@Override
	public CourseDto getCourseByID(String Id) {
		// TODO Auto-generated method stub
		return courseEntityToDto(courseRepository.findById(Id).get());
	}

	@Override
	public void updatedCourseByID(String topicId,CourseDto courseDto) {
		Course course=courseDtoToEntity(courseDto);
		course.setTopic(new Topic(topicId,"",""));
		courseDto.setTopicId(topicId);
		courseRepository.saveAndFlush(courseDtoToEntity(courseDto));

	}

	@Override
	public void deleteCourseByID(String courseId) {
		courseRepository.deleteById(courseId);

	}

	

	@Override
	public void addCourse(String topicId,CourseDto courseDto) {
		Course course=courseDtoToEntity(courseDto);
		course.setTopic(new Topic(topicId,"",""));
		courseDto.setTopicId(topicId);
		courseRepository.save(courseDtoToEntity(courseDto));
	
	}

}
