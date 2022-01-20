package by.restaurant.service;


import by.restaurant.entity.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User usersDto);

    boolean deleteUser(Long userId);

    User findByLogin(String login);

    List<User> findAll();

     List<User> usergtList(Long idMin);
}

