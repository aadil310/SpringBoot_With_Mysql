package com.sprin_practice.spring.Repo;

import com.sprin_practice.spring.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<EmployeeEntity,Integer>{
    
}
