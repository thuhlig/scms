package de.c4u.scms.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer extends AbstractEntity {

    private String firstName;

    private String lastName;

    private String mobil;

    private String address;

    private String email;

    private String internalCode;
}
