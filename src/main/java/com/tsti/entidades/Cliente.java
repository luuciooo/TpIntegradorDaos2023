package com.tsti.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// JPA

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dni")
    private Long dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String  apellido;
    @Column(name = "domicilio")
    private String domicilio;
    @Column(name = "email")
    private String email;
    @Column(name = "fechaDeNacimiento")
    private Date fechaDeNacimiento;
    @Column(name = "numeroDePasaporte")
    private Long numeroDePasaporte;
    @Column(name = "fechaDeVencimientoPasaporte")
    private Date fechaDeVencimientoPasaporte;

}
