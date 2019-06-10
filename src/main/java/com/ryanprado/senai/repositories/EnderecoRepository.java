package com.ryanprado.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ryanprado.senai.domain.Endereço;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereço, Integer>{

}
