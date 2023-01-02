package org.sarsandi.rajeev.validationdemo.service;

import org.sarsandi.rajeev.validationdemo.dto.UserRequest;
import org.sarsandi.rajeev.validationdemo.entity.User;
import org.sarsandi.rajeev.validationdemo.exception.UserNotFoundException;
import org.sarsandi.rajeev.validationdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public User saveUser(UserRequest userRequest) {

        User user = User.build(0, userRequest.getUserName(), userRequest.getEmail(), userRequest.getPhoneNo(), userRequest.getNationality());

        return userRepository.save(user);
    }

    public List<User> fetchAllUser() {

        return userRepository.findAll();
    }

    public User fetchUserByID(int userId) throws UserNotFoundException{

        User user = userRepository.findByUserId(userId);
        if (user != null) {
            return user;
        } else
            throw new UserNotFoundException("User not found in {}" + userId);
    }
}
