package org.voidmirror.own.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voidmirror.own.entity.Authority;

import java.util.UUID;

public interface AuthoritiesRepository extends JpaRepository<Authority, UUID> {
}
