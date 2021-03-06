package com.poc.petbook.Entities;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Users {

	@Field
	private ObjectId _id;
	@Field
	private String username;
	@Field
	private String password;
	
	public Users() {
		
	}
	
	public Users(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [_id=" + _id + ", username=" + username + ", password=" + password + "]";
	}
	
}
