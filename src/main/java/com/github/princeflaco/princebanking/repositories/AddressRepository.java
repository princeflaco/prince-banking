package com.github.princeflaco.princebanking.repositories;

import com.github.princeflaco.princebanking.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}