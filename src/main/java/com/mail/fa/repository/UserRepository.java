package com.mail.fa.repository;

import com.mail.fa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    boolean existsByEmailId(final String emailId);

    Optional<User> findByEmailId(final String emailId);
    Optional<User> findById(final UUID uuid);

}
