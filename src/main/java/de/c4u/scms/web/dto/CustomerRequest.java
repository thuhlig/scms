package de.c4u.scms.web.dto;

public record CustomerRequest(String firstName,
                              String lastName,
                              String mobil,
                              String address,
                              String email,
                              String internalCode) {
}
