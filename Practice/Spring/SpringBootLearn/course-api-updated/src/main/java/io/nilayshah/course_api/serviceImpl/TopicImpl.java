package io.nilayshah.course_api.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nilayshah.course_api.dto.TopicDto;
import io.nilayshah.course_api.entities.Topic;
import io.nilayshah.course_api.repositories.TopicRepository;
import io.nilayshah.course_api.service.TopicService;

@Service
public class TopicImpl implements TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public TopicDto TopicEntityToDto(Topic topic)
	{
		TopicDto topicDto=new TopicDto();
		topicDto = modelMapper.map(topic, TopicDto.class);
		return topicDto;
	}
	
	List<TopicDto> topicDto=new ArrayList<TopicDto> ();
	List <Topic> topics =new ArrayList <Topic> ();

	public List<TopicDto> TopicEntityToDto(List<Topic> topic)
	{
		for(Topic topics:topic)
		{
			topicDto.add(TopicEntityToDto(topics));
		}
		return topicDto;
	}
	
	public Topic TopicDtoToEntity(TopicDto topicDto)
	{
		Topic topic = new Topic();
		topic = modelMapper.map(topicDto, Topic.class);
		return topic;
	}
	
	
	
	@Override
	public List<TopicDto> getAllTopic() {	
		topicRepository.findAll().forEach(topics::add);
		return TopicEntityToDto(topics);
	}

	@Override
	public TopicDto getTopicByID(String Id) {
		// TODO Auto-generated method stub
		return TopicEntityToDto(topicRepository.findById(Id).get());
	}

	@Override
	public void updatedTopic(TopicDto topicDto) {
		// TODO Auto-generated method stub
		topicRepository.saveAndFlush(TopicDtoToEntity(topicDto));

	}

	@Override
	public void deleteTopicByID(String Id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(Id);

	}

	@Override
	public void addTopic(TopicDto topicDto) {
		topicRepository.save(TopicDtoToEntity(topicDto));
	}

}
