package com.pagina.Proyecto.Final.service;

import com.pagina.Proyecto.Final.dto.UsuarioActualizarRequest;
import com.pagina.Proyecto.Final.dto.UsuarioCrearRequest;
import com.pagina.Proyecto.Final.dto.UsuarioResponse;
import java.util.List;

public interface UsuarioService {

  UsuarioResponse crearUsuario(UsuarioCrearRequest request);

  List<UsuarioResponse> obtenerTodosLosUsuarios();

  UsuarioResponse obtenerUsuarioPorId(Long id);

  UsuarioResponse actualizarUsuario(Long id, UsuarioActualizarRequest request);

  void eliminarUsuario(Long id);

}
