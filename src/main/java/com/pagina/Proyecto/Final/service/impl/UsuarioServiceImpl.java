package com.pagina.Proyecto.Final.service.impl;

import com.pagina.Proyecto.Final.UsuarioRepository;
import com.pagina.Proyecto.Final.dto.UsuarioActualizarRequest;
import com.pagina.Proyecto.Final.dto.UsuarioCrearRequest;
import com.pagina.Proyecto.Final.dto.UsuarioResponse;
import com.pagina.Proyecto.Final.exception.EmailDuplicadoException;
import com.pagina.Proyecto.Final.exception.UsuarioNoEncontradoException;
import com.pagina.Proyecto.Final.mapper.UsuarioMapper;
import com.pagina.Proyecto.Final.model.Usuario;
import com.pagina.Proyecto.Final.service.UsuarioService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {

  private final UsuarioRepository usuarioRepository;
  private final UsuarioMapper usuarioMapper;

  public UsuarioServiceImpl(

  UsuarioRepository usuarioRepository,
  UsuarioMapper usuarioMapper) {

   this.usuarioRepository = usuarioRepository;
   this.usuarioMapper = usuarioMapper;
  }


  // Crear usuario
  @Override
  public UsuarioResponse crearUsuario(UsuarioCrearRequest request) {

    if (usuarioRepository.existsByEmail(request.email())) {
      throw new EmailDuplicadoException(String.format("El email '%s' no puede ser usado.", request.email()));
    }

    Usuario francisco = usuarioMapper.crearToUsuario(request);

    Usuario usuarioGuardado = usuarioRepository.save(francisco);

    return usuarioMapper.toResponse(usuarioGuardado);
  }

  // Obtener todos los usuarios
  @Override
  public List<UsuarioResponse> obtenerTodosLosUsuarios() {

                                          // List<Usuario>
    List<UsuarioResponse> listaResponse = usuarioRepository.findAll().stream()
        .map( usuario -> usuarioMapper.toResponse(usuario))
        .toList();

    return listaResponse;
  }

  // Obtener usuario por id
  @Override
  public UsuarioResponse obtenerUsuarioPorId(Long id) {

   Usuario usuario = usuarioRepository.findById(id).orElseThrow(() ->
       new UsuarioNoEncontradoException(id));

   return usuarioMapper.toResponse(usuario);
  }

  // Actualizar un usuario por id
  @Override
  public UsuarioResponse actualizarUsuario(Long id, UsuarioActualizarRequest request) {

    Usuario usuario = usuarioRepository.findById(id).orElseThrow(() ->

       new UsuarioNoEncontradoException(id));

    Usuario actualizado = usuarioMapper.actualizarToUsuario(usuario, request);

    Usuario usuarioGuardado = usuarioRepository.save(actualizado);

    return usuarioMapper.toResponse(usuarioGuardado);
  }

  // Eliminar un usuario por id
  @Override
  public void eliminarUsuario(Long id) {

    Usuario usuario = usuarioRepository.findById(id).orElseThrow(() ->
        new UsuarioNoEncontradoException(id));

    usuarioRepository.delete(usuario);
  }
}


