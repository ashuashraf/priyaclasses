package com.training.crudoperation.entity;

import org.springframework.data.repository.CrudRepository;

import com.training.crudoperation.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
