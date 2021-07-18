package com.leonid.exercise1.sdu;

import com.leonid.exercise1.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "jsonpPaceholderClient", url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceholderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Post> getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/posts/{id}")
    List<Post> getPost(@PathVariable("id") Long id);
}
