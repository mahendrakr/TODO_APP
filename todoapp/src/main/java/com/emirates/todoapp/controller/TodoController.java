package com.emirates.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.emirates.todoapp.model.UserStory;
import com.emirates.todoapp.service.TodoServices;

@Controller
@RequestMapping("/")
public class TodoController {
	@Autowired
	private TodoServices todoServices;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test() {
		System.out.println("Hello");
          return "index";
	}

	@RequestMapping(value = "/addTask", method = RequestMethod.POST, consumes = "application/json")
	public void addTask(@RequestBody UserStory userStory) {
		System.out.println(userStory);
		todoServices.saveTask(userStory);
	}

	@RequestMapping(value = "updateTask", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<String> updateTask(@RequestBody UserStory userStory) {
		todoServices.updateTask(userStory);
		return new ResponseEntity<String>("Updated Successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "deleteTask/{storyId}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> deleteTask(@PathVariable int storyId) {
		System.out.println("StoryId:"+storyId);
		todoServices.deleteTask(storyId);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "pendingTask", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<UserStory>> getAllPendingTask() {
		return new ResponseEntity<List<UserStory>>(todoServices.getAllPendingTask(), HttpStatus.OK);
	}

	@RequestMapping(value = "completeTask", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<UserStory>> getAllCompletedTask() {
		return new ResponseEntity<List<UserStory>>(todoServices.getAllCompletedTask(), HttpStatus.OK);
	}

}
