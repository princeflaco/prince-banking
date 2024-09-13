package com.github.princeflaco.princebanking.repositories;

import com.github.princeflaco.princebanking.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}