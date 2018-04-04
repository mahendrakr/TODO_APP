package com.emirates.todoapp.mapper.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.emirates.todoapp.domain.UserStoryJpa;
import com.emirates.todoapp.mapper.DataMapper;
import com.emirates.todoapp.model.UserStory;

@Component
public class DataMapperImpl implements DataMapper {
	private static final Logger LOGGER = LoggerFactory.getLogger(DataMapperImpl.class);

	@Override
	public UserStoryJpa mapUserStory2UserStoryJpa(UserStory userStory) {
		UserStoryJpa userStoryJpa = new UserStoryJpa();
		BeanUtils.copyProperties(userStory, userStoryJpa);
		LOGGER.info("userStoryJpa :{}", userStoryJpa);
		return userStoryJpa;
	}

	@Override
	public UserStory mapUserStoryJpa2UserStory(UserStoryJpa userStoryJpa) {
		UserStory userStory = new UserStory();
		BeanUtils.copyProperties(userStoryJpa, userStory);
		return userStory;
	}

	@Override
	public List<UserStory> mapUserStoryJpa2UserStory(List<UserStoryJpa> userStoryJpaList) {
		List<UserStory> userStoryList = new ArrayList<>();
		userStoryJpaList.forEach(userStoryJpa -> {
			UserStory userStory = new UserStory();
			BeanUtils.copyProperties(userStoryJpa, userStory);
			userStoryList.add(userStory);
		});

		return userStoryList;
	}

}
