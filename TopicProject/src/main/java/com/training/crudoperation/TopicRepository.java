package com.training.crudoperation;

import org.springframework.data.repository.CrudRepository;

import com.training.crudoperation.controller.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
