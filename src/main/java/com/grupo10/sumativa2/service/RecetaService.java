package com.grupo10.sumativa2.service;

import java.util.List;
import java.util.Optional;

import com.grupo10.sumativa2.model.Receta;

public interface RecetaService {

    public List<Receta> getAllRecetas();
    public Optional<Receta> getByIdReceta(Long id);

}
