package com.example.crudMoscoso.repository;

import com.example.crudMoscoso.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Persona,Long> {

}
