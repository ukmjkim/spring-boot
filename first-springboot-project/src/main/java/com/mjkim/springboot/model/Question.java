package com.mjkim.springboot.model;

import java.util.List;

public class Question {
	private String id;
	private String description;
	private String correctAnswer;
	private List<String> options;

	// Needed by Caused by: com.fasterxml.jackson.databind.JsonMappingException:
	// Can not construct instance of com.in28minutes.springboot.model.Question:
	// no suitable constructor found, can not deserialize from Object value
	// (missing default constructor or creator, or perhaps need to add/enable
	// type information?)
	public Question() {

	}

	/**
	 * @param id
	 * @param description
	 * @param correctAnswer
	 * @param options
	 */
	public Question(String id, String description, String correctAnswer, List<String> options) {
		super();
		this.id = id;
		this.description = description;
		this.correctAnswer = correctAnswer;
		this.options = options;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the correctAnswer
	 */
	public String getCorrectAnswer() {
		return correctAnswer;
	}

	/**
	 * @param correctAnswer
	 *            the correctAnswer to set
	 */
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	/**
	 * @return the options
	 */
	public List<String> getOptions() {
		return options;
	}

	/**
	 * @param options
	 *            the options to set
	 */
	public void setOptions(List<String> options) {
		this.options = options;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [id=" + id + ", description=" + description + ", correctAnswer=" + correctAnswer + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
