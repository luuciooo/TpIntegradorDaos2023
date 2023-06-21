package com.tsti.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteRequestDTO {

    @NotNull
    private Long dni;
    @NotNull
    @Size(min = 3,message = "Debe completar el nombre")
    private String nombre;
    @NotNull
    @Size(min = 3,message = "Debe completar el nombre")
    private String  apellido;
    @NotNull
    private String domicilio;
    @Email(message = "Por favor ingrese un e-mail válido")
    private String email;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fechaDeNacimiento;
    @NotNull
    private Long numeroDePasaporte;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fechaDeVencimientoPasaporte;
}
