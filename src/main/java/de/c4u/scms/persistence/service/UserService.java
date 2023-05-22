package de.c4u.scms.persistence.service;

import de.c4u.scms.persistence.entity.User;

import java.util.List;

public interface UserService {

    List<User> getALl();

    User create(String username, String password);
}
