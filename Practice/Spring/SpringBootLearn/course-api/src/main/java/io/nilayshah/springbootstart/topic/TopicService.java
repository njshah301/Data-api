package io.nilayshah.springbootstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	private List <Topic> topics=new ArrayList<Topic>();
	
	public List<Topic> getAllTopics()
	{
		//return topics;
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	public Topic getTopic(String id)
	{
		//return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id).get();
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}
	public void UpdateTopic(String id, Topic topic) {
		
		topicRepository.save(topic);
	}
	public void deleteTopic(String id) {
		
		topicRepository.deleteById(id);
	}
	
}
