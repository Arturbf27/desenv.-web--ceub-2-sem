package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clinica.entity.Curriculo;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Integer>{

	
}
