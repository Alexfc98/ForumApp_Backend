package com.Backend.ForumApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Backend.ForumApp.Models.Post;
import com.Backend.ForumApp.Service.PostService;

@RestController
@CrossOrigin()
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
	PostService service;
	
	@GetMapping
	public ResponseEntity<List<Post>> getAllPosts() {
	    List<Post> list = service.getAllPosts();

	    return new ResponseEntity<List<Post>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Post> createPost(@RequestBody Post myItem){
		Post created = service.createPost(myItem);

	    return new ResponseEntity<Post>(created, new HttpHeaders(), HttpStatus.OK);
	}
}
