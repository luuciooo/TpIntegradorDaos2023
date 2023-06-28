package com.tsti.presentacion;


import com.tsti.dto.ClienteRequestDTO;
import com.tsti.dto.ClienteResponseDTO;
import com.tsti.entidades.Cliente;
import com.tsti.exception.Excepcion;
import com.tsti.servicios.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService service;

    @PostMapping("/save")
    public ResponseEntity<ClienteResponseDTO> crearCliente(@Valid @RequestBody ClienteRequestDTO cliente) throws Excepcion {
        return ResponseEntity.status(HttpStatus.CREATED).body(new ClienteResponseDTO(service.saveCliente(cliente)));
    }

    @PutMapping("/update")
    public ResponseEntity<ClienteResponseDTO> actualizarCliente(@Valid @RequestBody ClienteRequestDTO cliente) throws Excepcion {
        return ResponseEntity.status(HttpStatus.OK).body(new ClienteResponseDTO(service.updateCliente(cliente)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obtenerCliente(@PathVariable("id") Long id) throws Excepcion {
        return ResponseEntity.status(HttpStatus.OK).body(service.getCliente(id));
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> obtenerClientes() throws Excepcion {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllClientes());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> eliminarCliente(@PathVariable("id") Long id) throws Excepcion {
        return ResponseEntity.status(HttpStatus.OK).body(new ClienteResponseDTO(service.deleteCliente(id)));
    }
}
