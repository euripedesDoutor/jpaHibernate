package com.doutor.jpaHibernate.service;

import com.doutor.jpaHibernate.dto.request.PersonRequestDTO;
import com.doutor.jpaHibernate.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update(PersonRequestDTO personRequestDTO, Long id);
    String delete(Long id);
}
