package io.nilayshah.springbootstart.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	private List <Course> course=new ArrayList<Course>();
	
	
	public List<Course> getAllCourse(String topicid)
	{
		//return topics;
		
		courseRepository.findByTopicId(topicid).forEach(course::add);
		return course;
	}
	
	public Course getCourse(String id)
	{
		return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}
	public void UpdateCourse(String id, Course course) {
		
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		
		courseRepository.deleteById(id);
	}
	
}