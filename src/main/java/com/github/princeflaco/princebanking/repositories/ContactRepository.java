package com.github.princeflaco.princebanking.repositories;

import com.github.princeflaco.princebanking.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}