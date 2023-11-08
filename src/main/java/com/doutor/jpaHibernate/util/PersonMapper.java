package com.doutor.jpaHibernate.util;

import com.doutor.jpaHibernate.dto.request.PersonRequestDTO;
import com.doutor.jpaHibernate.dto.response.PersonResponseDTO;
import com.doutor.jpaHibernate.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonMapper {

    public static Person toPerson(PersonResponseDTO personResponse){
        return Person.builder()
                .name(personResponse.getName())
                .email(personResponse.getEmail())
                .build();
    }

    public static Person toPerson(PersonRequestDTO personRequest){
        return Person.builder()
                .name(personRequest.getName())
                .email(personRequest.getEmail())
                .build();
    }

    public static PersonResponseDTO toPersonResponse(Person person){
        return PersonResponseDTO.builder()
                .id(person.getId())
                .name(person.getName())
                .email(person.getEmail())
                .build();
    }

    public static PersonRequestDTO toPersonRequest(Person person){
        return PersonRequestDTO.builder()
                .name(person.getName())
                .email(person.getEmail())
                .build();
    }

    public static List<PersonResponseDTO> toListPersonResponse(List<Person> person){
        return person.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
    }

    public static void toUpdatePerson(Person person, PersonRequestDTO personRequestDTO){
        person.setEmail(personRequestDTO.getEmail());
        person.setName(personRequestDTO.getName());
    }

}
