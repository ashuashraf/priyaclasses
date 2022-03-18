package com.training.crudoperation;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.training.crudoperation.controller.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	 public List<Course>  findByTopicId(String topicId);

}