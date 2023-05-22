package de.c4u.scms.web;

import de.c4u.scms.persistence.entity.Customer;
import de.c4u.scms.persistence.projection.CustomerProjection;
import de.c4u.scms.persistence.service.CustomerService;
import de.c4u.scms.web.dto.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll() {
        return this.customerService.getAll();
    }

    @GetMapping("/projections")
    public List<CustomerProjection> getAllAsProjection() {
        return this.customerService.getAllAsProjection();
    }

    @GetMapping("/{id}")
    public Customer getOneById(@PathVariable Long id) {
        return this.customerService.getOneById(id).orElseThrow();
    }

    @PostMapping
    public Customer create(@RequestBody CustomerRequest data) {
        return this.customerService.create(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.customerService.delete(id);
    }
}
