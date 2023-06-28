package com.tsti.accesoADatos;

import com.tsti.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente, Long> {
}
