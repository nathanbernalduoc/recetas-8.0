package com.grupo10.sumativa2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupo10.sumativa2.model.RecetaIngrediente;
import com.grupo10.sumativa2.repository.RecetaIngredienteRepository;

@Service
public class RecetaIngredienteServiceImpl implements RecetaIngredienteService {

    @Autowired
    RecetaIngredienteRepository recetaIngredienteRepository;

    @Override
    public List<RecetaIngrediente> getByIdReceta(Long idReceta) {
        return recetaIngredienteRepository
        .findByIdReceta(idReceta);
    }

}
