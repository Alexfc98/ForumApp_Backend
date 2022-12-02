package com.Backend.ForumApp.Data;

import java.util.ArrayList;
import java.util.List;

import com.Backend.ForumApp.Models.Hilo;
import com.Backend.ForumApp.Models.Post;

public class PostData {

	private static  List<Post> PostList = new ArrayList<>();
	
	public static List<Post> getPostList() {
		return PostList;
	}
	
	public static void savePost(Post p) {
		PostList.add(p);
	}
	
	public static void deletePost(Post p) {
		PostList.remove(p);
	}
	
	
}
