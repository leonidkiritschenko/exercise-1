package com.leonid.exercise1.service;

import com.leonid.exercise1.model.Post;
import com.leonid.exercise1.sdu.JsonPlaceholderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private JsonPlaceholderClient client;

    public List<Post> getPosts() {
        return client.getPosts();
    }

    public Post getPost(Long id) {
        return client.getPost(id).get(0);
    }
}
