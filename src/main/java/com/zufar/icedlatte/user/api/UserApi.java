package com.zufar.icedlatte.user.api;

import com.zufar.icedlatte.openapi.dto.UserDto;
import com.zufar.icedlatte.security.dto.UserRegistrationRequest;
import com.zufar.icedlatte.user.exception.UserNotFoundException;

import java.util.UUID;

public interface UserApi {

    /**
     * Method enables to save user with the details from saveUserRequest
     *
     * @param saveUserRequest the request to save a new user with the information from saveUserRequest
     * @return UserDto the information about a new user
     */
    UserDto saveUser(final UserRegistrationRequest saveUserRequest);

    /**
     * Method enables to get user with the provided userId
     *
     * @param userId the id to get a specific user
     * @return UserDto the information about user with given userId
     * @throws UserNotFoundException if there is no user in the database with the provided userId
     */
    UserDto getUserById(final UUID userId) throws UserNotFoundException;
}
