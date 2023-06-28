package com.tsti.presentacion;

import com.tsti.dto.VueloRequestDTO;
import com.tsti.entidades.Vuelo;
import com.tsti.exception.Excepcion;
import com.tsti.servicios.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloRestController {

    @Autowired
    private VueloService vueloService;

    @PostMapping
    public ResponseEntity<?> crearVuelo(@RequestBody VueloRequestDTO vueloDTO) {
        try {
            boolean creado = vueloService.saveVuelo(vueloDTO);
            if (creado) {
                return ResponseEntity.status(HttpStatus.CREATED).build();
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        } catch (Excepcion e) {
            return ResponseEntity.status(e.getStatusCode()).body(e.getMessage());
        }
    }

    @PutMapping("/{numeroVuelo}")
    public ResponseEntity<?> actualizarVuelo(
            @PathVariable("numeroVuelo") Long numeroVuelo,
            @RequestBody VueloRequestDTO vueloDTO) {
        try {
            boolean actualizado = vueloService.updateVuelo(numeroVuelo, vueloDTO);
            if (actualizado) {
                return ResponseEntity.status(HttpStatus.OK).build();
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        } catch (Excepcion e) {
            return ResponseEntity.status(e.getStatusCode()).body(e.getMessage());
        }
    }

    @GetMapping("/{numeroVuelo}")
    public ResponseEntity<?> obtenerVuelo(@PathVariable("numeroVuelo") Long numeroVuelo) {
        try {
            Vuelo vuelo = vueloService.getVuelo(numeroVuelo);
            return ResponseEntity.status(HttpStatus.OK).body(vuelo);
        } catch (Excepcion e) {
            return ResponseEntity.status(e.getStatusCode()).body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> obtenerTodosLosVuelos() {
        try {
            List<Vuelo> vuelos = vueloService.getAllEntities();
            return ResponseEntity.status(HttpStatus.OK).body(vuelos);
        } catch (Excepcion e) {
            return ResponseEntity.status(e.getStatusCode()).body(e.getMessage());
        }
    }

    @DeleteMapping("/{numeroVuelo}")
    public ResponseEntity<?> eliminarVuelo(@PathVariable("numeroVuelo") Long numeroVuelo) {
        boolean eliminado = vueloService.deleteVuelo(numeroVuelo);
        if (eliminado) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
