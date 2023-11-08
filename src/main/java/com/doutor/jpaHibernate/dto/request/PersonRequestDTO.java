package com.doutor.jpaHibernate.dto.request;

import com.doutor.jpaHibernate.entity.Person;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRequestDTO {
    private String name;
    private String email;

    @Builder
    public PersonRequestDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
