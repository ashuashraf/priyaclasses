package com.training.crudoperation.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.crudoperation.entity.CourseRepository;
import com.training.crudoperation.model.Course;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
 
    
	/*
	 * List<Topic> topicList = new ArrayList<>(Arrays.asList( new Topic("1", "java",
	 * "basic topics of java"), new Topic("5", "python", "loops for python")));
	 */

	public  List<Course>  getAllCourses(String topicId){
//		return topicList;
		List<Course> courseList = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courseList::add);
		return courseList;
		
	}
    
    public  Course  getCourse(String id){
    	return courseRepository.findById(id).get();
  //  return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    
    public  void  addCourse(Course course){
    	courseRepository.save(course);
    	// topicList.add(topic);
    }
    
    public  void  updateCourse(String id,Course course){
		
    	courseRepository.save(course);
    	
    	/*
		 * for(int i = 0; i<topicList.size(); i++) { Topic t = topicList.get(i);
		 * if(t.getId().equals(id)) { topicList.set(i, topic); } }
		 */
    }

	public void deleteCourse(String id) {
		 
		courseRepository.deleteById(id);
		
		// topicList.removeIf(t -> t.getId().equals(id));
	}

	 
}
