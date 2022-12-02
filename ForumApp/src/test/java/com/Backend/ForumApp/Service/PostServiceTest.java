package com.Backend.ForumApp.Service;

import com.Backend.ForumApp.Models.Post;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostServiceTest {

    @Autowired
    PostService service;
    private List<Post> fPostList1 = new ArrayList<>();
    private List<Post> fPostList2 = new ArrayList<>();
    private List<Post> fPostList3 = new ArrayList<>();
    Post pst0 = null;
    Post pst1 = new Post("1", "Default message", null, 4, "Tittle1");
    Post pst2 = new Post("5", "fuck", null, 8, "Tittle2");
    Post pst3 = new Post("1", "Default message", null, 44, "Tittle3");
    Post pst4 = new Post("5", "Default message", null, 005, "Tittle1");

    @BeforeEach
    void initTest() {
        fPostList2.add(pst1);
        fPostList3.add(pst1);
        fPostList3.add(pst2);
        fPostList3.add(pst3);
        System.out.println("\n\tStarting tests......\n");
    }

    @AfterEach
    void endTest() {
        System.out.println("\n\tEnding tests......\n");
        service.getAllPosts().clear();
    }
    @Test
    void getAllPosts() {
        assertEquals(fPostList1, service.getAllPosts());
        service.createPost(pst1);
        assertEquals(1, service.getAllPosts().size());
        assertEquals(fPostList2, service.getAllPosts());

    }

    @Test
    void createPost() {
        assertEquals(0, service.getAllPosts().size());
        service.createPost(pst1);
        assertEquals(1, service.getAllPosts().size());
        assertEquals(fPostList2, service.getAllPosts());
    }

    @Test
    void deletePost() {

    }

    @Test
    void checkMessage() {
        assertTrue(service.checkMessage(pst1));
        assertFalse(service.checkMessage(pst2));
    }

    @Test
    void checkTittle() {
        assertTrue(service.checkTittle(pst1));
        assertFalse(service.checkTittle(pst4));
    }
}