package com.example.clinica.odontologica.repository;

import com.example.clinica.odontologica.model.Odontologo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends CrudRepository<Odontologo, Integer> {
}
