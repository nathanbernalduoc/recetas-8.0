package com.grupo10.sumativa2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grupo10.sumativa2.model.RecetaIngrediente;

@Repository
public interface RecetaIngredienteRepository extends JpaRepository<RecetaIngrediente, Long> {

    public List<RecetaIngrediente> findByIdReceta(Long idReceta);

}
