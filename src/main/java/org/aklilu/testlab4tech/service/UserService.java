package org.aklilu.testlab4tech.service;

import org.aklilu.testlab4tech.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService  {
    public User saveUser(User user);
    public List<User> getAllUsers();
    public User getUserById(Long id);
    public boolean deleteUserById(Long id);
    public User updateUser(User updateUser);


}
