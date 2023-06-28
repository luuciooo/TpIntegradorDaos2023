package com.tsti.accesoADatos;

import com.tsti.entidades.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloDao extends JpaRepository<Vuelo, Long> {
}
