package com.Backend.ForumApp.Data;

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
class PostDataTest {
    @Autowired
    PostData data;
    private List<Post> PostList1 = new ArrayList<>();
    private List<Post> PostList2 = new ArrayList<>();
    Post pst1 = new Post("1", "This is my first messagge on a Post", null, 001, "firstPost");


    @BeforeEach
    void initTest() {
        PostList2.add(pst1);
        System.out.println("\n\tStarting tests......\n");
    }

    @AfterEach
    void endTest() {
        System.out.println("\n\tEnding tests......\n");
        data.getPostList().clear();
    }
    @Test
    void getPostList() {
        assertEquals(PostList1, data.getPostList());
        data.savePost(pst1);
        assertEquals(1, data.getPostList().size());
        assertEquals(PostList2, data.getPostList());
    }

    @Test
    void savePost() {
        data.savePost(pst1);
        assertEquals(1, data.getPostList().size());
    }

    @Test
    void deletePost() {
    }
}