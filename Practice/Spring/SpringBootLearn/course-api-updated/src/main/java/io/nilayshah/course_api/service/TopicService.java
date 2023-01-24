package io.nilayshah.course_api.service;

import java.util.List;

import io.nilayshah.course_api.dto.TopicDto;

public interface TopicService {
	public List <TopicDto> getAllTopic();
	public void addTopic(TopicDto topicDto);
	public TopicDto getTopicByID(String Id);
	public void updatedTopic(TopicDto topicDto);
	public void deleteTopicByID(String Id);
}
