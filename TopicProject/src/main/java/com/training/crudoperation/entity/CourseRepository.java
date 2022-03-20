package com.training.crudoperation.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.training.crudoperation.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

	 public List<Course>  findByTopicId(String topicId);

}