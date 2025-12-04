package com.pagina.Proyecto.Final.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioCrearRequest(

     @Size(max = 100)
     @NotBlank
     String nombre,

     @Email
     @Size(max = 100)
     @NotBlank
     String email)

{

}
