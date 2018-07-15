package com.gslab.scopedemo.model;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="singleton")
public class Message {
	private int id;
	private String message;
	private Date date;
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Message(int id, String message, Date date) {
		this.id = id;
		this.message = message;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", date=" + date + "]";
	}
	
}
