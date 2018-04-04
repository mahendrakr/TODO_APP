package com.emirates.todoapp.model;

public class UserStory {
	private int storyId;
	private String discription;
	private String status;

	public UserStory() {
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
