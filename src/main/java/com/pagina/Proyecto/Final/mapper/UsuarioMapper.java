package com.pagina.Proyecto.Final.mapper;

import com.pagina.Proyecto.Final.dto.UsuarioActualizarRequest;
import com.pagina.Proyecto.Final.dto.UsuarioCrearRequest;
import com.pagina.Proyecto.Final.dto.UsuarioResponse;
import com.pagina.Proyecto.Final.model.Usuario;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UsuarioMapper {


  // DTO crear -> Usuario
  public Usuario crearToUsuario(UsuarioCrearRequest request) {
    Usuario usuario = new Usuario();

    usuario.setNombre(request.nombre());
    usuario.setEmail(request.email());
    usuario.setFechaCreacion(LocalDateTime.now());

    return usuario; // <- faltaba esto
  }



  // DTO actualizar + Usuario = Usuario actualizado
  public Usuario actualizarToUsuario(Usuario usuario, UsuarioActualizarRequest request) {

  usuario.setNombre(request.nombre());
  usuario.setEmail(request.email());

  return usuario;
}

 // Usuario -> DTO response
  public UsuarioResponse toResponse(Usuario usuario) {

    return new UsuarioResponse(
        usuario.getId(),
        usuario.getNombre(),
        usuario.getEmail(),
        usuario.getFechaCreacion()
    );
  }
}
