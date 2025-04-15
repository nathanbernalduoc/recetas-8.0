package com.grupo10.sumativa2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo10.sumativa2.model.Receta;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Long> {

}
