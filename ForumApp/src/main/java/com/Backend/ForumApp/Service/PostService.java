package com.Backend.ForumApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Backend.ForumApp.Data.HiloData;
import com.Backend.ForumApp.Data.PostData;
import com.Backend.ForumApp.Models.Hilo;
import com.Backend.ForumApp.Models.Post;


@Service
public class PostService {

	 public List<Post> getAllPosts()
	    {
	        List<Post> list = PostData.getPostList();

	        if(list.size() > 0) {
	            return list;
	        } else {
	            return new ArrayList<Post>();
	        }
	    }

	 public Post createPost(Post entity){
	        PostData.savePost(entity);
			return entity;   
	    }
	
	 public void deletePost(Post p) {
		 PostData.deletePost(p);
	 }
	  
}
