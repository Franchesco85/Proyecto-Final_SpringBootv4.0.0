package com.pagina.Proyecto.Final.controller;

import com.pagina.Proyecto.Final.dto.UsuarioActualizarRequest;
import com.pagina.Proyecto.Final.dto.UsuarioCrearRequest;
import com.pagina.Proyecto.Final.dto.UsuarioResponse;
import com.pagina.Proyecto.Final.model.Usuario;
import com.pagina.Proyecto.Final.service.UsuarioService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

  private final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  // Crear usuario
  @PostMapping
  public ResponseEntity<UsuarioResponse> crearUsuario(
      @Valid @RequestBody UsuarioCrearRequest request) {

    UsuarioResponse response = usuarioService.crearUsuario(request);

    return ResponseEntity
        .status(HttpStatus.CREATED) // 201
        .body(response);
  }

  // Obtener todos los usuarios
  @GetMapping
  public ResponseEntity <List<UsuarioResponse>> obtenerTodosLosUsuarios() {

    List<UsuarioResponse> responses = usuarioService.obtenerTodosLosUsuarios();

    return ResponseEntity
        .status(HttpStatus.OK)
        .body(responses);

  }

  // Obtener usuario por id
  @GetMapping("/{id}")
  public ResponseEntity<UsuarioResponse> obtenerUsuarioPorId(
      @PathVariable Long id) {

    UsuarioResponse response = usuarioService.obtenerUsuarioPorId(id);

    return ResponseEntity
        .status(HttpStatus.OK)
        .body(response);
  }

  // Actualizar un usuario por id
  @PutMapping("/{id}")
  public ResponseEntity<UsuarioResponse> actualizarUsuario(
      @PathVariable Long id,
      @Valid @RequestBody UsuarioActualizarRequest request) {

    UsuarioResponse response = usuarioService.actualizarUsuario(id, request);

    return ResponseEntity
        .status(HttpStatus.OK)
        .body(response);
  }

  // Eliminar un usuario por id
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> eliminarUsuario(
      @PathVariable Long id) {

    usuarioService.eliminarUsuario(id);

    return ResponseEntity.noContent().build();
  }
}
