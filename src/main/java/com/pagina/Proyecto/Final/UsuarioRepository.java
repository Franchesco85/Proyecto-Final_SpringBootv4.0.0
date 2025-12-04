package com.pagina.Proyecto.Final;


import com.pagina.Proyecto.Final.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

 // Verificar si ya existe un usuario con este email en la BBDD
 boolean existsByEmail(String email);
}
