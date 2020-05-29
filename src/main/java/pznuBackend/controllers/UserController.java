package pznuBackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pznuBackend.model.User;
import pznuBackend.services.UserService;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

/*
   @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
*/

/*
    @GetMapping("/userById/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
*/

    @GetMapping("/userByLogin/{login}")
    public User userByLogin(@PathVariable String login) {
        return userService.userByLogin(login);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

}
