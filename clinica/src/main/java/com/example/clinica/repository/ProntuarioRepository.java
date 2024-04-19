package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clinica.entity.Prontuario;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, Integer >{

}
