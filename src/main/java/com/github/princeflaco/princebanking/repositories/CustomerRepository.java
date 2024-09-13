package com.github.princeflaco.princebanking.repositories;

import com.github.princeflaco.princebanking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}