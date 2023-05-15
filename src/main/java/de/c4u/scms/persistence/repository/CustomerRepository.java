package de.c4u.scms.persistence.repository;

import de.c4u.scms.persistence.entity.Customer;
import de.c4u.scms.persistence.projection.CustomerProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("select c from Customer c")
    List<CustomerProjection> getAllAsProjection();
}
