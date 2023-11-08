package com.doutor.jpaHibernate.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_person")
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Builder
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
