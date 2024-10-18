package com.pablomerinas.miett.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablomerinas.miett.persistence.model.EmployeeEntity;

@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeEntity, Long>{

}
