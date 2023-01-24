package io.nilayshah.course_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.nilayshah.course_api.dto.TopicDto;
import io.nilayshah.course_api.service.TopicService;
import io.nilayshah.course_api.util.URLConstants;

@RestController

public class TopicController {

	
	@Autowired
	private TopicService topicService;
	
	@GetMapping(value=URLConstants.TOPIC_BASE_URL,consumes= {URLConstants.APPLICATION_JSON})
	public List <TopicDto> getAllTopic()
	{
		return topicService.getAllTopic();
	}
	
	@PostMapping(value = URLConstants.TOPIC_BASE_URL)
	public void addTopic(@RequestBody TopicDto topicDto)
	{
		topicService.addTopic(topicDto);
	}
	
	@PutMapping(value = URLConstants.TOPIC_BASE_URL_WITH_PATH)
	public void UpdateTopic(@PathVariable String id,@RequestBody TopicDto topicDto)
	{
		topicService.updatedTopic(topicDto);
	}
	
	@DeleteMapping(value= URLConstants.TOPIC_BASE_URL_WITH_PATH)
	public void deleteById(@PathVariable String id)
	{
		topicService.deleteTopicByID(id);
	}
	

	@GetMapping(value = URLConstants.TOPIC_BASE_URL_WITH_PATH)
	public TopicDto getTopicByIdAsPath(@PathVariable String id)
	{
		return topicService.getTopicByID(id);
	}

	
	
	
	
}
