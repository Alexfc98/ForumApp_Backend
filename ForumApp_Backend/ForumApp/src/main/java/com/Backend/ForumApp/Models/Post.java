package com.Backend.ForumApp.Models;

import java.awt.Image;

public class Post {

	private String  postCategorie;
	private String message;
	private Image image;
	private int id;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public Post(String postCategorie, String message, Image image, int id) {
		super();
		this.postCategorie = postCategorie;
		this.message = message;
		this.image = image;
		this.id = id;
	}


	public String getPostCategorie() {
		return postCategorie;
	}
	public void setPostCategorie(String postCategorie) {
		this.postCategorie = postCategorie;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
}
