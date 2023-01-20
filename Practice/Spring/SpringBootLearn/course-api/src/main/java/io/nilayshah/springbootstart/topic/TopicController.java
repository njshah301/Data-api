package io.nilayshah.springbootstart.topic;

import java.util.Arrays;
import java.util.List;

import javax.el.VariableMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	@RequestMapping("/")
	public String hello()
	{
		return "Hi nj!";
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,  value = "/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,  value = "/topics/{id}")
	public void getTopic(@PathVariable String id,@RequestBody Topic topic)
	{
		topicService.UpdateTopic(id,topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,  value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
	
}
