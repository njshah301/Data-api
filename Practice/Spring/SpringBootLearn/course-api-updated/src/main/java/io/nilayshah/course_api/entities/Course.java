package io.nilayshah.course_api.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "Course")
@Entity
public class Course {
	@Id
	@Column(name = "Id")
	private String courseId;

	@Column(name = "Name")
	private String courseName;

	@Column(name = "Description")
	private String courseDescription;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Topic topic;
	
	
}
