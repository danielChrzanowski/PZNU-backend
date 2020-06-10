package pznuBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pznuBackend.model.Post;
import pznuBackend.services.PostService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

//    @GetMapping("/postById/{id}")
//    public Post getPostById(@PathVariable int id) {
//        return postService.getPostById(id);
//    }

    @PostMapping("/addPost")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

//    @DeleteMapping("/deletePost/{id}")
//    public void deletePost(@PathVariable int id) {
//        postService.deletePost(id);
//    }

}
