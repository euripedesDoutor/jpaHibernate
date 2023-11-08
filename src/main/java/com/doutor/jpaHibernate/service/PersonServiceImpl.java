package com.doutor.jpaHibernate.service;

import com.doutor.jpaHibernate.dto.request.PersonRequestDTO;
import com.doutor.jpaHibernate.dto.response.PersonResponseDTO;
import com.doutor.jpaHibernate.entity.Person;
import com.doutor.jpaHibernate.repository.PersonRepository;
import com.doutor.jpaHibernate.util.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;

    @Override
    public PersonResponseDTO findById(Long id) {
        return PersonMapper.toPersonResponse(returnPerson(id));
    }

    @Override
    public List<PersonResponseDTO> findAll() {
        return PersonMapper.toListPersonResponse(personRepository.findAll());
    }

    @Override
    public PersonResponseDTO register(PersonRequestDTO personDTO) {
        Person person = PersonMapper.toPerson(personDTO);
        person = personRepository.save(person);
        return PersonMapper.toPersonResponse(person);
    }

    @Override
    public PersonResponseDTO update(PersonRequestDTO personRequestDTO, Long id) {
        Person person = returnPerson(id);
        PersonMapper.toUpdatePerson(person, personRequestDTO);
        return PersonMapper.toPersonResponse(personRepository.save(person));
    }

    @Override
    public String delete(Long id) {
        personRepository.deleteById(id);
        return "Person ID: " + id + " deleted";
    }

    private Person returnPerson(Long id){
        return personRepository.findById(id).orElseThrow(() -> new RuntimeException("Person wasn't found on database"));
    }
}
