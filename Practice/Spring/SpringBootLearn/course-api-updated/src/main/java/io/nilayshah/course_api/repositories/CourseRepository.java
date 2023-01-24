package io.nilayshah.course_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nilayshah.course_api.entities.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

}
