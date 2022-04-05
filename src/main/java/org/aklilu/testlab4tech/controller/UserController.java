package org.aklilu.testlab4tech.controller;

import org.aklilu.testlab4tech.model.User;
import org.aklilu.testlab4tech.service.UserService;
import org.aklilu.testlab4tech.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        System.out.println(id);
        return userService.getUserById(id);
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUserByUser(@PathVariable Long id) {
        return userService.deleteUserById(id);
    }
}
