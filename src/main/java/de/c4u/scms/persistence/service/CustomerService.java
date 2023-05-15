package de.c4u.scms.persistence.service;

import de.c4u.scms.persistence.entity.Customer;
import de.c4u.scms.persistence.projection.CustomerProjection;
import de.c4u.scms.web.dto.CustomerRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getAll();

    List<CustomerProjection> getAllAsProjection();

    Optional<Customer> getOneById(@PathVariable Integer id);

    Customer create(@RequestBody CustomerRequest data);

    void delete(@PathVariable Integer id);
}
