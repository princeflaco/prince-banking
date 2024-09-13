package com.github.princeflaco.princebanking.repositories;

import com.github.princeflaco.princebanking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}