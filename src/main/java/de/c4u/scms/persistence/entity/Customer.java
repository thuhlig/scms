package de.c4u.scms.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity {

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;

    @Column(name = "mobil", length = 100)
    private String mobil;

    @Column(name = "address", length = 500)
    private String address;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "internal_code", length = 10)
    private String internalCode;
}
