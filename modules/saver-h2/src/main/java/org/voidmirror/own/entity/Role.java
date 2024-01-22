package org.voidmirror.own.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "roles")
public class Role {

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
    private String name;
    @Getter
    @Setter
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
    @Getter
    @Setter
    @ManyToMany
    @JoinTable(
            name = "roles_authorities",
            joinColumns = @JoinColumn(name = "role_uid", referencedColumnName = "uid"),
            inverseJoinColumns = @JoinColumn(name = "authorities_uid", referencedColumnName = "uid")
    )
    private Collection<Authority> authorities;

}
