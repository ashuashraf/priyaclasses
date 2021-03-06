package com.training.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.crudoperation.model.Topic;
import com.training.crudoperation.service.TopicService;

@RestController
public class TopicController {
    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTheTopics() {
        return topicService.getAllTopics();
    }
    @RequestMapping("/topics/{foo}")
    public Topic getTopic(@PathVariable("foo") String id) {
        return topicService.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {//pick instance from req body
        topicService.addTopic(topic);   // calling service method for business logic
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
         topicService.updateTopic(id,topic);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
         topicService.deleteTopic(id);
    }
}