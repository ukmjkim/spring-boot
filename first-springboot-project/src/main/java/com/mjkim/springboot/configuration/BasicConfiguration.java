package com.mjkim.springboot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("basic")
public class BasicConfiguration {
	private boolean value;
	private String message;
	private int number;

	/**
	 * @return the value
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(boolean value) {
		this.value = value;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

}
