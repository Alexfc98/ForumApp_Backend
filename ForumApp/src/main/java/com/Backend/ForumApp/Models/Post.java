package com.Backend.ForumApp.Models;

import java.awt.Image;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {

	private String  postCategorie;
	private String message;
	private Image image;
	private int id;
	private String tittle;
	
	
}
