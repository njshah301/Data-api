package io.nilayshah.course_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Table(name = "Topic")
@Entity

public class Topic {
	@Id
	@Column(name = "Id")
	private String topicId;
	
	
	@Column(name = "Name")
	private String topicName;
	
	@Column(name = "Description")
	private String topicDescription;

	
	
	public Topic()
	{
		
	}
	
	public String getTopicId() {
		return topicId;
	}
	
	
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public Topic(String topicId, String topicName, String topicDescription) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
	
}
