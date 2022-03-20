package com.training.crudoperation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.crudoperation.entity.TopicRepository;
import com.training.crudoperation.model.Topic;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
 
    
	/*
	 * List<Topic> topicList = new ArrayList<>(Arrays.asList( new Topic("1", "java",
	 * "basic topics of java"), new Topic("5", "python", "loops for python")));
	 */

    public  List<Topic>  getAllTopics(){
    	List<Topic> topiclist=new ArrayList<>();
    	topicRepository.findAll().forEach(topiclist::add);
    	return topiclist;
      //  return topicList;
    }
    
    public  Topic  getTopic(String id){
    	return topicRepository.findById(id).get();
  //  return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    
    public  void  addTopic(Topic topic){
       topicRepository.save(topic);
    	// topicList.add(topic);
    }
    
    public  void  updateTopic(String id,Topic topic){
		
    	topicRepository.save(topic);
    	
    	/*
		 * for(int i = 0; i<topicList.size(); i++) { Topic t = topicList.get(i);
		 * if(t.getId().equals(id)) { topicList.set(i, topic); } }
		 */
    }

	public void deleteTopic(String id) {
		 
		topicRepository.deleteById(id);
		
		// topicList.removeIf(t -> t.getId().equals(id));
	}
}