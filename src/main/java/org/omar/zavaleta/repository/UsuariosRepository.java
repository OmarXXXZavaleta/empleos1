package org.omar.zavaleta.repository;

import org.omar.zavaleta.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
