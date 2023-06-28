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

    @PutMapping("/{numero_vuelo}")
    public ResponseEntity<?> actualizarVuelo( @PathVariable("numero_vuelo") Long numeroVuelo, @RequestBody VueloRequestDTO vueloDTO) {
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

    @GetMapping("/{numero_vuelo}")
    public ResponseEntity<?> getVuelo(@PathVariable("numero_vuelo") Long numero_vuelo) {
        try {
            Vuelo vuelo = vueloService.getVuelo(numero_vuelo);
            return ResponseEntity.status(HttpStatus.OK).body(vuelo);
        } catch (Excepcion e) {
            return ResponseEntity.status(e.getStatusCode()).body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllVuelos() {
        try {
            List<Vuelo> vuelos = vueloService.getAllEntities();
            return ResponseEntity.status(HttpStatus.OK).body(vuelos);
        } catch (Excepcion e) {
            return ResponseEntity.status(e.getStatusCode()).body(e.getMessage());
        }
    }

    @DeleteMapping("/{numero_vuelo}")
    public ResponseEntity<?> eliminarVuelo(@PathVariable("numero_vuelo") Long numero_vuelo) {

        try{
            boolean eliminado = vueloService.deleteVuelo(numero_vuelo);
            if (eliminado)
                return ResponseEntity.status(HttpStatus.OK).build();
        } catch(Excepcion e) {

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
