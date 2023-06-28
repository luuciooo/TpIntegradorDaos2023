package com.tsti.servicios;

import java.util.Date;
import java.util.Optional;

import com.tsti.entidades.Vuelo;

import com.tsti.dto.VueloRequestDTO;
import com.tsti.exception.Excepcion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VueloService {

    boolean saveVuelo(VueloRequestDTO DTO) throws Excepcion;

    boolean updateVuelo(Long nro_vuelo, VueloRequestDTO DTO) throws Excepcion;

    Vuelo getVuelo(Long numero_vuelo) throws Excepcion;

    List<Vuelo> getAllEntities() throws Excepcion;

    boolean deleteVuelo(Long numero_vuelo) throws Excepcion;

    boolean reprogramarVuelo(Long numeroVuelo, Date nuevaFecha, String nuevaHora) throws Excepcion;

}
