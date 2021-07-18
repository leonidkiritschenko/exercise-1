package com.leonid.exercise1.api;

import com.leonid.exercise1.model.Post;
import com.leonid.exercise1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping("/posts")
    ResponseEntity<List<Post>> getPosts() {
        return ResponseEntity.ok(service.getPosts());
    }

    @GetMapping("/posts/{id}")
    ResponseEntity<Post> getPost(Long id) {
        return ResponseEntity.ok(service.getPost(id));
    }
}
