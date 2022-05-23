package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService {
    @Autowired
    PostRepository repository;
    //LIST
    public List<Post> postList(){
        return repository.findAll();
    }
    //CREATE
    public Post savePost(Post post){
        return repository.save(post);
    }
    // READ
    public Post readById(int id){
        return repository.findById(id).orElse(null);
    }
    //UPDATE
    public Post updatePost(Post post, int id){
        Post existPost = repository.findById(id).orElse(null);
        existPost.setTitle(post.getTitle());
        existPost.setText(post.getText());
        return repository.save(existPost);
    }
    // DELETE
    public String deletePost(int id){
        repository.deleteById(id);
        return "Удалено";

    }
}
