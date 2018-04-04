package com.emirates.todoapp.mapper;

import java.util.List;

import com.emirates.todoapp.domain.UserStoryJpa;
import com.emirates.todoapp.model.UserStory;

public interface DataMapper {
	
	public UserStoryJpa mapUserStory2UserStoryJpa(UserStory userStory);
	public UserStory mapUserStoryJpa2UserStory(UserStoryJpa userStoryJpa);
	public List<UserStory> mapUserStoryJpa2UserStory(List<UserStoryJpa> userStoryJpa);

}
