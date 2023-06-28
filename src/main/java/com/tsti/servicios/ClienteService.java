package com.tsti.servicios;

import com.tsti.dto.ClienteRequestDTO;
import com.tsti.entidades.Cliente;
import com.tsti.exception.Excepcion;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ClienteService {

    Long saveCliente(ClienteRequestDTO DTO) throws Excepcion;

    Long updateCliente(ClienteRequestDTO DTO) throws Excepcion;

    Cliente getCliente(Long id) throws Excepcion;

    List<Cliente> getAllClientes() throws Excepcion;

    Long deleteCliente(Long id) throws Excepcion;
}
