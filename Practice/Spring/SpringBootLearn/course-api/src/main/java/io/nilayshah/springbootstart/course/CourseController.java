package io.nilayshah.springbootstart.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.nilayshah.springbootstart.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	@RequestMapping("/topics/{topicid}/course")
	public List<Course> getAllCourses(@PathVariable String topicid)
	{
		
		return courseService.getAllCourse(topicid);
	}

	
	@RequestMapping("/topics/{topicid}/course/{id}")
	public Course getAllCourse(@PathVariable String id)
	{
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,  value = "/topics/{topicid}/course")
	public void addCourse(@RequestBody Course course,@PathVariable String topicid)
	{
		course.setTopic(new Topic(topicid,"",""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT,  value = "/topics/{topicid}/course/{id}")
	public void getCourse(@PathVariable String id,@RequestBody Course course,@PathVariable String topicid)
	{
		course.setTopic(new Topic(topicid,"",""));
		courseService.UpdateCourse(id,course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,  value = "/topics/{topicid}/course/{id}")
	public void deleteCourse(@PathVariable String id)
	{
		courseService.deleteCourse(id);
	}
	
}