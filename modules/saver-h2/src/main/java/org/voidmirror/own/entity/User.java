package org.voidmirror.own.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Getter
    @Setter
    private UUID uid;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String midName;
    @Getter
    @Setter
    private LocalDate birthDate;
    @Getter
    @Setter
    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "role_uid", referencedColumnName = "uid"),
            inverseJoinColumns = @JoinColumn(name = "user_uid", referencedColumnName = "uid")
    )
    private Collection<Role> roles;



}
