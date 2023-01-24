package io.nilayshah.course_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nilayshah.course_api.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, String> {

}
