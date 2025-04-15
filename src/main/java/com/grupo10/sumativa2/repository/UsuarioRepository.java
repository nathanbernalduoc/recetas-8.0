package com.grupo10.sumativa2.repository;

import com.grupo10.sumativa2.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>
{

    // public Optional<Usuario> findByUsuario(String usuario);
    Usuario findByUsuario(String username);

}
