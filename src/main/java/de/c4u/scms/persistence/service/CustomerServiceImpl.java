package de.c4u.scms.persistence.service;

import de.c4u.scms.persistence.entity.Customer;
import de.c4u.scms.persistence.projection.CustomerProjection;
import de.c4u.scms.persistence.repository.CustomerRepository;
import de.c4u.scms.web.dto.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return this.customerRepository.findAll();
    }

    public List<CustomerProjection> getAllAsProjection() {
        return this.customerRepository.getAllAsProjection();
    }

    public Optional<Customer> getOneById(Integer id) {
        return this.customerRepository.findById(id);
    }

    public Customer create(CustomerRequest data) {
        var customer = new Customer();
        customer.setFirstName(data.firstName());
        customer.setLastName(data.lastName());
        customer.setMobil(data.mobil());
        customer.setAddress(data.address());
        customer.setEmail(data.email());
        customer.setInternalCode(data.internalCode());

        return this.customerRepository.save(customer);
    }

    public void delete(Integer id) {
        this.customerRepository.deleteById(id);
    }
}
