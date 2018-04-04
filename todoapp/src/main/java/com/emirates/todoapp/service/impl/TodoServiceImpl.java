package com.emirates.todoapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emirates.todoapp.domain.UserStoryJpa;
import com.emirates.todoapp.jpa.repository.TodoAppJpaRepository;
import com.emirates.todoapp.mapper.DataMapper;
import com.emirates.todoapp.model.UserStory;
import com.emirates.todoapp.service.TodoServices;

@Service
public class TodoServiceImpl implements TodoServices {
	@Autowired
	private TodoAppJpaRepository todoAppRepository;
	@Autowired
	private DataMapper dataMapper;

	@Override
	public void saveTask(UserStory userStory) {
		
		UserStoryJpa userStoryJpa = dataMapper.mapUserStory2UserStoryJpa(userStory);
		System.out.println(userStoryJpa);
		todoAppRepository.save(userStoryJpa);

	}

	@Override
	public void updateTask(UserStory userStory) {
		System.out.println("StoryId: " + userStory.getStoryId());
		UserStoryJpa userStoryJpa = todoAppRepository.getOne(userStory.getStoryId());
		userStoryJpa.setStatus(userStory.getStatus());
		userStoryJpa.setDiscription(userStory.getDiscription());
		todoAppRepository.save(userStoryJpa);

	}

	@Override
	public void deleteTask(int storyId) {
		todoAppRepository.deleteById(storyId);

	}

	@Override
	public List<UserStory> getAllPendingTask() {
		return dataMapper.mapUserStoryJpa2UserStory(todoAppRepository.findByStatus("Pending"));
	}

	@Override
	public List<UserStory> getAllCompletedTask() {

		return dataMapper.mapUserStoryJpa2UserStory(todoAppRepository.findByStatus("Completed"));
	}

}
