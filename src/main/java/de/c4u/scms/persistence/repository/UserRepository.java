package de.c4u.scms.persistence.repository;

import de.c4u.scms.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, InternalError> {

    Optional<User> findByUsername(String username);
}
