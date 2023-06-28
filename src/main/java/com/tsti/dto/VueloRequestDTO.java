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
public class VueloRequestDTO {

    @NotNull
    private Long numero_vuelo;
    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fecha;
    @NotNull
    @Size(min = 3,message = "Debe completar la hora")
    private String  hora;
    @NotNull
    private Integer nro_filas;
    @NotNull
    private Integer nro_asientos_filas;

    @NotNull
    private String  tipo_vuelo;

    @NotNull
    private String  destino;
    @NotNull
    private String  origen;


}
