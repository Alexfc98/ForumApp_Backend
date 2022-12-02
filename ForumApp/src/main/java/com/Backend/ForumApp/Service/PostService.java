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
		 if(PostService.checkMessage(entity) && PostService.checkTittle(entity)){
	        PostData.savePost(entity);
			return entity;
		 } else return null;
	    }
	
	 public void deletePost(Post p) {
		 PostData.deletePost(p);
	 }


	 public static boolean checkMessage(Post post) {
		 String[] hiddenWords = {"fuck", "kill", "bitch", "bomb", "shit", "idiot"};
		 String[] messageReceived = post.getMessage().split("\\s+");
		 for (int i = 0; i < messageReceived.length; i++) {
			 for (int j = 0; j < hiddenWords.length; j++) {
				 if (messageReceived[i].equalsIgnoreCase(hiddenWords[j])) {
					 return false;
				 }
			 }
		 }
		 return true;
	 }

	 public static boolean checkTittle(Post post){
		 List<Post> Postslist = PostData.getPostList();
		 List<String> tittlesList=new ArrayList<>();
		 for(Post a : Postslist){
			 tittlesList.add(a.getTittle());
		 }
		 if(tittlesList.contains(post.getTittle())){
			 return false;
		 }
		 else return true;
	 }

}


