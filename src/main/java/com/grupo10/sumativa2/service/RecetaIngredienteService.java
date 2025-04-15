package com.grupo10.sumativa2.service;

import java.util.List;
import com.grupo10.sumativa2.model.RecetaIngrediente;

public interface RecetaIngredienteService {

    public List<RecetaIngrediente> getByIdReceta(Long idReceta);

}
