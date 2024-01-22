package org.voidmirror.own.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voidmirror.own.entity.Role;

import java.util.UUID;

public interface RolesRepository extends JpaRepository<Role, UUID> {
}
