package com.emirates.todoapp.service;

import java.util.List;

import com.emirates.todoapp.model.UserStory;

public interface TodoServices {
	public void saveTask(UserStory userStory);
	public void updateTask(UserStory userStory);
	
	public void deleteTask(int storyId);
	public List<UserStory> getAllPendingTask();
	public List<UserStory> getAllCompletedTask();

}
