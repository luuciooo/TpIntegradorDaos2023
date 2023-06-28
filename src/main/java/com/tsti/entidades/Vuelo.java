package com.tsti.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
@JsonIgnoreProperties({"hibernateLazyInitializer"})

@Entity
@Table(name = "Vuelo")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_vuelo")
    private Long numero_vuelo;
    @Column(name = "Fecha")
    private Date fecha;
    @Column(name = "hora")
    private String  hora;
    @Column(name = "nro_filas")
    private Integer nro_filas;
    @Column(name = "nro_asientos_filas")
    private Integer nro_asientos_filas;
    @Column(name = "tipo_vuelo")
    private String tipo_vuelo;
    @Column(name = "destino")
    private String destino;
    @Column(name = "origen")
    private String origen;
    @Column(name = "estadp")
    private String estado;

    @PrePersist
    private void prePersist() {
        // Se establece el estado del vuelo automáticamente
        this.estado = "registrado";
    }

    // ...

    public void setEstado(String estado) {
        this.estado=estado;
    }


}
