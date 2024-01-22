package org.voidmirror.own.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voidmirror.own.entity.User;

import java.util.UUID;

public interface UsersRepository extends JpaRepository<User, UUID> {
}
