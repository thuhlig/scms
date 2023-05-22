package de.c4u.scms.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(name = "username", length = 20, unique = true, nullable = false)
    private String username;

    @Column(name = "password", length = 100, nullable = false)
    private String password;
}
