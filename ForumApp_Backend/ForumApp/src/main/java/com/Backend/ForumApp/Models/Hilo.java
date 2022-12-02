package com.Backend.ForumApp.Models;

public class Hilo {
	
	private Post post;
	private String hiloCategorie;
	
	public String getHiloCategorie() {
		return hiloCategorie;
	}


	public void setHiloCategorie(String hiloCategorie) {
		this.hiloCategorie = hiloCategorie;
	}


	public Hilo(Post post) {
		super();
		this.post = post;
	}
	

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
