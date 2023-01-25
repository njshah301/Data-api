package io.nilayshah.course_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name = "Course")
@Entity

public class Course {
	@Id
	@Column(name = "Id")
	private String courseId;

	public String getCourseId() {
		return courseId;
	}
	public Course()
	{
		
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}
	
	@ManyToOne
	private Topic topic;
	public Course(String courseId, String courseName, String courseDescription, String topicId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.topic = new Topic(topicId,"","");
	}

	

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Column(name = "Name")
	private String courseName;

	@Column(name = "Description")
	private String courseDescription;
	

	
	
}
