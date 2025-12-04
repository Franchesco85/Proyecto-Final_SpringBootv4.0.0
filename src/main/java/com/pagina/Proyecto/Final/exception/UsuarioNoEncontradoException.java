package com.pagina.Proyecto.Final.exception;

public class UsuarioNoEncontradoException  extends RuntimeException{

 public UsuarioNoEncontradoException(String message) {
   super(message);
 }

 public UsuarioNoEncontradoException(Long id) {
   super(String.format("No se encontró un usuario con la id: " + id));
 }
}
