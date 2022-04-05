package org.aklilu.testlab4tech.service;

import org.aklilu.testlab4tech.model.User;
import org.aklilu.testlab4tech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(User updateUser) {
        User existingUser = userRepository.findById(updateUser.getId()).orElse(null);
        existingUser.setUserName(updateUser.getUserName());
        existingUser.setFirstName(updateUser.getFirstName());
        existingUser.setLastName(updateUser.getLastName());
        existingUser.setEmail(updateUser.getEmail());
        return userRepository.save(existingUser);
    }

    @Override
    public boolean deleteUserById(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
