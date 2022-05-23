package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PostController {
    @Autowired
    PostService service;
    @GetMapping("/")
    public List<Post> postList(){
        return service.postList();
    }
    @PostMapping("/create")
    public Post postCreate(@RequestBody Post post){
        return service.savePost(post);
    }
    @GetMapping("/post{id}")
    public Post postRead(@PathVariable int id){
        return service.readById(id);
    }
    @PutMapping("/update/id")
    public Post updatePost(@PathVariable int id, @RequestBody Post post){
        return service.updatePost(post,id);
    }
    @PostMapping("/delete/{id}")
    public String deletePost(@PathVariable int id){
        return service.deletePost(id);
    }
}
