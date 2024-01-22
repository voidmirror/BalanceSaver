package org.voidmirror.own.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "authorities")
public class Authority {

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
    @ManyToMany(mappedBy = "authorities")
    private Collection<Role> roles;

}
