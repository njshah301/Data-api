package io.nilayshah.springbootstart.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.nilayshah.springbootstart.topic.Topic;

@Entity
@Table(name="Course")

public class Course {
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	public Course()
	{
		
	}
	public Course(String id, String name, String description,String TopicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic=new Topic(TopicId,"","");	
	}

	

	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}
	
}
