package com.grupo10.sumativa2.service;

import java.util.Optional;
import com.grupo10.sumativa2.model.Usuario;

public interface UsuarioService {

    Optional<Usuario> getByUsuario(String usuario);

}
