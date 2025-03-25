package me.dio.api_rest.service;

import me.dio.api_rest.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}