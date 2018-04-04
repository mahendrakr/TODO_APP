package com.emirates.todoapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TODO_TASK")
public class UserStoryJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STORY_ID")
	private int storyId;
	@Column(name = "DISCRIPTION")
	private String discription;
	@Column(name = "STATUS")
	private String status;

	public UserStoryJpa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserStory [storyId=" + storyId + ", discription=" + discription + ", status=" + status + "]";
	}

}
