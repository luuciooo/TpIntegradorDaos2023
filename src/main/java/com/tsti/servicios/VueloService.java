package com.tsti.servicios;

import java.util.Optional;

import com.tsti.entidades.Vuelo;

import com.tsti.dto.VueloRequestDTO;
import com.tsti.exception.Excepcion;
import java.util.List;

public interface VueloService {

    boolean saveVuelo(VueloRequestDTO DTO) throws Excepcion;

    boolean updateVuelo(Long nro_vuelo, VueloRequestDTO DTO) throws Excepcion;

    Vuelo getVuelo(Long numero_vuelo) throws Excepcion;

    List<Vuelo> getAllEntities() throws Excepcion;

    boolean deleteVuelo(Long numero_vuelo);
}
