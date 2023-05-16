package de.c4u.scms.persistence.service;

import de.c4u.scms.persistence.entity.User;

public interface UserService {

    User create(String username, String password);
}
